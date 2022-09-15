package section001_classes;

import section001_classes.structures.DynaArray;

public class Problem {
    public static void main(String[] args) {
        int[] array = {-1, 2, 3, -4, -5, 1, 1, 1, 1, 1, 1, 1, 1};

        DynaArray dynaArray = getPositiveNumbers(array);

        System.out.println(dynaArray.toString());
    }

    private static DynaArray getPositiveNumbers(int[] array) {
        DynaArray dynaArray = new DynaArray();//создание переменной дина аррэй в классе Динааррэй
        for (int value : array) {
            if (value >= 0) {
                dynaArray.add(value);
            }
        }
        return dynaArray;

    }
}
