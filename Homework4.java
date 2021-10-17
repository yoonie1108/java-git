import java.util.Scanner;

public class Homework4 {
    public static int gcd(int num1, int num2) {
        if (num2 == 0)
            return num1;
        return gcd(num2, num1 % num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 수를 입력하세요:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int a = gcd(num1, num2);

        System.out.println("두 수의 최대공약수는" +a+ "입니다.");
    }
}
