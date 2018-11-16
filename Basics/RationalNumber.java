package Basics;
/** Representation of a positive rational number. */
public class RationalNumber {

  private final long numerator;
  private final long denominator;

  /**
   * Create a new rational number from a whole number.
   * 
   * @param value whole number
   */
  public RationalNumber(long value) {
    this.numerator = value;
    this.denominator = 1;
  }

  /**
   * Create a new rational number.
   * 
   * @param numerator a whole number
   * @param denominator a natural number (without zero)
   */
  public RationalNumber(long numerator, long denominator) {
	if(denominator == 0) {
		throw new IllegalArgumentException("Denominator of Rationalnumber is zero");
	}
    long d = gcd(numerator, denominator);
    this.numerator = numerator / d;
    this.denominator = denominator / d;
  }

  /**
   * Add a rational number to this rational number.
   * 
   * @param augend rational number to add
   * @return sum as new rational number
   */
  public RationalNumber add(RationalNumber augend) {
    long newDenominator = denominator * augend.denominator;
    long newNumerator = numerator * augend.denominator + augend.numerator * denominator;
    return new RationalNumber(newNumerator, newDenominator);
  }

  /**
   * Multiply this rational number with the supplied multiplicand. 
   * @param multiplicand the number to multiply {@code this} to.
   * @return new rational number that is the product
   */
  public RationalNumber multiply(RationalNumber multiplicand) {
    long newNumerator = numerator * multiplicand.numerator;
    long newDenominator = denominator * multiplicand.denominator;
    return new RationalNumber(newNumerator, newDenominator);
  }

  /**
   * Return string representation of rational number.
   */
  @Override
  public String toString() {
    if (this.denominator == 1) {
      return Long.toString(numerator);
    } else {
      return numerator + "/" + denominator;
    }
  }

  /**
   * Return double value corresponding to rational number.
   */
  public double toDouble() {
    return ((double) numerator) / denominator;
  }

  /**
   * Compute the greatest common divisor of two numbers.
   * 
   * @param m first number
   * @param n second number
   * @return greatest common divisor
   */
  private static long gcd(long m, long n) {
    if (n == 0) {
      return m;
    } else {
      return gcd(n, m % n);
    }
  }
}
