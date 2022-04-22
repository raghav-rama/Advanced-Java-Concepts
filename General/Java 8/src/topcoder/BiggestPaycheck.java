package topcoder;

public class BiggestPaycheck {
    int findBiggest(int a, int b, int c) {
        int biggest = (a>b)?((a>c)?a:c):((b>c)?b:c);
        return biggest;
    }
}
