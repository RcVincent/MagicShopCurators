package model;

import java.util.Random;

public class Generator {
	private Random rand; 

	public Generator() {

	}

	public int generateShops(Random r) {
		return r.nextInt(10) + 1;
	}

	public int generateMagicItemTable(Random r) {
		return r.nextInt(9) + 1;
	}

	public int generateStoretype(Random r) {
		return r.nextInt(8) + 1; 
	}

	public int generateInventory(Random r) {
		return r.nextInt(5) + 1;
	}
	//public int generatePotions(int r) {
	//return 
	//}

	public Random getRand() {
		return rand;
	}

	public void setRand(Random rand) {
		this.rand = rand;
	}
}

