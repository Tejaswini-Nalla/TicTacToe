import java.util.Scanner;
class tictac{
	static String user1_name;
	static String user2_name;
	static int user1_choice;
	static int user2_choice;
        static int player=1;
	static boolean isGameOver=false;
	static int gameBoard[][]=new int[3][3];
	static int i,j;
        static boolean checkplace(int i,int j)
	{ 	
		if(gameBoard[i][j]!=0){
			System.out.println("Already placed");
			return false;
		}
		if(i<0 || i>2 || j<0 || j>2){
			System.out.println("Enter correct positions");
			return false;
		}
		
		gameBoard[i][j]=player;
		if(player==1)
		{
			player=-1;
		}
		else
		{
			player=1;
		}
		return true;
	}
	static boolean checkWinner(int player)
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
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the user1 name");
		user1_name=s.next();
		System.out.println("Enter user1 choice '-1' or '1'");
		user1_choice=s.nextInt();
		System.out.println("Enter the user2 name");
                user2_name=s.next();
                System.out.println("Enter user2 choice '-1' or '1'");
                user2_choice=s.nextInt();
		while(!isGameOver)
		{
			System.out.println(player==1?"User 1 choice":"User 2 choice");
			i=s.nextInt();
			j=s.nextInt();
			if(checkplace(i,j))
			{
				if(checkWinner(player))
				{  
					if(player==1)
					{
						System.out.println("User1 wins");
					}
					else
					{
						System.out.println("User2 wins");
					}
						
				}
			}
			
		}
		
	}
}
