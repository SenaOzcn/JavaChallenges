import java.io.*;
import java.util.*;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        while(s.hasNext()) {
            i++;
            System.out.println(i + " " + s.nextLine());
        }
    }
}
