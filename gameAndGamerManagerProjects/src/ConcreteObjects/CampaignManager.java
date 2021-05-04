package ConcreteObjects;

import AbstractObjects.CampaignService;
import EntityObjects.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {

		System.out.println(campaign.getCampaignId()+" id numarasýna sahip "+campaign.getCampaignName()+" isimli kampanya sisteme baþarýyla kaydedildi.");
		
	}

	@Override
	public void delete(Campaign campaign) {

		System.out.println(campaign.getCampaignId()+" id numarasýna sahip "+campaign.getCampaignName()+" isimli kampanya sistemden baþarýyla silindi.");
		
	}

	@Override // ELOPARTO
	public void update(Campaign campaign) {

		System.out.println(campaign.getCampaignId()+" id numarasýna sahip "+campaign.getCampaignName()+" isimli kampanya bilgileri sistemde baþarýyla güncelledi.");
		
	}

	@Override
	public void list(Campaign[] campaign) {

		int a = 0;
		
		for(Campaign campaigns : campaign) {
			
			
			a++;
			
			System.out.println(" ");
			
			System.out.println(a+"-"+"Kampanya ismi: "+campaigns.getCampaignName()+" | "+"Kampanya indirim oraný: "+ "%"+campaigns.getDiscountRate()+" | ");
			
		}
		
	}

}
