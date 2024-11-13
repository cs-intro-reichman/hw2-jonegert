// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int rep = Integer.parseInt(args[0]);
		double n = 1;
		double sum = 0;
		for (int i = 0;i<rep;i++){
			if (i%2==1){
				sum=sum+(1/n)*(-1);
			}else{
				sum=sum+(1/n);
			}n+=2;
		}
		sum*=4;
		double pai = Math.PI;
		System.out.println("pi according to Java: " + pai);
		System.out.println("pi, approximated: " + sum);
	    
	}
}
