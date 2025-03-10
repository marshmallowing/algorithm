import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); //플레이어의 수
        int size = 1000001;
        int[] players = new int[n];
        boolean[] cards = new boolean[size];
        int[] results = new int[size];

        st= new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            players[i]=Integer.parseInt(st.nextToken());
            cards[players[i]]=true;
        }

        for(int i : players ){
            // 배수 존재 여부 확인
            for(int j=i+i; j < size; j+=i){
                if(cards[j]){
                    results[i]++;
                    results[j]--;
                }
            }
        }

        for (int i : players){
            sb.append(results[i]).append(' ');
        }

        System.out.println(sb);
        br.close();
    }
}