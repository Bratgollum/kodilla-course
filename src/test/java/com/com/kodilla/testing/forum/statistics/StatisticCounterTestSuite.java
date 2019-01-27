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
        System.out.println("That's the begining of testing method" +
                            " CalculateAdvStatistic(Statistics statistic)");
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
    public void testAvgCommentsPerUsers() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            listNames.add("name");
        }
        when(statisticsMock.userNames()).thenReturn(listNames);
        when(statisticsMock.commentsCount()).thenReturn(700);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistic(statisticsMock);

        //Then
        Assert.assertEquals(7, statisticsCounter.getAvgCommentsPerUser());
    }
    @Test
    public void testAvgCommentsPerNoExistUsers() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listNames = new ArrayList<String>();
        when(statisticsMock.userNames()).thenReturn(listNames);
        when(statisticsMock.commentsCount()).thenReturn(700);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistic(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCounter.getAvgCommentsPerUser());
    }

    @Test
    public void testAvgPostsPerUsers() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listNames = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            listNames.add("name");
        }
        when(statisticsMock.userNames()).thenReturn(listNames);
        when(statisticsMock.postsCount()).thenReturn(1000);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistic(statisticsMock);

        //Then
        Assert.assertEquals(10, statisticsCounter.getAvgPostsPerUser());
    }
    @Test
    public void testAvgNoExistPostsPerUsers() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listNames = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            listNames.add("name");
        }
        when(statisticsMock.userNames()).thenReturn(listNames);
        when(statisticsMock.postsCount()).thenReturn(0);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistic(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCounter.getAvgPostsPerUser());
    }
    @Test
    public void testAvgMoreCommentsPerLessPosts() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(600);
        when(statisticsMock.postsCount()).thenReturn(300);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistic(statisticsMock);

        //Then
        Assert.assertEquals(2, statisticsCounter.getAvgCommentsPerPost());

    }

    @Test
    public void testAvgLesCommentsPerMorePosts() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.postsCount()).thenReturn(300);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistic(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCounter.getAvgCommentsPerPost());

    }
    @Test
    public void testAvgNoExistCommentsPerPosts() {
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(300);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistic(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCounter.getAvgCommentsPerPost());

    }
}
