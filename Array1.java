public class Array1 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 2, 8};
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest: " + max);

    }
}
