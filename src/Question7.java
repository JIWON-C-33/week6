public class Question7 {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};

        System.out.println("역순 출력:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}