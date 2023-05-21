package generics.generics08;

public class Generics08 {
    public static void main(String args[])
    {
        //GenericsWithObjects<double> doubleObject = new GenericsWithObjects<double>(12.0);
        //primitve data tipi yerine Wrapper data tipi kullanilmasi gerekiyordu bundan dolayi CTE verir
        //doubleObject.print();
    }
}
class GenericsWithObjects<T>
{
    T obj;
    GenericsWithObjects(T obj)
    {
        this.obj = obj;
    }
    void print()
    {
        System.out.println(obj);
    }
}
