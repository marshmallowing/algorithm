import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] s=new char[n];
        char[] t=new char[n];

        for(int i=0;i<n;i++){
            s[i]=br.readLine().charAt(0);
        }

        int front=0;
        int back=n-1;

        for(int i=0;i<n;i++){
            if(s[front]>s[back]){
                t[i]=s[back--];
            }else if(s[front]<s[back]){
                t[i]=s[front++];
            }else {
                //같을 때 - 계속해서 비교
                int f = front;
                int b = back;
                boolean chooseFront = true;  // 기본은 앞

                while (f <= b) {
                    if (s[f] > s[b]) {
                        chooseFront = false;
                        break;
                    } else if (s[f] < s[b]) {
                        break;
                    }
                    f++;
                    b--;
                }
                if (chooseFront) {
                    t[i] = s[front++];
                } else {
                    t[i] = s[back--];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            bw.write(t[i]);
            if ((i + 1) % 80 == 0) {
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}