package generics.generics06;


public class Generics06 {
    public static void main(String args[])
    {
        GenericsWithObjects<Integer> integerObject = new GenericsWithObjects<Integer>(12);
        GenericsWithObjects<String> stringObject = new GenericsWithObjects<String>("AdvanceJava");
        //integerObject = stringObject; // CTE veir Integer data tipine String data tipinde deger atamaya calisildigi icin
        integerObject.print(); // LINE B
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
