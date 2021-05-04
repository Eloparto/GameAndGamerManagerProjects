package ConcreteObjects;

import AbstractObjects.GamerCheckService;
import EntityObjects.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {

		return true;
		
	}

}
