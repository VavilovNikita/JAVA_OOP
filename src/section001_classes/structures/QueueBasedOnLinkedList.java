package section001_classes.structures;

public final class QueueBasedOnLinkedList extends BasedOnLinkedListDataStorage {

    @Override
    public int get() {
        if(size > 0){
            Item item = first;
            var resault = last.value;
            while (item != null){
                if(item.next == last){
                    last = item;
                    last.next = null;
                    break;
                }
                item = item.next;
            }
            size--;
            if (size == 0) {
                first = null;
                last = null;
            }
            return resault;
        }else {
            return 0;
        }
    }
}
