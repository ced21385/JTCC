package chapter07;

import java.lang.System;
import java.lang.String;
import java.lang.Math;

public class DeckOfCards {
    
    public static void main(String[] args) {
        
        int[] deck = new int[52];  // array of 52 int elements with default value of 0
        
        DeckOfCards.initializeCards(deck);
        System.out.println("All " + deck.length + " cards:");  // all 52 cards
        DeckOfCards.printCards(deck);
        System.out.println();  // blank line
                
        DeckOfCards.shuffleCards(deck);
        System.out.println("All " + deck.length + " cards:");  // all 52 cards
        DeckOfCards.printCards(deck);
        System.out.println();  // blank line

        int[] numbers;
        int numberOfNumbers = 4;
        numbers = new int[numberOfNumbers];  // four numbers
        
        // for (int i = 0; i < numbers.length; i++) numbers[i] = deck[i];  // the first 4 cards
        
        System.arraycopy(deck, 0, numbers, 0, numbers.length);  // the first 4 cards
        System.out.println("The first " + numbers.length + " cards:");
        DeckOfCards.printCards(numbers);
        System.out.println();

        System.arraycopy(deck, deck.length - numberOfNumbers, numbers, 0, numberOfNumbers); // the last 4 cards
        System.out.println("The last " + numbers.length + " cards:");
        DeckOfCards.printCards(numbers);
        System.out.println();

        numbers = uniqueRandomNumbers(numbers.length, 0, deck.length - 1); // 4 random cards
        System.out.println(numbers.length + " random cards:");
        DeckOfCards.printCards(numbers);
        System.out.println();
        
    } // main ()
    
    public static void initializeCards(int[] x) {
        for (int i = 0; i < x.length; i++) x[i] = i;
    } // initializeCards()

    public static void shuffleCards(int[] x) {
        
        int j;
        int temp;
        
        for (int i = 0; i < x.length; i++) {
            j = (int)(Math.random() * x.length);    // random number between 0 and (x.length - 1)
            temp = x[i]; x[i] = x[j]; x[j] = temp;  // swap two cards: x[i] and x[j]
        } // for
    
    } // shuffleCards()

    public static void printCards(int[] x) {
        
        String[] suites = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks  = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < x.length; i++)
            System.out.println("\t" + (i + 1) + " Card number " + x[i] + ": \t" + ranks[x[i] % 13] + " of " + suites[x[i] / 13]);

        // for (int e: x) System.out.println("Card number " + e + ": " + ranks[e % 13] + " of " + suites[e / 13]);
    
    } // printCards()

    public static int[] uniqueRandomNumbers(int n, int min, int max) {
        
        int[] numbers = new int[n];

        boolean keepGoing = false;

        int x;

        for (int i = 0; i < numbers.length ; i++) {

            do {
                // keepGoing = false;

                x = min + (int)(Math.random() * (max - min + 1)); // random number between min and max

                for (int j = 0; j < i; j++) { // Check uniqueness
                    
                    if (numbers[j] == x) {
                        keepGoing = true;
                        break;
                    }
                    else keepGoing = false;
                    
                }  // for

            } while (keepGoing); // do

            numbers[i] = x;

        } // for

        return numbers;

    } // uniqueRandomNumbers()

} // class DeckOfCards