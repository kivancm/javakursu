package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {//BaseCustomerManager sinifindan miras aldi. 
	private ICustomerCheckService _customerCheckService;
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {//Contructor(yapici method) olusturduk
		this._customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson(customer)) {//if in ici dogru ise 17.satir calisir
			super.Save(customer);//ana siniftaki(BaseCustomerManager) save metodu calisir
		}else {//degilse 19.satir calisir
			System.out.println("gecerli kullanici degil");
		}
		
		
	}



}
