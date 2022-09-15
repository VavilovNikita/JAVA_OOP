package selection002_polymorphism;

public class ElementProvider implements fromRAMA {

    private int[] array;
    private int index;

    public ElementProvider(int[] array) {
        this.array = array;
    }

    @Override
    public Boolean HasMoreElement() {
        return index < array.length;
    }

    @Override
    public int nextElement() {
        return array[index++];
    }
}
