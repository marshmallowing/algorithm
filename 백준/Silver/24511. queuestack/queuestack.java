import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] struct=new int[n];

        // 큐 생성 (FIFO)
        Deque<Integer> queue = new ArrayDeque<>();

        // 큐 or 스택 여부
        StringTokenizer s = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            struct[i] = Integer.parseInt(s.nextToken());
        }

        // 초기 값
        StringTokenizer c = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            String token = c.nextToken(); // 무조건 토큰을 가져옴
            if (struct[i] == 0) {
                queue.add(Integer.parseInt(token));
                // struct[i]가 0일 때만 저장 (큐)
            }
        }

        int m= Integer.parseInt(br.readLine()); // c의 길이
        int[] input=new int[m];
        StringTokenizer in = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            input[i] = Integer.parseInt(in.nextToken());
        }
        // 2 1 (4)
        for(int j=0;j<m;j++){ //명령어
            queue.addFirst(input[j]);
            int pop= queue.pollLast();
            sb.append(pop).append(" ");
        }
        System.out.println(sb);
    }
}