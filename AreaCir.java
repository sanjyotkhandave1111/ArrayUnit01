
import java.util.Scanner;

    public class AreaCir {
        public static void main(String[] args) {
            double area,r;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter radius");
            r=sc.nextDouble();
            area=3.14*r*r;
            System.out.println("Area" +area);

        }
    }



