public class TriArea2 {

	public static double area(double base, double height, double tangent) {
		double part1 = (Math.pow(base, 2.0)),
		part2 = (Math.pow(height, 2.0)),
		part3 = (Math.pow(tangent, 2.0)),
		part4 = (part1 + part2 + part3),
		part8 = Math.pow(part4, 2.0),
		part5 = Math.pow(base, 4.0),
		part6 = Math.pow(height, 4.0),
		part7 = Math.pow(tangent, 4.0),
		part9 = (part5 + part6 + part7),
		part10 =(part9 * 2.0),
		part11 = (part8 - part10),
		part12 = Math.sqrt(part11),
		part13 =(part12 * 0.25);
		return part13;
		 
		//return (double) (Math.multiply((Math.sqrt(Math.pow(Math.pow(base, 2.0) + Math.pow(height, 2.0) + Math.pow(tangent, 2.0), 2.0)
		//- (Math.multiply((Math.pow(base, 4.0) + Math.pow(height, 4.0) + Math.pow(tangent, 4.0)), 2.0)))), 0.25));
	}
}
//public BigDecimal divide(BigDecimal divisor)
//public BigDecimal pow(int n)
//area= 1/4 square root((a^2+b^2+c^2)^2-2(a^4+b^4+c^4)
//public BigDecimal multiply(BigDecimal multiplicand)