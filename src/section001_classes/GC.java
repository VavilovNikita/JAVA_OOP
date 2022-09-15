package section001_classes;

import section001_classes.structures.DynaArray;

import java.util.Arrays;

public class GC {
    public static void main(String[] args) {
        DynaArray dynaArray2 = new DynaArray();
        DynaArray dynaArray3 = new DynaArray();
        dynaArray3.add(5);
        dynaArray3.add(5);
        dynaArray3.add(5);
        dynaArray3.add(5);
        dynaArray3.add(5);
        dynaArray3.add(5);
        System.out.println(Arrays.toString(dynaArray2.toArray()));
        System.out.println(dynaArray3.toString());
    }
}
