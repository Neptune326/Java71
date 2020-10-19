package example.Static.StaticField;

public class Student {
    private int id;     //学号
    private String name;//姓名
    private int age;//年龄
    static String room;//所在教室
    private static int idCounter = 0;//学号计数器，每new一个新的Student对象，计数器+1

    public Student() {
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
