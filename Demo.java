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

class Computer {
   public void playMusic() {
        System.out.println("Music Playing..");
    }

    public String getMeAPen(int cost){

        if (cost >= 10)
            return "pen";
        else
            return "Nothing";
    }
}

public class Demo {
    public static void main(String[] args) {
        

        Computer obj = new Computer();
        obj.playMusic();
        obj.getMeAPen(10);
        String str = obj.getMeAPen(2);
        System.out.println(str);

    }
}