package homework_8_2;

public class Obstacle {
    private final Wall wall;
    private final Road road;
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