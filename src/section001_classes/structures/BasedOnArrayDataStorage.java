package section001_classes.structures;

public abstract class BasedOnArrayDataStorage extends BaseDataStorage {
    public BasedOnArrayDataStorage(int size) {
        array = new int[size];
    }

    public BasedOnArrayDataStorage() {
        this(5);
    }

    @Override
    public final void add(int value) {
        if (size == array.length) {
            grow(array.length == 0 ? 5 : array.length * 2);
        }
        array[size++] = value;
    }

    @Override
    public int get() {
        if(size>0){
            return getifnotEmpty();
        }
        return 0;
    }

    protected abstract int getifnotEmpty();

    private void grow(int size) {
        int[] newarray = new int[size];
        System.arraycopy(array, 0, newarray, 0, this.size);
        array = newarray;
    }

    @Override
    public final int size() {
        return size;
    }
}
