import java.io.IOException;
import java.util.Scanner;

public class Practice2 {
    // 여러줄 입력
    public static void main(String[] args) throws IOException {
        // int를 받을 경우 두줄로 받아도 상관 없다.
        // nextShort, nextLong, nextDouble, nextFloat 등이 있다.
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("a : " + a + "\n" +  "b : " + b);

        // 문자를 받을 경우 두 줄로 입력 받을 때 잘 되지 않는다.
        // -> 첫 문자를 입력하고 엔터를 누르는 순간 \n 값이 먹히고 해당 값이 들어가기 때문!
        char c, d;
        c = (char)System.in.read();
        d = (char)System.in.read();
        System.out.println("c : " + c + "\n" +  "d : " + d);
        // 결과값으로 첫번째 입력값 c만 나온다. -> 잘못된 예

        // 문자를 여러줄 받는 경우, nextLine()을 이용해서 한 줄 씩 읽어서 처리한다.
        // next()는 개행문자를 무시하고 입력을 받는다. 즉, 숫자를 치고 엔터를 누를 경우 엔터 전까지만 입력으로 받는다.
        // nextLine()은 한줄 단위로 입력 받기 때문에 개행 문자도 한 줄로 인식한다.
        Scanner sc2 = new Scanner(System.in);
        String str;
        char e, f;
        str = sc2.nextLine();
        e = str.charAt(0);
        str = sc2.nextLine();
        f = str.charAt(0);
        System.out.println("e : " + e + "\n" +  "f : " + f);
    }
}
