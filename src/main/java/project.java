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
    if (type.equals("Equilateral") || type.equals("Isosceles") || type.equals("Scalene")) {
      //System.out.printf("This is a %s triangle. :)))", type);
    } else {
      System.out.println("This is not a triangle.");
    }

    reader.close();

  }

  public static String triangle(double a, double b, double c) {
    boolean x = ((a + b) > c); // 1 + 2 !> 4
    boolean y = ((a + c) > b); // 1 + 4 > 2
    boolean z = ((b + c) > a); // 2 + 4 > 1
    if (x && y && z) {
      if (a == b && b == c) {
        //check whether all sides are equal (a==b && b==c)
        System.out.println("This is an equilateral triangle.\n");
        return "Equilateral";
      } else if (a == b || a == c || b == c) {
        //check whether two sides are equal (a==b || a==c || b==c)
        System.out.println("This is an isosceles triangle.\n");
        return "Isosceles";
      } else {
        //check whether no sides are equal
        System.out.println("This is a scalene triangle.\n");
        return "Scalene";// return "Scalene";
      }
    }
    System.out.println("Not a triangle");
    return "Not a triangle";
  }

}