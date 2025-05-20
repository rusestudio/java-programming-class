package justprac;

import java.util.Arrays;
import java.util.List;

public abstract class Rational implements Comparable<Rational> {
	    protected abstract long getNumerator();
	    protected abstract long getDenominator();

	    @Override
	    public int compareTo(Rational that) {
	        long diff = this.getNumerator() * that.getDenominator() - that.getNumerator() * this.getDenominator();
	        return diff < 0 ? -1 : diff == 0 ? 0 : 1;
	    }

	    @Override
	    public boolean equals(Object that) {
	        return that instanceof Rational && 0 == compareTo((Rational) that);
	    }

	    @Override
	    public int hashCode() {
	        long num = getNumerator();
	        long den = getDenominator();
	        if (num == 0) return 0;
	        long gcd = gcd(num, den);
	        num /= gcd;
	        den /= gcd;
	        return (int) (num * Short.MAX_VALUE / den);
	    }

	    private long gcd(long a, long b) {
	        while (b != 0) {
	            long t = b;
	            b = a % b;
	            a = t;
	        }
	        return a;
	    }
	}

	final class IntRational extends Rational {
	    private final int numerator;
	    private final int denominator;

	    public IntRational(int num, int den) {
	        if (den == 0) {
	            throw new IllegalArgumentException("Denominator cannot be zero");
	        }
	        // Reduce the fraction by its greatest common divisor (GCD)
	        int gcd = gcd(num, den);
	        if (den < 0) {
	            gcd = -gcd; // Ensure the denominator is positive
	        }
	        this.numerator = num / gcd;
	        this.denominator = den / gcd;
	    }

	    @Override
	    protected long getNumerator() {
	        return numerator;
	    }

	    @Override
	    protected long getDenominator() {
	        return denominator;
	    }

	    private int gcd(int a, int b) {
	        while (b != 0) {
	            int t = b;
	            b = a % b;
	            a = t;
	        }
	        return a;
	    }

	    @Override
	    public String toString() {
	        return numerator + "/" + denominator;
	    }
	

	        }
	
