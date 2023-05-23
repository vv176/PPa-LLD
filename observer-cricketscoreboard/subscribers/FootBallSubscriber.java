package cricketscoreboard.subscribers;

import cricketscoreboard.publishers.CricketPublisher;
import cricketscoreboard.publishers.FootBallPublisher;

public interface FootBallSubscriber {

    void update(FootBallPublisher publisher);

}
