import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr=new int[n+1];

        int minLen=Integer.MAX_VALUE;
        int sum=0;
        int start=0;

        st = new StringTokenizer(br.readLine());
        for(int end=0; end<n; end++){
            arr[end]=Integer.parseInt(st.nextToken());
            sum+=arr[end];
            while(sum>=s){
                minLen=Math.min(minLen,end-start+1);
                sum-=arr[start];
                start++;
            }
        }

        if(minLen==Integer.MAX_VALUE){
            bw.write("0");
        }else{
            bw.write(String.valueOf(minLen));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}