package Abstract;

import Entities.Customer;

public interface ICustomerCheckService {
/*ici bos metot tanimlarini interfacede yapariz
 classda metotlari uygulatiriz yani metotlarin icini doldururuz
*/
	boolean CheckIfRealPerson(Customer customer);
}
