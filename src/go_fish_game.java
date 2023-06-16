import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;
public class go_fish_game
{
    public static void main(String[] args)
    {
        int i;
        deck card[] = new deck[52];
        for (i = 0; i<=51; i++)
        {
            card[i] = new deck();
        }

        game_play value=new game_play();
        value.load(card);
        value.displayRules();
        value.fish(card);
        System.exit(0);
    }
}

class game_play extends deck
{
    int i;
    int card_flag;

    int card_count=0;
    int deck_position;
    String player_name;
    Player[] players;

    void load(deck card[])
    {

        card[0].card_name="TWO";
        card[0].card_type="heart";
        card[0].card_value=2;
        card[0].dealt=false;
        card[1].card_name="THREE";
        card[1].card_type="heart";
        card[1].card_value=3;
        card[1].dealt=false;
        card[2].card_name="FOUR";
        card[2].card_type="heart";
        card[2].card_value=4;
        card[2].dealt=false;
        card[3].card_name="FIVE";
        card[3].card_type="heart";
        card[3].card_value=5;
        card[3].dealt=false;
        card[4].card_name="SIX";
        card[4].card_type="heart";
        card[4].card_value=6;
        card[4].dealt=false;
        card[5].card_name="SEVEN";
        card[5].card_type="heart";
        card[5].card_value=7;
        card[5].dealt=false;
        card[6].card_name="EIGHT";
        card[6].card_type="heart";
        card[6].card_value=8;
        card[6].dealt=false;
        card[7].card_name="NINE";
        card[7].card_type="heart";
        card[7].card_value=9;
        card[7].dealt=false;
        card[8].card_name="TEN";
        card[8].card_type="heart";
        card[8].card_value=10;
        card[8].dealt=false;
        card[9].card_name="ACE";
        card[9].card_type="heart";
        card[9].card_value=1;
        card[9].dealt=false;
        card[10].card_name="JACK";
        card[10].card_type="heart";
        card[10].card_value=10;
        card[10].dealt=false;
        card[11].card_name="QUEEN";
        card[11].card_type="heart";
        card[11].card_value=10;
        card[11].dealt=false;
        card[12].card_name="KING";
        card[12].card_type="heart";
        card[12].card_value=10;
        card[12].dealt=false;

        card[13].card_name="TWO";
        card[13].card_type="diamond";
        card[13].card_value=2;
        card[13].dealt=false;
        card[14].card_name="THREE";
        card[14].card_type="diamond";
        card[14].card_value=3;
        card[14].dealt=false;
        card[15].card_name="FOUR";
        card[15].card_type="diamond";
        card[15].card_value=4;
        card[15].dealt=false;
        card[16].card_name="FIVE";
        card[16].card_type="diamond";
        card[16].card_value=5;
        card[16].dealt=false;
        card[17].card_name="SIX";
        card[17].card_type="diamond";
        card[17].card_value=6;
        card[17].dealt=false;
        card[18].card_name="SEVEN";
        card[18].card_type="diamond";
        card[18].card_value=7;
        card[18].dealt=false;
        card[19].card_name="EIGHT";
        card[19].card_type="diamond";
        card[19].card_value=8;
        card[19].dealt=false;
        card[20].card_name="NINE";
        card[20].card_type="diamond";
        card[20].card_value=9;
        card[20].dealt=false;
        card[21].card_name="TEN";
        card[21].card_type="diamond";
        card[21].card_value=10;
        card[21].dealt=false;
        card[22].card_name="ACE";
        card[22].card_type="diamond";
        card[22].card_value=1;
        card[22].dealt=false;
        card[23].card_name="JACK";
        card[23].card_type="diamond";
        card[23].card_value=10;
        card[23].dealt=false;
        card[24].card_name="QUEEN";
        card[24].card_type="diamond";
        card[24].card_value=10;
        card[24].dealt=false;
        card[25].card_name="KING";
        card[25].card_type="diamond";
        card[25].card_value=10;
        card[25].dealt=false;

        card[26].card_name="TWO";
        card[26].card_type="spade";
        card[26].card_value=2;
        card[26].dealt=false;
        card[27].card_name="THREE";
        card[27].card_type="spade";
        card[27].card_value=3;
        card[27].dealt=false;
        card[28].card_name="FOUR";
        card[28].card_type="spade";
        card[28].card_value=4;
        card[28].dealt=false;
        card[29].card_name="FIVE";
        card[29].card_type="spade";
        card[29].card_value=5;
        card[29].dealt=false;
        card[30].card_name="SIX";
        card[30].card_type="spade";
        card[30].card_value=6;
        card[30].dealt=false;
        card[31].card_name="SEVEN";
        card[31].card_type="spade";
        card[31].card_value=7;
        card[31].dealt=false;
        card[32].card_name="EIGHT";
        card[32].card_type="spade";
        card[32].card_value=8;
        card[32].dealt=false;
        card[33].card_name="NINE";
        card[33].card_type="spade";
        card[33].card_value=9;
        card[33].dealt=false;
        card[34].card_name="TEN";
        card[34].card_type="spade";
        card[34].card_value=10;
        card[34].dealt=false;
        card[35].card_name="ACE";
        card[35].card_type="spade";
        card[35].card_value=1;
        card[35].dealt=false;
        card[36].card_name="JACK";
        card[36].card_type="spade";
        card[36].card_value=10;
        card[36].dealt=false;
        card[37].card_name="QUEEN";
        card[37].card_type="spade";
        card[37].card_value=10;
        card[37].dealt=false;
        card[38].card_name="KING";
        card[38].card_type="spade";
        card[38].card_value=10;
        card[38].dealt=false;

        card[39].card_name="TWO";
        card[39].card_type="club";
        card[39].card_value=2;
        card[39].dealt=false;
        card[40].card_name="THREE";
        card[40].card_type="club";
        card[40].card_value=3;
        card[40].dealt=false;
        card[41].card_name="FOUR";
        card[41].card_type="club";
        card[41].card_value=4;
        card[41].dealt=false;
        card[42].card_name="FIVE";
        card[42].card_type="club";
        card[42].card_value=5;
        card[42].dealt=false;
        card[43].card_name="SIX";
        card[43].card_type="club";
        card[43].card_value=6;
        card[43].dealt=false;
        card[44].card_name="SEVEN";
        card[44].card_type="club";
        card[44].card_value=7;
        card[44].dealt=false;
        card[45].card_name="EIGHT";
        card[45].card_type="club";
        card[45].card_value=8;
        card[45].dealt=false;
        card[46].card_name="NINE";
        card[46].card_type="club";
        card[46].card_value=9;
        card[46].dealt=false;
        card[47].card_name="TEN";
        card[47].card_type="club";
        card[47].card_value=10;
        card[47].dealt=false;
        card[48].card_name="ACE";
        card[48].card_type="club";
        card[48].card_value=1;
        card[48].dealt=false;
        card[49].card_name="JACK";
        card[49].card_type="club";
        card[49].card_value=10;
        card[49].dealt=false;
        card[50].card_name="QUEEN";
        card[50].card_type="club";
        card[50].card_value=10;
        card[50].dealt=false;
        card[51].card_name="KING";
        card[51].card_type="club";
        card[51].card_value=10;
        card[51].dealt=false;
    }
    void displayRules() {
        JOptionPane.showMessageDialog(null, "Welcome to Go Fish!" +
                "\n\nRules:" +
                "\n1. Each player starts with 7 cards." +
                "\n2. Players take turns asking the opponent if they have a card of a certain rank." +
                "\n3. If the opponent has that card, they must give it to the player and the turn ends." +
                "\n4. If the opponent doesn't have that card, the player must draw one card from the deck and the turn ends." +
                "\n5. If the player gets all four cards of a rank, they form a book and place it aside." +
                "\n6. The game ends when all 52 cards have been drawn and no books can be formed." +
                "\n7. The player with the most books at the end of the game wins.");
    }
    void printdeck(deck card[])
    {
        //loop to print all cards
        for (i=0; i<=51; ++i)
        {
            if((i==13)||(i==26)||(i==39))
                System.out.println();
            System.out.println(card[i].card_name+" "+card[i].card_type+" " +card[i].card_value+" " +card[i].dealt);
        }//for loop
    }
    void fish(deck card[]) {
        int currentPlayerIndex = 0;
        int humanBooksCount = 0;
        int computerBooksCount = 0;

        players = new Player[2];
        String playerName = JOptionPane.showInputDialog(null,
                "Enter the player's name", "Input Data", JOptionPane.QUESTION_MESSAGE);
        playerName = playerName.toUpperCase();

        players[0] = new Player(playerName);
        players[1] = new Player("Computer");

        for (int i = 0; i < 7; i++) {
            players[0].addCard(deal_card(card));
            players[1].addCard(deal_card(card));
        }
        players[0].printHand();
        boolean gameOver = false;
        while (!gameOver) {
            Player humanPlayer = players[0];
            Player computer = players[1];
            while (currentPlayerIndex == 0) {
                String playerRequest = JOptionPane.showInputDialog(null,
                        "Enter the rank of the card you are looking for (e.g. 'Two'):", "Input Card", JOptionPane.QUESTION_MESSAGE);
                playerRequest = playerRequest.toUpperCase();

                switch (playerRequest) {
                    case "1" -> playerRequest = "ONE";
                    case "2" -> playerRequest = "TWO";
                    case "3" -> playerRequest = "THREE";
                    case "4" -> playerRequest = "FOUR";
                    case "5" -> playerRequest = "FIVE";
                    case "6" -> playerRequest = "SIX";
                    case "7" -> playerRequest = "SEVEN";
                    case "8" -> playerRequest = "EIGHT";
                    case "9" -> playerRequest = "NINE";
                    case "10" -> playerRequest = "TEN";
                    case "11" -> playerRequest = "JACK";
                    case "12" -> playerRequest = "QUEEN";
                    case "13" -> playerRequest = "KING";
                    case "14" -> playerRequest = "ACE";
                    default -> {
                    }
                }

                if (players[1].hasCard(playerRequest)) {
                    players[1].transferCard(players[0], playerRequest);
                    JOptionPane.showMessageDialog(null, "Computer has: " + playerRequest);
                    System.out.println("New Hand");
                    players[0].printHand();
                    currentPlayerIndex = 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Computer does not have: " + playerRequest + " Go Fish!");
                    System.out.println("Does not have condition");
                    deck drawnCard = deal_card(card);
                    players[0].addCard(drawnCard);
                    JOptionPane.showMessageDialog(null, "You drew the " + drawnCard.card_name, "Drawn Card", JOptionPane.INFORMATION_MESSAGE);
                    players[0].printHand();
                    currentPlayerIndex = 1;
                }
                ArrayList<deck> humanBooks = humanPlayer.checkBooks();
                if (!humanBooks.isEmpty()) {
                    humanBooksCount++;
                }
                JOptionPane.showMessageDialog(null, "Human Books " + humanBooksCount + "\nComputer Books " + computerBooksCount);
            }

            while (currentPlayerIndex == 1) {
                if (computer.getHand().isEmpty()) {
                    computer.addCard(deal_card(card));
                }
                String requestedCard = computer.requestCardComp();
                if (players[0].hasCard(requestedCard)) {
                    players[0].transferCard(players[1], requestedCard);
                    JOptionPane.showMessageDialog(null, playerName + " The computer has requested: " + requestedCard);
                    JOptionPane.showMessageDialog(null, playerName + " has: " + requestedCard);
                    currentPlayerIndex = 0;
                } else {
                    JOptionPane.showMessageDialog(null, playerName + " does not have: " + requestedCard + ". Go Fish, Computer!");
                    players[1].addCard(deal_card(card));
                    currentPlayerIndex = 0;
                }
                ArrayList<deck> computerBooks = computer.checkBooks();
                if (!computerBooks.isEmpty()) {
                    computerBooksCount++;
                }
            }

            if (card_count == 52) {
                gameOver = true;
                if (humanBooksCount > computerBooksCount) {
                    JOptionPane.showMessageDialog(null, playerName + " wins with " + humanBooksCount + " books to " + players[1].name + "'s " + computerBooksCount + " books");
                } else if (computerBooksCount > humanBooksCount) {
                    JOptionPane.showMessageDialog(null, players[1].name + " wins with " + computerBooksCount + " books to " + playerName + "'s " + humanBooksCount + " books");
                } else {
                    JOptionPane.showMessageDialog(null, "It's a tie! Both players have same amount of books");
                }
            }
        }
    }

