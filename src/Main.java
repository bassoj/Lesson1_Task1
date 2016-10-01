import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        TestClass testClass = new TestClass();

        try {
            Method[] methods = testClass.getClass().getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(MyAnnotation.class)) {

                    MyAnnotation an = method.getAnnotation(MyAnnotation.class);
                    if ("test".equals(method.getName())) {
                        method.invoke(testClass, an.a(), an.b());
                    }
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
