package lv.beatrise.module;

public class Team {
	private String name;
	private int wins;
	private int loses;
	private int ties;
	
	public Team(String nameOfTeam){
		this.name = nameOfTeam;
		this.wins = 0;
		this.loses = 0;
		this.ties = 0;
		
	}
	
	
	
	
	
	public String getNameL() {
		return name;
	}
	public void setNameL(String name) {
		this.name = name;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLoses() {
		return loses;
	}
	public void setLoses(int loses) {
		this.loses = loses;
	}
	public int getTies() {
		return ties;
	}
	public void setTies(int ties) {
		this.ties = ties;
	}
	@Override
	public String toString() {
		return "Team [name=" + name + ", wins=" + wins + ", loses="
				+ loses + ", ties=" + ties + "]";
	}
	
	public int gamesPlayed() {
		return this.wins +this.loses +this.ties;
	}
	
	
}
