import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int count = 0;

        String[] input = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < n; i++){
            if(arr[i]>2){
                boolean isPrime = true;

                for(int j = 2; j < arr[i]; j++){
                    if(arr[i]%j==0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    count++;
                }
            }else if(arr[i]==2){
                count++;
            }
        }

        System.out.println(count);
    }
}