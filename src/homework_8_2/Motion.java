package homework_8_2;

public class Motion implements IMotion {


    public boolean jump(double height, double maxheight) {
        return height < maxheight;
    }

    public boolean run(int distance, int maxdistance) {
        return distance < maxdistance;
    }
}