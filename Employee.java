import java.text.DecimalFormat;

public class Employee {
	private String name;
	private double q1;
	private double q2;
	private double q3;
	private double q4;
	private double total;
	
	public Employee(String name, double q1, double q2, double q3, double q4, double total) {
		super();
		this.name = name;
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.q4 = q4;
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getQ1() {
		return q1;
	}

	public void setQ1(double q1) {
		this.q1 = q1;
	}

	public double getQ2() {
		return q2;
	}

	public void setQ2(double q2) {
		this.q2 = q2;
	}

	public double getQ3() {
		return q3;
	}

	public void setQ3(double q3) {
		this.q3 = q3;
	}

	public double getQ4() {
		return q4;
	}

	public void setQ4(double q4) {
		this.q4 = q4;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		DecimalFormat formatDec = new DecimalFormat("0.00");
		return "Employee name: " + name + ",  Q1 Sales: $" +  formatDec.format(q1) + "  Q2 Sales: $" + formatDec.format(q2) + "  Q3 Sales: $" + formatDec.format(q3) + "  Q4 sales: $" + formatDec.format(q4) + "  Total Sales: $ " + formatDec.format(total);
	}
	

}
