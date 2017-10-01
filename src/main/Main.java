package main;

import java.util.Random;

import model.Generator;

public class Main {



	public static void main(String[] args) throws Exception {
		Random r = new Random();

		int s, a, t, b;
		Generator gen = new Generator();

		s = gen.generateShops(r);

		System.out.println("There are a total of " + s + " shops in the city.");

		for(int k = 1; k <= s; k ++) {
			
			t = gen.generateMagicItemTable(r);
			System.out.println("This shop has items from magic item table: " + t);
			
			//find out how many items can be bought
			b = gen.generateInventory(r) + 1;
			System.out.println("There are " + b + " items for sale");
			
			int [] items = new int[b + 1];
			
			//get the item codes 
			for(int i = 1; i <= b; i++) {
				
				a = r.nextInt(100) + 1;
				items[i] = a;
				System.out.print(items[i]+ ", ");
			}
			System.out.println("");
			System.out.println("Thank you for coming.");
			System.out.println("");
		}	
	}
}
