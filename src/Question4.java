public class Question4 {
    public static void main(String[] args) {
        int[] array = {3, 7, 2, 9, 4};
        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("최대값: " + max);
    }
}