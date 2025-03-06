import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        // 소수 판별을 위한 배열
        boolean[] isNotPrime = new boolean[n + 1];

        // 에라토스테네스의 체 적용
        for (int i = 2; i * i <= n; i++) {
            if (!isNotPrime[i]) {
                // i의 배수 지우기
                for (int j = i * i; j <= n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        for (int i = m; i <= n; i++) {
            if (i > 1 && !isNotPrime[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.print(sb);
    }
}
