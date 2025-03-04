package Assignment_4;

public class Cards 
{
    protected String rank;
    protected String suit;

    //constructor
    public Cards(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }    

    //getter method for rank
    public String getRank(){
        return rank;
    }

    //getter method for suit
    public String getSuit(){
        return suit;
    }

    public String toString(){
        return rank + " of " + suit;
    }
}
