import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] array = new int[n];
        //기본값으로 0

        for(int i = 1; i <= m; i++) {
            String[] input2 = br.readLine().split(" ");
            int a = Integer.parseInt(input2[0]);
            int b = Integer.parseInt(input2[1]);

            array[a-1]++;
            array[b-1]++;
        }

        for(int i = 0; i <n; i++) {
            sb.append(array[i]).append("\n");
        }
        System.out.println(sb);
    }
}