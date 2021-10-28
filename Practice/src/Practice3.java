import java.util.Scanner;

public class Practice3 {
    // 입력 받을 개수가 가변적인데 그 사이에 공백이 있는 경우
    public static void main(String[] args) {
        // int는 nextInt로 char는 nextLine으로 받으면 문제가 발생한다.
        // 숫자를 입력받고 엔터를 치면 Exception 발생
        // nextInt()로 입력을 받기 때문에 개행문자 전까지만 입력을 받고 개행문자는 nextLine이 읽었기 때문
        // 이를 해결하기 위해서는 nextInt()와 nextLine() 사이에 nextLine()을 한번 더 사용해서 개행문자를 제거한다.
        int n;
        String str;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
/*
        str = sc.nextLine();    // 모든 입력을 nextLine()을 활용해서 해결할 수 있다.(위아래 한줄씩 지우고 주석해제)
        n = Integer.parseInt(str);
*/
        sc.nextLine(); // 개행문자 제거하는 부분
        str = sc.nextLine();
        char[] a = new char[n];
        for(int i = 0; i < n; i++) a[i] = str.charAt(i*2);
        for(int i = 0; i < n; i++) System.out.print(a[i]+" ");
    }
}
