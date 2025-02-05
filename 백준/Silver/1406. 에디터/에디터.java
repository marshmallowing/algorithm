import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());
        
        LinkedList<Character> list = new LinkedList<Character>();

        for(int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        } //입력받은 문자열을 배열이 아닌 linkelist 형태로 저장

        //iterator 메소드 호출
        ListIterator<Character> iter = list.listIterator();

        while(iter.hasNext()) {
            iter.next(); //( a | b c )
        }

        for(int i = 0; i < M; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            switch(c) {
                case 'L':
                    if(iter.hasPrevious())
                        iter.previous();

                    break;
                case 'D':
                    if(iter.hasNext())
                        iter.next();

                    break;
                case 'B':
                    //remove()는 next()나 previous()에 의해 반환된 가장 마지막 요소를 리스트에서 제거함
                    if(iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    char t = command.charAt(2);
                    iter.add(t);
                    //현재 커서의 위치 바로 뒤에 요소가 추가
                    break;
                default:
                    break;
            }
        }
        for(Character chr : list) {
            bw.write(chr);
        }

        bw.flush();
        bw.close();
    }
}