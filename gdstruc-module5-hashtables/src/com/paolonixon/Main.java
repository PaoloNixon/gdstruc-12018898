package com.paolonixon;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player paolong11 = new Player(1, "Paolong11", 100);
        Player jelly = new Player(2, "Jelly", 150);
        Player piew = new Player(3, "PIEW", 234);
        Player puffinwarrior02 = new Player(4, "PuffinWarrior02", 211);
        Player deyeeted = new Player(5, "Deyeeted", 342);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(paolong11.getName(), paolong11);
        hashtable.put(jelly.getName(), jelly);
        hashtable.put(piew.getName(), piew);
        hashtable.put(puffinwarrior02.getName(), puffinwarrior02);
        hashtable.put(deyeeted.getName(), deyeeted);
        System.out.println("Starting Table");
        hashtable.printHashtable();
        hashtable.remove("PuffinWarrior02");
        System.out.println("\nTable with removed player that has a same hashvalue with another player (same value of 5: Jelly & PuffinWarrior02, removed: puffin)");
        hashtable.printHashtable();
        hashtable.put(puffinwarrior02.getName(), puffinwarrior02);
        System.out.println("\nTable where PuffinWarrior02 is returned to its original position");
        hashtable.printHashtable();;

    }
}
