package cricketscoreboard.subscribers;

import cricketscoreboard.publishers.ESPNCricketScoreBoardPublisher;
import cricketscoreboard.publishers.SonyCricketScoreBoardPublisher;

import java.util.Arrays;

public class PubSubTester {

    public static void main(String[] args) {}}
        /**SonyCricketScoreBoardPublisher cricketScoreBoardPublisher =
                new SonyCricketScoreBoardPublisher();
        ESPNCricketScoreBoardPublisher espnCricketScoreBoardPublisher =
                new ESPNCricketScoreBoardPublisher();
        RunrateSubscriber runrateSubscriber =
                new RunrateSubscriber(cricketScoreBoardPublisher);
        TopDiscussionsSubscriber topDiscussionsSubscriber =
                new TopDiscussionsSubscriber(cricketScoreBoardPublisher);
        PredictedScoreSubscriber predictedScoreSubscriber =
                new PredictedScoreSubscriber(Arrays.asList(cricketScoreBoardPublisher, espnCricketScoreBoardPublisher));
        cricketScoreBoardPublisher.notifyAll(100, 2, 20.1f);
        topDiscussionsSubscriber.getPublisher().unsubscribe(topDiscussionsSubscriber);
        cricketScoreBoardPublisher.notifyAll(104, 2, 20.2f);
        espnCricketScoreBoardPublisher.notifyAll(106, 4, 22.3f);
        espnCricketScoreBoardPublisher.subscribe(runrateSubscriber);**/
      