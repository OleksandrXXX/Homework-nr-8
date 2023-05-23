package homework_8_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Team {
    private String[] arr;
    private final ArrayList<Sportsman> team;
    private final String teamname;

    private final IOutputProvider outputProvider;

    public Team(String teamname) {
        this.team = new ArrayList<>();
        this.teamname = teamname;
        outputProvider = new DesktopFormOutputProvider(teamname);
    }

    public void addSportsman(Sportsman sportsman) {
        team.add(sportsman);
    }

    public void getTeamInfo() {
        arr = new String[team.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = team.get(i).getInfo();
        }

        outputProvider.print("The team " + teamname + " consists of: " + Arrays.toString(arr));
    }

    public void startCompetition(ArrayList<Obstacle> course) {

        outputProvider.print("Competition start!");
        for (Obstacle obstacle : course) {
            for (int i = 0; i < arr.length; i++) {
                if (team.get(i).getCondition())

                    outputProvider.print(team.get(i).getRunResult(obstacle.getRoadLength()));
                if (team.get(i).getCondition())

                    outputProvider.print(team.get(i).getJumpResult(obstacle.getWallHeight()));
            }
        }
    }

    public void getWinner() {
        for (Sportsman sportsman : team) {
            if (sportsman.getCondition()) {
                outputProvider.print("\nПобедитель в команде " + teamname + " " + sportsman.info + " !!");
            }
        }
    }
}