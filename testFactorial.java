import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFactorial {

	@Test
	public void factorialTest() {
		assertEquals(1, factorial(0));
		assertEquals(1, factorial(1));
		assertEquals(2, factorial(2));
		assertEquals(6, factorial(3));
	}
	
	private int factorial(int x) {
		int result = 1;
		
		if (x < 0) {
			throw new IllegalArgumentException("Number must be positive");
		}
		
		if (x == 0 || x == 1) {
			return 1;
		} else {
			for (int i = 2; i <= x; i++) {
				result *= i;
			}
		}
		return result;
	}

}
