import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BattleshipsTest {
	
	@Before
	private void setUp() {
		
	}
	
	@Test
	private void patrolBoatTest() {
		assertEquals("A1", patrolBoat.place(coordX, coordY));
	}
	
	@Test
	private void twoPatrolBoatTest() {
		assertEquals("A1", patrolBoat.place(coordX, coordY));
		assertEquals("B5", patrolBoat.place(coordX, coordY));
	}
	
	@Test
	private void hitTest() {
		assertEquals(true, patrolBoat.hitOrMiss(true));
	}
	
	@Test
	private void missTest() {
		assertEquals(false, patrolBoat.hitOrMiss(false));
	}
	
	@Test
	private void sunkShipsTest() {
		assertEquals(3, playerOne.bombed(3));
	}
	
	@Test
	private void gameOverTest() {
		assertEquals(true, playerOne.gameOver(true));
	}
	
	@Test
	private void multipleShipsTest() {
		assertEquals(expected, actual);
		assertEquals(expected, actual);
		assertEquals(expected, actual);
		assertEquals(expected, actual);
		assertEquals(expected, actual);
		assertEquals(expected, actual);
		assertEquals(expected, actual);
	}
	
	

}
