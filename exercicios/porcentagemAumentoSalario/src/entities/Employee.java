package entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;

	// Construtor padrão.
	public Employee() {
	}

	// Construtor referenciando id, name e salary.
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// segue os Getters e Setters correspondentes aos atributos.
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	// Método para aplicar a porcetagem no salário do funcionário.
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.00;
	}
	
	// Método para formatação toString.
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
