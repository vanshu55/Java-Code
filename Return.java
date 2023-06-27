import java.io.*;
import java.util.*;
public class Return{
    public static int[] vanshu() {
        int[] number={2,3,4,5};
        return number;
    }
    public static void main(String[] args) {
       int[] number =vanshu();
       for(int num : number){
        System.out.print(num +" ");
       }
    }
}
