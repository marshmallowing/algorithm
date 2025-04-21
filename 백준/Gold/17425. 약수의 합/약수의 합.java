import java.io.*;

// x보다 작거나 같은 모든 자연수 y의 f(y)_약수의 합을 더한 값인 g(x)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int MAX=1000000;
        long[] arr = new long[MAX+1];
        long[] prefixSum = new long[MAX+1];

        //약수의 합
        //에라토니스체 이용
        for(int i=1; i<=MAX; i++){
            for(int j=i; j<=MAX; j+=i){
                arr[j]+=i;
            }
        }

        //누적합
        for(int i=1; i<=MAX; i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(prefixSum[n]));
            if (i != t - 1) {
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}