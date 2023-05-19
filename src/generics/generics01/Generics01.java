package generics.generics01;
    public class Generics01 {
        public static void main(String args[]){
            MyGen<Integer> m = new MyGen<Integer>();
            //m.set("java"); CTE hatasi verir Integer tipinde belirlendigi icin String yazamayiz
            System.out.println(m.get());
        }
    }
    class MyGen<T>
    {
        T var;
        void  set(T var)
        {
            this.var = var;
        }
        T get()
        {
            return var;
        }
    }

