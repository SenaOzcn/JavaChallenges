import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("================================");
        
        for(int i = 0; i < 3; i++) {
            String sc = s.next();
            int x = s.nextInt();
            
            /* ("%-15s%03d%n", sc, x) % : used as a formatter. '-' : minus sign used for left 
            indentation of the string. 15s : here 15 denotes the string's minimum field width 15. 
            '0' : pads the extra 0s in the integer. 3d : here 3 denotes integer's minimum field width 3. %n : prints the new line */
            System.out.printf("%-15s%03d%n", sc, x);
        }
        
        System.out.println("================================");
    }
}
