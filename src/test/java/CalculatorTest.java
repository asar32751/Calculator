import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		assertTrue(true);
		
	}
	@Test
	public void testAdd(){
		Calculator c1= new Calculator();
		int actual=c1.add(10,20);
		int expected=30;
		assertEquals(expected, actual);
	}
	@Test
	public void testMod(){
		Calculator c1= new Calculator();
		int actual=c1.mod(50,9);
		int expected=5;
		assertEquals(expected, actual);
		assertEquals(5,c1.mod(50,9));
	}
	@Test
	public void testSub() {
		Calculator c1= new Calculator();
        int x=10;
        int y=20;
        int expected=-10;
        int actual =c1.sub(x,y);
        assertEquals(expected,actual);
        
	}

}
