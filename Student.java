public class Student extends Person {
    private String Program;
    private int Year;

    public Student(String Name, String Address, String Program, int Year) {
        super(Name, Address);
        this.Program = Program;
        this.Year = Year;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

    public String getProgram() {
        return Program;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getYear() {
        return Year;
    }
    @Override
    public String toString(){
        return "hello i am " + Name + " and " + "in lived in " + Address + ". I am " + Year + "year of " + Program + ".";
    }
}