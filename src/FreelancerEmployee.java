public class FreelancerEmployee extends Employee {
    public FreelancerEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.15;
    }
}