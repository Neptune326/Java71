package example;

public class Person {
    private String name;
    private int age;
    private boolean male;   //是不是爷们
    public void setName(String str){
        name = str;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
