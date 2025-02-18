import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int[] arr = new int[10000001];
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int input=Integer.parseInt(br.readLine());
            arr[input]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                for(int j=0; j<arr[i];j++){
                    sb.append(i).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}