package section001_classes.structures;

public final class StackBasedOnArray extends BasedOnArrayDataStorage implements DataStorage {

    public StackBasedOnArray(int size) {
        super(size);
    }

    public StackBasedOnArray() {
    }

    public int getifnotEmpty() {
        return array[--size];
    }
}
