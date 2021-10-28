import java.util.Scanner;

public class Practice4 {
    // 공백이 포함된 문자열을 입력받는 경우
    public static void main(String[] args) {
        // split(" ") 사용
        int n;
        String str;
        String[] sarr;
        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();
        n = Integer.parseInt(str);
        str = sc.nextLine();    // 입력받는 공백있는 글이 최소 n-1개의 공백은 있어야 한다.
        sarr = str.split(" ");
        for(int i = 0; i < n; i++) System.out.print(sarr[i] + " ");
    }
}
