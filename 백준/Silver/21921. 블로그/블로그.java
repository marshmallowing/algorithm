import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        Deque<Integer> queue = new ArrayDeque<>();

        int sum = 0;
        int maxSum = 0;
        int maxDays=0;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int k = Integer.parseInt(st.nextToken());
            queue.addLast(k);
            sum += k;
            if(queue.size() == x){
                if(sum > maxSum){
                    maxSum = sum;
                    maxDays=1;
                }else if(sum == maxSum){
                    maxDays++;
                }
                int remove = queue.removeFirst();
                sum -= remove;
            }
        }

        if(maxSum==0){
            bw.write("SAD");
        }else{
            bw.write(String.valueOf(maxSum)+"\n");
            bw.write(String.valueOf(maxDays));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}