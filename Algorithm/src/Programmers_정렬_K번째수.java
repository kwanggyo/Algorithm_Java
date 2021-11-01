import java.util.Arrays;

public class Programmers_정렬_K번째수 {
    // https://programmers.co.kr/learn/courses/30/lessons/42748
    public static void main(String[] args) {
        // 배열을 자르고 정렬, 해당 인덱스의 수를 answer 배열에 저장

        class Solution {
            public int[] solution(int[] array, int[][] commands) {

                int[] answer = new int[commands.length];

                for (int i = 0; i < commands.length; i++) {

                    int sliceRange = commands[i][1] - (commands[i][0]-1);
                    int [] arr1 = new int[sliceRange];
                    int idx = 0;

                    for (int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
                        arr1[idx] = array[j];
                        idx ++;
                    }
                    Arrays.sort(arr1);
                    answer[i] = arr1[commands[i][2] - 1];
                }

                return answer;
            }
        }
    }
}


//정답 참고 코드
//import java.util.Arrays;
//
//class Solution {
//    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//
//        for(int i=0; i<commands.length; i++){
//            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
//            Arrays.sort(temp);
//            answer[i] = temp[commands[i][2]-1];
//        }
//
//        return answer;
//    }
//}