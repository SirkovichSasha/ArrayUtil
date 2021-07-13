package program;

import arrays.ArrayUtil;

public class Program {
    public static void main(String[] args) {
        int[] array=new int [5];
        ArrayUtil.fill(array,2,6);
        System.out.println(ArrayUtil.toString(array));
        System.out.println(ArrayUtil.evenIndexes(array));
    }
}
