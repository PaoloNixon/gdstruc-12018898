package com.paolonixon;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
	    CardStack deck = new CardStack();
        CardStack hand = new CardStack();
        CardStack discardPile = new CardStack();

        deck.push(new Card(1, "Pot of Greed"));
        deck.push(new Card(2, "Dark Magician"));
        deck.push(new Card(3, "Exodia The Forbidden One"));
        deck.push(new Card(4, "Slifer The Sky Dragon"));
        deck.push(new Card(5, "Blue-Eyes White Dragon"));
        deck.push(new Card(6, "Relinquished"));
        deck.push(new Card(7, "The Winged Dragon of Ra"));
        deck.push(new Card(8, "Obelisk The Tormentor"));
        deck.push(new Card(9, "Blue-Eyes Ultimate Dragon"));
        deck.push(new Card(10, "Five-Headed Dragon"));
        deck.push(new Card(11, "Apoqliphort Towers"));
        deck.push(new Card(12, "Chaos Emperor Dragon - Envoy of the End"));
        deck.push(new Card(13, "Dark Armed Dragon"));
        deck.push(new Card(14, "Don Thousand / Monster B"));
        deck.push(new Card(15, "Don Thousand / Monster C"));
        deck.push(new Card(16, "Last Turn"));
        deck.push(new Card(17, "Master Peace, The True Dracoslaying King"));
        deck.push(new Card(18, "Number 16: Shock Master"));
        deck.push(new Card(19, "Obelisk The Tormentor"));
        deck.push(new Card(20, "Slifer The Sky Dragon"));
        deck.push(new Card(21, "Super Quantal Mech King Great Magnus"));
        deck.push(new Card(22, "The Tyrant Neptune"));
        deck.push(new Card(23, "Victory Dragon"));
        deck.push(new Card(24, "Jinzo"));
        deck.push(new Card(25, "Elemental HERO Stratos"));
        deck.push(new Card(26, "Confiscation"));
        deck.push(new Card(27, "Cyber Dragon Infinity"));
        deck.push(new Card(28, "Dark Strike Fighter"));
        deck.push(new Card(29, "Dark Hole"));
        deck.push(new Card(30, "Solemn Judgement"));

        int y = rand.nextInt(5) + 1;

        System.out.println("Game Start!");
        while (deck.countStack() != 0)
        {
            int action = rand.nextInt(3);
            int x = rand.nextInt(5) + 1;
            System.out.println("Round Start:");
            if (action == 0)
            {
                if (deck.isEmpty() == true)
                {
                    System.out.println("Draw Failed, Deck is Empty");
                }
                if (deck.countStack() < x && deck.isEmpty() == false)
                {
                    System.out.println("Cannot Draw " + x + " Cards, Deck Only has " + deck.countStack() + " Cards Remaining");
                    System.out.println("Drawing " + deck.countStack() + " Cards Instead");
                    deck.draw(hand, deck.countStack());
                }
                if (deck.countStack() >= x)
                {
                    System.out.println("Drawing " + x + " Cards");
                    deck.draw(hand, x);
                }
            }

            if (action == 1)
            {
                if (hand.isEmpty() == true)
                {
                    System.out.println("Discard Failed, There are No Cards on Hand");
                }
                if (hand.countStack() < x && hand.isEmpty() == false)
                {
                    System.out.println("Cannot Discard " + x + " Cards, There are Only " + hand.countStack() + " Cards on Hand");
                    System.out.println("Discarding " + hand.countStack() + " Cards Instead");
                    hand.discard(discardPile, hand.countStack());
                }
                if (hand.countStack() >= x)
                {
                    System.out.println("Discarding " + x + " Cards");
                    hand.discard(discardPile, x);
                }
            }

            if (action == 2)
            {
                if (discardPile.isEmpty() == true)
                {
                    System.out.println("Get Failed, There are No Cards on Hand");
                }
                if (discardPile.countStack() < x && discardPile.isEmpty() == false)
                {
                    System.out.println("Cannot Get " + x + " Cards, Discard Pile Only has " + discardPile.countStack() + " Cards Remaining");
                    System.out.println("Getting " + discardPile.countStack() + " Cards Instead");
                    discardPile.get(hand, discardPile.countStack());
                }
                if (discardPile.countStack() >= x)
                {
                    System.out.println("Getting " + x + " Cards");
                    discardPile.get(hand, x);
                }
            }
            System.out.println();
            System.out.println("Round End Card Count:");
            System.out.println("On hand: " + hand.countStack() + " Cards");
            System.out.println("Deck: " + deck.countStack() + " Cards");
            System.out.println("Discard Pile: " + discardPile.countStack() + " Cards");
            System.out.println();
        }

        System.out.println("Player deck is now empty!");
        System.out.println("Ending the game...");
        System.out.println("Thank you for playing!");
    }
}
