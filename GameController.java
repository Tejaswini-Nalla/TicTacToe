
class GameController{
    Player player1=new Player();
    Player player2=new Player();
    String currentplayer=player1.name;
    void changePlayerturn(String currentplayer)
    {
        currentplayer=currentplayer==player1.name?player2.name:player1.name;
    }
    
}