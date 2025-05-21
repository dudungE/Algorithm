import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];

        for (int i = 0; i < n; i++) str[i] = br.readLine();
        for (int i = 0; i < n; i++) System.out.println(firstCapitalization(str[i]));
    }

    public static String firstCapitalization(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}