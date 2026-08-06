// class student {
//     int rollno;
//     String name;
//     int marks;
// }

public class Array {
    public static void main (String[]arg) {
        
//         // 1D

//         // int nums[] = {5,8,3,12};

//         // int nums[] = new int[4];
//         // nums[0] = 4;
//         // nums[1] = 5;
//         // nums[2] = 46;
//         // nums[3] = 8;

//         // for(int i = 0;i<4;i++)

//         // System.out.println("Hello World " + nums[i]);

//         //2D
   
//         // int nums[][] = new int [3][4];
//         // int random = 0;
//         // // (int)Math.random() * 100;

//         // for(int i = 0; i < 3; i++) {
//         //     for (int j = 0; j < 4; j++) {
//         //         nums[i][j] = (int)(Math.random() * 10);
//         //     }
            
//         // }


//         // for(int i = 0; i < 3; i++) {
//         //     for (int j = 0; j < 4; j++) {
//         //         System.out.print(nums[i][j] + " ");
//         //     }
//         //     System.out.println();
//         // }

//         // for (int n[] : nums) {
//         //     for (int m: n) {
//         //         System.out.print(m + " ");
//         //     }
//         //     System.out.println();
//         // }
   
//         //Jagged Array

//         // int nums[][] = new int[3][];
        
//         // nums[0] = new int[4];
//         // nums[1] = new int[9];
//         // nums[2] = new int[6];

//         // for (int i = 0; i < nums.length; i++) {
//         //     for (int j = 0; j < nums[i].length; j++) {
//         //         nums[i][j] = (int)(Math.random() * 10);
//         //     }
//         // }

//         // for (int n[] : nums) {
//         //     for (int m: n) {
//         //         System.out.print(m + " ");
//         //     }
//         //     System.out.println();
//         // }
   
//         student s1 = new student();
//         s1.rollno = 1;
//         s1.name = "Shubham";
//         s1.marks = 69;

//         student s2 = new student();
//         s2.rollno = 2;
//         s2.name = "Shanko";
//         s2.marks = 99;

//         student s3 = new student();
//         s3.rollno = 3;
//         s3.name = "Joydip";
//         s3.marks = 59;

//         student students[] = new student[3];
//         students[0] = s1;
//         students[1] = s2;
//         students[2] = s3;

//         for (int i = 0; i < students.length; i++) {
//             System.out.println(students[i].name + " : " + students[i].marks);
//         }

        int nums[] = new int[4];

        nums[0] = 4;
        nums[1] = 5;
        nums[2] = 6;
        nums[3] = 9;

        for(int i = 0; i < nums.length; i ++) {
            System.out.println(nums[i]);
        } 

        for (int n : nums) {
            System.out.println(n);
        }

    }
}