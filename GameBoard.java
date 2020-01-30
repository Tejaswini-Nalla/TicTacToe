import java.util.ArrayList;
import java.util.Arrays;
class GameBoard {
	public boolean isGameOver=false;
	public ArrayList<String> gameBoard=new ArrayList<String>(9);
	int winPositions[][]={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8}};
	boolean isPositionEmpty(int position)
	{
		if(gameBoard.get(position)!="")
			return true;
		return false;
	}
	boolean isBoardfilled()
	{
		return false;
	}
	void checkisWinner(String name,ArrayList<Integer> playerMoves)
	{
		ArrayList<Integer> checkPositions=new ArrayList<>();
		for(int i=0;i<winPositions.length;i++)
		{
			checkPositions.addAll(Arrays.asList(winPositions[i][0],winPositions[i][1],winPositions[i][2]));
			if(playerMoves.containsAll(checkPositions))
			{
				isGameOver=true;
				System.out.println(name+"Won");
				break;
			}
		}
	}
        
}
