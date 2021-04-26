package at.htlklu;

public class Goalkeeper extends Player{

	public Goalkeeper(String name, int playernumber, int penaltyminutes, int catchquote, int goalcount,
			int assistcount) {
		super(name, playernumber, penaltyminutes, catchquote, goalcount, assistcount);
		// TODO Auto-generated constructor stub
	}
	@Override 
	 public String toString() {
			return  getClass().getSimpleName() + " " + name + ":" + playernumber + "," + "Catchquote:" + catchquote + ", Assists" + assistcount + ", Penaltyminutes:" + penaltyminutes; 
		}
}
