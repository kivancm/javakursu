
import Concrete.CampaignManager;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer gamer1=new Gamer(1,"oyuncu1","ahmet","demir",53);
		Gamer gamer2=new Gamer(2,"oyuncu2","mehmet","demir",75);
		Gamer gamer3=new Gamer(3,"oyuncu3","ali","demir",86);
		
		Gamer[] gamers=new Gamer[] {gamer1,gamer2,gamer3};
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.addMultiple(gamers);
		
		CampaignManager abc=new CampaignManager();
		System.out.println("Puaniniz : "+abc.puanHesapla(gamer1));
		System.out.println("Kalan can : "+abc.canEksilt(gamer3));//abstract method
	}

}
