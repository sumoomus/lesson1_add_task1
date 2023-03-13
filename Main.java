import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//a)
        System.out.print("Enter A = ");
        int A = scanner.nextInt();
        System.out.print("Enter B = ");
        int B = scanner.nextInt();
        double discountA = A * 0.15, totalCostB = B * 2;
        double totalCostA = A - discountA, totalCost = totalCostA * 10 + totalCostB;

        System.out.println("Final price AB  " + totalCost);


//b)

        System.out.print("Enter AA = ");
        int AA = scanner.nextInt();
        System.out.print("Enter BB = ");
        int BB = scanner.nextInt();
        double discountAA = AA * 0.50, totalCostBB = BB * 1;
        double totalCostAA = AA - discountAA, totalCost1 = totalCostAA * 7 + totalCostBB;

        System.out.println("Final price AABB  " + totalCost1);


//c)
        System.out.print("Enter AAA = ");
        int AAA = scanner.nextInt();
        System.out.print("Enter BBB = ");
        int BBB = scanner.nextInt();
        double discountAAA = AAA * 0.10, totalCostBBB = BBB * 3;
        double totalCostAAA = AAA - discountAAA, totalCost2 = totalCostAAA * 2 + totalCostBBB;

        System.out.println("Final price AABB  " + totalCost2);


    }
}