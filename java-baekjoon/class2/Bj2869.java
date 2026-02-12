import java.util.*;
import java.io.*;

public class Bj2869 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int now = 0;
        int day = 0;

        while(now < end){
            day++;
            now += up;
            if(now >= end)
                break;
            now -= down;
        }

        System.out.println(day);

    }
    
}
