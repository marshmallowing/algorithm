import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
        }

        Arrays.sort(arr, (a, b) -> a[0] == b[0] ?
                a[1] - b[1] : a[0] - b[0]);
        // x가 같을 때는 y 기준 오름차순 정렬

        for(int i = 0; i < n; i++){
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }

        System.out.println(sb);
    }
}