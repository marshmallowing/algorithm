import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner 객체 생성
        Scanner sc= new Scanner(System.in);

        Long n = sc.nextLong();

        System.out.println(n * n);
        //System.out.println((int)Math.pow(n, 2));

        // 코드1 수행 횟수는 n^2 -> 차수는 2
        if (n > 0) {
            System.out.println(2);  // 최고차항 차수는 2
        } else {
            // 만약 다항식으로 나타낼 수 없다면 4를 출력
            System.out.println(4);
        }
    }
}