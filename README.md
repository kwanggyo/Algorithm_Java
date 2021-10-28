# Algorithm_Java

## 입출력

### 1. 타입별 입력받기

- int : nextInt()
- char : (char)System.in.read()
- char를 여러개 받는 경우 : nextLine()

#### 예시

```java
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
```

### 2. 여러줄 입력받기

- int로 받는 경우 두 줄로 받아도 문제가 없다.
- 문자를 여러줄로 받는 경우 nextLine()을 이용해서 한 줄씩 읽어서 처리한다.

#### 예시

```java
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
```

### 3. 입력 받을 개수가 가변적인데 그 사이에 공백이 있을 경우

- int는 nextInt로 char는 nextLine으로 받으면 문제가 발생한다.
- 숫자를 입력받고 엔터를 치면 Exception 발생
- nextInt()로 입력을 받기 때문에 개행문자 전까지만 입력을 받고 개행문자는 nextLine이 읽었기 때문
- 이를 해결하기 위해서는 nextInt()와 nextLine() 사이에 nextLine()을 한번 더 사용해서 개행문자를 제거한다.

#### 예시

```java
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
```

### 4. 공백이 포함된 문자열을 입력 받는 경우

- split() 사용

#### 예시

```java
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
```

:bulb: 참고 : https://limkydev.tistory.com/170

