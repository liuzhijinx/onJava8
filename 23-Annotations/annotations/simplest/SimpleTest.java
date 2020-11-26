// annotations/simplest/SimpleTest.java
// Test the "Simple" annotation
// {java annotations.simplest.SimpleTest}

// D:\workspace\IdeaProjects\onJava8\out\production\onJava8\annotations\simplest
// javac -processor annotations.simplest.SimpleProcessor D:\workspace\IdeaProjects\onJava8\23-Annotations\annotations\simplestSimpleTest.java
package annotations.simplest;
@Simple
public class SimpleTest {
    @Simple
    int i;
    @Simple
    public SimpleTest() {}
    @Simple
    public void foo() {
        System.out.println("SimpleTest.foo()");
    }
    @Simple
    public void bar(String s, int i, float f) {
        System.out.println("SimpleTest.bar()");
    }
    @Simple
    public static void main(String[] args) {
        @Simple
        SimpleTest st = new SimpleTest();
        st.foo();
    }
}