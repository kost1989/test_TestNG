import org.junit.Test;
import org.testng.ISuite;
import org.testng.ISuiteListener;

import static org.junit.Assert.assertEquals;


@TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
public class AnnotationTest implements ISuiteListener {
    public static boolean start = false;

    public static boolean finish = false;

    @Override
    public void onFinish(ISuite arg0) {
        System.out.println("Finishing");
    }

    @Override
    public void onStart(ISuite arg0) {
        System.out.println("Starting");
    }


    @Test
    public void annotation() {
        assertEquals(1, 1);
        System.out.println();
    }
}
