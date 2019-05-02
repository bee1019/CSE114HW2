import java.util.*;
public class RollingDice {
	public static void main (String [] args) {
		String ndx = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string representing the set of dice to roll (ndx): ");
		ndx = scan.next();
		
		System.out.println("\n" + "Total sum of dice values: " + rollDice(ndx));
	}
	
	public static int rollDice(String ndx) {
		
		int sum = 0;
		int d = ndx.indexOf("d");
		String sdice = ndx.substring(0,d);
		int numOfDice = Integer.parseInt(sdice);
		
		String edice = ndx.substring(d + 1);
		int diceSides = Integer.parseInt(edice);
		
		int [] values = new int [numOfDice];
		
		for (int i = 0; i < values.length; i++) {
			values [i] = (int) ((Math.random() * diceSides) + 1);
			}
		
		for(int val = 0; val < values.length; val++) {
			sum += values[val];
		}
		
		System.out.print("Resulting values for dice roll(s): ");
		
		for(int roll = 0; roll < values.length; roll++) {
			System.out.print(values[roll] + " ");
		}
		
		return sum;
		
	}
}
