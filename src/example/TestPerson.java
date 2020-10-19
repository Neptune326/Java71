package example;

public class TestPerson {
    public static void main(String[] args) {
        Person one = new Person();
        one.setName("zs");
        one.setAge(34);
        one.setMale(true);
        System.out.println("姓名:" + one.getName());
        System.out.println("年龄：" + one.getAge());
        System.out.println("是不是爷们：" + one.isMale());
    }
}
