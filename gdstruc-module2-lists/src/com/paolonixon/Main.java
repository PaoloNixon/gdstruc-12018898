package com.paolonixon;

public class Main {

    public static void main(String[] args) {

        Player paolong11 = new Player(1, "Paolong11", 100);
        Player jelly = new Player(2, "Jelly", 150);
        Player piew = new Player(3, "PIEW", 234);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(paolong11);
        playerLinkedList.addToFront(jelly);
        playerLinkedList.addToFront(piew);

        playerLinkedList.printList();
        playerLinkedList.count();
        System.out.println();
        System.out.println("Contain Search Result:");
        System.out.println(playerLinkedList.contains(paolong11 ,1, "Paolong11", 100));
        System.out.println();
        System.out.println("Index Search Result:");
        System.out.println(playerLinkedList.indexof(piew ,3, "PIEW", 234));
        playerLinkedList.deleteFront();
        System.out.println();
        System.out.println("Removed front!:");
        playerLinkedList.printList();
    }
}
