// class Calculator {

//     int a;
//     int b;
    
//     public int add(int n1, int n2) {
//         int r = n1 + n2;
//         return r;
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
        
//         int num1 = 7;
//         int num2 = 9;

//         Calculator calc = new Calculator();

//         int result = calc.add(num1, num2);

//         // int result = num1 + num2;

//         System.out.print("The sum is : " + result);
//     }
// }

// class Computer {
//    public void playMusic() {
//         System.out.println("Music Playing..");
//     }

//     public String getMeAPen(int cost){

//         if (cost >= 10)
//             return "pen";
//         else
//             return "Nothing";
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
        

//         Computer obj = new Computer();
//         obj.playMusic();
//         obj.getMeAPen(10);
//         String str = obj.getMeAPen(2);
//         System.out.println(str);

//     }
// }

// class calculator {
//     public int add( int n1, int n2, int n3) {
//         return n1 + n2 + n3;
//     }
//     public int add( int n1, int n2) {
//         return n1 + n2;
//     }
//     public double add( double n1, int n2) {
//         return n1 + n2;
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
        
//         calculator obj = new calculator();
//         int r1 = obj.add(3,4);
//          r1 = obj.add(3,4);
//         System.out.println(r1);
//     }
// }

class Demo {
    public static void main(String[]args) { 
        StringBuffer sb = new StringBuffer("Shankho");
        System.out.println(sb.capacity());
        sb.append("Shubham");

        sb.deleteCharAt(3);
        sb.insert(3, "Helo" );
        sb.setLength(23);
        sb.ensureCapacity(23);

        System.out.println(sb); 
    }
}