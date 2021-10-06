package com.paolonixon;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CardStack {
    private LinkedList<Card> stack;

    public CardStack()
    {
        stack = new LinkedList<Card>();
    }

    public void push(Card card)
    {
        stack.push(card);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Card pop()
    {
        return stack.pop();
    }

    public Card peek()
    {
        return stack.peek();
    }

    public void printStack()
    {
        ListIterator<Card> iterator = stack.listIterator();

        System.out.println("Printing Card Stack");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public int countStack()
    {
        ListIterator<Card> iterator = stack.listIterator();
        int count = 0;
        while (iterator.hasNext())
        {
            count++;
            iterator.next();
        }
        return count;
    }

    public void draw(CardStack hand, int rand)
    {
        for (int i = 0; i < rand; i++)
        {
            hand.push(this.pop());
            System.out.println("Drawing " + hand.peek());
        }
    }

    public void discard(CardStack discardPile, int rand)
    {
        for (int i = 0; i < rand; i++)
        {
            discardPile.push(this.pop());
            System.out.println("Discarding " + discardPile.peek());
        }
    }

    public void get(CardStack hand, int rand)
    {
        for (int i = 0; i < rand; i++)
        {
            hand.push(this.pop());
            System.out.println("Getting " + hand.peek());
        }
    }
}
