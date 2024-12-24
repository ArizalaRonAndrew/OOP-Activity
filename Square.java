class Square extends Rectangle {
    protected double Side;

    public Square(double Side,double Length,double Width, String Color, boolean Filled){
        super(Length,Width,Color,Filled);
        this.Side = Side;
    }
    public void setSide(double Side){
        this.Side = Side;
    }
    public double getSide(){
        return Side;
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
        return "Side: " + Side + ", Length: " + Length + ",  Width: " + Width + ", Color: " + Color + ", isFIlled: " + Filled;
    }
}
