package section001_classes.structures;

public abstract class BaseDataStructure {
    protected int count;

    public final int size() {
        return count;
    }

    public void clear() {
        count = 0;
    }


    public abstract void add(int value);

    public void add(DynaArray dynaArray) {
        add(dynaArray.toArray());
    }

    public void add(int[] array) {
        for (int value : array) {
            add(value);
        }
    }


    public void add(LinkedList list) {
        add(list.toArray());
    }
}
