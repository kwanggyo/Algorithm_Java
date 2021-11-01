import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

// 자판을 나타내는 배열을 생성한다.
// 자음과 모음이 담겨있는 배열을 각각 생성한다.
// 처음 손가락 위치를 자판 배열에서 찾아서 저장한 후 L_finger, R_finger
// 주어진 순서대로 자음인지 모음인지 판단 -> 해당하는 손가락을 움직이고 새로운 위치 저장 And 시간 저장
// string 객체는 내용 변경 불가
// 17520KB, 204ms

public class BJ_20436_ZOAC3 {   // 백준 제출 시 BJ_20436_ZOAC3 -> Main 으로 바꿔서 제출해야 한다. + import 부분도 있어야한다.
    // https://www.acmicpc.net/problem/20436
    public static void main(String[] args) {

//        int[][] keyboard2 = {
//                {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'},
//                {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'},
//                {'z', 'x', 'c', 'v', 'b' ,'n' ,'m'},
//        };
        HashMap<String, String> keyboard = new HashMap<String, String>();
        keyboard.put("q", "00");
        keyboard.put("w", "01");
        keyboard.put("e", "02");
        keyboard.put("r", "03");
        keyboard.put("t", "04");
        keyboard.put("y", "05");
        keyboard.put("u", "06");
        keyboard.put("i", "07");
        keyboard.put("o", "08");
        keyboard.put("p", "09");
        keyboard.put("a", "10");
        keyboard.put("s", "11");
        keyboard.put("d", "12");
        keyboard.put("f", "13");
        keyboard.put("g", "14");
        keyboard.put("h", "15");
        keyboard.put("j", "16");
        keyboard.put("k", "17");
        keyboard.put("l", "18");
        keyboard.put("z", "20");
        keyboard.put("x", "21");
        keyboard.put("c", "22");
        keyboard.put("v", "23");
        keyboard.put("b", "24");
        keyboard.put("n", "25");
        keyboard.put("m", "26");

        HashSet<String> consonant = new HashSet<String>(Arrays.asList("q", "w", "e", "r", "t", "a", "s", "d", "f", "g", "z", "x", "c", "v"));
        HashSet<String> vowel = new HashSet<String>(Arrays.asList("y", "u", "i", "o", "p", "h", "j", "k", "l", "b", "n", "m"));

        int L_row, R_row, L_col, R_col;
        char L, R;
        int ans = 0;
        String A, B;
        String str;
        String problem;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        L = str.charAt(0);
        R = str.charAt(2);
        problem = sc.nextLine();

        A = keyboard.get(Character.toString(L));    // char to string : Character.toString
        B = keyboard.get(Character.toString(R));

        L_row = A.charAt(0) - '0';  // char to int : Character.getNumericValue()도 가능
        L_col = A.charAt(1) - '0';
        R_row = B.charAt(0) - '0';
        R_col = B.charAt(1) - '0';

        for (int i = 0; i < problem.length(); i++) {
            char search =  problem.charAt(i);
            int new_row = keyboard.get(Character.toString(search)).charAt(0) - '0';
            int new_col = keyboard.get(Character.toString(search)).charAt(1) - '0';
            if(consonant.contains(Character.toString(search))) {
                ans += Math.abs(L_row- new_row) + Math.abs(L_col - new_col);
                L_row = new_row;
                L_col = new_col;
            }
            else if(vowel.contains(Character.toString(search))) {
                ans += Math.abs(R_row- new_row) + Math.abs(R_col - new_col);
                R_row = new_row;
                R_col = new_col;
            }
        }

        System.out.println(ans+problem.length());

    }
}
