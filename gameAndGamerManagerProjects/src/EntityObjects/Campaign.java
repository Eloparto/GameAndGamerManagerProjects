package EntityObjects;

import AbstractObjects.Entity;

public class Campaign implements Entity {

	private int _campaignId;
	private String _campaignName;
	private double _discountRate;
	
	public Campaign() {}
	
	public Campaign(int campaignId, String campaignName, double discountRate) {
		
		_campaignId = campaignId;
		_campaignName = campaignName;
		_discountRate = discountRate;
		
	}
	
	public void setCampaignId(int campaignId) {
		_campaignId = campaignId;
	}
	public int getCampaignId() {
		return _campaignId;
	}
	public void setCampaignName(String campaignName) {
		_campaignName = campaignName;
	}
	public String getCampaignName() {
		return _campaignName;
	}
	public void setDiscountRate(double discountRate) {
		_discountRate = discountRate;
	}
	public double getDiscountRate() {
		return _discountRate;
	}
	
	public double getDiscount(double gamePrice) {
		
		return gamePrice-(gamePrice*_discountRate/100);
				
	}
	
}
