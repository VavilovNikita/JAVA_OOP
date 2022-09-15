package section001_classes.structures;

import java.util.Arrays;

public class LinkedListTest{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 1; i <= 50; i++) {
            list.add(i);
        }
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list);
        list.clear();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.toString() + list.size());

        list.remove(5);
        System.out.println(list.contains(5));
        System.out.println(list.contains(3));
        System.out.println(list.contains(1));
        // [0, 1, 2, 3]
        System.out.println(list.toString() + list.size());

        list.remove(0);
        // [1, 2, 3]
        System.out.println(list.toString() + list.size());

        list.remove(2);
        // [1, 3]
        System.out.println(list.toString() + list.size());

        list.remove(1);
        // [3]
        System.out.println(list.toString() + list.size());

        list.remove(3);
        //[]
        System.out.println(list.toString() + list.size());
        ///////////////////////////////////////////
        list.add(0);
        list.add(1);

        list.remove(1);
        // [0]
        System.out.println(list.toString() + list.size());
        DynaArray dynaArray = new DynaArray();
        int[] array = {0,1,2,3,4};
        dynaArray.add(array);

        list.add(array);
        list.add(dynaArray);
        System.out.println(list.toString() + list.size());
        list.clear();
        LinkedList secondlist = new LinkedList();
        list.add(new int[]{0,1,2,3});
        secondlist.add(new int[]{4,5,6,7});

        list.add(secondlist);

        System.out.println(list);
        int[] array2 = list.toArray();
        System.out.println(Arrays.toString(array2));
//        for (int i = 1; i <= 50; i++) {
//            list.add(i);
//        }
//        System.out.println(list.asString());
//        int count = 0;
//        while (count <= 500) {
//            count++;
//            int random = new Random().nextInt(51);
//            list.remove(random);
//            System.out.println(list.asString());
//
//        }
    }
}
//        [0, 1, 2, 3]
//[0, 1, 2, 3] - После удаления элемента = 5
//                [1, 2, 3] - После удаления элемента = 0
//                [1, 3] - После удаления элемента = 2
//                [3]  - После удаления элемента = 1
//                []  - После удаления элемента = 3
//                [0] - После добавления двух элементов и удаления элемента = 1



