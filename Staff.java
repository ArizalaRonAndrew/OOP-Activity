public class Staff extends Person {
    private String School;
    private double Salary;

    public Staff(String Name, String Address, String School, double Salary) {
        super(Name, Address);
        this.School = School;
        this.Salary = Salary;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    public String getSchool() {
        return School;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public double getSalary() {
        return Salary;
    }
    @Override
    public String toString(){
        return "hello i am " + Name + " and " + "i lived in " + Address +  " from " + School + " and my salary is " + Salary + " pesos." ;
    }
}
