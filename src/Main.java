import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = n;
        for (int i = 2; i <= n / i; i++){
            if (n % i == 0){
                x = i;
                break;
            }

        }
        System.out.println(x);

    }
}