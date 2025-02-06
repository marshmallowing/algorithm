import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            String str = br.readLine();
            char[] arr = str.toCharArray();

            int cnt=0;

            if(i!=0){
                bw.write("\n");
            }

            for(int j = 0; j < arr.length; j++) {
                if(arr[j]=='(') {
                    cnt++;
                }else if(arr[j]==')') {
                    if(cnt==0) {
                        //예외 처리
                        cnt=1;
                        break;
                    }
                    if(cnt>0){
                        cnt--;
                    }
                }
            }
            if(cnt==0) {
                bw.write("YES");
            }else{
                bw.write("NO");
            }
        }

        bw.flush();
        bw.close();
    }
}