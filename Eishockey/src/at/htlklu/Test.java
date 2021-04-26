package at.htlklu;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		Player[] team = new Player[6];
		
		int randomnumber = (int) (Math.random() * team.length);
		System.out.println(randomnumber);
		int fieldplayernumber = team.length - randomnumber;
		
		for (int i = 0; i < randomnumber; i++) {
			int randomgoals = (int) (Math.random() * (30 - 1)) * 1;
			int randomplayernumber = (int) (Math.random() * (99 - 1)) * 1;
			int randomcatchquote = (int) (Math.random() * (100 - 1)) * 1;
			int randomassists = (int) (Math.random() * (30 - 1)) * 1;
			int randompenalty = (int) (Math.random() * (1000 - 1)) * 1;
			team[i] = new Goalkeeper("Fred", randomplayernumber, randompenalty, randomcatchquote, randomgoals, randomassists);
		}
		for (int i = 0; i < fieldplayernumber; i++) {
			int randomgoals = (int) (Math.random() * (30 - 1)) * 1;
			int randomplayernumber = (int) (Math.random() * (99 - 1)) * 1;
			int randomcatchquote = (int) (Math.random() * (100 - 1)) * 1;
			int randomassists = (int) (Math.random() * (30 - 1)) * 1;
			int randompenalty = (int) (Math.random() * (1000 - 1)) * 1;
			team[i + randomnumber] = new Fieldplayer("Fred", randomplayernumber, randompenalty, randomcatchquote, randomgoals, randomassists);
		}
		for (int i = 0; i < team.length; i++) {
			System.out.println(team[i].toString());
		}
		System.out.println(isValidTeam(team));
	}
	public static boolean isValidTeam(Player [] team) {
		int counter = 0;
		for(int i = 0; i < team.length; i++) {
			if(team[i] instanceof Goalkeeper) {
				counter++;
			}
		}
		if(counter == 1) {
			return true;
		}
		return false;
	}
}
