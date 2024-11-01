package lessons.lesson3;

import org.junit.jupiter.api.Test;

import static com.arzer0.lessons.lesson3.homework.Main.main;

public class AppTest {

    private void runTest(String testName, Runnable testMethod) {
        System.out.println("[INFO] -------------------------------------------------------");
        System.out.println("[INFO]  " + testName + " TEST Урок 3");
        System.out.println("[INFO] -------------------------------------------------------");
        testMethod.run();
    }

    @Test
    public void testLinkedList() {
        runTest("LinkedList", () -> main(null));
    }


}
