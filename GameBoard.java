import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class GameBoard {
	public boolean isGameOver=false;
	public ArrayList<String> gameBoard=new ArrayList<String>(Collections.nCopies(9, "-"));
	int winPositions[][]={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{1,4,8},{2,4,6}};
	boolean isPositionEmpty(int position)
	{
		if(gameBoard.get(position)=="-")
			return true;
		return false;
	}
	boolean isBoardfilled()
	{
		int countfilled=0;
		for(String valueOnBoard:gameBoard)
		{
			if(valueOnBoard!="-")
			  countfilled++;
		}
		if(countfilled==9)
		   return true;
		return false;
	}
	void checkisWinner(String name,ArrayList<Integer> playerMoves)
	{
		System.out.println(name+" moves:"+playerMoves);
		for(int i=0;i<winPositions.length;i++)
		{
			ArrayList<Integer> checkPositions=new ArrayList<>();
			checkPositions.addAll(Arrays.asList(winPositions[i][0],winPositions[i][1],winPositions[i][2]));
			if(playerMoves.containsAll(checkPositions))
			{
				isGameOver=true;
				System.out.println(name+" "+"Won");
				break;
			}
		}
	}
	void printBoard()
	{
		System.out.println(gameBoard);
	}
        
}
