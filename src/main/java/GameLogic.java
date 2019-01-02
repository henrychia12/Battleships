import java.util.Scanner;
import java.util.*;

public class GameLogic {
//	public String horizontalOrVertical() {
//		Scanner direction = new Scanner(System.in);
//		System.out.println("Patrol Boat One: Horizontally or Vertically? (Enter 'H' or 'V') ");
//		String answer = direction.nextLine().toLowerCase();
//		direction.close();
//		System.out.println(answer);
//		return answer;
//	}

	public void createShip(String[][] board, Ship ship) {

		List<String> shipList = new ArrayList<>();

		shipList.add("Patrol Boat One");
		shipList.add("Patrol Boat Two");
		shipList.add("Battleship One");
		shipList.add("Battleship Two");
		shipList.add("Submarine");
		shipList.add("Destroyer");
		shipList.add("Carrier");

//		while (true) {
//			for (int i = 0; i < shipList.size(); i++) {
//				Scanner direction = new Scanner(System.in);
//				System.out.println(shipList.get(i) + ": Horizontal or Vertical? (Enter 'H' or 'V') ");
//				String answer = direction.next();
//				direction.close();

		Scanner direction = new Scanner(System.in);
		System.out.println("Patrol Boat One: Horizontally or Vertically? (Enter 'H' or 'V') ");
		String answer = direction.nextLine().toLowerCase();
//		direction.close();
		System.out.println(answer);


		System.out.println("Column Coordinate: ");
		int columnCoord = direction.nextInt();
//		direction.close();


		System.out.println("Row Coordinate: ");
		int rowCoord = direction.nextInt();
		direction.close();

		if (answer.equals("v")) {
			for (int j = 0; j < ship.getShipSize(); j++) {
				board[rowCoord][columnCoord + j] = "S";
			}
		}

		else {
			for (int j = 0; j < ship.getShipSize(); j++) {
				board[rowCoord + j][columnCoord] = "S";
			}
		}
	}

	public void randomShipLocation(String[][] board, Ship ship) {

		if (Math.random() < 0.5) {
			int col = (int) (Math.random() * 8);
			int row = (int) (Math.random() * 10);
			for (int i = 0; i < ship.getShipSize(); i++) {
				board[row][col + i] = "S";
			}
		} else {
			int col = (int) (Math.random() * 10);
			int row = (int) (Math.random() * 8);
			for (int i = 0; i < ship.getShipSize(); i++) {
				board[row + i][col] = "S";
			}
		}
	}

}
