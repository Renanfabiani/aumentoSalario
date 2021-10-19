package entities;

public class Funcionario {

	public String name;
	public double GrossSalary;
	public double tax;
	
	
	public double netSalary () {
		return GrossSalary - tax;
	}

	public void aumentoSalario (double porcentagem) {
		GrossSalary += GrossSalary * porcentagem /100.0;
	}
		
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}