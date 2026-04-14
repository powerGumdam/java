package array;

public class EnhancedFor1 {

    static void main() {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numner" + i + "번의 결과: " + numbers[i]);
        }
    }
}
