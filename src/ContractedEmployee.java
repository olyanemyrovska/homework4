public class ContractedEmployee extends Employee {
  // TODO fix class declaration and declare variables here
  private String employeeId;
  private String name;
  private String federalTaxId;
  double hourlyRate;
  double NumberOfHoursWorked;

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(employeeId, name);
    this.employeeId = employeeId;
    this.name = name;
    this.federalTaxId = federalTaxId;
    // TODO fill in code here
  }

  public String getFederalTaxId() {
    // TODO fill in code here and replace the return statement
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
    // TODO fill in code here
  }

  public double getHourlyRate() {

    // TODO fill in code here and replace the return statement
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
    // TODO fill in code here
  }

  public void setNumberOfHoursWorked(double NumberOfHoursWorked) {
    this.NumberOfHoursWorked = NumberOfHoursWorked;
    // TODO fill in code here
  }
  public double getNumberOfHoursWorked() {
    // TODO fill in code here and replace the return statement
    return NumberOfHoursWorked;
  }
@Override
  public double calculatePay() {
    this.AverageMonthlySalary = NumberOfHoursWorked * hourlyRate;
  System.out.println(AverageMonthlySalary);
  return AverageMonthlySalary;
    // TODO fill in code here
  }
}
