package generics.generics07;

import java.util.*;
public class Generics07 {
    public static void main(String args[]) {
        Sample <Integer> obj = new Sample<>();
        obj.push(36);
        System.out.println(obj.pop());
    }
}
class Sample<E>
{
    Stack <E> ob = new Stack <E>();
    public void push(E obj) {
        ob.push(obj);
    }
    public E pop() {
        E obj = ob.pop();
        return obj;
    }
}