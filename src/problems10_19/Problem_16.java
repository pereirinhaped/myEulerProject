package problems10_19;

import java.math.BigInteger;
import java.lang.Character;

public class Problem_16 {
	
	public static void main(String[] args) {
		
		sumDigits("2", 1000);
		
	}
	
	// Sum all digits
	
	private static void sumDigits(String n, int x) {
		
		int result = 0;
		
		String toSum = convertToString(n, x);
		
		for (int i = 0; i < toSum.length(); ++i) {
			int aInt = Character.getNumericValue(toSum.charAt(i));
			result += aInt;
		}
		
		System.out.println(result);
		
	}
	
	// Auxiliary function that calculates and converts result BigInteger to String
	private static String convertToString(String n, int x) {
		
		BigInteger expResult = new BigInteger(n).pow(x);
		
		String result = expResult.toString();
		
		return result;
	}
	
}
