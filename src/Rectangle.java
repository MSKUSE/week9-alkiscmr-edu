public class Rectangle extends Shape implements Drawable{



    int sideA=0 , sideB=0;

    public Rectangle(){}
    public Rectangle(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) obj;
        return sideA == rectangle.sideA && sideB == rectangle.sideB;
    }


    @Override
    public double perimeter(){
        return 2*(this.sideA + this.sideB);
    }

    @Override
    public double area




    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return 2*(sideA + sideB);
    }

    @Override
    public String toString() {
        return super.toString() +
                " Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }



}
