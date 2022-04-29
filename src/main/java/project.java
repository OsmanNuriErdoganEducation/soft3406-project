import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        // Reading from System.in
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter side 1: ");
        // Scans the next token of the input as an int.
        int side_1 = reader.nextInt();

        System.out.println("Enter side 2: ");
        // Scans the next token of the input as an int.
        int side_2 = reader.nextInt();

        System.out.println("Enter side 3: ");
        // Scans the next token of the input as an int.
        int side_3 = reader.nextInt();

        String type = triangle(side_1, side_2, side_3);
        if (type =="Equilateral" || type =="Isosceles" ||type =="Scalene") {
        } else {
            System.out.println("This is not a triangle.");
        }

        reader.close();

    }
    public static String triangle (double a, double b, double c) {
        if ((a + b > c) &&     // should be a + b > c
                (a + c > b) && // should be a + c > b
                (b + c > a)) { // should be b + c > a
            if(a==b && b==c) //check whether all sides are equal (a==b && b==c)
            {
                System.out.println("This is an equilateral triangle.\n");
                return "Equilateral";
            }
            else if(a==b || a==c || b==c) //check whether two sides are equal (a==b || a==c || b==c)
            {
                System.out.println("This is an isosceles triangle.\n");
                return "Isosceles";
            }
            else //check whether no sides are equal
            {
                System.out.println("This is a scalene triangle.\n");
                return "Scalene";// return "Scalene";
            }
        }
        return "Not a triangle";
    }

}
