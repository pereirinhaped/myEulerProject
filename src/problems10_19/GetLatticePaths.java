package problems10_19;


import org.junit.*;

public class GetLatticePaths {
	
//	private static int gridsize = 2;
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 14; ++i) {
			System.out.println(countPaths(0,0,i));			
		}

	}
	
	@Test
	public void test1() {
		Assert.assertEquals(1, countPaths(0,0,0));
	}
	
	public static int countPaths(int x, int y, int gridsize) {
		int i = 0;
		
		if (x < gridsize) {
			i += countPaths(x+1, y, gridsize);
		}
		if (y < gridsize) {
			i += countPaths(x, y+1, gridsize);
		}
		
		if (x == gridsize && y == gridsize) {
			return 1;
		}
		
		return i;
	}
	
}
