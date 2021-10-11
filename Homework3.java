import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요?");
        int a = sc.nextInt();
        int num[] = new int[a];
        System.out.print("수를 입력하세요:");
        int max = num[0], min = num[0];
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();

        if (i == 0) min = num[i];
        if (max < num[i]) {
            max = num[i];
        } else if (min > num[i]) {
            min = num[i];
        }
    }
            System.out.println("최대값: " +max);
            System.out.println("최소값: " +min);
        }
    }

