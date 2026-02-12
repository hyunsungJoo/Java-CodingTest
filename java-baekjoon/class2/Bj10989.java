import java.util.*;
import java.io.*;

public class Bj10989 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];

        for(int i = 0; i < count; i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
        Arrays.sort(arr);

        for(int i = 0; i < count; i++){
            System.out.println(arr[i]);
        }

    }
}
