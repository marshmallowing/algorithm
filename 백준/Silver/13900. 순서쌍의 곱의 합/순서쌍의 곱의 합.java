import java.io.*;
import java.util.StringTokenizer;

//서로 다른 위치의 두 수를 뽑는 모든 경우의 두 수의 곱의 합
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr=new int[n+1];

        int totalSum=0;

        st=new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            totalSum+=arr[i];
        }

        long sum=0;
        for(int i=0; i<n-1; i++) {
            totalSum-=arr[i];
            sum+= (long) totalSum *arr[i];
        }

        bw.write(String.valueOf(sum));

        bw.flush();
        bw.close();
        br.close();
    }
}