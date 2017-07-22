import com.ecib.*;

public class Main {

	public static void main(String[] args) {
		
		Customer shabbir = new Customer(1, "Muhammad Shabbir Mirza");
		shabbir.setAge(70);

		Customer faisal = new Customer(2, "Muhammad Faisal Mirza");
		faisal.setAge(31);		

		Account shabbirCurrent = new Account(101, 1, "current");
		shabbirCurrent.setBalance(20_000);

		Account shabbirSaving = new Account(102, 1, "saving");
		shabbirSaving.setBalance(90_000);

		Account faisalSaving = new Account(103, 2, "saving");
		faisalSaving.setBalance(5_000);		

		System.out.println(shabbir);
		System.out.println(faisal);

		System.out.println(shabbirCurrent);
		System.out.println(shabbirSaving);
		System.out.println(faisalSaving);

		/*
		Customer c = new Customer(10, "Customer");
		System.out.println(c);

		c.setAge(-50);
		System.out.println(c);

		Account a = new Account(201, 10, "asldkfjasdl");
		System.out.println(a);
		*/
		
	}

	
}