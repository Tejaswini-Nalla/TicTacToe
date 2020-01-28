import java.util.Scanner;
class tictac{
	static int row,col;
      
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		TicTacToe game=new TicTacToe();
		while(!game.isGameOver)
		{
			System.out.println(game.player==game.player1?"Player1 choice":"Player2 choice");
			row=s.nextInt();
			col=s.nextInt();
			if(game.checkplace(row,col))
			{
				if(game.checkWinner(game.player))
				{  

					if(game.player==game.player1)
					{
						System.out.println("Player1 wins");
						break;
					}
					else
					{
						System.out.println("Player2 wins");
					}
						
				}
			}
			if(game.player==game.player1)
		   {
			   game.player=game.player2;
		   }
		  else
		   {
			   game.player=game.player1;
		   }
			
		}
		
	}
}
