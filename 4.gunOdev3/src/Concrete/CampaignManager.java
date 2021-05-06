package Concrete;

import Abstract.BaseCampaignManager;
import Abstract.CampaignService;
import Entities.Gamer;

public class CampaignManager extends BaseCampaignManager implements CampaignService {
	
	
	@Override
	public double canEksilt(Gamer gamer) {
		// TODO Auto-generated method stub
		return gamer.getLives()-10;
	}

	
	@Override
	public void add(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getFirstName()+" eklendi");
		System.out.println(gamer.getLastName()+" eklendi");
		System.out.println(gamer.getUserName()+" eklendi");
	}
	@Override
	public void addMultiple(Gamer[] gamers) {
		// TODO Auto-generated method stub
		for(Gamer gamer:gamers) {
			add(gamer);
		}
	}
	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getFirstName()+" silindi");
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getFirstName()+" guncellendi");
	}


	

}
