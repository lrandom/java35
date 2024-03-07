public class Human {
    int age;
    String gender;
    String name;
    float height;
    float weight;
    String eyeColor;
    String hairColor;

    public Human() {

    }
    public Human(String name) {
        this.name = name;
    }

    public Human(int age,  String name) {
        this.age = age;
        this.name = name;
    }

    void eat() {
        System.out.println(this.name + " age");
    }

    void sleeping() {
        System.out.println(this.name + " sleep");
    }

    public static void main(String[] args) {
        Human nam = new Human(20, "Nam");
        nam.hairColor = "yellow";
        nam.eyeColor = "black";
        nam.gender = "male";
        nam.height = 1.75f;
        nam.weight = 63;
        nam.eat();

        Human hung = new Human(20, "Hùng");
        hung.hairColor = "red";
        hung.eyeColor = "black";
        hung.gender = "male";
        hung.height = 1.75f;
        hung.weight = 65;
        hung.sleeping();
    }
}
