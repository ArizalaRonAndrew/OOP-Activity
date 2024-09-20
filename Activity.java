public class Activity{
    public static void main(String[] args) {
        Dog aso = new Dog(5);

      
        
        aso.aww("Bonatan");
        System.out.println(aso.ngalan());
        aso.bark();
        System.out.println(aso.bilang(5));
        aso.setNum();
        String[] puppyNames = {"Buddy", "Bella","ron", "Charlie"};
        aso.setDoggyNames(puppyNames);
        aso.listPuppies();
       

    }
}