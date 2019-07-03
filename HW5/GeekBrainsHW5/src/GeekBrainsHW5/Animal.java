package GeekBrainsHW5;

public abstract class Animal extends Object {

    protected String name;
    protected int age;
    protected String color;
    protected int runlength;
    protected int maxrunlen;

    public Animal
(int age, String color, String name) {
        this.age = age;
        this.name = name;
        this.color = color;
    }


    //if (mouse != 0 & weight / mouse < 1000)

    public void run(int runlength) {

        if (runlength <= this.runlength)
                //& runlength <= this.maxrunlen)
                //(runlength <= this.maxrunlen)
        {System.out.println(name + " runs " + runlength + " current limit "+ this.runlength);}
        else
        {System.out.println(runlength + " - not possible to run for " + name + " current limit " + this.runlength);}
    }

   // public abstract void voice();
}
