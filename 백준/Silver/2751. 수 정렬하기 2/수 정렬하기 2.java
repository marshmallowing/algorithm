import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

// Counting sort 이용
// Collections.sort(list); 정렬 메소드도 가능
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        boolean[] arr = new boolean[2000001];
        //-1000000 ~ 1000000 범위의 정수를 배열의 <인덱스>로 변환
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
            // 음수를 포함한 정수를 배열의 인덱스로 변환하기 위해 +1000000
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                sb.append((i - 1000000)).append('\n');
            }
        }
        System.out.println(sb);
    }
}