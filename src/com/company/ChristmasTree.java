package com.company;

public class ChristmasTree {
    public static void main(String[] args) {

        int treeHeight = 5;
        System.out.println();
        printChristmasTree(treeHeight);
    }

    static void printChristmasTree(int treeHeight) {

        for (int i = 1; i <= treeHeight; i++)
        {
            for (int j = treeHeight - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

