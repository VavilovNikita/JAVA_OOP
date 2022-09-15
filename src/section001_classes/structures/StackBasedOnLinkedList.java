package section001_classes.structures;

public final class StackBasedOnLinkedList extends BasedOnLinkedListDataStorage {
    @Override
    public int get() {
        if (size > 0) {
            var resault = first.value;
            first = first.next;
            size--;
            if (size == 0) {
                first = null;
                last = null;
            }
            return resault;
        } else {
            return 0;
        }
    }
}
