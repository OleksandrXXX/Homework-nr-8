package homework_8_2;

public class Obstacle {
    private  Wall wall;
    private Road road;
    public Obstacle(Wall wall, Road road){
        this.road = road;
        this.wall = wall;
    }
    public int getRoadLength() {
        return road.getLength();
    }

    public Double getWallHeight() {
        return wall.getHeight();
    }
}