package Abstract;

import Entities.Customer;

public interface ICustomerCheckService {
/*ici bos metot tanimlarini interfacede yapariz
 classda metotları uygulatırız yani metotlarin icini doldururuz
*/
	boolean CheckIfRealPerson(Customer customer);
}
