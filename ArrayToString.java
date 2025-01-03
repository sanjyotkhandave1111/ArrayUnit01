import java.util.Scanner;
public class ArrayToString {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            char[] nameArray = name.toCharArray();

            String result = "";
            for (int i = 0; i < nameArray.length; i++) {
                result += nameArray[i];
                if (i < nameArray.length - 1) {
                    result += " ";
                }
            }
            System.out.println("Converted String: " +result);
        }

}
