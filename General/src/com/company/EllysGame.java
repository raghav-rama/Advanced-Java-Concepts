package com.company;

import java.util.Arrays;

public class EllysGame {
    private final char NULL = '\u0000';
    private final char UP='^',DOWN='v',RIGHT='>',LEFT='<', DOT='.';
    private char flowDirection=NULL;

    public static void main(String args[]) {
        EllysGame elly = new EllysGame();
//        String[] board = {">>>><<<<"};
        String[] board = {"vv.^>>"
                        ,".^.<>."
                        ,">>.^>v"
                        ,".^v>.."
                        ,"^^...<"};
        System.out.println(elly.getMax(board));
        System.out.println(board[0]);
    }
    int getMax(String[] board) {
        char nextCharacter;
        int counter=0;
        int rows = board.length;
        int columns = board[0].length();
        int[] totalSeconds = new int[rows * columns];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                char ch = board[i].charAt(j);
                String[] boardDuplicate = board.clone();
                totalSeconds[counter++] = getMaxSeconds(boardDuplicate, i, j, ch);
                System.out.println(boardDuplicate[0]);
            }
        }
        Arrays.sort(totalSeconds);
        return totalSeconds[rows * columns - 1];
    }

    private int getMaxSeconds(String[] board, int i, int j, char currentChar) {
        int counter = 0;
        try {
            while (i < board.length & j < board[i].length()) {
                if (currentChar == RIGHT) {
                    char[] arr = board[i].toCharArray();
                    arr[j++] = '.';
                    board[i] = String.valueOf(arr);
                    flowDirection = currentChar;
                } else if (currentChar == LEFT) {
                    char[] arr = board[i].toCharArray();
                    arr[j--] = '.';
                    board[i] = String.valueOf(arr);
                    flowDirection = currentChar;
                } else if (currentChar == DOWN) {
                    char[] arr = board[i].toCharArray();
                    arr[j] = '.';
                    board[i++] = String.valueOf(arr);
                    flowDirection = currentChar;
                } else if (currentChar == UP) {
                    char[] arr = board[i].toCharArray();
                    arr[j] = '.';
                    board[i--] = String.valueOf(arr);
                    flowDirection = currentChar;
                }
                else if(currentChar == DOT) {
                    currentChar = flowDirection;
                    continue;
                }
                ++counter;
                currentChar = board[i].charAt(j);
            }
        }
        catch(Exception e){
            return counter;
        }
        return counter;
    }
}
