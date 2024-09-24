public class circle {
    private double radius;
    private String color;
    public circle(){
        radius = 2.0;
        color = "red";
    }
    public circle(double r){
        radius = r;
        color = "red";
    }
    void setRadius(double r){
        this.radius = r;
    }
    void setColor(String c){
        this.color = c;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public String getColor() {
        return color;
    }
}

