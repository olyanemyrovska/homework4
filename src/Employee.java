public class Employee implements Payable {
  private String employeeId;
  private String name;
  double AverageMonthlySalary;
  public void  calculatePay(){
  }
  // TODO fix class declaration and declare variables here

  public Employee(String employeeId, String name) {
   this.employeeId = employeeId;
   this.name = name;
    // TODO fill in code here ++-
  }

  public String getEmployeeId() {
        // TODO fill in code here and replace the return statement ++
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
    // TODO fill in code here
  }

  public String getName() {
    // TODO fill in code here and replace the return statement ++
    return name;
  }

  public void setName(String name) {
    this.name = name;
    // TODO fill in code here ++
  }

  public double getAverageMonthlySalary() {
  // TODO fill in code here and replace the return statement
    return AverageMonthlySalary;
  }

  @Override
  public String toString() {
    // TODO fill in code here and replace the return statement, be sure to format double value
    return "Employee " + getName()+ " has average salary " + String.format("%.2f", getAverageMonthlySalary());
  }
}
