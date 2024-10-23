import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        Scanner scanner = new Scanner(System.in);

        System.out.print("찾을 값: ");
        int value = scanner.nextInt();
        boolean found = false;

        for (int num : array) {
            if (num == value) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("존재");
        } else {
            System.out.println("존재안해");
        }

        scanner.close();
    }
}