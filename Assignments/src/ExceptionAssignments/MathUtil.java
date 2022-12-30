package ExceptionAssignments;

public class MathUtil {
	public static int factorial(int no) throws IllegalArgumentException{
		try {
			if(no>16) {
				throw new IllegalArgumentException("The argument passed overflows Integer boundaries ");
			}
			else if(no<0) {
				throw new IllegalArgumentException("The argument passed is less than 0");
			}
			else {
				int fact=1;
				for(int i=no;i>0;i--)
					fact*=i;
				return fact;
			}
		}catch(IllegalArgumentException e) {
			System.out.println("Caught in MathUtil class: "+e);
			throw e;
		}
	}
}
