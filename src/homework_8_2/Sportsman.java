package homework_8_2;

public abstract class Sportsman {

    protected String name;
    protected String info;
    protected int maxdistance;
    protected double maxheight;
    protected String succesfulrunresult;
    protected String badrunresult;
    protected String succesfuljumpresult;
    protected String badjumpresult;
    private boolean condition;
    private final IMotion motion;


    Sportsman(String name, int maxdistance, double maxheight) {
        this.name = name;
        this.info = "";
        this.maxdistance = maxdistance;
        this.maxheight = maxheight;
        this.succesfulrunresult = "";
        this.badrunresult = "";
        this.succesfuljumpresult = "";
        this.badjumpresult = "";
        this.condition = true;
        this.motion = new Motion();
    }

    public String getInfo() {
        return info;
    }

    public String getRunResult(int distance) {
        if (motion.run(distance, maxdistance) && condition) {
            return info + succesfulrunresult + distance + " м";
        }
        condition = false;
        return info + badrunresult;
    }

    public String getJumpResult(double height) {
        if (motion.jump(height, maxheight) && condition) {
            return info + succesfuljumpresult + height + " м";
        }
        condition = false;
        return info + badjumpresult;
    }

    public boolean getCondition() {
        return condition;
    }
}