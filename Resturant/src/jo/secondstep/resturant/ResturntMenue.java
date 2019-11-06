package jo.secondstep.resturant;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;

public class ResturntMenue {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice , mount  , type;
		double value=0;
		String answer="yes";
		String[] hotDrinks = {"Coffe         ","Espresso   ","latte   ","Cappuccion   ", "Hot Chocolate   ","Tea       "};
		double[] priceOfDrinks = {1.00, 1.00, 1.50,1.50,1.50,.50};
		String[] pizaa= {"pizza Marinara" , "Pizza Margherita" , "Pizza Margherita Extra" , "Greek Piza       " , "Louis Pizza       "};
		double[] priceOfPizza = {2.00, 2.50, 2.50,3.50,3.00};
		String [] Salads = {"House Salad" , "Caeser Salad", "South West Salad"};
		String [] Soup = {"Mashroom Soup" , "Cream of Corn", "Clam Chowder"};
		double[] priceOfSalad = {1.00, 2.00, 2.50};
		double[] priceOfSoup = {1.00, 2.00, 2.50};
		System.out.println("Wellcome Dear Customer :)");
		while (answer.equalsIgnoreCase("yes")) {
			
		System.out.println("What Kind Of your Order ?");
		System.out.println("1. HOT DRINKS");
		System.out.println("2. PIZZA");
		System.out.println("2. SALADS");
		System.out.println("2. SOUP");
		choice=scan.nextInt();
		System.out.println("TYPE"+"\t             Price");
		switch (choice) {
	
		case 1:
			for (int i =0 ; i<hotDrinks.length; i++)
			System.out.println((i+1)+"_"+hotDrinks[i]+"\t "+priceOfDrinks[i]+"JD");
			System.out.println("PLZ select your Choice and the mount you want");
			type=scan.nextInt();
			mount=scan.nextInt();
			 value= value+mount*priceOfDrinks[type-1];
			
			break;
		case 2:
			for (int i =0 ; i<pizaa.length; i++)
			System.out.println((i+1)+"_"+pizaa[i]+"\t "+priceOfPizza[i]+"JD");
			System.out.println("PLZ select your Choice and the mount you want");
			type=scan.nextInt();
			mount=scan.nextInt();
			 value= value+mount*priceOfPizza[type-1];
			break;
		case 3:
			for (int i =0 ; i<Salads.length; i++)
			System.out.println((i+1)+"_"+Salads[i]+"\t "+priceOfSalad[i]+"JD");
			System.out.println("PLZ select your Choice and the mount you want");
			type=scan.nextInt();
			mount=scan.nextInt();
			 value= value+mount*priceOfPizza[type-1];
			break;
		case 4:
			for (int i =0 ; i<Soup.length; i++)
			System.out.println((i+1)+"_"+Soup[i]+"\t "+priceOfSoup[i]+"JD");
			System.out.println("PLZ select your Choice and the mount you want");
			type=scan.nextInt();
			mount=scan.nextInt();
			 value=value+ mount*priceOfPizza[type-1];
			break;
		default:
			break;
		}
		System.out.println("Do you want anpther thing ? Yes/No");
		answer=scan.next();
		}
		System.out.println(" The bill requested from you : "+value+"JD");
		
	
		
		
		
		
		

	}

}
