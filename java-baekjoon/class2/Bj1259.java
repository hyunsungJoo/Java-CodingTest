import java.util.*;

public class Bj1259 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer(sc.next());
        

        while(true){
            sb = new StringBuffer(sc.next());
            if(sb.toString().equals("0")) break;
            if(sb == sb.reverse()) System.out.println("yes");
            else System.out.println("no");
        }
    }
}