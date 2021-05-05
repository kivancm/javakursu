import java.rmi.RemoteException;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter() );
		Customer customer =new Customer();
		customer.setId(1);
		customer.setFirstName("mehmet");//isim
		customer.setLastName("kývanç");//soyisim
		customer.setDateOfBirth(1985);//dogumtarihinin yili
		customer.setNationalityId("12345678910");//dogru tckimlikno giriniz
		customerManager.Save(customer);
		
	
	}

}
