package arylist;

import java.util.ArrayList;

public class ArraYlist {

	public static void main(String[] args) {
		
		// Uncomment codes and see the results too! 1D&2DArrraylist
		
		//1- ArrayList
 		
		/*
		 * ArrayList<String>Chips=new ArrayList<String>(); Chips.add("Lays");
		 * Chips.add("Crax"); Chips.add("Kurkure"); Chips.add("Domitos");
		 * Chips.add("Bingo");
		 * 
		 * Chips.remove("Kurkure"); Chips.set(2, "Cheetos");
		 * 
		 * for(String i : Chips) { System.out.println(i); }
		 */
	
     //2-D ArrayList 
     
 	//ArrayList
     
     ArrayList<ArrayList<String>>Snacks=new ArrayList();
     
     ArrayList<String>Biscuits=new ArrayList<String>();
     Biscuits.add("Milk Bikis");
     Biscuits.add("Gooday");
     Biscuits.add("Oreo");
     Biscuits.add("Bourbon");
     Biscuits.add("Marie Gold");

     ArrayList<String>Choclates=new ArrayList<String>();
     Choclates.add("Dairy Milk");
     Choclates.add("5 Star");
     Choclates.add("Mars");
     Choclates.add("Snickers");
     Choclates.add("Milky Bar");
     
     ArrayList<String>Chips=new ArrayList<String>();
     Chips.add("Lays");
     Chips.add("Crax");
     Chips.add("Kurkure");
     Chips.add("Domitos");
     Chips.add("Bingo");
        
    Snacks.add(Biscuits);
    Snacks.add(Choclates);
    Snacks.add(Chips);
   
  
    /*for(ArrayList<String> i : Snacks) {
        System.out.println(i);
	}
     */
    System.out.println(Snacks);
    System.out.println("This Week's Best Selling Choclate: "+Snacks.get(1).get(0));
    System.out.println("This Week's Best Selling Biscuit :"+Snacks.get(0).get(1));
    System.out.println("This Week's Best Selling Chips :"+Snacks.get(2).get(0));
   }
	}
	


