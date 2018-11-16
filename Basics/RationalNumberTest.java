package Basics;
public class RationalNumberTest {

  /** Test rational number class. */
  public static void main(String[] args) {
    testZero();
    testOne();
    testOneThirdWithOneFifth();
    testFourThirdsWithSixSeventh();
    testOneHalfWithOneHalf();
    testTwoThirdsWithSixFifth();
    testFourSixthWithZero();
    testDenZero();
  }

  private static void testZero() {
    RationalNumber q = new RationalNumber(0);
    checkSame(q, 0.0, "0");
    q = new RationalNumber(0, 1);
    checkSame(q, 0.0, "0");
  }

  private static void testOne() {
    RationalNumber q = new RationalNumber(1);
    checkSame(q, 1.0, "1");
    q = new RationalNumber(1, 1);
    checkSame(q, 1.0, "1");
  }

  private static void testOneThirdWithOneFifth() {
    RationalNumber q1 = new RationalNumber(1, 3);
    RationalNumber q2 = new RationalNumber(1, 5);
    RationalNumber q3 = q1.add(q2);
    RationalNumber q4 = q1.multiply(q2);
    checkSame(q3, (5.0 + 3.0) / (3.0 * 5.0), "8/15");
    checkSame(q4, 1.0 / 1.15, "1/15");
  }

  private static void testFourThirdsWithSixSeventh() {
    RationalNumber q1 = new RationalNumber(4, 3);
    RationalNumber q2 = new RationalNumber(6, 7);
    RationalNumber q3 = q1.add(q2);
    RationalNumber q4 = q1.multiply(q2);
    checkSame(q3, 46.0 / 21.0, "46/21");
    checkSame(q4, 8.0 / 7.0, "8/7");
  }

  private static void testOneHalfWithOneHalf() {
    RationalNumber q1 = new RationalNumber(1, 2);
    RationalNumber q2 = q1.add(q1);
    RationalNumber q3 = q1.multiply(q1);
    checkSame(q2, 1.0, "1");
    checkSame(q3, 1.0 / 4.0, "1.4");
  }

  private static void testTwoThirdsWithSixFifth() {
    RationalNumber q1 = new RationalNumber(2, 3);
    RationalNumber q2 = new RationalNumber(6, 5);
    RationalNumber q3 = q1.add(q2);
    RationalNumber q4 = q1.multiply(q2);
    checkSame(q3, 28.0 / 15.0, "28/15");
    checkSame(q4, 4.0 / 5.0, "4/5");
  }

  private static void testFourSixthWithZero() {
    RationalNumber q1 = new RationalNumber(4, 6);
    RationalNumber q2 = new RationalNumber(0);
    RationalNumber q3 = q1.add(q2);
    RationalNumber q4 = q1.multiply(q2);
    checkSame(q3, 2.0 / 3.0, "2/3");
    checkSame(q4, 0.0, "0");
  }
  
  private static void checkSame(RationalNumber rationalNumber, double expectedDouble,
      String expectedString) {
    System.out.print(
        "double value: " + rationalNumber.toDouble() + ", expected double: " + expectedDouble);
    System.out.println(", string: " + rationalNumber.toString() + ", expected: " + expectedString);
  }
  
  private static void testDenZero() {
	  try {
	  RationalNumber q1 = new RationalNumber(2, 0);
	  }catch(IllegalArgumentException e) {
		  System.err.println("Invalid Input! Error:\n" + e.getMessage());
		  System.exit(1);
	  }
  }
}
