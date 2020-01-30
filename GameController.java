import java.util.Scanner;
class GameController {
    Scanner input=new Scanner(System.in);
    Player player1=new Player("A","X");
    Player player2=new Player("B","O");
    GameBoard board=new GameBoard();
    String currentplayer=player1.name;
    int position;
    boolean placed;
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
    void startGame()
    {
        while(!board.isGameOver)
        {
            System.out.println(currentplayer+" give position");
            position=input.nextInt();
            if(board.isPositionEmpty(position))
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
                currentplayer=changePlayerturn(currentplayer); 
            }
            
            
        }
    }
    
}