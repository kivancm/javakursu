package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;


public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {//Bu metodu ezdik.(override)
		// TODO Auto-generated method stub
		return true;
	}




}
