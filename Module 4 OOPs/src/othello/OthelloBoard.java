package othello;

public class OthelloBoard {

	private int board[][];
	final static int player1Symbol = 1;
	final static int player2Symbol = 2;
	 private static  int xDir[] = {-1,-1,0,1,1,1,0,-1};
     private static  int yDir[] = {0,1,1,1,0,-1,-1,-1};
       

	public OthelloBoard() {
		board = new int[8][8];
		board[3][3] = player1Symbol;
		board[3][4] = player2Symbol;
		board[4][3] = player2Symbol;
		board[4][4] = player1Symbol;
	}

	public void print() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean move(int symbol, int x, int y){
		
        //step1
        // check for invalid cell
        if(x<0 || x>=board.length || y<0 || y>=board.length || board[x][y] != 0 )// !=0 already taken cell.
            return false;// because we cannot move there.

        //step2
        // all 8 direction ma find any possinle direction that different colour disc in cell and 
        // at end same disc as current player, we do coversion ,white to black or black to hite.
        
        // instead of 8 loop we use array to store delta(change) in direction in array and choose one by one both direction coordinate value from array
        
      
        
        
        
        
        
        
        
//                 boolean movePossible = false;
//         for(int i = 0; i < xDir.length; i++){
//             int xStep = xDir[i];
//             int yStep = yDir[i];
//             int currentX = x + xStep;
//             int currentY = y + yStep;
//             int count = 0;
//             // count of opponent's pieces encountered 
//             while(currentX >= 0 && currentX < 8 && currentY >= 0 && currentY < 8){
//                 // Empty cell 
//                 if(board[currentX][currentY] == 0){
//                     break;
//                 }
//                 else if(board[currentX][currentY] != symbol){
//                     currentX += xStep;
//                     currentY += yStep;
//                     count++;
//                 }
//                 else{
//                     // conversion is possible 
//                     if(count > 0){
//                         movePossible = true;
//                         int convertX = currentX - xStep;
//                         int convertY = currentY - yStep;
//                         while(convertX != x || convertY != y){
//                             board[convertX][convertY] = symbol;
//                             convertX = convertX - xStep;
//                             convertY = convertY - yStep;
//                         }
//                     }
//                     break;
//                 }
//             }
//         }
//         if(movePossible){
//             board[x][y] =symbol;
//         }
//         return movePossible;
//     }
        
        
        
        
        
        
        boolean  conversionTakePlace = false; //   for coversion as flag use
        for(int i=0; i<xDir.length;i++)
        {
            int xStep = xDir[i];
            int yStep = yDir[i];
            // check for conversion possible or not
            
            int currentX= x+ xStep;   // dont do x=x+xStep you will lost parameter x
            int currentY = y + yStep;
            int count=0;
         
            while(currentX>=0 && currentX<board.length && currentY>0 && currentY<board.length )
            {
               
              
                if(board[currentX][currentY] == 0 ) {
                	
                	 break;
                }

                else  if(board[currentX][currentY] != symbol){
                	currentX+= xStep;   
                    currentY+=yStep;
                     count++;
                   // continue;
                    
                }
               else{// board[][] == symbol
           
	                if(count!=0)
	            {
	                conversionTakePlace = true;
                  int convertX = currentX - xStep;
                        int convertY = currentY - yStep;
                        while(convertX != x || convertY != y){
                            board[convertX][convertY] = symbol;
                            convertX = convertX - xStep;
                            convertY = convertY - yStep;
                        }
                    }
                    break;
                }
            }
        }
        if(conversionTakePlace){
            board[x][y] =symbol;
        }
        return conversionTakePlace;
    }






	public boolean move2(int symbol, int x, int y){
		
        //step1
        // check for invalid cell
        if(x<0 || x>=board.length || y<0 || y>=board.length || board[x][y] != 0 )// !=0 already taken cell.
            return false;// because we cannot move there.

        //step2
        // all 8 direction ma find any possinle direction that different colour disc in cell and 
        // at end same disc as current player, we do coversion ,white to black or black to hite.
        
        // instead of 8 loop we use array to store delta(change) in direction in array and choose one by one both direction coordinate value from array
        
      
        
        
        
        
        
        
        
                boolean movePossible = false;
        for(int i = 0; i < xDir.length; i++){
            int xStep = xDir[i];
            int yStep = yDir[i];
            int currentX = x + xStep;
            int currentY = y + yStep;
            int count = 0;
            // count of opponent's pieces encountered 
            while(currentX >= 0 && currentX < 8 && currentY >= 0 && currentY < 8){
                // Empty cell 
                if(board[currentX][currentY] == 0){
                    break;
                }
                else if(board[currentX][currentY] != symbol){
                    currentX += xStep;
                    currentY += yStep;
                    count++;
                }
                else{
                    // conversion is possible 
                    if(count > 0){
                        movePossible = true;
                        int convertX = currentX - xStep;
                        int convertY = currentY - yStep;
                        while(convertX != x || convertY != y){
                            board[convertX][convertY] = symbol;
                            convertX = convertX - xStep;
                            convertY = convertY - yStep;
                        }
                    }
                    break;
                }
            }
        }
        if(movePossible){
            board[x][y] =symbol;
        }
        return movePossible;
    }
        
        
    




}
        
        
        
	


