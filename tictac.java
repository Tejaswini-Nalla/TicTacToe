import java.util.Scanner;
class tictac{
	static boolean isGameOver=false;
	static int i,j;
      
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		TicTacToe game=new TicTacToe();
		while(!isGameOver)
		{
			System.out.println(game.player==game.player1?"Player1 choice":"Player2 choice");
			i=s.nextInt();
			j=s.nextInt();
			if(game.checkplace(i,j))
			{
				if(game.checkWinner(game.player))
				{  
					if(game.player==game.player1)
					{
						System.out.println(isGameOver);
						System.out.println("Player1 wins");
						isGameOver=true;
						System.out.println("after chage"+isGameOver);
					}
					else
					{
						System.out.println("Player2 wins");
						isGameOver=true;
					}
						
				}
			}
			
		}
		
	}
}
