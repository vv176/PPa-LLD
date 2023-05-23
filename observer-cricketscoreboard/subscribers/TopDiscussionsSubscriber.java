package cricketscoreboard.subscribers;

import cricketscoreboard.publishers.CricketPublisher;

public class TopDiscussionsSubscriber implements CricketSubscriber {

    private int runs;
    private int wickets;
    private float overs;
    private final CricketPublisher publisher;

    public TopDiscussionsSubscriber(CricketPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void update(CricketPublisher publisher) {
        this.runs = publisher.getRuns();
        this.wickets = publisher.getWickets();
        this.overs = publisher.getOvers();
        // additional logic
        System.out.println("In TopDiscussionsSubscriber : " + this.runs + " runs," + this.wickets + " wickets,"
                + this.overs + " overs.");
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

    public CricketPublisher getPublisher() {
        return publisher;
    }

}
