# PIJL_4

# Card Deck Simulation in Java

## Overview
This project is a Java-based Card Deck Simulation that allows users to interact with a deck of cards through various operations. Users can display, shuffle, search, compare, and deal cards from the deck using a menu-driven console application.

## Features
- **Display All Cards**: View all 52 cards in the deck.
- **Shuffle Deck**: Randomly shuffle the deck.
- **Print a Specific Card**: Retrieve a card at a specified index.
- **Show All Cards of a Suit**: Display all cards belonging to a particular suit.
- **Compare Cards of the Same Rank**: Find all cards with a given rank.
- **Find a Specific Card**: Search for a card by rank and suit.
- **Deal 5 Random Cards**: Draw five random cards from the deck.
- **Select Two Random Cards**: Pick two random cards from the shuffled deck.

## Installation & Usage
### Prerequisites
- Java Development Kit (JDK) installed (Java 8 or later)
- An IDE like IntelliJ IDEA, Eclipse, or VS Code (Optional)

### Steps to Run
1. Clone this repository:
   ```sh
   git clone https://github.com/your-username/card-deck-java.git
   ```
2. Navigate to the project folder:
   ```sh
   cd card-deck-java
   ```
3. Compile the Java files:
   ```sh
   javac Assignment_4/*.java
   ```
4. Run the program:
   ```sh
   java Assignment_4.Main
   ```
5. Follow the on-screen menu to interact with the deck.

## File Structure
```
Assignment_4/
│── Main.java        # Entry point of the program, handles user interaction
│── Cards.java       # Defines the structure of a single card
│── Deck.java        # Implements deck-related operations
```

## Example Output
```
===== CARD DECK MENU =====
1. Display all cards
2. Shuffle deck
3. Print a specific card
4. Show all cards of a suit
5. Compare cards of the same rank
6. Find a specific card
7. Deal 5 random cards
8. Select two random cards
9. Exit
Enter your choice: 
```

## Contributing
If you want to contribute:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -m "Added new feature"`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a Pull Request.

## License
This project is open-source and available under the [MIT License](LICENSE).
