abstract class Shape {
    protected String Color;
    protected boolean Filled;

    public Shape(String Color,boolean Filled){
        this.Color = Color;
        this.Filled = Filled;
    }

    public void setColor(String Color){
        this.Color = Color;
    }
    public void setFilled(boolean Filled){
        this.Filled = Filled;
    }
    public String getColor(){
        return Color;
    }
    public boolean isFilled(){
        return Filled;
    }
   
    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString(){
        return "Shape's color is: " + Color + ", is filled: " + Filled;
    }

}
