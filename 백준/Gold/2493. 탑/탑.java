import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

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
                }
            }else{
                queue.add(i);
                sb.append("0 ");
            }
        }
        System.out.println(sb);
    }
}