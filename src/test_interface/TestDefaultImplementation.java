package test_interface;

interface A{
    default void test(){
        System.out.println("Test Method from interface A");
    }
}

interface B{
    default void test(){
        System.out.println("Test Method from interface B");
    }
}
class C implements A, B{

    @Override
    public void test() {
        A.super.test();
    }
}
public class TestDefaultImplementation {
}
