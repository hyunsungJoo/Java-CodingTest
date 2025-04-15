// 웰컴키트
import java.util.*;

public class Bj30802 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int participant = sc.nextInt();
        int[] sizeArr = new int[6];

        for(int i = 0; i < sizeArr.length; i ++){
            sizeArr[i] = sc.nextInt();
        }

        int clothSet = sc.nextInt();
        int penSet = sc.nextInt();
        int clothSetCount = 0;
        int penSetCount = participant / penSet;
        int penEach = participant % penSet;

        for(int i = 0; i < sizeArr.length; i ++){
            if(sizeArr[i] % clothSet == 0) clothSetCount += (sizeArr[i] / clothSet);
            else clothSetCount += (sizeArr[i] / clothSet) + 1;
        }

        System.out.println(clothSetCount);
        System.out.println(penSetCount + " " + penEach);

    }
}
