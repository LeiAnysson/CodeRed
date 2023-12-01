package Package2;

public class Dialogue {
	public static void intro() throws InterruptedException {
		System.out.println("All of a sudden you found yourself teleported to a universe called Universe Z.");
		Thread.sleep(1000);
		System.out.println("It's a universe where music and emotions are banned.");
		Thread.sleep(1000);
		System.out.println("Suddenly, a man appeared in front of you.");
		Thread.sleep(1000);
		System.out.println("\nHongjoong: Never seen you before, nice to meet you! I'm Hongjoong and you are? "
				+ "\n[Press P to answer]");
	}
	public static void dOne() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("\nHongjoong: It's dangerous out here, come with me to the hideout."
				+ "\n[Press P to continue]");
	}
	public static void dTwo() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("\nYou reached the hideout and saw 7 unfamiliar faces beside Hongjoong.");		
	}
	public static void qOne() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Hongjoong: I found it in a hidden compartment in the ship that we stole.");
		Thread.sleep(1000);
		System.out.println("\tIt’s a piece of paper with some random letters on it. ");
		System.out.println("\tLOSEU, OSUHT AOKER");
		Thread.sleep(1000);
		System.out.println("\tWhat do you think does this mean?"
				+ "\n\t\t[A] Seoul, South Korea"
				+ "\n\t\t[B] Seoul, North Korea");
	}
	public static void dThree() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("After solving the clue, you rode the ship with ATEEZ to travel to Seoul, South Korea");
		Thread.sleep(1000);
		System.out.println("Once you reached the place from the coordinates given with the clue,");
		Thread.sleep(1000);
		System.out.println("The place is heavily guarded with Android Guardians, enemies of music and emotion"
				+ "\n[Press P to continue]");
	}
	public static void dFour() throws InterruptedException {
		System.out.println("\nHongjoong: Since there are 3 possible rooms that the cromer is in,"
				+ "\n\tLet's divide the team, Me and Yeosang will go and hack the system to guide you.");
		Thread.sleep(1000);
		System.out.println("\tSan and Wooyoung, go to the 1st room"
				+ "\n\tYunho and Mingi, 2nd room"
				+ "\n\tJongho, you go on lookout.");
	}
	public static void qTwo() throws InterruptedException {
		System.out.println("You reached the last room with Seonghwa and the sign says,");
		Thread.sleep(1000);
		System.out.println("TO OBTAIN WHAT YOU SEEK, ONE MUST FINISH EVERY LEVEL."); 
		Thread.sleep(1000);
		System.out.println("\nYou suddenly heard a voice.");
		Thread.sleep(1000);
		System.out.println("\nHongjoong: Be careful there's an enemy nearby,"
				+ "\n\tI think that's the Level One enemy, kill it");
		Thread.sleep(2000);
	}
	public static void dFive() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("\nThe Cromer suddenly appeared before you.");
		Thread.sleep(1000);
		System.out.println("\nSeonghwa: Wow you did it. Let's head back so we can escape this world."
				+ "\n[Press P to continue]");
	}
	public static void cheers() throws InterruptedException {
		System.out.println("\nWooyoung: WE DID ITTTT!");
		Thread.sleep(1000);
		System.out.println("San: We finally have the Cromer!");
		Thread.sleep(1000);
		System.out.println("Mingi: LET'S GO HOME!"
				+ "\n[Press P to continue]");
	}
	public static void finale() throws InterruptedException{
		System.out.println("\nAfter a few cheers, Hongjoong thanked you and finally flipped the Cromer.");
		Thread.sleep(2000);
		System.out.println("You suddenly feel a little dizzy and when the dizziness is gone...");
		Thread.sleep(3000);
		System.out.println("You returned to Universe A, Earth, where music and emotions lived on.");
		Thread.sleep(1000);
		System.out.println("\n_____Thank you for playing!_____");
	}
}
