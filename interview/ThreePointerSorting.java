package interview;

import java.util.Arrays;

public class ThreePointerSorting {

    public static void main(String[] args) {
        int[] arr = new int[]{2,2,2,2,1,0,1,1,2,1,0,2,0,2,1,1,1, 0,0,0};

        int lowest=0,middle=0,highest= arr.length-1;
        while (middle <= highest) {
            switch(arr[middle]){
                case 0:
                    int tempa= arr[lowest];
                    arr[lowest] = arr[middle];
                    arr[middle] = tempa;
                    lowest++;middle++;
                    break;
                case 1:
                    middle++;
                    break;
                case 2:
                    int tempb= arr[highest];
                    arr[highest] = arr[middle];
                    arr[middle] = tempb;
                    highest--;
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
