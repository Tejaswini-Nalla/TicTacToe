import java.util.Scanner;
class GameController {
    Scanner input = new Scanner(System.in);
    Player player1 = new Player("A","X");
    Player player2 = new Player("B","O");
    GameBoard board = new GameBoard();
    Player players[] = {player1, player2}; 
    int currentPlayerIndex = 0;
    int position;

    int changeCurrentPlayer(int currentplayer){
        currentPlayerIndex = 1-currentPlayerIndex;
        return currentPlayerIndex;
    }

    void performAction(Player player){
        player.placeMoveOnBoard(position, player.symbol,board.gameBoard);
        board.printBoard();
        board.checkisWinner(player.name, player.playerMoves);  
    }

    void checkPlayer(){
        performAction(players[currentPlayerIndex]);
    }

    void checkPositionEmpty(){
        if(board.isPositionEmpty(position)) {
            checkPlayer();
            changeCurrentPlayer(currentPlayerIndex); 
        }
        else {
            System.out.println("Position filled,give another position");
        }
    }

    void startGame(){
        while(!board.isGameOver){
            if(!board.isBoardfilled()){
                System.out.println("Player "+players[currentPlayerIndex].name+", give position to be placed");
                position = input.nextInt();
                checkPositionEmpty();   
            } 
            else{
                System.out.println("Draw");
                board.isGameOver = true;
            }  
        }
    }
}