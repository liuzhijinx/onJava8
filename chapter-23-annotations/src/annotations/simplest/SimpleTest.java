// annotations/simplest/SimpleTest.java
// Test the "Simple" annotation
// {java annotations.simplest.SimpleTest}

// D:\workspace\IdeaProjects\onJava8\chapter-23-annotations\target\classes>
// javac -processor annotations.simplest.SimpleProcessor D:\workspace\IdeaProjects\
// onJava8\chapter-23-annotations\src\annotations\simplest\SimpleTest.java
// or
// D:\workspace\IdeaProjects\onJava8\chapter-23-annotations\src>
// javac -processor annotations.simplest.SimpleProcessor
// D:\workspace\IdeaProjects\onJava8\chapter-23-annotations\src
// \annotations\simplest\SimpleTest.java

// the classes which '-processor' need is in 'target'
//  it is hard to understand the structure of project
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