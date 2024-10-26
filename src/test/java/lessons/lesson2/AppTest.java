package lessons.lesson2;

import org.junit.jupiter.api.Test;

import static com.arzer0.lessons.lesson2.homework.Main.main;

public class AppTest {

    private void runTest(String testName, Runnable testMethod) {
        System.out.println("[INFO] -------------------------------------------------------");
        System.out.println("[INFO]  " + testName + " TEST Урок 2");
        System.out.println("[INFO] -------------------------------------------------------");
        testMethod.run();
    }

    @Test
    public void testAirport() {
        runTest("AIRPORT", () -> main(null));
    }


}
