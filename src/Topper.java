import java.util.Scanner;

public class Topper {
    public static boolean isMatches(int oddRes , int evenRes)
    {
        return oddRes == evenRes;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to find ODD and EVEN sum: ");
        int number = scanner.nextInt();
        int oddSum = 0;
        int evenSum = 0;
        while(number > 0)
        {
            int last = number % 10;
            if(last % 2 == 0)
            {
                evenSum += last;
            }
            else
            {
                oddSum += last;
            }
            number = number / 10;
        }
        System.out.println("The Sum of Odd Digits is : "+ oddSum);
        System.out.println("The Sum of Even Digits is : "+ evenSum);
        boolean res = isMatches(oddSum,evenSum);
        System.out.println("Probable Topper: "+ res);
    }
}