from flask import Flask, request
from flask_restful import Resource, Api
from flasgger import Swagger

app = Flask(__name__)
api = Api(app)
swagger = Swagger(app)


class MovieList:

    def __init__(self, id: int, name: str, movie_list: list):
        self.id = id
        self.name = name
        self.movie_list = movie_list

    def to_dict(self):
        return {
            'id': self.id,
            'name': self.name,
            'movie_list': self.movie_list
        }


movie_data = [
    MovieList(
        1, "datenight",
        ["The Notebook", "50 First Dates", "A Walk to Remember"]).to_dict(),
    MovieList(2, "action",
              ["Die Hard", "Mad Max: Fury Road", "John Wick"]).to_dict(),
    MovieList(3, "comedy",
              ["Superbad", "Step Brothers", "The Hangover"]).to_dict(),
]


class Movie(Resource):

    def get(self):
        """
        Get a list of all movie playlist
        ---
        responses:
          200:
            description: A list of movie playlist
        """
        return movie_data, 200

    def post(self):
        """
        Create a new playlist
        ---
        parameters:
          - in: body
            name: Movie
            required: true
            schema:
                id: Movie
                required:
                    - playlist_name
                    - movie_list
                properties:
                    playlist_name:
                        type: string
                        description: The name of the playlist
                    movie_list:
                        type: string[]
                        description: the list of movie's name
        responses:
            201:
                description: A new playlist created
            400:
                description: Bad request
        """
        new_id = movie_data[-1].get("id") + 1
        data = request.get_json()
        new_playlist = MovieList(new_id, data['playlist_name'],
                                 data['movie_list'])
        movie_data.append(new_playlist.to_dict())
        return new_playlist.to_dict(), 201


api.add_resource(Movie, '/movie')

# Run the app
if __name__ == '__main__':
    app.run(debug=True)
