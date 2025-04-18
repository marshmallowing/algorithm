import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String input = br.readLine();
        String[] arr = new String[input.length()];

        for(int i = 0; i < input.length(); i++) {
            arr[i] = input.substring(i);
        }
        
        // 문자열 배열 정렬
        Arrays.sort(arr);

        for(int i = 0; i < input.length(); i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}