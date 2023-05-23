package homework_8_2;

public class Program {

    public static void main(String[] args) {

        Team team1= new Team("Winners 1990");
        team1.addSportsman( new Human("Alex",400,0.9));
        team1.addSportsman( new Cat("Sam", 120, 0.5));
        team1.addSportsman( new Robot("Android",2000,1.8));

        Team team2 = new Team("Winners 2000");
        team2.addSportsman( new Human("Pete",800,0.5));
        team2.addSportsman( new Cat("Tom", 500, 0.9));
        team2.addSportsman( new Robot("Drone",180,0.3));

        ObstacleCourse course1=new ObstacleCourse();
        course1.obstacleAdd(new Obstacle(new Wall(0.2), new Road(100)));
        course1.obstacleAdd(new Obstacle(new Wall(0.8), new Road(300)));
        course1.obstacleAdd(new Obstacle(new Wall(1.5), new Road(1500)));
        team1.getTeamInfo();
        team1.startCompetition(course1.getObstacles());

        team2.getTeamInfo();
        team2.startCompetition(course1.getObstacles());

        team1.getWinner();
        team2.getWinner();
    }
}