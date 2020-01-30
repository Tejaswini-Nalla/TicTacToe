import java.util.ArrayList;

class Player {
    String name;
    String symbol;
    int position;
    boolean placeMoveOnBoard(int pos,String symbol,ArrayList<String> gameBoard)
    {
        gameBoard.add(pos,symbol);
        return true;

    }
}