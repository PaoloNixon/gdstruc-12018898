package com.paolonixon;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayQueue queue = new ArrayQueue(20);
        ArrayQueue pList = new ArrayQueue(20);
        pList.add(new Player(1, "Paolong11", 100));
        pList.add(new Player(2, "Jelly", 150));
        pList.add(new Player(3, "PIEW", 234));
        pList.add(new Player(4, "PuffinWarrior02", 211));
        pList.add(new Player(5, "Deyeeted", 342));
        pList.add(new Player(6, "The_GuestNo.1", 199));
        pList.add(new Player(7, "The_GuestNo.2", 143));
        pList.add(new Player(8, "John", 351));
        pList.add(new Player(9, "Gunther", 90));
        pList.add(new Player(10, "TempestIcy", 123));
        pList.add(new Player(11, "King Kai", 103));
        pList.add(new Player(12, "sping", 34));
        pList.add(new Player(13, "KX", 392));
        pList.add(new Player(14, "marc_the_dog24", 135));
        pList.add(new Player(15, "IncogLad", 405));
        pList.add(new Player(16, "Enhance", 59));
        pList.add(new Player(17, "Moyaaaaa", 384));
        pList.add(new Player(18, "m4gpiie", 203));
        pList.add(new Player(19, "Cindarhulk", 294));
        pList.add(new Player(20, "Yeast", 23));
        int match = 0;
        while (match < 10)
        {
            System.out.println("Match Making...");
            int x = rand.nextInt(7) + 1;
            for (int i = 0; i <= x; i++)
            {
                queue.add(pList.remove());
            }
            System.out.println("Queue " + queue.size() + "/5");

            if (queue.size() >= 5)
            {
                System.out.println("Creating a game...");
                System.out.println("Players:");
                for (int i = 0; i < 5; i++)
                {
                    System.out.println(queue.peek());
                    pList.add(queue.remove());
                }
                match++;
                System.out.println("Remaining players in queue: " + queue.size());
                if (queue.size() >= 5)
                {
                    System.out.println("\nThere are enough players in queue");
                    System.out.println("Creating another game...");
                    System.out.println("Players:");
                    for (int i = 0; i < 5; i++)
                    {
                        System.out.println(queue.peek());
                        pList.add(queue.remove());
                    }
                    match++;
                    System.out.println("Remaining players in queue: " + queue.size());
                }
            }
            System.out.println("(Enter y to continue)");
            String text = scanner.next();
        }
        System.out.println("\nCreated 10 games");
        System.out.println("Closing the queue");
    }
}
