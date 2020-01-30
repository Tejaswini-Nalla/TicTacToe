class TicTacToe{
	final int player1=1;
	final int player2=-1;
	public int player=1;
	public int gameBoard[][]=new int[3][3];
	public boolean isGameOver=false;
	boolean checkplace(int row,int col)
	{ 	
		if(gameBoard[row][col]!=0){
			System.out.println("Already present,select other position");
			return false;
		}
		if(row<0 || row>2 || col<0 || col>2){
			System.out.println("Enter correct positions");
			return false;
		}
		//System.out.print("place available");
		gameBoard[row][col]=player;
		printBoard();
		return true;
	}
	boolean checkWinner(int player,int row,int col)
	{
		if(gameBoard[row][0]+gameBoard[row][1]+gameBoard[row][2]==3*player||gameBoard[0][col]+gameBoard[1][col]+gameBoard[2][col]==3*player)
		{
			isGameOver=true;
			return true;
		}
		else if(row==col && gameBoard[0][0]+gameBoard[1][1]+gameBoard[2][2]==3*player)
		{
			isGameOver=true;
			return true;
		}
		else if(row+col==2 && gameBoard[2][0]+gameBoard[1][1]+gameBoard[0][2]==3*player)
		{
			isGameOver=true;
			return true;
		}
		return false;
	}
	int switchPlayer(int player)
	{
		player=(player==player1)?player2:player1;
		return player;
	}
	void printBoard()
	{
		for(int rows[]:gameBoard)
		{
			for(int cols:rows)
			{
				System.out.print(cols+" ");
			}
			System.out.println();

		}

	}
        
}
