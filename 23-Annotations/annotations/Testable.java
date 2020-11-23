package annotations;
import onjava.atunit.*;

public class Testable {
    public void execute() {
        System.out.println("Executing");
    }
    @Test
    void testExecute() {
        execute();
    }

    public static void main(String[] args) {
        new Testable().execute();
    }
}
