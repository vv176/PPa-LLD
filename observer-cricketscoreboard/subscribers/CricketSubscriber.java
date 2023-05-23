package cricketscoreboard.subscribers;

import cricketscoreboard.publishers.CricketPublisher;
import cricketscoreboard.publishers.FootBallPublisher;

public interface CricketSubscriber {

    void update(CricketPublisher publisher);


}
