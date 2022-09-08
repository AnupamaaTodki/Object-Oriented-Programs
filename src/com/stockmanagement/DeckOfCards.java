package com.stockmanagement;

import java.util.Random;

public class DeckOfCards {
	static String suit[] = {"Club", "Daimond", "Spades", "Hearts"};
	static String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Ace", "King", "Quine", "jack"};
	static String deck[] = new String[52];
	static Random random = new Random();
	static String player1[] = new String[9];
	static String player2[] = new String[9];
	static String player3[] = new String[9];
	static String player4[] = new String[9];

	public static void main(String[] args) {
	for(int i = 0; i < deck.length; i++) {
		deck[i] = rank[i % 13] + suit[i / 13];
	}
	
	for( int i = 0; i < deck.length; i++) {
		int index = random.nextInt(52);
		String temp = deck[i];
		deck[i] = deck[index];
		deck[index] = temp;
	}
		
     distributeCards();
     System.out.println("****************");
     System.out.println("Player 1 cards");
     for(String cards : player1) {
    	 System.out.println(cards);
     }
     System.out.println("****************");
     System.out.println("Player 2 cards");
     for(String cards : player1) {
    	 System.out.println(cards);
     }
     System.out.println("****************");
     System.out.println("Player 3 cards");
     for(String cards : player1) {
    	 System.out.println(cards);
     }
     System.out.println("****************");
     System.out.println("Player 4 cards");
     for(String cards : player1) {
    	 System.out.println(cards);
     }
     
}


	public static void distributeCards() {
		for ( int i = 0; i < deck.length; i ++) {
			if(i < 9) {
				player1[i] = deck[i];
			}
			else if(i < 18 && i >= 9) {
				player2[i-9] = deck[i];
			}
			else if(i < 27 && i >= 18) {
				player3[i-18] = deck[i];
			}
			else if(i < 36 && i >= 27) {
				player4[i-27] = deck[i];
				}
		}
	}
	}