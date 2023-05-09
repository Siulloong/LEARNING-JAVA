package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Contract;
import Entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		/* OnlinePaymentService ps = new PaypalService();
		
		System.out.println(ps.paymentFree(200.00));
		
		System.out.println(ps.interest(200.00,3));
		*/
		
		 //OnlinePaymentService ps = new PaypalService();
		 //ContractService cs = new ContractService(ps);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data");
		System.out.print("Number : ");
		Integer number = sc.nextInt();
		System.out.print("Date dd/mm/yyyy :");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value : ");
		Double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Enter number of installments : ");
		int N = sc.nextInt();
		
		ContractService cs = new ContractService(new PaypalService());
		cs.processContract(contract, N);
		
		System.out.println("Installments : ");
		
		for (Installment it : contract.getInstallments()) {
			System.out.println(it);
		}
		
	}

}
