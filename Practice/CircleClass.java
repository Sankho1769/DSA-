// class Circle {
//     double x;
//     double y;
//     double r;

//     double area() {
//         return (22.0 / 7) * r * r;
//     }
// }

// class Demo {
//     public static void main(String args[]) {

//         Circle c = new Circle();

//         c.x = 0.0;
//         c.y = 0.0;
//         c.r = 5.0;

//         System.out.println(c.area());
//     }
// }

class Circle {
    double r;

    double area () {
        return(22.00/7) *r*r;
    }
}

class CircleClass {
    public static void main(String[]args) {
        Circle c = new Circle();

        c.r = 4;

        System.out.println(c.area());
    }
}