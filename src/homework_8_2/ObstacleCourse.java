package homework_8_2;

import java.util.ArrayList;

public class ObstacleCourse {

    private final ArrayList<Obstacle> obstaclecourse;

    public ObstacleCourse() {
        obstaclecourse = new ArrayList<>();
    }

    public void obstacleAdd(Obstacle obstacle) {
        obstaclecourse.add(obstacle);
    }

    public ArrayList<Obstacle> getObstacles() {
        return obstaclecourse;
    }

}