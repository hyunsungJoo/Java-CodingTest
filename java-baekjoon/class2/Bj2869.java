import java.util.*;
import java.io.*;

public class Bj2869 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int up = Integer.parseInt(br.readLine());
        int down = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

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
