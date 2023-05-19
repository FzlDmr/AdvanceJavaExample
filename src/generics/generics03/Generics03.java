package generics.generics03;


class MyClassA<U> {
    U a;
    public MyClassA(U str) { a = str; }
    public U get_() { return a; }
}
class MyClassB<T, V> extends MyClassA<V> { // LINE A
    public MyClassB(V v) { super(v);  }
    public String myMethod() {
        V input = get_();
        String inputString = input.toString();
        String result = "";
        for (int i = inputString.toCharArray().length; i > 0; i--) {
            int ch = inputString.toLowerCase().toCharArray()[i - 1];
            int newNumber = 0;
            while (ch > 0) {
                newNumber = newNumber * 10 + ch % 10;
                ch = ch / 10;
            }
            result += ((char) ((newNumber / 65) + 66));
        }
        return result;
    }
}
public class Generics03 {
    public static void main(String[] args) {
        MyClassB<Integer, StringBuilder> obj = new MyClassB<Integer, StringBuilder>(new StringBuilder("JAVA"));
        System.out.println(obj.myMethod());
    }
}