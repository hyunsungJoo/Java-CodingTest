// 음계
import java.util.*;

public class Bj2920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] song = new int[8];
        int[] ascending = {1,2,3,4,5,6,7,8};
        int[] descending = {8,7,6,5,4,3,2,1};
        String result;

        for(int i = 0; i < 8; i++){
            int sound = sc.nextInt();
            song[i] = sound;
        }

        if(Arrays.equals(song, ascending)) result = "ascending";
        else if(Arrays.equals(song, descending)) result = "descending";
        else result = "mixed";

        System.out.println(result);
    }
}