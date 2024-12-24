class Circle extends Shape{
    private double Radius;

    public Circle(double Radius,String Color,boolean Filled){
        super(Color,Filled);
        this.Radius = Radius;
    }
    public void setRadius(double Radius){
        this.Radius = Radius;
    }
    public double getRadius(){
        return Radius;
    }
    @Override
    public double getArea(){
        return 3.14159 * Radius * Radius;
    }
    @Override
    public double getPerimeter(){
        return 2 * 3.14159;
    }
    @Override
    public String toString(){
        return "Radius of Circle is: " + Radius + ", color: " + Color + ", is filled: " + Filled;
    }
}
