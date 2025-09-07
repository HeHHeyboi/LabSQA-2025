package sqa.Lab9.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import sqa.Lab9.api.MovieService;
import sqa.Lab9.data.stub.MovieServiceStub;

public class FavoriteMovieTest {
	@Test
	void test_favorite_withStub() {
		MovieService ms = new MovieServiceStub();
		FavoriteMovie fm = new FavoriteMovie(ms);

		List<String> movie_list = fm.getUserPlaylist("", "datenight");
		assertEquals(5, movie_list.size());
	}

	@Test
	void test_favorite_withMockito() {
		MovieService ms = mock(MovieService.class);
		Map<String, List<String>> userPlaylists = new HashMap<>();
		List<String> horror = new ArrayList<>();
		horror.add("Paranormal Activity");
		horror.add("Alien");
		horror.add("The Cabin in The Woods");
		horror.add("The Conjuring");
		horror.add("Evil Dead");
		userPlaylists.put("horror", horror);

		when(ms.getUserPurchaseMovie("")).thenReturn(userPlaylists);
		FavoriteMovie fm = new FavoriteMovie(ms);
		List<String> movie_list = fm.getUserPlaylist("", "horror");
		assertEquals(5, movie_list.size());
	}

}
