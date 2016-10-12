package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{
  @Test
  public void testEmptyString() throws Exception{
    assertEquals(0, Calculator.add(""));
  }
  @Test
  public void testOneNumber() throws Exception{
    assertEquals(1, Calculator.add("1"));
  }
  @Test
  public void testTwoNumbers() throws Exception{
    assertEquals(3, Calculator.add("1,2"));
  }
  @Test
  public void testMultipleNumbers() throws Exception{
    assertEquals(6, Calculator.add("1,2,3"));
  }
}
