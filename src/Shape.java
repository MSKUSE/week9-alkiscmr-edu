public abstract class Shape {

    private String color = "white";

    public Shape(){

    }
    public Shape(String color) {

        this.color = color;
    }

    public abstract double perimeter();

    public abstract double area();

    @Override
    public String toString(){
        return "shape{color"}";
                ";
    }




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
