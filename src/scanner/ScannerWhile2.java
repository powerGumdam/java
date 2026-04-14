package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두 번쨰 숫자 모두 0을 입력하면 프로그램을 종료합니다.");

    while (true) {
        int num1 = 0;
        int num2 = 0;

        if (num1 == 0 && num2 == 0) {
            System.out.println("프로그램을 종료합니다.");
            break;
        }
    }
    }
}
