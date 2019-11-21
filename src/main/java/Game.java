import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(){
        players = new ArrayList<Player>();
        deck = new Deck();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void dealCards(){
        for(Player player : players) {
            deck.dealHand(player);
        }
    }

//    public String getWinner() {
//
//
//    }

}
