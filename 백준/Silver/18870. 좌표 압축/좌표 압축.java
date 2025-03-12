import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        int n = parseInt(br.readLine());
        int[] input = new int[n];
        int[] sorted = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            input[i]= parseInt(st.nextToken());
            sorted[i] = input[i];
        }

        //크기 순으로 정렬
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        int rank=0;
        for(int i : sorted){
            // 중복을 제거하면서 압축된 순위 저장
            if(!map.containsKey(i)){
                map.put(i, rank++);
            }
        }

        for(int i : input){
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);

        br.close();
    }
}