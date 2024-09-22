// Yha pe method overloading ka concept use hoga taking aapko uska concept pta chal ske!
package learn_OOPs;
import java.util.*;
class UjjwalRocks
{
	public void meth1()
	{
		System.out.println("Kem Cho Mota Bhai (Yha pe method of class 1 ka hua)");
	}
}
class mojame extends UjjwalRocks
{
	@Override 										// ye zaruri nhi hai lekin ye krna zaruri hai taki aap pta kr ske ye method overloading ho rha h!
	public void meth1()								// yha pe method overriding ho rha h! 
	{												// ek hi method jo same hai previous method ka jha pe arguments ar datatype same rhega!
		System.out.println("Moja Me Mota Bhai ");	// method a rule hai tbhi method overriding hoga!
		System.out.println("Yha pe Method Overloading ka output show hoga");
	}
}
public class Concepts_MethodOverriding
{
	public static void main(String[] args)
	{
		UjjwalRocks u1 = new UjjwalRocks();
		mojame 		 m1 = new mojame();
		u1.meth1();
		m1.meth1();
	}
}

