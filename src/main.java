import java.util.ArrayList;

public class main {

    private static ArrayList<Integer> nums = new ArrayList<>();
    private static int elInArgsArray;

    public static void main(String[] args) {

        try {
            for (elInArgsArray = 0; elInArgsArray < args.length; elInArgsArray++) {
                nums.add(Integer.valueOf(args[elInArgsArray]));
            }
        } catch (NumberFormatException e) {
            System.err.println(args[elInArgsArray] + " is not number!");
        }


        for (int i = 0; i < nums.size(); i++) {
            NumericalMultiplicity nm = new NumericalMultiplicity(nums.get(i));
            nm.calculate();
            System.out.println(nm);

        }
    }
}
