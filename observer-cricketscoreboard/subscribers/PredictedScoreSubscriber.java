package cricketscoreboard.subscribers;

import cricketscoreboard.publishers.FootBallPublisher;
import cricketscoreboard.publishers.CricketPublisher;

import java.util.List;

public class PredictedScoreSubscriber implements CricketSubscriber,
FootBallSubscriber{

    private int runs;
    private int wickets;
    private float overs;
    private int goals1;
    private int goals2;
    private float duration;
    private List<CricketPublisher> publishers;

    public PredictedScoreSubscriber(List<CricketPublisher> publishers) {
        this.publishers = publishers;
        for (CricketPublisher publisher : this.publishers)
            publisher.subscribe(this);
    }

    @Override
    public void update(CricketPublisher publisher) {
            this.runs = publisher.getRuns();
            this.wickets = publisher.getWickets();
            this.overs = publisher.getOvers();

        // additional logic
        System.out.println("In ProjectedScoreSubscriber : " + this.runs + " runs," + this.wickets + " wickets,"
                + this.overs + " overs.");
    }

    @Override
    public void update(FootBallPublisher publisher) {

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

    public List<CricketPublisher> getPublisher() {
        return publishers;
    }
}
