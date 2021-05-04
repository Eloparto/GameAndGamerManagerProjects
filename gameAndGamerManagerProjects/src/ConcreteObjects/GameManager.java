package ConcreteObjects;

import AbstractObjects.GameService;
import EntityObjects.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {

		System.out.println(game.getGameId()+" idsine sahip "+game.getGameName()+" isimli oyun �r�n� sisteme ba�ar�yla kaydedildi.");
		
	}

	@Override
	public void delete(Game game) {

		System.out.println(game.getGameId()+" idsine sahip "+game.getGameName()+" isimli oyun �r�n� sistemden ba�ar�yla silindi.");
		
	}

	@Override // ELOPARTO
	public void update(Game game) {

		System.out.println(game.getGameId()+" idsine sahip "+game.getGameName()+" isimli oyunun �r�n bilgileri ba�ar�yla g�ncellenip sisteme kaydedildi.");

	}

	@Override
	public void list(Game[] game) {

		int a = 0;
		
		for(Game games : game) {
			
			
			a++;
			
			System.out.println(" ");
			System.out.println(a+"-"+"Oyun ismi: "+games.getGameName()+" | "+"Oyun hakk�nda: "+games.getGameDetails()+" | "+"Oyun incelemeleri: "+games.getAllReviews()+" | "+"Oyunun ��k�� tarihi: "+games.getReleaseDate()+
					" | "+"Oyunun fiyat�: "+games.getPrice()+" | ");
			
		}
		
	}

}
