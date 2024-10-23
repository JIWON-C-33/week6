public class Question9 {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5};
        int[] Copy = new int[Array.length];

        for (int i = 0; i < Array.length; i++) {
            Copy[i] = Array[i];
        }

        System.out.println("복사된 배열:");
        for (int num : Copy) {
            System.out.println(num);
        }
    }
}