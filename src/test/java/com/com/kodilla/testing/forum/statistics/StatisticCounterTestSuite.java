package com.com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCounter;
import org.junit.*;

import java.util.ArrayList;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticCounterTestSuite<i> {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("That's the begining of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished ");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test #" + testCounter + " finished \n");
    }

    @Test
    public void testCalculateAdvStatisticNr1() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            listNames.add("name");
        }
        when(statisticsMock.userNames()).thenReturn(listNames);
        when(statisticsMock.commentsCount()).thenReturn(700);
        when(statisticsMock.postsCount()).thenReturn(1000);

        int avaPostPerUser = statisticsMock.postsCount() / statisticsMock.userNames().size();
        int avgCommentsPerUser = statisticsMock.commentsCount() / statisticsMock.userNames().size();
        int avgCommentsPerPost = statisticsMock.commentsCount() / statisticsMock.postsCount();

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistic(statisticsMock);

        //Then

        //Testing exoected numbers  of Comments , Post , User
        System.out.println("Case :"+testCounter+
                "\nNUMBER OF USERS - "+listNames.size() +"\nNUMBER OF COMMENTS - "+statisticsMock.commentsCount()+
                "\nNUMBER OF POSTS - "+statisticsMock.postsCount());
        Assert.assertEquals(700, statisticsCounter.getNumberOfComments());
        Assert.assertEquals(1000, statisticsCounter.getNumberOfPosts());
        Assert.assertEquals(100, statisticsCounter.getNumberOfUsers());
        //Testing avarage statistic :
        //Post per User
        //Comments per User
        //Comments per Post
        System.out.println("AVARAGE POST PER USER - " + avaPostPerUser + "\nAVARAGE COMMENTS PER USER - " + avgCommentsPerUser +
                "\nAVARAGE COMMENTS PER POST - " + avgCommentsPerPost);
        Assert.assertEquals(avaPostPerUser, statisticsCounter.getAvgPostsPerUser());
        Assert.assertEquals(avgCommentsPerUser, statisticsCounter.getAvgCommentsPerUser());
        Assert.assertEquals(avgCommentsPerPost, statisticsCounter.getAvgCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticNr2() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listNames = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            listNames.add("name");
        }
        when(statisticsMock.userNames()).thenReturn(listNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);

        int avaPostPerUser = statisticsMock.postsCount() / statisticsMock.userNames().size();
        int avgCommentsPerUser = statisticsMock.commentsCount() / statisticsMock.userNames().size();
        int avgCommentsPerPost = statisticsMock.commentsCount() / statisticsMock.postsCount();

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistic(statisticsMock);

        //Then

        //Testing exoected numbers  of Comments , Post , User
        System.out.println("Case :"+testCounter+
                   "\nNUMBER OF USERS - "+listNames.size() +"\nNUMBER OF COMMENTS - "+statisticsMock.commentsCount()+
                   "\nNUMBER OF POSTS - "+statisticsMock.postsCount());
        Assert.assertEquals(0, statisticsCounter.getNumberOfComments());
        Assert.assertEquals(1000, statisticsCounter.getNumberOfPosts());
        Assert.assertEquals(10, statisticsCounter.getNumberOfUsers());

        //Testing avarage statistic :
        //Post per User
        //Comments per User
        //Comments per Post
        System.out.println("AVARAGE POST PER USER - " + avaPostPerUser + "\nAVARAGE COMMENTS PER USER - " + avgCommentsPerUser +
                "\nAVARAGE COMMENTS PER POST - " + avgCommentsPerPost);
        Assert.assertEquals(avaPostPerUser, statisticsCounter.getAvgPostsPerUser());
        Assert.assertEquals(avgCommentsPerUser, statisticsCounter.getAvgCommentsPerUser());
        Assert.assertEquals(avgCommentsPerPost, statisticsCounter.getAvgCommentsPerPost());
    }
}
