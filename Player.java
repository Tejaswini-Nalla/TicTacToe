import java.util.ArrayList;
class Player {
    String name;
    String symbol;
    ArrayList<Integer> playerMoves = new ArrayList<Integer>();

    Player(String name,String symbol){
        this.name = name;
        this.symbol = symbol;
    }

    boolean placeMoveOnBoard(int position,String symbol,ArrayList<String> gameBoard){
        gameBoard.set(position,symbol);
        playerMoves.add(position);
        return true;
    }   
}