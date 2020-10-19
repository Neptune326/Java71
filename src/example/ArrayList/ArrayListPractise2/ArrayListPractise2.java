package example.ArrayList.ArrayListPractise2;

import java.util.ArrayList;

/*
定义四个学生对象，添加到集合，并遍历
 */
public class ArrayListPractise2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三", 20);
        Student stu2 = new Student("李四", 21);
        Student stu3 = new Student("王五", 22);
        Student stu4 = new Student("赵六", 23);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名：" + list.get(i).getName() + ",年龄：" + list.get(i).getAge());
        }
    }
}
