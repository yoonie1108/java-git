import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args){
        int sum1;
        int sum2;
        int sum3;
        int sum4;
        System.out.print("정수를 입력하세요:");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("현재까지 입력된 정수의 합은"+num1+"입니다");
        System.out.print("정수를 입력하세요:");
        int num2=sc.nextInt();
        sum1=num1+num2;
        System.out.println("현재까지 입력된 정수의 합은"+sum1+"입니다");
        System.out.print("정수를 입력하세요:");
        int num3=sc.nextInt();
        sum2=sum1+num3;
        System.out.println("현재까지 입력된 정수의 합은"+sum2+"입니다");
        System.out.print("정수를 입력하세요:");
        int num4=sc.nextInt();
        sum3=sum2+num4;
        System.out.println("현재까지 입력된 정수의 합은"+sum3+"입니다");
        System.out.print("정수를 입력하세요:");
        int num5=sc.nextInt();
        sum4=sum3+num5;
        System.out.println("현재까지 입력된 정수의 합은"+sum4+"입니다");
    }
}