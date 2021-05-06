package Abstract;

import Entities.Gamer;

public abstract class BaseCampaignManager implements CampaignCheckManager {

	@Override
	public abstract double canEksilt(Gamer gamer);

	@Override
	public double puanHesapla(Gamer gamer) {
		// TODO Auto-generated method stub
		return 100*gamer.getLives(); 
	}
	
}
