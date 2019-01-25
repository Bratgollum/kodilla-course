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
    public static void beforeAllTests(){
        System.out.println("That's the begining of tests");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished ");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #"+testCounter);
    }
    @After
    public void afterEveryTest(){
        System.out.println("Test #"+testCounter +" finished ");
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



        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        statisticsCounter.calculateAdvStatistic(statisticsMock);
        //Then
        Assert.assertEquals(700,statisticsCounter.getNumberOfComments());
        Assert.assertEquals(1000,statisticsCounter.getNumberOfPosts());
        Assert.assertEquals(100,statisticsCounter.getNumberOfUsers());
        Assert.assertEquals(statisticsMock.postsCount()/statisticsMock.userNames().size(),statisticsCounter.getAvgPostsPerUser());
        Assert.assertEquals(statisticsMock.commentsCount()/statisticsMock.userNames().size(),statisticsCounter.getAvgCommentsPerUser());
        Assert.assertEquals(statisticsMock.commentsCount()/statisticsMock.postsCount(),statisticsCounter.getAvgCommentsPerPost());
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
        when(statisticsMock.postsCount()).thenReturn(0);



        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        statisticsCounter.calculateAdvStatistic(statisticsMock);
        //Then
        Assert.assertEquals(0,statisticsCounter.getNumberOfComments());
        Assert.assertEquals(0,statisticsCounter.getNumberOfPosts());
        Assert.assertEquals(10,statisticsCounter.getNumberOfUsers());
        Assert.assertEquals(0,statisticsCounter.getAvgPostsPerUser());
        Assert.assertEquals(0,statisticsCounter.getAvgCommentsPerUser());
        Assert.assertEquals(0,statisticsCounter.getAvgCommentsPerPost());
    }
    @Test
    public void testShowStatistic() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            listNames.add("name");
        }
        when(statisticsMock.userNames()).thenReturn(listNames);
        when(statisticsMock.commentsCount()).thenReturn(700);
        when(statisticsMock.postsCount()).thenReturn(1000);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        statisticsCounter.showStatistics();
        //Then
        Assert.assertEquals( "Statistics :\n"+
                "{ numberOfUsers= " + statisticsCounter.getNumberOfUsers()+
                ", numberOfPosts= " + statisticsCounter.getNumberOfPosts() +
                ", numberOfComments= " + statisticsCounter.getNumberOfComments() +
                ", avgPostsPerUser= " + statisticsCounter.getAvgPostsPerUser()+
                ", avgCommentsPerUser =" + statisticsCounter.getAvgCommentsPerUser() +
                ", avgCommentsPerPost =" + statisticsCounter.getAvgCommentsPerPost() +
                "}",statisticsCounter.showStatistics());

    }

}
