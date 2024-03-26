import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test35 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        char start = 'a';
        char end = 'z';
        StringBuilder sb = new StringBuilder();
        ArrayList arr = new ArrayList<>();

        for (char c : S.toCharArray()) {
            for (int j = start; j < (int) end; j++) {
                if(c == (char) j)  {
                    System.out.println( ">> " + (char) j);
                    sb.append(S.indexOf(c)).append(" ");
                } else {
                    System.out.println("-1");
                }    
            }
        }
    }

}
