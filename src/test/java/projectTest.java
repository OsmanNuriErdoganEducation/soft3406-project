import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class projectTest {
  @Test
  public void test_project_1() {
    assertEquals("Not a triangle", (project.triangle(2, 9, -1)));
  }
  @Test
  public void test_project_2() {
    assertEquals("Not a triangle", (project.triangle(1, 2, 4)));
  }
  @Test
  public void test_project_3() {
    assertEquals("Equilateral", (project.triangle(6, 6, 6)));
  }
  @Test
  public void test_project_4() {
    assertEquals("Isosceles", (project.triangle(5, 2, 5)));
  }
  @Test
  public void test_project_5() {
    assertEquals("Isosceles", (project.triangle(1, 3, 3)));
  }
  @Test
  public void test_project_6() {
    assertEquals("Isosceles", (project.triangle(6, 6, 1)));
  }
  @Test
  public void test_project_7() {
    assertEquals("Scales", (project.triangle(8, 15, 17)));
  }

}