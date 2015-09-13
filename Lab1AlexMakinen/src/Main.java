import org.apache.poi.ss.formula.functions.FinanceLib;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double r;
		double n;
		double y;
		double p;
		double f;
		boolean t;
		
		double RI; // required income
		double SSI; // monthly SSI
		
		double PV;
		double PMT;
		
		Scanner scanner = new Scanner(System.in);
		
		// PV
		System.out.println("What is your annual return? (Answer from .00-.03)");
		r = scanner.nextDouble();
		r = r / 12;
		System.out.println("How many years do you plan to be retired?");
		n = scanner.nextDouble();
		n = n * 12;
		System.out.println("What is your required income?");
		RI = scanner.nextDouble();
		System.out.println("What is your monthly SSI?");
		SSI = scanner.nextDouble();
		y = RI - SSI;
		f = 0;
		t = false;
		
		PV = FinanceLib.pv(r, n, y, f, t);
		System.out.println("Your PV is " + PV);
		
		// PMT
		System.out.println("What is your annual return? (Answer from .00 to .20)");
		r = scanner.nextDouble();
		r = r / 12;
		System.out.println("How many years do you plan to work?");
		n = scanner.nextDouble();
		n = n * 12;
		p = 0;
		f = PV;
		t = false;
		
		PMT = FinanceLib.pmt(r, n, p, f, t);
		System.out.println("Your PMT is " + PMT);
		
		
		
	
	}
	
}
