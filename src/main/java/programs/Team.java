package programs;

public class Team {
	
	public String teamName;
	public int noOfPlayers;
	
	public Team(String teamname, int noOfPlayers) {
			this.teamName = teamname;
			this.noOfPlayers = noOfPlayers;
	}
	
	public void AddPlayer(int count) {
		this.noOfPlayers += count;
	}
	
	
	public boolean RemovePlayr(int count) {
		if(this.noOfPlayers - count < 0)
			return false;
		this.noOfPlayers -= count;
		return true;
	}

}

public class Subteam extends Team{

	public Subteam(String teamname, int noOfPlayers) {
		super(teamname, noOfPlayers);
	}
	
	public void ChangeTeamaName(String name) {
		teamName = name;
	}
}
