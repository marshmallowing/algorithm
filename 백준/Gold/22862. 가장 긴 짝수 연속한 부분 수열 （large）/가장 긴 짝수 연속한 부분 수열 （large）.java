import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

// 짝수로 이루어져 있는 연속한 부분 수열 중 가장 긴 길이
// 최대 K번 원소를 삭제
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] s = new int[n+1];
        Deque<Integer> deletePos = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(st.nextToken());
        }

        int start=0;
        int maxLen = 0;

        for(int i = 0; i < n; i++) {
            if (s[i] % 2 != 0) {
                deletePos.addLast(i);
                if (deletePos.size() > k) {
                    start = deletePos.pollFirst() + 1;
                }
            }
            // 전체 길이 - 삭제된 홀수 개수
            int len = i - start + 1 - deletePos.size();
            maxLen = Math.max(maxLen, len);
        }

        bw.write(String.valueOf(maxLen));

        bw.flush();
        bw.close();
        br.close();
    }
}