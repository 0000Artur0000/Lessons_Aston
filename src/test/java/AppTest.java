import org.junit.jupiter.api.Test;

public class AppTest {

    private void runTest(String testName, Runnable testMethod) {
        System.out.println("[INFO] -------------------------------------------------------");
        System.out.println("[INFO]  " + testName + " TEST");
        System.out.println("[INFO] -------------------------------------------------------");
        testMethod.run();
    }
<<<<<<< HEAD
=======
>>>>>>> temp-branch
    @Test
    public void testAirport() {
        runTest("AIRPORT", () -> com.arzer0.lessons.lesson1.homework.airport.App.main(null));
    }
<<<<<<< HEAD
=======
>>>>>>> temp-branch
    @Test
    public void testAutobase() {
        runTest("AUTOBASE", () -> com.arzer0.lessons.lesson1.homework.autobase.App.main(null));
    }
<<<<<<< HEAD
=======
>>>>>>> temp-branch
    @Test
    public void testEntranceExams() {
        runTest("ENTRANCE EXAMS", () -> com.arzer0.lessons.lesson1.homework.entrance_exams.App.main(null));
    }
<<<<<<< HEAD
=======
>>>>>>> temp-branch
    @Test
    public void testLibrary() {
        runTest("LIBRARY", () -> com.arzer0.lessons.lesson1.homework.library.App.main(null));
    }
<<<<<<< HEAD
=======
>>>>>>> temp-branch
    @Test
    public void testStore() {
        runTest("STORE", () -> com.arzer0.lessons.lesson1.homework.store.App.main(null));
    }
<<<<<<< HEAD
=======
>>>>>>> temp-branch
    @Test
    public void testSystemFacultative() {
        runTest("SYSTEM FACULTATIVE", () -> com.arzer0.lessons.lesson1.homework.system_facultative.App.main(null));
    }
<<<<<<< HEAD
=======
>>>>>>> temp-branch
    @Test
    public void testTelecom() {
        runTest("TELECOM", () -> com.arzer0.lessons.lesson1.homework.telecom.App.main(null));
    }
}
