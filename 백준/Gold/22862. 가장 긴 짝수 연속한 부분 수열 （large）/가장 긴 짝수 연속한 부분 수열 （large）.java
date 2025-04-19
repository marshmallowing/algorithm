import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] s = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int oddCount = 0; //홀수 개수
        int maxLen = 0;

        for (int end = 0; end < n; end++) {
            if (s[end] % 2 != 0) {
                oddCount++;
            }
						//시작점 갱신
            while (oddCount > k) {
                if (s[start] % 2 != 0) {
                    oddCount--;
                }
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1 - oddCount);
        }

        bw.write(String.valueOf(maxLen));
        bw.flush();
        bw.close();
        br.close();
    }
}
