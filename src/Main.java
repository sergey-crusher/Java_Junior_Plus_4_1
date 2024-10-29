public class Main {
    public static void main(String[] args) {
        try {
            int[] arr_itr = new int[2];
            arr_itr[0] = 1;
            arr_itr[1] = 2;
            arr_itr[3] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        System.out.println("Финал");
    }
}