package Adapters;

import java.rmi.RemoteException;

import AbstractObjects.GamerCheckService;
import EntityObjects.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		boolean result = false;
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.get_nationalId()),gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(),gamer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}

}
