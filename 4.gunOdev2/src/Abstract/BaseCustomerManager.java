package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
/*interface tanimladigimiz metotlarin icini dolduruyoruz */
	@Override
	public void Save(Customer customer) {//Bu metodu ezdik(Override).
		// TODO Auto-generated method stub
		System.out.println("saved to db : "+customer.getFirstName());
	}

}
