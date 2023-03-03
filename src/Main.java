import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số cần in: ");
        int number = scanner.nextInt();
        int x = 0;
        int n = 2;
        boolean check = true;
//        String arr = "";
        while (x < number) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                }
            }
            if (check == true) {
                x++;
                System.out.print(n + " ");
//                arr += n + " ";
            }
            n++;
            check = true;
        }
    }
}