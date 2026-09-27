/*
 * Problem -10 GCR Java strings Level 3
 * Write a program to create a deck of cards, initialize the deck, shuffle the
 * deck, and distribute the deck of n cards to x number of players. Finally,
 * print the cards the players have.
 * Hint =>
 * Create a deck of cards with suits "Hearts", "Diamonds", "Clubs", "Spades" and
 * ranks from "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
 * "King", and "Ace"
 * Calculate the number of cards in the deck and initialize the deck
 * int numOfCards = suits.length * ranks.length;
 * Write a Method to Initialize the deck of cards with suits and ranks and
 * return the deck. The deck is an array of strings where each string represents
 * a card in the deck represented as "rank of suit" e.g., "2 of Hearts"
 * Write a Method to Shuffle the deck of cards and return the shuffled deck. To
 * shuffle the card iterate over the deck and swap each card with a random card
 * from the remaining deck to shuffle the deck. Please find the steps below
 * Step1: Use for Loop Iterate over the deck and swap each card with a random
 * card from the remaining deck
 * Step 2: Inside the Loop Generate a random card number between i and n using
 * the following code
 * int randomCardNumber = i + (int) (Math.random() * (n - i));
 * Step 3: Swap the current card with the random card
 * Write a Method to distribute the deck of n cards to x number of players and
 * return the players. For this Check the n cards can be distributed to x
 * players. If possible then Create a 2D array to store the players and their
 * cards
 * Write a Method to Print the players and their cards
 * 
 * 
 * Author: Dheeraj Buchha
 * Date: 27-09-2026
 */

import java.util.Scanner;

public class decks {

    // Method to initialize the deck
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }

        return deck;
    }

    // Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int n, int players) {
        if (n % players != 0) {
            return null;
        }

        int cardsPerPlayer = n / players;

        String[][] playerCards = new String[players][cardsPerPlayer];

        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[index];
                index++;
            }
        }

        return playerCards;
    }

    // Method to print players and their cards
    public static void printPlayers(String[][] playerCards) {
        for (int i = 0; i < playerCards.length; i++) {
            System.out.println("Player " + (i + 1) + ":");

            for (int j = 0; j < playerCards[i].length; j++) {
                System.out.println(playerCards[i][j]);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] suits = {
                "Hearts", "Diamonds", "Clubs", "Spades"
        };

        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King", "Ace"
        };

        System.out.print("Enter number of cards: ");
        int n = sc.nextInt();

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        String[] deck = initializeDeck(suits, ranks);

        shuffleDeck(deck);

        if (n > deck.length) {
            System.out.println("Number of cards cannot be greater than 52.");
            return;
        }

        String[][] playerCards = distributeCards(deck, n, players);

        if (playerCards == null) {
            System.out.println("Cards cannot be equally distributed among players.");
        } else {
            printPlayers(playerCards);
        }
    }
}