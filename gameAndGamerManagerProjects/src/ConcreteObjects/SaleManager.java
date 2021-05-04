package ConcreteObjects;

import AbstractObjects.SaleService;
import EntityObjects.Campaign;
import EntityObjects.Game;
import EntityObjects.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Gamer gamer, Game game) {
		
		System.out.println(gamer.getFirstName()+" isim ve "+gamer.getLastName()+" soyisimli oyuncu "+game.getGameId()+" id numarasýna sahip "+game.getGameName()+" isimli oyunu "+
				game.getPrice()+"TL'ye baþarýyla satýn aldý.");
		
	}

	@Override // ELOPARTO
	public void sale(Gamer gamer, Game game, Campaign campaign) {
	
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" isim ve soyisimli oyuncu "+game.getGameId()+" id numarasýna sahip "+game.getGameName()+" isimli oyunu "+ campaign.getCampaignName()
		+" isimli kampanyadan faydalanarak "+game.getPrice()+" TL yerine "+campaign.getDiscount(game.getPrice())+" TL'ye baþarýyla satýn aldý.");
		
	}

}
