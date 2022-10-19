import java.util.Scanner;

class PrimeNumberCheck {
    double number;

    void takeInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nPRIME NUMBER CHECKING (RANGE 1 - 1000)  ");
        System.out.print("Enter the Number = ");
        number = input.nextDouble();
        input.close();
    }

    boolean Check(double nmbr) {
        boolean flag = false;
        if (nmbr == 0 || nmbr == 1) {
            flag = true;
            return flag;
        }
        for (int i = 2; i <= nmbr / 2; ++i) {
            if (nmbr % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}

public class Prime_Number {
    public static void main(String[] args) {
        PrimeNumberCheck obj = new PrimeNumberCheck();
        obj.takeInput();
        boolean flag = obj.Check(obj.number);
        if (!flag) {
            System.out.println(obj.number + " is a prime number.");
            return;
        }
        System.out.println(obj.number + " is not a prime number.");
    }
}