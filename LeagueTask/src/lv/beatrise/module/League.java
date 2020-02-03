package lv.beatrise.module;

import java.util.ArrayList;

public class League {
	
	private String name;
	private ArrayList<String> nameOfTeam;
	
	public League(String leagueName){
		this.name = leagueName;
		this.nameOfTeam = new ArrayList<>();
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getNameOfTeam() {
		return nameOfTeam;
	}
	public void setNameOfTeam(ArrayList<String> nameOfTeam) {
		this.nameOfTeam = nameOfTeam;
	}
	@Override
	public String toString() {
		return "League [name=" + name + ", nameOfTeam="
				+ nameOfTeam + "]";
	}
	
	
	
}
