package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client =new KPSPublicSoapProxy();//nesne olusturduk
		boolean result=false;
		try {
			result = client.TCKimlikNoDogrula//Bu metod verilen parametrelere gore dogru yada yanlis bir deger donduruyor
					(Long.parseLong(customer.getNationalityId()),//tckimlikno 
									customer.getFirstName().toUpperCase(), //isim
									customer.getLastName().toUpperCase(), //soyisim
									customer.getDateOfBirth());//dogum tarihi 
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
