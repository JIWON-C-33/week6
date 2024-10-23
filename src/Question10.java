public class Question10 {
    public static void main(String[] args) {
        int[] array = {20, 30, 50, 70, 90};
        int sum = 0;

        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;
        System.out.println("배열 평균: " + average);
    }
}