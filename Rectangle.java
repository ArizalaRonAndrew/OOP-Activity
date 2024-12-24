class Rectangle extends Shape{
    protected double Length;
    protected double Width;

    public Rectangle(double Length, double Width, String Color, boolean Filled){
        super(Color, Filled);
        this.Length = Length;
        this.Width = Width;
    }
    public void setLenght(double Length){
        this.Length = Length;
    }
    public void setWidth(double Width){
        this.Width = Width;
    }
    public double getLenght(){
        return Length;
    }
    public double getWidth(){
        return Width;
    }
    @Override
    public double getArea(){
        return Width * Length;
    }
    @Override
    public double getPerimeter(){
        return 2 * (Width + Length);
    }
    @Override
    public String toString(){
        return "lenght: " + Length + ", Width: " + Width + ", Color: " + Color + ", is Filled: " + Filled;
    }
    
}
