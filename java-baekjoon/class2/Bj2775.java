import java.util.*;
import java.io.*;

public class Bj2775 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int[][] personNum = new int[14][14];
        int total = 0;

        for(int i = 0; i < personNum[0].length; i++){
            personNum[0][i] = i + 1;
        }

        for(int i = 0; i < personNum.length - 1; i++){
            for(int j = 0; j < personNum[0].length; j++){
                total += personNum[i][j];
                personNum[i + 1][j] = total;
            }
            total = 0;
        }
        
        for(int i = 0; i < count; i++){
            int floor = Integer.parseInt(br.readLine());
            int roomNum = Integer.parseInt(br.readLine());
            System.out.println(personNum[floor][roomNum - 1]);
        }



    }
}
