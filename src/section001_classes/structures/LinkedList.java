package section001_classes.structures;

public class LinkedList extends BaseDataStructure {
    private Item first;

    private Item last;

@Override
    public void add(int value) {
        Item item = new Item(value);
        if (first == null) {
            first = last = item;
        } else {
            last.next = item;
            last = item;
        }
        count++;
    }
@Override
    public void add(LinkedList list) {
        if (list.count > 0) {
            if (first == null) {
                first = list.first;
            } else {
                last.next = list.first;
            }
            last = list.last;
            count += list.count;
        }
    }

    public int[] toArray() {
        int[] array = new int[count];
        int i = 0;
        Item current = first;
        while (current != null) {
            array[i++] = current.value;
            current = current.next;
        }
        return array;
    }

    public String toString() {
        StringBuilder string = new StringBuilder("[");
        Item current = first;
        while (current != null) {
            string.append(current.value);
            current = current.next;
            if (current != null) {
                string.append(", ");
            }
        }
        return string.append("]").toString();
    }

    public boolean remove(int value) {
        Pair pair = findPair(value);
        if (pair != null) {
            if (pair.current == first && pair.current == last) {
                first = null;
                last = null;
            } else if (pair.current == first) {
                first = pair.current.next;
            } else {
                pair.previous.next = pair.current.next;
                if (pair.current == last) {
                    last = pair.previous;
                }
            }
            count--;
            return true;
        }
        return false;
    }

    private Pair findPair(int value) {
        Item previous = first;
        Item current = first;
        while (current != null) {
            if (current.value == value) {
                return new Pair(previous, current);
            } else {
                previous = current;
                current = current.next;
            }
        }
        return null;
    }

    public boolean contains(int value) {
        return findPair(value) != null;
    }

    private static class Pair {
        private Item previous;

        private Item current;

        public Pair(Item previous, Item current) {
            this.previous = previous;
            this.current = current;
        }
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        count = 0;
    }

    private static class Item {
        int value;

        Item next;

        Item(int value) {
            this.value = value;
        }
    }
}
