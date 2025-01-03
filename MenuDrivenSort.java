import java.util.Scanner;
import java.util.Arrays;
public class MenuDrivenSort {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            int i;
            System.out.println("Enter the elements:");
            for ( i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            do {
                System.out.println(n);
                n++;
            } while (n<=i);
            System.out.println("\nMenu:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Merge Sort");
            System.out.println("3. Selection Sort");
            System.out.println("4. Quick Sort");
            System.out.println("5. Insertion Sort");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
        }


}
