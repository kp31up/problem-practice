package bitManipulation;

//The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
public class HammingDistance {

    public static void main(String[] args) {
        int s1 = 5;
        int s2 = 31;
        System.out.println("Hamming distance = "+ hammingDistance(s1,s2));
    }

    public static int hammingDistance(int x, int y) {
        int count =0;
        while(x != 0 || y!=0) {
            int xLSB = x%2;
            int yLSB = y%2;

            x = x/2;
            y = y/2;

            count = count + (xLSB ^ yLSB);
        }
        return count;
    }
}
