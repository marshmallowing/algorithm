import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

//소수 판별 메소드로 분리시켜 만들기
//골드바흐의 추측 (두수의 합이 2이상 짝수면 무조건 소수 표현 가능)
public class Main {
    static final int LIMIT = 2_000_000;  // 200만까지 소수 저장
    // 문제에서 A, B의 범위가 2 × 10¹² => √(4 × 10¹²) = 2 × 10⁶ = 200만
    static boolean[] isPrime = new boolean[LIMIT + 1];
    static List<Long> primes = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        initPrime();

        int t = parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            long a = Long.parseLong(input[0]);
            long b = Long.parseLong(input[1]);
            long sum = a + b;

            // 2 이하인 경우는 무조건 NO
            if (sum < 4) {
                sb.append("NO\n");
                continue;
            }

            //두수의 합이 홀수이면 2(소수)+ sum-2(소수)의 꼴로 나타내야만 가능
            if(sum%2==1){
                if(isPrime(sum-2)){
                    sb.append("YES\n");
                }else{
                    sb.append("NO\n");
                }
                continue;
            }
            //골드바흐의 추측
            sb.append("YES\n");
        }
        System.out.println(sb);
    }

    // 200만까지 소수를 미리 계산하는 함수 (에라토스테네스 체)
    private static void initPrime() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;  // 0과 1은 소수 아님

        for (int i = 2; i <= LIMIT; i++) {
            if (isPrime[i]) {
                primes.add((long) i);
                for (int j = i * 2; j <= LIMIT; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    // 소수 판별
    private static boolean isPrime(long n) {
        // 소수 범위(LIMIT) 이하라면, 바로 배열에서 확인
        if (n <= LIMIT) return isPrime[(int) n];

        // 미리 구한 소수(primes) 리스트를 이용해 판별
        for (Long prime : primes) {
            // prime의 제곱이 n보다 크면 중단
            if (prime * prime > n) break;
            // prime으로 나누어 떨어지면 소수가 아님 !!
            if (n % prime == 0) return false;
        }
        // 위에서 나누어 떨어지는 소수가 없었다면 소수
        return true;
    }
}