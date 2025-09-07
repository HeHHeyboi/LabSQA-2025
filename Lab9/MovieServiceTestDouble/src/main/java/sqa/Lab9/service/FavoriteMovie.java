package sqa.Lab9.service;

import java.util.List;
import java.util.Map;

import sqa.Lab9.api.MovieService;

public class FavoriteMovie {
	private MovieService movie_service;

	public FavoriteMovie(MovieService movieService) {
		super();
		this.movie_service = movieService;
	}

	public List<String> getUserPlaylist(String username, String playlist_name) {
		Map<String, List<String>> playlist_map = movie_service.getUserPurchaseMovie(username);

		List<String> list = playlist_map.get(playlist_name);

		return list;
	}
}
