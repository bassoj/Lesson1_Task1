public class TestClass {

    @MyAnnotation(a = 2, b = 5)
    public void test(int a, int b) {
        System.out.println(a + b);
    }

}
