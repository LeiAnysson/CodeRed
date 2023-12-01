package Package2;
import java.util.*;
public class runGame extends Player{
	public static void main(String[] args) throws InterruptedException{
		Scanner scn = new Scanner(System.in);
		Player p = new Player();
		Enemy e = new Enemy();
		char ans;
		char ply;
		
		System.out.print("Enter your name: ");
		String player = scn.nextLine();
		p.setName(player);

		do {
			System.out.println("Press 1 or 2 to select your gamemode: "
					+ "\n1 - Story"
					+ "\n2 - Survival");
			int mode = scn.nextInt();
			System.out.println("Press P to start playing, " + p.getName() + ".");
			char play = scn.next().toUpperCase().charAt(0);
			
			if (play == 'P') {
				switch(mode) {
				case 1:
					System.out.println("----------Story----------");
					intro();
					while(true) {
						ply = scn.next().toUpperCase().charAt(0);	
						if (ply == 'P') {
							System.out.println(p.getName() + ": Nice to meet you too! I'm " + p.getName() + ".");
							break;
						}
						else {
							System.err.println("Invalid input. Press P to Play.");
						}
					}
					dOne();
					while(true) {
						ply = scn.next().toUpperCase().charAt(0);
						if (ply == 'P') {
							System.out.println("You joined Hongjoong to the hideout.");
							break;
						}
						else System.err.println("Invalid input. Press P to Play.");
					}
					dTwo();
					ateez.introduction(p, ply, scn);
					Thread.sleep(2000);
					System.out.print("\nHongjoong: Hey " + p.getName() + " Since your here, maybe you can decode this.");
					Thread.sleep(2000);
					System.out.println("\n\tI found a clue that might lead us to the Cromer, but I don't know what it meant. "
							+ "\n\tCan you translate it for me? [Y/N] ");
					char choice = scn.next().toUpperCase().charAt(0);
					if (choice == 'Y') {
						System.out.println(p.getName() + ": Sure, let me see. Where did you find this clue?");
						qOne();
						ans = scn.next().toUpperCase().charAt(0);
						if (ans != 'A') {
							System.out.println("Hongjoong: I don't think that's what it means.");
						}
						else {
							System.out.println(p.getName() + ": I cracked the code. It means Seoul, South Korea.");
							Thread.sleep(1000);
							System.out.println("\tWhich means the Cromer is in Seoul, South Korea.");
						}
						System.out.println("\nHongjoong: Great! Let's go, " + p.getName() + ". Let's find the treasure.");
					}
					System.out.print("Do you want to continue on the Journey? [Y/N] ");
					ans = scn.next().toUpperCase().charAt(0);
					if (ans == 'N') {
						System.out.println("Thanks for playing!");
						System.exit(0);
					}
					else if (ans == 'Y') {
						System.out.println();
					}
					break;
				case 2:	
					System.out.println("----------Survival----------");
					dThree();
					while(true) {
						ply = scn.next().toUpperCase().charAt(0);
						if (ply == 'P') {
							dFour();
							Thread.sleep(1000);
							System.out.println("\tSeonghwa and " + p.getName() + ", both of you to the last room.");
							Thread.sleep(1000);
							System.out.println("\tBest of luck comrades! Fighting! ");
							Thread.sleep(1000);
							System.out.println("\nSeonghwa: Let's go, " + p.getName() 	
									+ "\n[Press P to continue]");
							ply = scn.next().toUpperCase().charAt(0);
							if (ply == 'P') {
								qTwo();
								e.eOne();
								while(p.getEHP() != 0) {
									ply = scn.next().toUpperCase().charAt(0);
									if (ply == 'X') {
										p.player1ATK();
										if (p.getEHP() <= 0) {
											Thread.sleep(1000);
											System.out.println("-----You DEFEATED the Android Guardian.-----");
											break;
										}
										else {
											System.out.println("\nANDROID GUARDIAN"
												+ "\nHP: " + p.getEHP());
											e.eOneATK();
										}
									}
									else System.err.println("Invalid input. Press X to Attack.");
								}
								Thread.sleep(2000);
								System.out.println("\nCongratulations on passing level 1! Here's a better sword as a reward.");
								Thread.sleep(1000);
								System.out.println("Yeosang: Enemy nearby! It's the level 5 enemy!"
										+ "\nSeonghwa: This one's a lot stronger " + p.getName());
								e.eFive();
								p.setEHP(50);
								while(p.getEHP() != 0) {
									ply = scn.next().toUpperCase().charAt(0);
									if (ply == 'X') {
										p.player5ATK();
										if (p.getEHP() <= 0) {
											System.out.println("-----You DEFEATED the Android Guardian.-----");
											break;
										}
										else {
											System.out.println("\nANDROID GUARDIAN"
												+ "\nHP: " + p.getEHP());
											e.eFiveATK();
										}
									}
									else System.err.println("Invalid input. Press X to Attack.");
								}
								Thread.sleep(2000);
								System.out.println("\nCongratulations on passing level 5! Here's an ULTIMATE sword as a reward.");
								Thread.sleep(1000);
								System.out.println("Yeosang: I can see the enemy boss! "
										+ "\nHongjoong: It's the last stretch, Fighting!"
										+ "\nSeonghwa: " + p.getName() + ", Let's do this together! For the Cromer!");
								e.boss();
								p.setEHP(50);
								while(p.getEHP() != 0) {
									ply = scn.next().toUpperCase().charAt(0);
									if (ply == 'X') {
										p.playerBATK();
										if (p.getEHP() <= 0) {
											System.out.println("-----You DEFEATED the Android Guardian.-----");
											break;
										}
										else {
											System.out.println("\nANDROID GUARDIAN"
												+ "\nHP: " + p.getEHP());
											e.eBossATK();
										}
									}
									else System.err.println("Invalid input. Press X to Attack.");
								}
								Thread.sleep(2000);
								System.out.println("\nCongratulations for completing every stage!");
								Thread.sleep(2000);
								System.out.println("As promised, here is your treasure."
										+ "\n[Press P to continue]");
								ply = scn.next().toUpperCase().charAt(0);
								if (ply == 'P') {
									dFive();
									ply = scn.next().toUpperCase().charAt(0);
									if (ply == 'P') {
										Thread.sleep(3000);
										System.out.println("\nYou headed back with Seonghwa to meet with other ATEEZ members.");
										Thread.sleep(3000);
										System.out.println("Hongjoong: We did it! and It's all thanks to you " + p.getName()
												+ "\n[Press P to continue]");
										ply = scn.next().toUpperCase().charAt(0);
										if (ply == 'P') {
											cheers();
											ply = scn.next().toUpperCase().charAt(0);
											if (ply == 'P') {
												finale();
												System.exit(0);
											}
											else System.err.println("Invalid input. Press P to Play.");
										}
										else System.err.println("Invalid input. Press P to Play.");
									}
									else System.err.println("Invalid input. Press P to Play.");
								}
								else System.err.println("Invalid input. Press P to Play.");
							}
							else System.err.println("Invalid input. Press P to Play.");
						}
						else System.err.println("Invalid input. Press P to Play.");
					}
				}	
			}else System.err.println("Invalid letter.");
		}while(true);
	}
}
