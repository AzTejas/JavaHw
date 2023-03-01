package HWPDF3;

public class WhileLoopEvenandOddNumbers {
    public static void main(String[] args) {
        int even=2;
        int odd=1;
        System.out.println("Odd Numbers on the left and Even Numbers on the Right:");
        while (even<=20) {
            System.out.println(odd+" "+even);
            even++;
            even++;
            odd++;
            odd++;
        }
    }
}
