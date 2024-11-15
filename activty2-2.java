public class Main {
    public static void main(String[] args) {
        
        Student StudentInstance = new Student("charlie", "san juan Balayan", "BSIT", 2);
        System.out.println("Student Details:");
        System.out.println("Student Name: " + StudentInstance.getName());
        System.out.println("Student Address: " + StudentInstance.getAddress());
        System.out.println("Student Program: " + StudentInstance.getProgram());
        System.out.println("Student Year: " + StudentInstance.getYear());

        
        Staff StaffInstance = new Staff("Ron", "Calantas Calaca City", "english Department", 40000.0);
        System.out.println("\nStaff Details:");
        System.out.println("Staff Name: " + StaffInstance.getName());
        System.out.println("Staff Address: " + StaffInstance.getAddress());
        System.out.println("Staff School: " + StaffInstance.getSchool());
        System.out.println("Staff Salary: " + StaffInstance.getSalary());
    }

    public static class Person {
        protected String Name;
        protected String Address;

        public Person() {}

        public Person(String Name, String Address) {
            this.Name = Name;
            this.Address = Address;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getName() {
            return Name;
        }

        public void setAddress(String Address) {
            this.Address = Address;
        }

        public String getAddress() {
            return Address;
        }
    }

    // Change Student to a static nested class
    public static class Student extends Person {
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
    }

    public static class Staff extends Person {
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
    }
}
