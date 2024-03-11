import java.io.IOException;
import java.util.Scanner;

public class ativ1019 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int sec = sc.nextInt();

        int hours = sec / 3600;
        int minutes = (sec % 3600) / 60;
        int seconds = sec % 60;

        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
        sc.close();
    }

}