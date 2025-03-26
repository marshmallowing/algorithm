import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Deque<Integer> queue = new ArrayDeque<>();

        int sum = 0;
        int cnt = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            queue.addLast(Integer.parseInt(st.nextToken()));
            sum += queue.getLast();
            if(sum==m){
                cnt++;
            }else if(sum>m){
                while(sum>m){
                    int rm=queue.removeFirst();
                    sum-=rm;
                    if(sum==m){
                        cnt++;
                        break;
                    }
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}