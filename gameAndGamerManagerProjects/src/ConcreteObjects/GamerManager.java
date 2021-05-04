package ConcreteObjects;

import AbstractObjects.GamerCheckService;
import AbstractObjects.GamerService;
import EntityObjects.Gamer;

public class GamerManager implements GamerService {

	private GamerCheckService _gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		
		_gamerCheckService = gamerCheckService;
		
	}
	
	@Override
	public void add(Gamer gamer) {
		
		if(_gamerCheckService.CheckIfRealPerson(gamer)) {
			
			System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+"isim ve soyisimli kullanýcý sistem tarafýndan doðrulanýp baþarýyla kaydedilmiþtir.");
			
		}else {
			System.out.println("Girilen bilgiler geçersizdir. Kayýdýnýz tamamlanamadý.");
		}

		
	}

	@Override
	public void delete(Gamer gamer) {

		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+"isim ve soyisimli kullanýcý sistemden baþarýyla silindi.");
		
	}

	@Override
	public void update(Gamer gamer) {

		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+"isim ve soyisimli kullanýcýnýn bilgileri baþarýyla güncellendi.");
		
	}

}
