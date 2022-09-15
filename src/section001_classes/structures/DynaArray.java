package section001_classes.structures;

import java.util.Arrays;

public class DynaArray extends BaseDataStructure {
    private int[] result;

    public DynaArray(int size) {
        result = new int[size];
    }

    public DynaArray() {
        result = new int[5];
    }

    @Override
    public void add(int value) {
        if (count == result.length) {
            grow(result.length == 0 ? 5 : result.length * 2);
        }
        result[count++] = value;
    }

    @Override
    public void add(int[] array) {
        add(array, array.length);
    }

    @Override
    public void add(DynaArray dynaArray) {
        add(dynaArray.result, dynaArray.count);
    }

    public void add(int[] array, int leight) {
        if (leight > result.length - count) {
            grow(count + leight);
        }
        System.arraycopy(array, 0, result, count, leight);
        count += leight;
    }

    public void grow(int newLength) {
        int[] newArray = new int[newLength];
        System.arraycopy(result, 0, newArray, 0, result.length);
        result = newArray;
    }

    public int[] toArray() {
        return Arrays.copyOf(result, count);
    }


    @Override
    public String toString() {
        StringBuilder resault = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            resault.append(result[i]);
            if (i != count - 1) {
                resault.append(", ");
            }
        }
        return String.valueOf(resault.append("]"));

    }

    public boolean remove(int value) {
        for (int i = 0; i < count; i++) {
            if (result[i] == value) {
                if (i != count - 1) {
                    System.arraycopy(result, i + 1, result, i, count - 1 - i);
                    count--;
                    break;
                } else {
                    count--;
                    break;
                }
            }

        }
        return false;
    }

    public String contains(int i) {
        for (int j = 0; j < count; j++) {
            if (result[j] == i) {
                return i + " присутствует";
            } else {
                return i + "отсутствует";
            }
        }
        return null;
    }
}




