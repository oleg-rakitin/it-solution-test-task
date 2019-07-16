import java.util.ArrayList;
import java.util.List;

public class NumericalMultiplicity {

    private int N;
    private List listOfFindedNums = new ArrayList();


    NumericalMultiplicity(int N) {
        this.N = N;
    }

    private int getDigitCapacity(int number) {
        return (int) Math.log10(number) + 1;
    }

    public void calculate() {
        int i = 0;
        int findedNums = 0;
        for (; ; ) {
            if (findedNums != N) {
                if (i % getDigitCapacity(i) == 0) {
                    listOfFindedNums.add(i);
                    findedNums++;
                }
                i++;
            } else break;
        }
    }

    @Override
    public String toString() {
        return "Found numbers for N = " + N + " : " + listOfFindedNums;
    }

}
