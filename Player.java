package Package2;

import java.util.Random;
import java.util.Scanner;

public class Player extends Dialogue implements eat {
	private static String name;
	private static int eHP = 10;
	private int pHP = 100;
	int pEat;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setEHP(int eHP){
		this.eHP = eHP;
	}
	public int getEHP(){
		return this.eHP;
	}
	public void setPHP(int pHP){
		this.pHP = pHP;
	}
	public int getPHP(){
		return this.pHP;
	}
	public void player1ATK() throws InterruptedException {
		Random ran = new Random();
		int dmg;
		int hit;
		hit = ran.nextInt(1,10);
		Thread.sleep(1000);
		System.out.println("\nYou attacked the Android Guardian.\n"
					+ "-"+ hit + "dmg");
		dmg = getEHP() - hit;
		setEHP(dmg); 
	}
	public void player5ATK() throws InterruptedException {
		Random ran = new Random();
		int dmg;
		int hit;
		hit = ran.nextInt(10,30);
		Thread.sleep(1000);
		System.out.println("\nYou attacked the Android Guardian.\n"
					+ "-"+ hit + "dmg");
		dmg = getEHP() - hit;
		setEHP(dmg); 
	}
	public void playerBATK() throws InterruptedException {
		Random ran = new Random();
		int dmg;
		int hit;
		hit = ran.nextInt(15,50);
		Thread.sleep(1000);
		System.out.println("\nYou attacked the Android Guardian.\n"
					+ "-"+ hit + "dmg");
		dmg = getEHP() - hit;
		setEHP(dmg); 
	}
	public void eatFood() throws InterruptedException{
		Scanner scn = new Scanner(System.in);
		System.out.println("\nHongjoong: " + name + ", your HP's low. Eat some food");
		while(true) {
			System.out.println("[Press E to eat]");
			char eat = scn.next().toUpperCase().charAt(0);
			if (eat == 'E') {
				pEat = getPHP() + eatFood;
				setPHP(pEat);
				if(getPHP() >= 100) {
					Thread.sleep(1000);
					System.out.println("\nANDROID GUARDIAN"
							+ "\nHP: " + getEHP());
					break;
				}
				System.out.println("Your current health: " + getPHP());
			}
			else {
				System.err.println("Invalid input. Press E to eat.");
			}
		}
	}
}
