package ru.geekbrains.dz;




public class Main {

    public static void main(String[] args) {
        ActionMake [] participants = initParticipants();
        Object[] obstacles = initObstacles();


        for(int i = 0; i < participants.length; i++) {

            for (int j = 0; j < obstacles.length; j++) {
                participants[i].action(obstacles[j]);
                if(participants[i].isWin()) {
                    break;
                }

            }
        }
    }

    public static ActionMake[] initParticipants() {
        ActionMake[] participants = new ActionMake[3];
        participants[0] = new Human(1000, 2.5);
        participants[1] = new Cat(500, 3.0);
        participants[2] = new Robot(3000, 5.0);
        return participants;
    }
    public static Object[] initObstacles() {
        Object[] obstacles = new Object[2];
        obstacles[0] = new Treadmill(1000);
        obstacles[1] = new Wall(3.5);
        return obstacles;
    }
}
