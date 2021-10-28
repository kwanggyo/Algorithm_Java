import java.io.IOException;
import java.util.Scanner;

public class Practice {
    // 타입별 입력
    public static void main(String[] args) throws IOException {
        // int를 입력 받을 경우는 nextInt()
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("a : " + a + "\n" +  "b : " + b);

        // char를 입력 받을 경우는 (char)System.in.read()
        char ch;
        ch = (char)System.in.read();
        System.out.println(ch);

        // char를 여러개 입력 받을 경우는 nextLine()
        char c, d;
        String str;
        Scanner sc2 = new Scanner(System.in);
        str = sc2.nextLine();
        c = str.charAt(0);
        d = str.charAt(2);
        System.out.println("c : " + c + "\n" +  "d : " + d);
        sc2.close();
    }
}
