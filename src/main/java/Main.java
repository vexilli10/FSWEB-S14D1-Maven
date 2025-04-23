import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.*;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {
        // *** Cylinder Tests ***
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        // *** Pool Tests ***
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        // *** Developer Tests ***
        Employee employee = new Employee(1, "John", 50000);
        employee.work();
        JuniorDeveloper junior = new JuniorDeveloper(2, "Jane", 40000);
        junior.work();
        MidDeveloper mid = new MidDeveloper(3, "Bob", 60000);
        mid.work();
        SeniorDeveloper senior = new SeniorDeveloper(4, "Alice", 80000);
        senior.work();
        HRManager hr = new HRManager(5, "Mary", 90000);
        hr.work();
        hr.addEmployee(junior, 0);
        hr.addEmployee(mid, 1);
        hr.addEmployee(senior, 2);
        hr.addEmployee(junior, 0); // should warn
    }
}