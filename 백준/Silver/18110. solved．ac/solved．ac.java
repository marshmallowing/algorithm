import java.io.*;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = parseInt(br.readLine());
        int[] input=new int[n];
        int exc = (int) Math.round(n*0.15);
        int sum=0;

        for (int i = 0; i < n; i++) {
            input[i] = parseInt(br.readLine());
        }

        Arrays.sort(input);

        for(int i=0;i<n;i++){
            if(exc<=i && i<n-exc){
                sum+=input[i];
            }
        }

        String avg= String.valueOf(Math.round((double)sum/(n-exc*2)));;

        bw.write(avg);
        bw.flush();
        bw.close();
        br.close();
    }
}