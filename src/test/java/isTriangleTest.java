import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class isTriangleTest{

    @Test
    public void test_isTriangle_2(){
        assertFalse(isTriangle.isTriangle(1, 2, 4));
    }
    @Test
    public void test_isTriangle_3(){assertFalse(isTriangle.isTriangle(0, 4, 2)); }
    @Test
    public void test_isTriangle_4(){
        assertFalse(isTriangle.isTriangle(5, 2, 3));
    }
    @Test
    public void test_isTriangle_5(){ assertTrue(isTriangle.isTriangle(3, 4, 5)); }

    /*@Test
    public void test_main_1(){
        ByteArrayInputStream in = new ByteArrayInputStream("5\n12\n13\n".getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String consoleOutput = "Enter side 1: \n";
        consoleOutput += "Enter side 2: \n";
        consoleOutput += "Enter side 3: \n";
        consoleOutput += "This is a triangle.\n";

        assertEquals(consoleOutput, out.toString());
    }*/
}
