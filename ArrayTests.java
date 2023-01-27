import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  //my test
  @Test 
	public void testReverseInPlaceMine() {
    int[] input1 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  //my test
  @Test
  public void testReversedMine() {
    int[] input1 = {6, 5, 4};
    assertArrayEquals(new int[]{4, 5, 6}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input = {5.0, 6.0, 6.0, 8.0, 5.0, 5.0, 10.0, 16.0};
    assertEquals(8.0, ArrayExamples.averageWithoutLowest(input), 0);
  }
}
