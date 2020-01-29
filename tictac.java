import java.util.Scanner;
class tictac{
	static int row,col;
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		TicTacToe game=new TicTacToe();
		while(!game.isGameOver)
		{
			System.out.println(game.player==game.player1?"Player1 choice":"Player2 choice");
			row=scanner.nextInt();
			col=scanner.nextInt();
			if(game.checkplace(row,col))
			{
				if(game.checkWinner(game.player,row,col))
				{  

					if(game.player==game.player1)
					{
						System.out.println("Player1 wins");
						break;
					}
					else
					{
						System.out.println("Player2 wins");
						break;
					}
						
				}
			}
			game.player=game.switchPlayer(game.player);
			
		}
		
	}
}
