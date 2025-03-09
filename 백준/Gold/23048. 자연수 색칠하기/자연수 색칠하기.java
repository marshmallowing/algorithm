import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] colored = new int[n+1];
        int color=1;

        for(int i=1; i<=n;i++){
            if(i==1){
                colored[i] = color;
                color++;
            } else if(colored[i]==0){
                colored[i] = color;
                // 에라토스테네스의 체 적용
                for(int j=i+i; j<=n; j+=i){
                    colored[j] = color;
                }
                color++;
            }
            sb.append(colored[i]).append((' '));
        }

        System.out.println(color-1);
        System.out.println(sb);
        br.close();
    }
}
