import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n= Integer.parseInt(br.readLine());

        int cnt=0;
        int sum=0;

        for(int i=0;i<=6;i++){
            int bar = 64 / (int) Math.pow(2,i);

            if(bar<=n-sum){
                cnt++;
                sum+=bar;
            }

            if(sum==n){
                break;
            }
        }

        bw.write(String.valueOf(cnt));

        bw.flush();
    }
}