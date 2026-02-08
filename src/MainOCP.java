public class MainOCP {
    public static void main(String[] args) {
        EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator();

        Employee permanent = new PermanentEmployee("John Doe", 50000);
        Employee contract = new ContractEmployee("Jane Smith", 40000);
        Employee intern = new InternEmployee("Bob Johnson", 20000);

        System.out.println(permanent.getName() + " salary: $" + calculator.calculateSalary(permanent));
        System.out.println(contract.getName() + " salary: $" + calculator.calculateSalary(contract));
        System.out.println(intern.getName() + " salary: $" + calculator.calculateSalary(intern));

        Employee freelancer = new FreelancerEmployee("Alice Brown", 30000);
        System.out.println(freelancer.getName() + " salary: $" + calculator.calculateSalary(freelancer));
    }
}