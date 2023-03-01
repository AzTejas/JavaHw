package HWPDF3;

public class LoopEvenandOddNumbers {
    public static void main(String[] args) {
        for (int even = 2; even<=20; even++)
            if (even % 2 ==0){
                System.out.println("Even "+even);
            }
        for (int odd = 1; odd <= 20; odd++) {
            if (odd % 2 != 0) {
                System.out.println("Odd "+odd);

            }
        }
    }
}
