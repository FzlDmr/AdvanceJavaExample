package generics;

public class Generics02<T> {
    private T t;
    public void set(T t) { this.t = t;  }
    public T get() {
        return t;
    }
    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
    public static void main(String[] args) {
        Generics02<Integer> integerBox = new Generics02<Integer>();
        integerBox.set(10);
        //integerBox.inspect(new Number("12")); CTE verir.
        //Number abstract class oldugundan methodlarini overrirde yapmak gerekiyor
    }
}