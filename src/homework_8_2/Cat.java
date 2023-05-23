package homework_8_2;

public class Cat extends Sportsman {

    public static final String OBJECT_CLASS = "Кот";
    public static final String SUCCESFULL_RUN_RESULT = " преодолел ";
    public static final String BAD_RUN_RESULT = " не смог.";
    public static final String SUCCESFULL_JUMP_RESULT = " преодолел стенку высотой ";
    public static final String BAD_JUMP_RESULT = " не смог прыгнуть так высоко.";

    public Cat(String name, int maxdistance, double maxheight) {
        super(name,maxdistance,maxheight);
        super.info= OBJECT_CLASS + " по кличке " + name;
        super.succesfulrunresult=SUCCESFULL_RUN_RESULT;
        super.badrunresult=BAD_RUN_RESULT;
        super.succesfuljumpresult=SUCCESFULL_JUMP_RESULT;
        super.badjumpresult=BAD_JUMP_RESULT;
    }
}