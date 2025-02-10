import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>(); //유효한 높이의 인덱스 저장

        StringTokenizer s = new StringTokenizer(br.readLine());
        int[] heights = new int[n];

        for(int i=0; i<n; i++) {
            String token = s.nextToken();
            heights[i] = Integer.parseInt(token);
            if(!queue.isEmpty()) {
                if(heights[queue.getLast()]>heights[i]){ 
                    sb.append(queue.getLast()+1);
                    sb.append(' ');
                    queue.addLast(i);
                    //큐의 원소보다 작을 경우 일단 저장 
                    //->이후에 자신보다 더 작은 탑 나올 가능성 고려
                }else{
                    while(!queue.isEmpty()){
                        if(heights[queue.getLast()]<heights[i]){
                            queue.removeLast();
                        }else{
                            sb.append(queue.getLast()+1);
                            sb.append(' ');
                            queue.addLast(i);
                            break;
                        }
                    }
                    if(queue.isEmpty()){
                        queue.add(i);
                        sb.append("0 ");
                    }
                    //큐의 원소보다 클 경우 신호 닿을 만한 탑 순회
                }
            }else{
                queue.add(i);
                sb.append("0 ");
            }
        }
        System.out.println(sb);
    }
}
