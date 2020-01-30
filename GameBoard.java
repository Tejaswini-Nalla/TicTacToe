import java.util.ArrayList;

class TicTacToe {
	public ArrayList<String> gameBoard=new ArrayList<String>(9);
	public boolean isGameOver=false;
	boolean isPositionEmpty(int position)
	{
		if(gameBoard.get(position).isEmpty())
			return true;
		return false;
	}
	boolean isBoardfilled()
	{
		return false;
	}
        
}
