package at.htlklu;

public class Player  {
	protected final String name;
	protected final int playernumber;
	protected int penaltyminutes;
	protected int catchquote;
	protected int goalcount;
	protected int assistcount;
	
	public Player(String name, int playernumber, int penaltyminutes, int catchquote, int goalcount,
			int assistcount) {
		super();
		this.name = name;
		this.playernumber = playernumber;
		this.penaltyminutes = penaltyminutes;
		this.catchquote = catchquote;
		this.goalcount = goalcount;
		this.assistcount = assistcount;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", playernumber=" + playernumber + ", penaltyminutes=" + penaltyminutes
				+ ", catchquote=" + catchquote + ", goalcount=" + goalcount + ", assistcount=" + assistcount + "]";
	}
	
}
