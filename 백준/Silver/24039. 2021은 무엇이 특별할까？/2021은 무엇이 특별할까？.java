import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        boolean[] isNotPrime = new boolean[10001];

        int cnt=0;
        int firstPrime=0;
        int secondPrime=0;

        for (int i = 2; cnt <2; i++) {
            if (!isNotPrime[i]) {
                if(cnt==0){
                    firstPrime=i;
                    cnt++;
                }else if(cnt==1){
                    secondPrime=i;
                    if(firstPrime*secondPrime>n){
                        break;
                    }else{
                        cnt=1;
                        firstPrime=i;
                    }
                }
 
                for (int j = i * i; j <= n; j += i) {
                    isNotPrime[j] = true;
                }

            }
        }
        System.out.print(firstPrime*secondPrime);
    }
}
