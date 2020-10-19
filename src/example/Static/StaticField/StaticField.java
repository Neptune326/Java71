package example.Static.StaticField;

public class StaticField {
    public static void main(String[] args) {
        Student one = new Student("张三", 23);
        one.room = "206教室";
        System.out.println("姓名：" + one.getName()
                + "，年龄：" + one.getAge()
                + "，所在教室：" + one.room
                + "，学号：" + one.getId());
        Student two = new Student("李四", 21);
        System.out.println("姓名：" + two.getName()
                + "，年龄：" + two.getAge()
                + "，所在教室：" + two.room
                + "，学号：" + two.getId());
    }
}
