import java.util.*;
public class CountSort {
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter three positive integers for n, min, and max (in that order): ");
		int n = scan.nextInt();
		int min = scan.nextInt();
		int max = scan.nextInt();
		
		int [] values = new int [n];

		//unsorted array
		for (int i = 0; i < values.length; i++) {
			values [i] = (int) ((Math.random() * (max - (min -1))) + min);
			}
		
		countingSort(values, min, max);
	}
	
	public static void countingSort(int [] values, int min, int max) {
		
		System.out.println();
		System.out.println("Unsorted Random Array:");
		for(int f = 0; f < values.length; f++) {
		System.out.print(values[f] + " ");
		}
		
		System.out.println();
		
		int [] counter = new int [(max-min) + 1];
		int k = min, j, count = 0, c;
		
		//storing count array values
		while(k <= max) {
			for(c = 0; c < counter.length; c++) {
			for(j = 0; j < values.length; j++) {
				if(values[j] == k) {
					count++;
				}
			}
			
			counter[c] = count;
			count = 0;
			k++;
			}
		}
		
		
		
		//restoring sorted array
		int [] sorted = new int [values.length];
		int inc = min;
		String string = "";
		String move = "";
		int moved = 0;
		
		while(inc <= max) {
		for(int h = 0; h < counter.length; h++) {
		for(int s = 1; s <= counter[h]; s++) {
			
		string += Integer.toString(inc);
		}
		inc++;
		
		}
			
			}
		
		for(int a = 0; a < string.length(); a++) {
			char z = string.charAt(a);
			move = move + z;
			moved = Integer.parseInt(move);
			sorted[a] = moved;
			move = "";
		}
		
		System.out.println();
		System.out.println("Sorted Array:");
		
		for(int print = 0; print < sorted.length; print++) {
			System.out.print(sorted[print] + " ");
		}
		}
}
