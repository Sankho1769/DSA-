class Human {
    private int age = 19;
    private String name = "Sankho";

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String a) {
        name = a;
    }

    public String getName() {
        return name;
    }

}

class Demo {
    public static void main(String[]args) {

        Human obj = new Human();
        obj.setAge(39);
        obj.setName("Sankho");


        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}