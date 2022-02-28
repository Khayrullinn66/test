import java.util.*;

public class Test2 {
    public static void main(String[] args) throws Exception {
        int[] arr = {1, 14, 28, 0, 2, 3, 0, 4, 50, 0};
        int i = 0;
        System.out.print("\nСуществующий массив : \n");
        for (int n : arr)
            System.out.print(n + "  ");

        for (int j = 0, l = arr.length; j < l; ) {
            if (arr[j] == 0)
                j++;
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
        while (i < arr.length)
            arr[i++] = 0;
        System.out.print("\nМассив, в котором перенесли нули в конец: \n");
        for (int n : arr)
            System.out.print(n + "  ");
        System.out.print("\n");
    }
}
