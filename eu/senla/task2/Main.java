package eu.senla.task2;

public class Main {

    public static void main(String[] args) {
        int i = 10;
        Cat oneCat = new Cat();

        while (i > 0) {
            /*System.out.print(oneCat.getName() + " ");
            System.out.println(oneCat.getAge());*/
            System.out.println(oneCat.toString());
            i--;
        }

        for (int j = 0; j < 10; j++){
            oneCat.setName("Murka" + j);
            oneCat.setAge((int)(Math.random()*10 + 1));
            System.out.print(oneCat.getName()+" ");
            System.out.println(oneCat.getAge());

        }

        Cat[] cats =new Cat[5];
        for (Cat testCat: cats){
            testCat = new Cat();
            testCat.setName("Cat number ");
            testCat.setAge((int)(Math.random()*10+1));
            System.out.print(testCat.getName());
            System.out.println(testCat.getAge());
        }

        int k = 10;
       do {
            Cat newCat = new Cat("Kitty", 5);
            newCat.setName("Kitty");
            newCat.setAge((int)(Math.random()*10+1));
            System.out.print(newCat.getName()+" ");
            System.out.println(newCat.getAge());
            k--;
        } while (k > 1);

    }



}
