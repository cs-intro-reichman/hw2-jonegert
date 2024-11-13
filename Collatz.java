// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int number = Integer.parseInt(args[0]);
        String mode = args[1];
        boolean verbose = mode.equals("v");
        for (int seed = 1; seed <= number; seed++) {
            int current = seed;
            int times = 1; 
            if (verbose) {
                System.out.print(seed + " ");
            }
            if (current == 1) {
                current = 4;
                times++;
                if (verbose) {
                    System.out.print(current + " ");
                }
            }
            while (current != 1) {
                if (current % 2 == 0) {
                    current = current / 2;
                } else {
                    current = current * 3 + 1;
                }
                times++;
                if (verbose) {
                    System.out.print(current + " ");
                }
            }
            if (verbose) {
                System.out.println("(" + times + ")");
            }
        }
        System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
    }
}

