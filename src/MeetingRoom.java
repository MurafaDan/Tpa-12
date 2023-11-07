public class MeetingRoom {
    public void join(Training[] trainee){
        for (Training t:trainee ) {
            t.attendTraining();
        }
    }
}
