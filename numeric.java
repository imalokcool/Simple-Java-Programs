
import java.util.*;
import java.lang.*;
import java.io.*;

class Numeric {

    public static void main(String[] args) {

        String str;
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
