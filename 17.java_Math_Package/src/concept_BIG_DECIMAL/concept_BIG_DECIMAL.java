package concept_BIG_DECIMAL;
import java.math.*;
class info_BigDecimal
{
	info_BigDecimal()
	{
		System.out.println("The BigDecimal class provides operations on double numbers for arithmetic, scale handling, rounding, comparison, format conversion and hashing."
				+ "\nIt can handle very large and very small floating point numbers with great precision but compensating with the time complexity a bit.\r"
				+ "\nA BigDecimal consists of a random precision integer unscaled value and a 32-bit integer scale. If greater than or equal to zero, "
				+ "\nthe scale is the number of digits to the right of the decimal point. If less than zero, the unscaled value of the number is multiplied by 10^(-scale).");
		System.out.println("\nNeed Of BigDecimal:\r\n"
				+ "\r\n"
				+ "The two java primitive types(double and float) are floating point numbers, which is stored as a binary representation of a fraction and a exponent.\r\n"
				+ "Other primitive types(except boolean) are fixed-point numbers. Unlike fixed point numbers, floating point numbers will most of the times return an answer with a small error (around 10^-19)."
				+ "\nThis is the reason why we end up with 0.009999999999999998 as the result of 0.04-0.03 in the above example.\n");
	}
}
class double_add
{
	double_add()
	{
		double a = 0.45;
		double b = 0.43;
		double c = a-b;
		System.out.println("The result of a-b is "+c);
	}
}
class bigDecimal_add
{
	bigDecimal_add()
	{
		BigDecimal _a = new BigDecimal("0.45");
		BigDecimal _b = new BigDecimal("0.43");
		BigDecimal _c = _a.subtract(_b);
		System.out.println("The Result of a-b is "+_c );
		
	}
}
public class concept_BIG_DECIMAL 
{
	public static void main(String[] args) 
	{
		info_BigDecimal info = new info_BigDecimal();
		double_add dadd = new double_add();
		bigDecimal_add bigdadd = new bigDecimal_add();
	}
}
