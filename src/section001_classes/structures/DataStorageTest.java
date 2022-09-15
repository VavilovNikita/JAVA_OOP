package section001_classes.structures;

public class DataStorageTest {
    public static void main(String[] args) {
        DataStorage dataStorage = new QueueBasedOnLinkedList();//new QueueBasedOnArray();
        DataStorage dataStorage1 = new StackBasedOnLinkedList();

//        for (int i = 1; i < 5; i++) {
//            dataStorage.add(i);
//        }
        dataStorage.add(1);
        dataStorage.add(2);
        dataStorage.add(3);
        dataStorage.add(4);
        dataStorage.add(5);
        dataStorage1.add(1);
        dataStorage1.add(2);
        dataStorage1.add(3);
        dataStorage1.add(4);
        dataStorage1.add(5);

        while (dataStorage.size() > 0){
            System.out.print(dataStorage.get() + ", ");
        }
        System.out.println();
        while (dataStorage1.size() > 0){
            System.out.print(dataStorage1.get() + ", ");
        }
        System.out.println();
    }
}
