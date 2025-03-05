package BitManipulation;

public class PS02 {
    public static void oddorEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        oddorEven(0);
        oddorEven(2);
        oddorEven(3);
    }
}
