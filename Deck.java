package Assignment_4;

import java.util.ArrayList;
import java.util.Collections;

public class Deck 
{
    private ArrayList<Cards> deck;

    private String ranks[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};    //array of ranks
    private String suits[] = {"Spades", "Clubs", "Hearts", "Diamonds"};    //array of suits


    //constructor
    public Deck(){
        this.deck = new ArrayList<>();
    }

    //method to create a deck
    public void createDeck()
    {
        for(String suit : suits)
        {
            for(String rank : ranks){
                deck.add(new Cards(rank, suit));
            }
        }
    }

    //method to display the cards
    public void display_AllCards()
    {
        for(Cards card : deck){
            System.out.println(card);
        }
    }

    //method to shuffle the deck
    public void shuffleDeck(){
        Collections.shuffle(deck);
    }

    //method to print a card
    public void printCard(int index)
    {
        shuffleDeck();

        if((index >= 0) && (index < deck.size())){
            System.out.println(deck.get(index));
        } 

        else{
            System.out.println("Invalid index!\n Please enter a value between 0 and " + (deck.size() - 1));
        }
    }

    //method to display cards of a particular suit
    public void display_suit(String suit)
    {
        for(String current_suit : suits)
        {
            if(current_suit.equals(suit)){
                for(String rank : ranks){
                    System.out.println(rank + " of " + suit);
                }
            }
        }
    }

    //method to find cards with the same rank
    public void compareCard(String rank) 
    {
        System.out.println("Cards with rank " + rank + ":");
        for(Cards card : deck){
            if(card.getRank().equalsIgnoreCase(rank)){ 
                System.out.println(card);
            }
        }
    }

    //method to search for a particular card
    public void findCard(String rank, String suit) 
    {
        for(Cards card : deck){
            if((card.getRank().equalsIgnoreCase(rank)) && (card.getSuit().equalsIgnoreCase(suit))){
                System.out.println("Card found: " + card);
                return;
            }
        }

        System.out.println("Card not found!");
    }

    //method to deal 5 random cards
    public void deal_5Cards()
    {
        System.out.println("Dealing 5 random cards:");

        shuffleDeck();
        for(int i = 0; i < 5; i++){
            System.out.println(deck.get(i));
        }
    }
    

    //method to select two cards at random
    public void select_TwoCards(){
        shuffleDeck();
        System.out.println("Card 1: " + deck.get(0));
        System.out.println("Card 2: " + deck.get(1));
    }
}
