import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr=new int[100001];

        int sum=0;
        int minLen=Integer.MAX_VALUE;
        int len=0;
        int start=0;

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int k=Integer.parseInt(st.nextToken());
            arr[i]=k;
            sum+=k;
            len++;
            while(sum>=s){
                if(len<minLen){
                    minLen=len;
                }
                sum-=arr[start];
                start++;
                len--;
            }
        }

        if(minLen==Integer.MAX_VALUE){
            bw.write(String.valueOf(0));
        }else{
            bw.write(String.valueOf(minLen));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}