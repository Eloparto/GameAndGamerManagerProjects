package ConcreteObjects;

import AbstractObjects.GameService;
import EntityObjects.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {

		System.out.println(game.getGameId()+" idsine sahip "+game.getGameName()+" isimli oyun ürünü sisteme baþarýyla kaydedildi.");
		
	}

	@Override
	public void delete(Game game) {

		System.out.println(game.getGameId()+" idsine sahip "+game.getGameName()+" isimli oyun ürünü sistemden baþarýyla silindi.");
		
	}

	@Override // ELOPARTO
	public void update(Game game) {

		System.out.println(game.getGameId()+" idsine sahip "+game.getGameName()+" isimli oyunun ürün bilgileri baþarýyla güncellenip sisteme kaydedildi.");

	}

	@Override
	public void list(Game[] game) {

		int a = 0;
		
		for(Game games : game) {
			
			
			a++;
			
			System.out.println(" ");
			System.out.println(a+"-"+"Oyun ismi: "+games.getGameName()+" | "+"Oyun hakkýnda: "+games.getGameDetails()+" | "+"Oyun incelemeleri: "+games.getAllReviews()+" | "+"Oyunun çýkýþ tarihi: "+games.getReleaseDate()+
					" | "+"Oyunun fiyatý: "+games.getPrice()+" | ");
			
		}
		
	}

}
