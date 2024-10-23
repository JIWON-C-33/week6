public class Question5 {
    public static void main(String[] args) {
        int[] array = {12, 3, 19, 7, 5};
        int min = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println("최소값: " + min);
    }
}