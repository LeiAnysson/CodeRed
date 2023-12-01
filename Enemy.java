package Package2;

import java.util.*;
public class Enemy implements lvl1, lvl5, boss, eat{
	Random ran = new Random();
	Player p = new Player();
	Scanner scn = new Scanner(System.in);
	int hit;
	int pDMG;
	
	@Override
	public void eOne() {
		System.out.println("\n!!! ANDROID GUARDIAN LEVEL ONE !!!"
				+ "\n\tHP : 10");
		System.out.println("[Press X to attack]");
	}
	@Override
	public void eFive() {
		System.out.println("\n!!! ANDROID GUARDIAN LEVEL FIVE !!!"
				+ "\n\tHP : 50");
		System.out.println("[Press X to attack]");
	}
	@Override
	public void boss() {
		System.out.println("\n!!! ANDROID GUARDIAN BOSS LEVEL !!!"
				+ "\n\tHP : 100");
		System.out.println("[Press X to attack]");
	}
	@Override
	public void eOneATK() throws InterruptedException{
		Thread.sleep(1000);
		System.out.println("\nThe Android Guardian Attacked you.");
		hit = ran.nextInt(1,20);
		System.out.println("-" + hit + "dmg");
		pDMG = p.getPHP() - hit;
		p.setPHP(pDMG);
		Thread.sleep(1000);
		System.out.println("Your current health: " + p.getPHP());
		if(p.getPHP() <= 50) {
			p.eatFood();
		}
		System.out.println("[Press X to Attack]");
	}
	@Override
	public void eFiveATK() throws InterruptedException{
		Thread.sleep(1000);
		System.out.println("\nThe Android Guardian Attacked you.");
		hit = ran.nextInt(10,30);
		System.out.println("-" + hit + "dmg");
		pDMG = p.getPHP() - hit;
		p.setPHP(pDMG);
		Thread.sleep(1000);
		System.out.println("Your current health: " + p.getPHP());
		if(p.getPHP() <= 50) {
			p.eatFood();
		}
		System.out.println("[Press X to Attack]");
	}
	@Override
	public void eBossATK() throws InterruptedException{
		Thread.sleep(1000);
		System.out.println("\nThe Android Guardian Attacked you.");
		hit = ran.nextInt(20,50);
		System.out.println("-" + hit + "dmg");
		pDMG = p.getPHP() - hit;
		p.setPHP(pDMG);
		Thread.sleep(1000);
		System.out.println("\nYour current health: " + p.getPHP());
		if(p.getPHP() <= 50) {
			p.eatFood();
		}
		System.out.println("[Press X to Attack]");
	}
}
