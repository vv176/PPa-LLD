package cricketscoreboard.publishers;

import cricketscoreboard.subscribers.CricketSubscriber;

public interface FootBallPublisher {

    void subscribe(CricketSubscriber subscriber);
    void unsubscribe(CricketSubscriber subscriber);
    void notifyAll(int goals1, int goals2, float duration);
    int getGoals1();
    int getGoals2();
    float getDuration();

}