    deck deal_card(deck card[])
    {
        int deck_position;
        do {
            deck_position = (int) (Math.random() * 52);
        } while (card[deck_position].dealt);

        card[deck_position].dealt = true;
        card_count++;
        return card[deck_position];
    }

    class Player {
        String name;
        ArrayList<deck> hand;

        Player(String name) {
            this.name = name;
            hand = new ArrayList<>();
        }
        public ArrayList<deck> getHand() {
            return hand;
        }
        void addCard(deck card) {
            hand.add(card);
        }
        String requestCardComp() {
            int randomIndex = (int) (Math.random() * hand.size());
            return hand.get(randomIndex).card_name;

        }

        void transferCard(Player toPlayer, String cardRank) {
            int i = 0;
            while (i < hand.size()) {
                if (hand.get(i).card_name.equalsIgnoreCase(cardRank)) {
                    toPlayer.addCard(hand.get(i));
                    hand.remove(i);
                } else {
                    i++;
                }
            }
        }
        
        /*void printHand() {
            System.out.println(name + "'s Hand:");
            for (deck deck : hand) {
                System.out.println(deck.card_name + " of " + deck.card_type + "s");
            }
            System.out.println();
        }*/
        void printHand() {
            StringBuilder handStr = new StringBuilder(name + "'s Hand:\n");
            for (deck deck : hand) {
                handStr.append(deck.card_name).append(" of ").append(deck.card_type).append("s\n");
            }
            System.out.println(name + "'s Hand:");
            for (deck deck : hand) {
                System.out.println(deck.card_name + " of " + deck.card_type + "s");
            }
            JOptionPane.showMessageDialog(null, handStr.toString());
        }
        
        ArrayList<deck> checkBooks() {
            ArrayList<deck> books = new ArrayList<>();
            for (int i = 0; i < hand.size(); i++) {
                deck currentCard = hand.get(i);
                int count = 0;
                for (deck value : hand) {
                    if (Objects.equals(value.card_name, currentCard.card_name)) {
                        count++;
                    }
                }
                if (count == 4) {
                    for (deck deck : hand) {
                        if (Objects.equals(deck.card_name, currentCard.card_name)) {
                            books.add(deck);
                        }
                    }
                }
            }
            hand.removeAll(books);
            return books;
        }
        public boolean hasCard(String cardName) {
            for (deck card : hand) {
                if (card.card_name.equals(cardName)) {
                    return true;
                }
            }
            return false;
        }
    }



}

class deck
{
    String card_name;
    String card_type;
    int card_value;
    boolean dealt;
}