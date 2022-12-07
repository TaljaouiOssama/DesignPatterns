import java.util.Map;
import java.util.Objects;

abstract public class Shape implements Prototype{
    protected int x;
    protected int y;
    protected String color;





    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape(Shape shape){
        this.x=shape.getX();
        this.y=shape.getY();
        this.color=shape.getColor();
    }
    public Shape(){
    }

    @Override
    abstract public Prototype clone();

    public void saveInCache(String key){
        ShapeCache.cache.put(key, this);
    }

    static public  Shape getFromCache(String key){
        return (Shape) ShapeCache.cache.get(key).clone();
    }
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.getX() == this.x && shape2.getY() == this.y && shape2.getColor().equals(this.color);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
