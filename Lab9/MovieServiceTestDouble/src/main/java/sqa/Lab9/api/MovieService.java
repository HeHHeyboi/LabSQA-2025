// นายธนทัต ภู่แก้ว 663380211-0
package sqa.Lab9.api;

import java.util.Map;
import java.util.List;

public interface MovieService {
	public Map<String, List<String>> getUserPurchaseMovie(String username);
}
