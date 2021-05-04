package AbstractObjects;

import EntityObjects.Campaign;
import EntityObjects.Game;
import EntityObjects.Gamer;

public interface SaleService {

	void sale(Gamer gamer, Game game);
	
	void sale(Gamer gamer, Game game, Campaign campaign);
}
