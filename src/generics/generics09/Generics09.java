package generics.generics09;


public class Generics09 {
    public static void main(String args[]) {
        GenericsWithObjects<Double> doubleObject = new GenericsWithObjects<>(12.0);
        doubleObject.print();
        GenericsWithObjects<String> stringObject = new GenericsWithObjects<>("Advance Java");
        stringObject.print();
    }
}
class GenericsWithObjects<T> {
    Object obj;
    GenericsWithObjects(Object obj) {
        this.obj = obj;
    }
    void print() {
        System.out.println(obj);
    }
}