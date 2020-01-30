import java.util.Scanner;
class GameController {
    Scanner input=new Scanner(System.in);
    Player player1=new Player("A","X");
    Player player2=new Player("B","O");
    GameBoard board=new GameBoard();
    String currentplayer=player1.name;
    int position;
    String changePlayerturn(String currentplayer)
    {
        if(currentplayer==player1.name)
        {
            return player2.name;
        }
        else
        {
            return player1.name;
        }
    }
    void performAction()
    {
        if(currentplayer==player1.name)
        {
            player1.placeMoveOnBoard(position, player1.symbol,board.gameBoard);
            board.printBoard();
            board.checkisWinner(player1.name, player1.playerMoves);
        }
        else
        {
            player2.placeMoveOnBoard(position, player2.symbol,board.gameBoard); 
            board.printBoard();
            board.checkisWinner(player2.name, player2.playerMoves);  
        }
    }
    void checkPositionEmpty()
    {
        if(board.isPositionEmpty(position))
        {
            performAction();
            currentplayer=changePlayerturn(currentplayer); 
        }
        else
        {
            System.out.println("Position filled,give another position");
        }
    }
    void startGame()
    {
        while(!board.isGameOver)
        {
            if(!board.isBoardfilled())
            {
                System.out.println("Player "+currentplayer+", give position to be placed");
                position=input.nextInt();
                checkPositionEmpty();   
            } 
            else
            {
                System.out.println("Draw");
                board.isGameOver=true;
            }  
        }
    }
    
}