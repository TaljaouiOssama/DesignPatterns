public class Circle extends Shape{

    private int radius;

    public Circle(int x, int y, String color,int radius) {
       super(x,y,color);
       this.radius=radius;
    }
    public Circle() {

    }
    public  Circle(Circle circle){
        super(circle);
        this.radius=circle.getRadius();
    }
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) {
            return false;
        }

        Circle shape2 = (Circle) object2;
        return shape2.getRadius() == this.radius;
    }

    @Override
    public Prototype clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
