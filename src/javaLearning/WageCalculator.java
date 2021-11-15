package javaLearning;

public class WageCalculator {
	
	int nrOreLucrate = 40;

	public static void main(String[] args) {
		Tester tester1 = new Tester();
		tester1.setNume("Oana");
		tester1.setRatePerHour(40);
		tester1.setAge(23);
		
		System.out.println(tester1.getNume());
		
		Tester tester2 = new Tester();
		tester2.setNume("Maria");
		tester2.setRatePerHour(25);
		tester2.setAge(20);

		System.out.println(tester2.getNume());
		
		WageCalculator calc = new WageCalculator();
		
		System.out.println("Salariul lui " + tester1.getNume() + " este " + calc.calculateSalary(tester1.getRatePerHour()));
		System.out.println("Ana are: " + tester1.getAge() + " ani");
		
	}

	public int calculateSalary(int rateHourly) {
		int salary = nrOreLucrate * rateHourly;		
		return salary;
	}
	
	
}