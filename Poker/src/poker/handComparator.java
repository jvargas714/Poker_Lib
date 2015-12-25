package poker;

import java.util.Comparator;

public class handComparator implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {
		
		if(p1.getHandStrength() > p2.getHandStrength())
			return 1;
		
		else if(p1.getHandStrength() == p2.getHandStrength())
			return 0; 
		
		else
			return -1;				
	}

}
