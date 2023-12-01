package Package2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ateez {
	public static void introduction(Player p, char ply, Scanner scn) throws InterruptedException {
		Queue<String> q = new LinkedList<String>();		
		q.offer("Seonghwa");
		q.offer("Yunho");
		q.offer("Yeosang");
		q.offer("San");
		q.offer("Mingi");
		q.offer("Wooyoung");
		q.offer("Jongho");
		Thread.sleep(2000);
		System.out.println("Hongjoong: Everyone this is " + p.getName() + ". Introduce yourselves.");	
		for (int i = 0; i < 7; i++)	{
			String ateez = (String) q.poll();
				Thread.sleep(1000);
				System.out.println("\n" + ateez + ": Hey there! I'm " + ateez
						+ "\n[Press H to say Hi]");
			while(true) {	
				ply = scn.next().toUpperCase().charAt(0);
				if (ply == 'H') {
					System.out.println(p.getName() + ": Hi " + ateez + "!");
					break;
				}
				else {
				System.err.println("Invalid input. Press H to say Hi.");
				}
			}
		}
	}
}
