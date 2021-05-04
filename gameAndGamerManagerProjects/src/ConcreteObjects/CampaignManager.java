package ConcreteObjects;

import AbstractObjects.CampaignService;
import EntityObjects.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {

		System.out.println(campaign.getCampaignId()+" id numaras�na sahip "+campaign.getCampaignName()+" isimli kampanya sisteme ba�ar�yla kaydedildi.");
		
	}

	@Override
	public void delete(Campaign campaign) {

		System.out.println(campaign.getCampaignId()+" id numaras�na sahip "+campaign.getCampaignName()+" isimli kampanya sistemden ba�ar�yla silindi.");
		
	}

	@Override // ELOPARTO
	public void update(Campaign campaign) {

		System.out.println(campaign.getCampaignId()+" id numaras�na sahip "+campaign.getCampaignName()+" isimli kampanya bilgileri sistemde ba�ar�yla g�ncelledi.");
		
	}

	@Override
	public void list(Campaign[] campaign) {

		int a = 0;
		
		for(Campaign campaigns : campaign) {
			
			
			a++;
			
			System.out.println(" ");
			
			System.out.println(a+"-"+"Kampanya ismi: "+campaigns.getCampaignName()+" | "+"Kampanya indirim oran�: "+ "%"+campaigns.getDiscountRate()+" | ");
			
		}
		
	}

}
