import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class projectTest {
  @Test
  public void test_project_1() {
    assertEquals("Not a triangle", (project.triangle(1, 2, 4)));
  }

  @Test
  public void test_project_2() {
    /*for (int i = 1; i < 10; i++) {
      assertEquals("Scalene", (project.triangle(3 * i, 4 * i, 5 * i)));
    }*/
    assertEquals("Scalene", (project.triangle(3, 4, 5)));
  }

  @Test
  public void test_project_3() {
    assertEquals("Scalene", (project.triangle(5, 12, 13)));
  }

  @Test
  public void test_project_4() {
    assertEquals("Scalene", (project.triangle(7, 24, 25)));
  }

  @Test
  public void test_project_5() {
    assertEquals("Scalene", (project.triangle(8, 15, 17)));
  }

  @Test
  public void test_project_6() {
    assertEquals("Isosceles", (project.triangle(1, 1, Math.sqrt(2))));
  }

  @Test
  public void test_project_7() {
    assertEquals("Scalene", (project.triangle(1, Math.sqrt(3), 2)));
  }

  // ! ///////////////////////////////////////////////////////////////////////////////
  @Test
  public void test_project_8() {
    assertEquals("Not a triangle", (project.triangle(10, 20, 40)));
  }

  @Test
  public void test_project_9() {
    assertEquals("Not a triangle", (project.triangle(15, 60, 13)));
  }

  @Test
  public void test_project_10() {
    assertEquals("Equilateral", (project.triangle(5, 5, 5)));
  }

  /*
  ? 3 - 4 - 5
  ? 5 - 12 - 13
  ? 7 - 24 - 25
  ? 8 - 15 - 17
  ? 1 - 1 - Sqrt(2)
  ? 1 - Sqrt(3) - 2
  ! 10 - 20 - 40
  ! 20 - 10 - 40
  ! 40 - 20 - 10
  ! 5 - 5 - 8
  ! 5 - 8 - 5
  ! 8 - 5 - 5
  !
  !
  !
  !
  !
  */
}