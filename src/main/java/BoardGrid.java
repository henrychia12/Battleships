//import java.awt.GridLayout;
//import javax.swing.JButton;
//import javax.swing.JFrame;

public class BoardGrid {

	public static boolean cloakShip = false;

	public void boardBorder() {
		System.out.println("_________________________");
		System.out.println("");
	}

	public void createBoard(String[][] board) {
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board.length; c++) {
				board[r][c] = "~";

			}
		}
	}

	public void showcaseBoard(String[][] board) {
		boardBorder();
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board.length; c++) {
				board[r][c] = "~";
				System.out.print(" " + board[r][c]);
			}
			System.out.println("");
		}
		boardBorder();
	}

	public void boardLayout(String[][] board) {
		boardBorder();
		for (int r = 0; r < board.length; r++) {
			if (cloakShip == false) {
				for (int c = 0; c < board.length; c++) {
					System.out.print(" " + board[r][c]);
				}
				System.out.println("");
			} else {
				for (int c = 0; c < board.length; c++) {
					if (board[r][c].equals("S")) {
						System.out.print(" " + "~");
					} else {
						System.out.print(" " + board[r][c]);
					}

				}
				System.out.println("");
			}

		}
		boardBorder();
	}

}

//	JFrame f;
//
//	BoardGrid(){  
//	    f=new JFrame();  
//	      
//	    JButton b1=new JButton("A1");
//	    JButton b2=new JButton("B1");  
//	    JButton b3=new JButton("C1");  
//	    JButton b4=new JButton("D1");  
//	    JButton b5=new JButton("E1");  
//	    JButton b6=new JButton("F1");  
//	    JButton b7=new JButton("A2");  
//	    JButton b8=new JButton("B2");  
//	    JButton b9=new JButton("C2");  
//	    JButton b10=new JButton("D2");  
//	    JButton b11=new JButton("E2");  
//	    JButton b12=new JButton("F2");  
//	    JButton b13=new JButton("A3");  
//	    JButton b14=new JButton("B3");  
//	    JButton b15=new JButton("C3");  
//	    JButton b16=new JButton("D3");  
//	    JButton b17=new JButton("E3");  
//	    JButton b18=new JButton("F3");  
//	    JButton b19=new JButton("A4");  
//	    JButton b20=new JButton("B4");
//	    JButton b21=new JButton("C4");  
//	    JButton b22=new JButton("D4");  
//	    JButton b23=new JButton("E4");
//	    JButton b24=new JButton("F4");  
//	    JButton b25=new JButton("A5");  
//	    JButton b26=new JButton("B5");
//	    JButton b27=new JButton("C5");  
//	    JButton b28=new JButton("D5");  
//	    JButton b29=new JButton("E5");
//	    JButton b30=new JButton("F5");
//	    JButton b31=new JButton("A6");
//	    JButton b32=new JButton("B6");
//	    JButton b33=new JButton("C6");
//	    JButton b34=new JButton("D6");
//	    JButton b35=new JButton("E6");
//	    JButton b36=new JButton("F6");
//	          
//	    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);  
//	    f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);
//	    f.add(b11);f.add(b12);f.add(b13);f.add(b14);f.add(b15);
//	    f.add(b16);f.add(b17);f.add(b18);f.add(b19);f.add(b20);
//	    f.add(b21);f.add(b22);f.add(b23);f.add(b24);f.add(b25);
//	    f.add(b26);f.add(b27);f.add(b28);f.add(b29);f.add(b30);
//	    f.add(b31);f.add(b32);f.add(b33);f.add(b34);f.add(b35);
//	    f.add(b36);
//	  
//	    f.setLayout(new GridLayout(6,6));  
//	  
//	    f.setSize(300,300);  
//	    f.setVisible(true);  
//	}
//
//public static void main(String[] args) {  
//    new BoardGrid();  
//}  
