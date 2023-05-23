package cricketscoreboard.publishers;

import cricketscoreboard.subscribers.CricketSubscriber;

import java.util.ArrayList;
import java.util.List;

public class SonyCricketScoreBoardPublisher implements CricketPublisher {

    private int runs;
    private int wickets;
    private float overs;
    private List<CricketSubscriber> subscribers;

    public SonyCricketScoreBoardPublisher() {
        this.subscribers = new ArrayList<>();
    }

   public void subscribe(CricketSubscriber subscriber) {
        this.subscribers.add(subscriber);
   }

    public void unsubscribe(CricketSubscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void notifyAll(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        for (CricketSubscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public float getOvers() {
        return overs;
    }

    public List<CricketSubscriber> getSubscribers() {
        return subscribers;
    }

}
