package GeekBrainsHW5;

//import ru.geekbrains.lesson_e.online.Animal;


public class Dog extends Animal {
    public Dog(int age, String color, String name, int maxrunlen) {
        super(age, color, name);
        //this.runlength = 500;
        if (maxrunlen != 0) this.runlength = maxrunlen;
        else this.runlength = 500;
    }

}
