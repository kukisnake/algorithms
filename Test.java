import java.util.ArrayList;
import java.util.List;

public class Test {

    static void solve(int first, int second) {

        int lastAns = 0;
        List<List> seqList = new ArrayList();

        List<Integer> firstLineNumbers = new ArrayList();
        firstLineNumbers.add(first);
        firstLineNumbers.add(second);
        int N = firstLineNumbers.get(0);
        int Q = firstLineNumbers.get(1);

        for (int i = 0; i<N; i++) {
            seqList.add(new ArrayList());
        }
        System.out.println(seqList);

        for (int i = 0; i<Q; i++) {
            List<Integer> queryNumbers = firstLineNumbers;
            int queryType = queryNumbers.get(0);
            int x = queryNumbers.get(1);
            int y = queryNumbers.get(2);

            if (queryType == 1) {
                List<Integer> seq = seqList.get(x^lastAns%N);
                seq.add(y);
            } else if (queryType == 2) {
                List<Integer> seq = seqList.get(x^lastAns%N);
                lastAns = seq.get(y%seq.size());
                System.out.println(lastAns);
            }
        }

        System.out.println(N + " " + Q);
    }

    public static void main(String[] args) {

        solve(2,5);

    }
}
