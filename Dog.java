class Dog {
   String name; 
   boolean isMale;
   int puppies;
   Dog [] doggy;

   public Dog(int numPuppies) {
      puppies = numPuppies;
      doggy = new Dog[puppies]; 
  }
 
   public String aww(String name){
       return this.name = name;
   }

   public String ngalan(){
       return name;
   }

   public void bark(){
      System.out.println(this.name + " Woof! Woof!");
  }

   public int bilang(Integer bilang){
       return this.puppies = bilang;
   }

   public int setNum(){
      return puppies;
   }
   
   public void setDoggyNames(String[] names) {
      for (int i = 0; i < names.length && i < doggy.length; i++) {
          doggy[i]= new Dog(i);
         doggy[i].aww(names[i]);
      }
  }

  public void listPuppies(){
      for(int i = 0; i < puppies;i++ ){
         System.out.println(doggy[i].ngalan());
   }
  }
 
} 