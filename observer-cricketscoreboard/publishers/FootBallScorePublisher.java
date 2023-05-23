package cricketscoreboard.publishers;

import cricketscoreboard.subscribers.CricketSubscriber;

import java.util.List;

public class FootBallScorePublisher implements FootBallPublisher {

    private int goals1;
    private int goals2;
    private float duration;
    private List<CricketSubscriber> subscribers;

    @Override
    public void subscribe(CricketSubscriber subscriber) {

    }

    @Override
    public void unsubscribe(CricketSubscriber subscriber) {

    }

    @Override
    public void notifyAll(int runs, int wickets, float overs) {

    }

    @Override
    public int getGoals1() {
        return this.goals1;
    }

    @Override
    public int getGoals2() {
        return this.goals2;
    }

    @Override
    public float getDuration() {
        return this.duration;
    }
}
