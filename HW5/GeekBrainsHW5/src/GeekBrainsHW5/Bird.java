package GeekBrainsHW5;

//import ru.geekbrains.lesson_e.online.Animal;
//import GeekBrainsHW5;

public class Bird extends Animal {

    protected int flyHeight;

/*
    public Bird(int age, String color, String name) {
        super(age, color, name);
        flyHeight = 0;
    }
*/

    public Bird(int age, String color, String name, int flyHeight) {
        super(age, color, name);
        this.runlength = 5;
        this.flyHeight = flyHeight;
    }

}
