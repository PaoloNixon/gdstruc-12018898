package com.paolonixon;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(18);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(68);
        tree.insert(55);

        tree.traverseInOrderDescending();

        tree.getMin();
        tree.getMax();
    }
}
