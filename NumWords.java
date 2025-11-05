// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class NumWords {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args [0]);
		int ones = num1 % 10;
		int tens = (num1/10)%10;
		int hundreds = num1/100;
		System.out.println( "ones" + ones + "tens" +  tens + "hundreds" + hundreds);
	}
}
