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
			
			System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+"isim ve soyisimli kullanıcı sistem tarafından doğrulanıp başarıyla kaydedilmiştir.");
			
		}else {
			System.out.println("Girilen bilgiler geçersizdir. Kayıdınız tamamlanamadı.");
		}

		
	}

	@Override
	public void delete(Gamer gamer) {

		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+"isim ve soyisimli kullanıcı sistemden başarıyla silindi.");
		
	}

	@Override
	public void update(Gamer gamer) {

		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+"isim ve soyisimli kullanıcının bilgileri başarıyla güncellendi.");
		
	}

}
