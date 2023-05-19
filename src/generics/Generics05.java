package generics;

public class Generics05 {
    public static void main(String args[])
    {
        //GenericsWithObjects<int> integerObject = new GenericsWithObjects<int>(12);
        //primitive data type kullanildigi icin CTE verir
        //integerObject.print();
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
