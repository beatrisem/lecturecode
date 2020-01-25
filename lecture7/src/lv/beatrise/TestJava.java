package lv.beatrise;

import lv.beatrise.geometricfigures.Circle;
import lv.beatrise.layer.FootballPlayer;

public class TestJava {

	
	
	public static void main(String[] args) {
		
		FootballPlayer player = new FootballPlayer("ronaldo", "forward", 7, true, 176, 90);
		
		
		System.out.println(player.getName());
		System.out.println(player.getPosition());
		System.out.println(player.getShirtNumber());
		System.out.println(player.getBuild());
		System.out.println(player.getHeight());
		System.out.println(player.getWeight());
		
		player.setShirtNumber(12);
		System.out.println("__________________________________");
		System.out.println(player.getName());
		System.out.println(player.getPosition());
		System.out.println(player.getShirtNumber());
		System.out.println(player.getBuild());
		System.out.println(player.getHeight());
		System.out.println(player.getWeight());
		
		
		
		
//	player .setName("ron");
//		player .getName();
//		
//		System.out.println(player .getName());
		
		
	}

}
