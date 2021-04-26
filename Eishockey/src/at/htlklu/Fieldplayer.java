package at.htlklu;

public class Fieldplayer extends Player{

	public Fieldplayer(String name, int playernumber, int penaltyminutes, int catchquote, int goalcount,
			int assistcount) {
		super(name, playernumber, penaltyminutes, catchquote, goalcount, assistcount);
		// TODO Auto-generated constructor stub
	}
@Override 
 public String toString() {
		return getClass().getSimpleName()  + " " +  name + ":" + playernumber + "," + "Goals:" + goalcount + "(" + assistcount + ") , Penalty minutes" + penaltyminutes; 
	}
}
