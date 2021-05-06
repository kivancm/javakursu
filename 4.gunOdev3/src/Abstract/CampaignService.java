package Abstract;

import Entities.Gamer;

public interface CampaignService {
	public void add(Gamer gamer);
	public void addMultiple(Gamer[] gamers);
	public void delete(Gamer gamer);
	public void update(Gamer gamer);
}
