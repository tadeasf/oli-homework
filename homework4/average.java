package homework4;

public class average {
    static double average(int a[], int n) {
        int sum = 0;

        for (int i = 0; i < n; i++)
            sum += a[i];

        return (double) sum / n;
    }

    public static void main(String[] args)
    {

        int arr[] = { 10, 2, 3, 5, 69, 4, 3, 2};
        int n = arr.length;

        System.out.println(average(arr, n));
    }
}