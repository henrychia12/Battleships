import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		String[][] board = new String[12][12];
		BoardGrid field = new BoardGrid();
		GameLogic gameOne = new GameLogic();
		PatrolBoat patrolBoatOne = new PatrolBoat("Patrol Boat", 2);
		PatrolBoat patrolBoatTwo = new PatrolBoat("Patrol Boat", 2);
		BattleShip battleshipOne = new BattleShip("Battleship", 3);
		BattleShip battleshipTwo = new BattleShip("Battleship", 3);
		Submarine submarineOne = new Submarine("Submarine", 3);
		Destroyer destroyerOne = new Destroyer("Destroyer", 4);
		Carrier carrierOne = new Carrier("Carrier", 5);

		field.createBoard(board);
		field.showcaseBoard(board);
//		gameOne.patrolBoatOneLocation();
		gameOne.createShip(board, patrolBoatOne);
		field.boardLayout(board);
//		gameOne.createShip(board, patrolBoatTwo);
//		gameOne.createShip(board, battleshipOne);
//		gameOne.createShip(board, battleshipTwo);
//		gameOne.createShip(board, destroyerOne);


	}

}
