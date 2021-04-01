import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("arr["+ i + "]= ");
            array[i] = scanner.nextInt();
        }


        System.out.print("Elements of Array: ");
        for (int j : array
             ) {
            System.out.print(j + "\t");
        }
        System.out.println();
        System.out.println("Min value of array is: " + minOfArray(array));
    }
    public static int minOfArray(int[] arr){
        int min = arr[0];
        for (int i : arr
             ) {
            if (i < min) min = i;
        }
        return min;
    }
}
