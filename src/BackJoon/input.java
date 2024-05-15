package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class input {

    public static void main(String[] args) throws IOException {
        StringTokenizer st = readStringToken();
        List<Integer> inputList = parseInputData(st);

        solution(inputList);
    }

    private static void solution(List<Integer> inputList) {

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
