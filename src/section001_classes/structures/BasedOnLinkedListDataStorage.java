package section001_classes.structures;

public abstract class BasedOnLinkedListDataStorage implements DataStorage {

    protected int size;

    protected Item first;

    protected Item last;


    @Override
    public void add(int value) {
        Item item = new Item(value);
        if(first == null){
            first = last = item;
        }else{
            last.next = item;
            last = item;
        }
        size++;
    }

    @Override
    public abstract int get();

    @Override
    public int size() {
        return size;
    }

    protected static class Item {
        int value;

        Item next;

        Item(int value) {
            this.value = value;
        }
    }
}
