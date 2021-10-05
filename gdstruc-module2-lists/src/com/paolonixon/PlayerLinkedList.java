package com.paolonixon;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }


    public void  printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public void deleteFront() {
        PlayerNode current = head;
        PlayerNode temp;
        temp = current;
        head = current.getNextPlayer();
        current.setPlayer(null);
    }

    public void count(){
        int counter = 0;
        PlayerNode current = head;
        while (current != null) {
            current = current.getNextPlayer();
            counter++;
        }
        System.out.println("List Size: " + counter);
    }

    public boolean contains(Player player, int id, String name, int level){
        PlayerNode current = head;
        while (current != null) {
            current = current.getNextPlayer();
            if(player.getId() == id &&player.getName() == name && player.getLevel() == level)
            {
                return true;
            }
        }
        return false;
    }

    public int indexof(Player player, int id, String name, int level){
        PlayerNode current = head;
        int count = 0;
        while (current != null) {
            current = current.getNextPlayer();
            if(player.getId() == id &&player.getName() == name && player.getLevel() == level)
            {
                return count;
            }
            count++;
        }
        System.out.println("Player Not Found!");
        return -1;
    }
}
