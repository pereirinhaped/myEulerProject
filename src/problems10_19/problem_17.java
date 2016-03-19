package problems10_19;

public class problem_17 {
	
	public static void main (String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		String[] oneToTen = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] tenToTwenty = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] twentyToHundred = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		int letterCounter = 0;
		
		letterCounter += count1to9(oneToTen);
		
		letterCounter += count10to19(tenToTwenty);
		
		letterCounter += count20to99(twentyToHundred, oneToTen);
		
		letterCounter += count100to999();
		
		String thousand = "onethousand";
		
		letterCounter += thousand.length();
		
		System.out.println(letterCounter);
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);

	}

	public static int count1to9(String[] numList) {
		// Count 1 to 9
		int letterCounter = 0;
		//int numCounter = 0;
		String curNumber = "";
		
		for (String i : numList) {
			curNumber = i;
			letterCounter += curNumber.length();
			//System.out.println(curNumber);
			//numCounter++;
		}
		
		return letterCounter;
	}
	
	public static int count10to19(String[] numList) {
		//Count 10 to 19
		int letterCounter = 0;
		//int numCounter = 0;
		String curNumber = "";
		
		for (String i : numList) {
			curNumber = i;
			letterCounter += curNumber.length();
			//System.out.println(curNumber);
		}
		
		return letterCounter;
	}
	
	public static int count20to99(String[] tensList, String[] numList) {
		// Count all numbers between 20 and 99
		int letterCounter = 0;
		//int numCounter = 0;
		String curNumber = "";
		
		for (String j : tensList) {
			curNumber = j;
			letterCounter += curNumber.length();
			//System.out.println(curNumber);
			for (String i : numList) {
				curNumber = j + i;
				letterCounter += curNumber.length();
				//System.out.println(curNumber);
			}			
		}
		
		return letterCounter;
	}
	
	public static int count100to999() {
		String[] oneToTen = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] tenToTwenty = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] twentyToHundred = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		int letterCounter = 0;
		String curNumber = "";
		
		for (String i : oneToTen) {
			//System.out.println(i + "hundred");
			curNumber = i + "hundred";
			letterCounter += curNumber.length();
			
			for (String j : oneToTen) {
				//System.out.println(i + "hundredand" + j);
				curNumber = i + "hundredand" + j;
				letterCounter += curNumber.length();
			}
			
			for (String j : tenToTwenty) {
				//System.out.println(i + "hundredand" + j);
				curNumber = i + "hundredand" + j;
				letterCounter += curNumber.length();
			}
			
			for (String j : twentyToHundred) {
				//System.out.println(i + "hundredand" + j);
				curNumber = i + "hundredand" + j;
				letterCounter += curNumber.length();
				for (String k : oneToTen) {
					//System.out.println(i + "hundredand" + j + k);
					curNumber = i + "hundredand" + j + k;
					letterCounter += curNumber.length();
				}
			}
		}
		
		return letterCounter;
	}
	
}
