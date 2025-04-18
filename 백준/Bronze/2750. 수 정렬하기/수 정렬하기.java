import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n= Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            int s = Integer.parseInt(br.readLine());
            arr[i] = s;

            if(i!=0){
                for(int j=0; j<i; j++){
                    if(arr[i]<arr[j]){
                        int k=arr[i];
                        arr[i]=arr[j];
                        arr[j]=k;
                    }
                }

            }
        }

        for(int i=0;i<n;i++){
            bw.write(arr[i]+"\n");
        }

        bw.flush();
    }
}