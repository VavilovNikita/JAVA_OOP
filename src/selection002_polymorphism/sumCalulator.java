package selection002_polymorphism;

public class sumCalulator{
    public static long sum(ElementProvider elementProvider) {
        long sum = 0;
        while (elementProvider.HasMoreElement()) {
            sum += elementProvider.nextElement();
        }
        return sum;
    }

    public static void main(String[] args) {
        ElementProvider object = new ElementProvider(new int[]{1,2,3,4,5});
        System.out.println(sum(object));
    }
}
