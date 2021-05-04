package AbstractObjects;

import EntityObjects.Game;

public interface GameService {

	void add(Game game);
	
	void delete(Game game);
	
	void update(Game game);
	
	void list(Game[] game);
}
