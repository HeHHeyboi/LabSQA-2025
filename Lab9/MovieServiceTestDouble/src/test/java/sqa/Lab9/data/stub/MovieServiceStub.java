// นายธนทัต ภู่แก้ว 663380211-0
package sqa.Lab9.data.stub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sqa.Lab9.api.MovieService;

public class MovieServiceStub implements MovieService {

	@Override
	public Map<String, List<String>> getUserPurchaseMovie(String username) {
		Map<String, List<String>> userPlaylists = new HashMap<>();

		List<String> dateNight = Arrays.asList("The Notebook", "50 First Dates", "A Walk to Remember", "First Love",
				"The Lucky One");
		List<String> horror = new ArrayList<>();
		horror.add("Paranormal Activity");
		horror.add("Alien");
		horror.add("The Cabin in The Woods");
		horror.add("The Conjuring");
		horror.add("Evil Dead");

		userPlaylists.put("datenight", dateNight);
		userPlaylists.put("horror", horror);
		return userPlaylists;
	}

}
