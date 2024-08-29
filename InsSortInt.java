import java.io.File;
import java.util.Scanner;

public class InsSortInt {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("numbers.txt"));
        int[] arr = new int[1000]; 
        int count = 0;

        while (scanner.hasNextInt()) {
            arr[count++] = scanner.nextInt();
        }
        scanner.close();

        insertionSort(arr, count);

        System.out.println("Smallest value: " + arr[0]);
        System.out.println("Largest value: " + arr[count - 1]);
    }

    public static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }
    }
}
