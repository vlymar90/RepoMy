package ru.geekbrains.dz;

public class Team {
    Participants[] participants;

    public Team(Participants[] participants) {
        this.participants = participants;
    }

    public void gameStart(Course c) {
        Obstacles[] obstacles = c.getObstacles();
        for(int i = 0; i < participants.length; i++) {
            for(int y = 0; y < obstacles.length; y++) {
                if(participants[i] instanceof Robot) {
                    ((Robot) participants[i]).action(obstacles[y]);
                    if(!((Robot) participants[i]).isReadyDistance()) {
                        break;
                    }
                }
                if(participants[i] instanceof Animal) {
                    ((Animal) participants[i]).action(obstacles[y]);
                    if(!((Animal) participants[i]).isReadyDistance()) {
                        break;
                    }
                }
                if (participants[i] instanceof Swimable && obstacles[y] instanceof Watter) {
                    ((Swimable) participants[i]).swim(obstacles[y]);
                    if(!participants[i].isReadyDistance()) {
                        break;
                    }
                }
            }
        }
    }
    public void resultCross(Participants[] participants) {
        for(int i = 0; i < participants.length; i++) {
            participants[i].printInfo();
        }
    }
}
