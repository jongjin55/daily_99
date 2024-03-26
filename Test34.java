import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test34 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int cnt = 0;

        for (char num : str.toCharArray()) {            
            cnt +=  Character.getNumericValue(num);
        }
        System.out.println(cnt);

    }
}
