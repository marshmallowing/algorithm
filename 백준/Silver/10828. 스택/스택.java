import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int length = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            switch (s) {
                case "empty":
                    if (length == 0) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "pop":
                    if (length == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(arr[length-1]).append("\n");
                        length -= 1;
                    }
                    break;
                case "top":
                    if (length == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(arr[length-1]).append("\n");
                    }
                    break;
                case "size":
                    sb.append(length).append("\n");
                    break;
                default:
                    // 공백 기준으로 문자열 나누기
                    String[] parts = s.split(" ");
                    // 맨 뒤의 숫자 추출
                    int num = Integer.parseInt(parts[1]);

                    length += 1;
                    arr[length - 1] = num;
                    break;
            }
        }

        // StringBuilder를 String으로 변환 후 trim() 적용
        String resultString = sb.toString().trim();  // 끝의 \n이 제거됨
        System.out.println(resultString);
    }
}