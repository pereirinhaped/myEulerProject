package problems10_19;

public class Problem_14 {
	
	public static void main(String[] args) {
		
		printCollatzMaxs(999999, 500000);
		
	}
	
	// Method for finding the longest sequence in a given interval - inverse search from largest to smallest and starting with an odd number
	public static void printCollatzMaxs(int intStart, int intEnd) {
		int iCur = intStart;
		int maxSeq = 0;
		int iMax = iCur;

		
		do {
			if (collatzLength(iCur) > maxSeq) {
				maxSeq = collatzLength(iCur);
				iMax = iCur;
				System.out.println("*** NEW iMax: " + iMax + " - maxSeq: " + maxSeq);
				iCur -= 2;
			} else {
				iCur -= 2;
			}
		} while (iCur > intEnd);
		System.out.println("***\niMax: " + iMax + " - maxSeq: " + maxSeq);
	}
	
	
	// Method for printing and the length of a singular sequence starting with a given value 
	public static int collatzLength(long n) {
		int len = 1;
		do {
			if ( n%2 == 0) {
				n = n / 2;
			} else {
				n = n * 3 + 1;
			}
			len += 1;
		} while (n > 1);
		return len;
	}
	
	
}
