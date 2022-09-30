package homework4;

import java.util.Arrays;

public class appendHomework {
    public static int[] append(int[] list1, int[] list2) {
        int[] newList = new int[list1.length + list2.length];
        int index = 0;

        for (int j : list1) {
            newList[index] = j;
            index++;
        }

        for (int j : list2) {
            newList[index] = j;
            index++;
        }

        return newList;
    }
    public static void main (String[] args) {

        int[] list1 = { 3, 2, 1};
        int[] list2 = { 1, 2, 3};

        System.out.println(Arrays.toString(append(list1, list2)));
    }
}
