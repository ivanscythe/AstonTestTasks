public class ThirdTask {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Чётные числа:");
        for (int n : arr) {
            if (n % 2 == 0 ) {
                System.out.println(n);
            }
        }
    }
}
