package com.company;

public class EllysGame {
    int getMax(String[] board) {
        char up='^',down='v',right='>',left='<';
        outer:for(int i=0;i<board.length;i++) {
            inner:for(int j=0;j<board[i].length();j++) {
                char ch=board[i].charAt(j);
                if((ch==up || ch==down || ch==right || ch==left) && i==0)
                    continue outer;
//                else if(ch)
            }
        }
        return 0;
    }
}
