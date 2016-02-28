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
		
		BigInteger toCalc = getExp(n, x);
		String toSum = convertToString(toCalc);
		
		for (int i = 0; i < toSum.length(); ++i) {
			int aInt = Character.getNumericValue(toSum.charAt(i));
			result += aInt;
		}
		
		System.out.println(result);
		
	}
	
	// Auxiliary function that converts result Double to String
	private static String convertToString(BigInteger n) {
		String result = n.toString();
		
		return result;
	}
	
	// Auxiliary function to get exponential result
	private static BigInteger getExp(String x, int y) {
		
		BigInteger result = new BigInteger(x).pow(y);
		
		return result;
		
	}
	
}
