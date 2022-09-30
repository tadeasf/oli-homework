package homework4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class squareRoot {
    public static void main(String[] args)
    {
        HashMap<int[], double[]> map = new HashMap<>();
        int[] List1 = IntStream.iterate(0, n -> n + 1).limit(1000).toArray();
        double [] List2 = new double[0];
        map.put(List1, List2);
        System.out.println(Arrays.toString(map.get(144)));
    }

}
