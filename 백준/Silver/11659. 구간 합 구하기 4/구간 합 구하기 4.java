import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] sum = new int[n];

        // 누적합 이용
        st =  new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            if(i==0){
                sum[i] = Integer.parseInt(st.nextToken());
            }else{
                sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < m; i++) {
            st =  new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a==1){
                sb.append(sum[b-1]).append("\n");
            }else{
                sb.append(sum[b-1]-sum[a-2]).append("\n");
            }
        }
        System.out.println(sb);
    }

}