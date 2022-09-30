package othello;

public class Board {

	private int [][] board;
	static final int boardSize = 8;
	
	// private for inside box
	private int player1 ;
	private int player2 ;
	
	private int count;
	public int Player1_Moves;
	public int Player2_Moves;

	public Board(int player1,int player2) {
		// jase he i create board i want to know about players choice of disk white or black
	// user have to tell me, by using player class
		// firstly i create player,than board , than play
		// top doen approach.
		
		board = new int [8][8];
		// 8x8 grid that have default value =0 that represent Empty cell
		// placed 1 or 2 that represent p1 or p2 move in cell
		
		this.player1 = player1;
		this.player2 = player2;
	}

	
	
	
	
	public boolean move(int i ,int j , int colour) { // colour ko represent by integer.
		return false;
		
	}
	
	
	public void print() {
		
	}





	public boolean moveInBoard(int rowIndex, int columnIndex, int disc) {
		// TODO Auto-generated method stub
		return false;
	}
}
