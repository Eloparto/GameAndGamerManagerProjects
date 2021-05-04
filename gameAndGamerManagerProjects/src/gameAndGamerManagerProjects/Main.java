package gameAndGamerManagerProjects;

import java.util.Date;

import Adapters.MernisServiceAdapter;
import ConcreteObjects.CampaignManager;
import ConcreteObjects.GameManager;
import ConcreteObjects.GamerCheckManager;
import ConcreteObjects.GamerManager;
import ConcreteObjects.SaleManager;
import EntityObjects.Campaign;
import EntityObjects.Game;
import EntityObjects.Gamer;

public class Main {

	public static void main(String[] args) {

		Campaign campaign1 = new Campaign(1,"Bahar indirimleri",25);
		Campaign campaign2 = new Campaign(2,"Yeni üye indirimi",15);
		Campaign campaign3 = new Campaign(3,"10. Yýla Özel indirim",20);

		System.out.println("---KAMPANYA EKLEME/SÝLME/GÜNCELLEME SÝSTEMÝ---");
		System.out.println(" ");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.add(campaign3);
		
		Campaign[] campaigns = {campaign1,campaign2,campaign3};
		
		Game game1 = new Game(1238840,"Battlefield 1","FPS, Savaþ oyunu","Çok olumlu","20 Ekim 2016",280);
		Game game2 = new Game(261550,"Mount & Blade II: Bannerlord","Orta çað, Strateji,Açýk dünya","Çok olumlu","30 Mart 2020",150);
		Game game3 = new Game(292030,"The Witcher® 3: Wild Hunt","Zengin hikaye, Atmosferik,Açýk dünya","Son Derece Olumlu","18 Mayýs 2015",60);		
		Game game4 = new Game(1091500,"Cyberpunk 2077","Bilim Kurgu, Açýk dünya,RYO","Çok olumlu","10 Aralýk 2020",250);
		Game game5 = new Game(1174180,"Red Dead Redemption 2","Macera, Açýk dünya,Vahþi batý","Çok olumlu","5 Aralýk 2019",300);
		
		System.out.println(" ");
		System.out.println("---OYUN EKLEME/SÝLME/GÜNCELLEME SÝSTEMÝ---");
		System.out.println(" ");
		
		GameManager gameManager = new GameManager();
		
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.add(game3); // ELOPARTO
		gameManager.add(game4);
		gameManager.add(game5);
		
		Game[] games = {game1,game2,game3,game4,game5};

		System.out.println(" ");
		System.out.println("---KULLANICI KAYIT/SÝLME/GÜNCELLEME SÝSTEMÝ---");
		System.out.println(" ");

		Gamer gamer = new Gamer(1,"KAÐAN","ELOPARTO","eloparto@google.com","05555555555","99999999999",new Date(1453,5,29));

		// GamerManager gamerManager = new GamerManager(new MernisServiceAdapter()); MERNÝS SÝSTEMÝ KUSURSUZ BÝR ÞEKÝLDE ÇALIÞIYOR
		
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());

		gamerManager.add(gamer);

		
		System.out.println(" ");
		System.out.println("--| KAMPANYALAR |--");
		
		campaignManager.list(campaigns);
		
		System.out.println(" ");
		System.out.println("--| OYUNLAR |--");
		
		gameManager.list(games);
		
		System.out.println(" ");
		System.out.println("-- MAÐAZA --");
		
		System.out.println(" ");
		SaleManager saleManager = new SaleManager();

		saleManager.sale(gamer, game1, campaign1);
		System.out.println(" ");
		saleManager.sale(gamer, game2, campaign2);
		System.out.println(" ");
		saleManager.sale(gamer, game3, campaign3);
		System.out.println(" ");
		saleManager.sale(gamer, game4, campaign1);
		System.out.println(" ");
		saleManager.sale(gamer, game5, campaign1);
		
	}

}
