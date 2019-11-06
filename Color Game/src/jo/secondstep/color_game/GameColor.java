package jo.secondstep.color_game;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class GameColor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> answer=new ArrayList<Integer>();
		int numberMatches,oldNumOfmatches;
		ArrayList<Integer> colorList = new ArrayList<Integer>();
		for (int i =0 ; i<16;i++) {
			colorList.set(i, i+1);
		}
		ArrayList<Integer> playerColor= new ArrayList<Integer>();
		Random rand = new Random();
		for (int i =0 ; i<4;i++) {
			int randNum=rand.nextInt(16)+1;
			while((playerColor.contains(randNum)))
			randNum=rand.nextInt();
			playerColor.add(randNum);			
		}
		
		
		
		
	ArrayList <Integer> secondPlayer = new ArrayList<Integer>();
	for (int i =0 ; i<4;i++)
		secondPlayer.add(colorList.get(i));
	oldNumOfmatches= numOfMatch(playerColor, secondPlayer);
	while (oldNumOfmatches==0) 
		{
		colorList.removeAll(secondPlayer);
		for (int i = 0; i < colorList.size(); i++) {
			secondPlayer.add(colorList.get(i));
			oldNumOfmatches=numOfMatch(playerColor,secondPlayer);
		}
		
		}
	for (int i=0 ; i<colorList.size();i++)
	{
		
		secondPlayer.set(0, colorList.get(i));
		numberMatches=numOfMatch(playerColor, secondPlayer);
		if (numberMatches>oldNumOfmatches)
		{
			answer.add(colorList.get(i));
			colorList.remove(0);
		}
		else if (numberMatches<oldNumOfmatches)
		{
			answer.add(secondPlayer.get(0));
			colorList.remove(i);
		}
		
		
	}
	
	
	}

	public static int numOfMatch(ArrayList<Integer> fPlayer, ArrayList<Integer> sPlayer) {
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (fPlayer.contains(sPlayer.get(i)))
				count++;
		}
		return count;
	}

}
