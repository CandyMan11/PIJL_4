/*
Name-> Saksham Sharma
PRN-> 23070126113
Branch-> AIML B2
 */

package Assignment_4;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.createDeck();
        
        while(true) 
        {
            System.out.println("\n===== CARD DECK MENU =====");
            System.out.println("1. Display all cards");
            System.out.println("2. Shuffle deck");
            System.out.println("3. Print a specific card");
            System.out.println("4. Show all cards of a suit");
            System.out.println("5. Compare cards of the same rank");
            System.out.println("6. Find a specific card");
            System.out.println("7. Deal 5 random cards");
            System.out.println("8. Select two random cards");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice) 
            {
                case 1:
                    deck.display_AllCards();
                    break;
                
                case 2:
                    deck.shuffleDeck();
                    break;

                case 3:
                    System.out.print("Enter index (0 - 52): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;

                case 4:
                    System.out.print("Enter suit (Spades, Clubs, Hearts, Diamonds): ");
                    String suit = scanner.nextLine();
                    deck.display_suit(suit);
                    break;

                case 5:
                    System.out.print("Enter rank (2, 3, ..., Jack, Queen, King, Ace): ");
                    String rank = scanner.nextLine();
                    deck.compareCard(rank);
                    break;

                case 6:
                    System.out.print("Enter rank: ");
                    String searchRank = scanner.nextLine();
                    System.out.print("Enter suit: ");
                    String searchSuit = scanner.nextLine();
                    deck.findCard(searchRank, searchSuit);
                    break;

                case 7:
                    deck.deal_5Cards();
                    break;

                case 8:
                    deck.select_TwoCards();
                    break;

                case 9:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1-9.");
            }
        }
    }
}
