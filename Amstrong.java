import java.util.Scanner;
public class Amstrong {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int dupN = n;
    int count = 0;
    int sum = 0;

    // Counting the number of digits
    while (dupN > 0) {
        count++;
        dupN = dupN / 10;
    }

    dupN = n;

    // Calculating the sum of each digit raised to the power of the number of digits
    while (dupN > 0) {
        int d = dupN % 10;
        sum += Math.pow(d, count);
        dupN = dupN / 10;
    }

    // Checking if the sum is equal to the original number
    if (sum == n) {
        System.out.print(true);
    } else {
        System.out.print(false);
    }
}
}

