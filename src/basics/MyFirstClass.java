import java.util.Scanner;

// test input -> 1 4
// output -> 5
// output -> 14

// test input -> 10 20
// output -> 30
// output -> 1020

// test input -> 5 0
// output -> 5
// output -> 50

public class MyFirstClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x + y;
        String str = Integer.toString(x) + Integer.toString(y);
        System.out.println(sum + "\n" + str);

    }
}