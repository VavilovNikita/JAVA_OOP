package section001_classes.structures;

public final class QueueBasedOnArray extends BasedOnArrayDataStorage implements DataStorage {
    public QueueBasedOnArray(int size) {
        super(size);
    }
    public QueueBasedOnArray() {
    }
    public int getifnotEmpty() {
        int resault = array[0];
        System.arraycopy(array, 1, array, 0, array.length-1);
        size--;
        return resault;
    }
}
