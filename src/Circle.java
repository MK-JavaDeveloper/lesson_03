public class Circle {

    double radius;
    double diameter;
    final double p = 3.14;

    //Конструктор
    Circle(double radius, double diameter){
        this.radius = radius;
        this.diameter = diameter;
    }
    //Обчислення площі кола
    public double area() {
        return p * diameter;
    }
    //Обчислення довжини кола
    public double circumference() {
        return (2 * p) * radius;
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(2,4);
        Circle c2 = new Circle(3.7,7.4);
        Circle c3 = new Circle(6.3,12.6);
        Circle c4 = new Circle(32.64,65.28);

        System.out.println("Площа кола = " + c1.area());
        System.out.println("Довжина кола = " + c1.circumference());
        System.out.println("Площа кола = " + c2.area());
        System.out.println("Довжина кола = " + c2.circumference());
        System.out.println("Площа кола = " + c3.area());
        System.out.println("Довжина кола = " + c3.circumference());
        System.out.println("Площа кола = " + c4.area());
        System.out.println("Довжина кола = " + c4.circumference());
    }
}
