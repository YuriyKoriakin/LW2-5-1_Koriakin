package initialization;

/**
 * Created by Yuriy on 22.02.2016.
 */
public class MyInitTest {//create class
    static {
        System.out.println("static initialization block 1"); //create static init block
    }
    static {
        System.out.println("static initialization block 2");//create static init block
    }
    {
        System.out.println("non-static initialization block 1");//create non-static init block
    }
    {
        System.out.println("non-static initialization block 2");//create non-static init block
    }
    public MyInitTest(){//create construktor default
        this(0);
        System.out.println("constructor 2");//при такому розміщенні першим спрацює конструктор нижній оскільки він визивається з дефолтного конструктора.

    }
    public MyInitTest(int i){//create construktor int
        System.out.println("constructor 1");
    }
}
