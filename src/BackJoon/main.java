package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *  23971
 */
public class main {

    public static void main(String[] args) throws IOException {
        StringTokenizer st = readStringToken();
        List<Integer> inputList = parseInputData(st);

        solution(inputList);
    }

    private static void solution(List<Integer> inputList) {
        int one = inputList.get(0);
        int two = inputList.get(1);
        int three = inputList.get(2);
        int four = inputList.get(3);

        System.out.println(((one-1)/three+1)*((two-1)/four));
    }

    public static StringTokenizer readStringToken() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();
        return new StringTokenizer(str);
    }

    public static List<Integer> parseInputData(StringTokenizer st){
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(st.hasMoreTokens()){
            arrayList.add(Integer.parseInt(st.nextToken()));
        }
        return arrayList;
    }
}
