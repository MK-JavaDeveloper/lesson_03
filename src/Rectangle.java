public class Rectangle {

    double length;
    double width;

    //Конструктори
    Rectangle(){
        this.length = 10;
        this.width = 5;
    }

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    //Обчислення площі
    public double area() {
        return length * width;
    }
    //Обчислення периметра
    public double perimeter() {
        return (length + width) * 2;
    }

    public static void main(String[] args) {

        Rectangle p1 = new Rectangle();
        Rectangle p2 = new Rectangle(7.5, 3.3);
        Rectangle p3 = new Rectangle(12,8);
        Rectangle p4 = new Rectangle(10.4, 5.6);

        System.out.println("Площа прямокутника = " + p1.area());
        System.out.println("Периметр прямокутника = " + p1.perimeter());
        System.out.println("Площа прямокутника = " + p2.area());
        System.out.println("Периметр прямокутника = " + p2.perimeter());
        System.out.println("Площа прямокутника = " + p3.area());
        System.out.println("Периметр прямокутника = " + p3.perimeter());
        System.out.println("Площа прямокутника = " + p4.area());
        System.out.println("Периметр прямокутника = " + p4.perimeter());
    }
}
