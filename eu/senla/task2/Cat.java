package eu.senla.task2;

public class Cat {

    private String name ;
    private int age;

    public Cat(){
        name = "Murka";
        age = 3;
    }
    public Cat(String name, int age) {
    }


    //Cat[] cats =new Cat[5];

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


