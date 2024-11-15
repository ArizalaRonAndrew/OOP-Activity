public class Activity {
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

   
