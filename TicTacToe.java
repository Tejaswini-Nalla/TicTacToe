class TicTacToe{
	final int player1=1;
	final int player2=-1;
	public int player=1;
	public int gameBoard[][]=new int[3][3];
	public boolean isGameOver=false;
	public boolean checkplace(int i,int j)
	{ 	
		if(gameBoard[i][j]!=0){
			System.out.println("Already placed");
			return false;
		}
		if(i<0 || i>2 || j<0 || j>2){
			System.out.println("Enter correct positions");
			return false;
		}
		//System.out.print("place available");
		gameBoard[i][j]=player;
		for(int rows[]:gameBoard)
		{
			for(int col:rows)
			{
				System.out.print(col+" ");
			}
			System.out.println();

		}
		return true;
	}
	boolean checkWinner(int player)
	{
		if(gameBoard[0][0]+gameBoard[0][1]+gameBoard[0][2]==3*player||gameBoard[1][0]+gameBoard[1][1]+gameBoard[1][2]==3*player||gameBoard[2][0]+gameBoard[2][1]+gameBoard[2][2]==3*player||
		   gameBoard[0][0]+gameBoard[1][0]+gameBoard[2][0]==3*player||gameBoard[0][1]+gameBoard[1][1]+gameBoard[2][1]==3*player||gameBoard[0][2]+gameBoard[1][2]+gameBoard[2][2]==3*player||
		   gameBoard[0][0]+gameBoard[1][1]+gameBoard[2][2]==3*player||gameBoard[1][1]+gameBoard[0][2]+gameBoard[2][0]==3*player)
		{
			isGameOver=true;
			return true;
		}
		return false;
	}
        
}
