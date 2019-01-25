package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticsCounter {
    Statistics statistics;

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;

    private int avgPostsPerUser;
    private int avgCommentsPerUser;
    private int avgCommentsPerPost;

    public StatisticsCounter(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistic(Statistics statistics){
        this.numberOfUsers = statistics.userNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();

        if(numberOfUsers !=0 && numberOfComments != 0 ){
        this.avgCommentsPerUser = numberOfComments / numberOfUsers;
        }
        else {
            this.avgCommentsPerUser = 0;
        }
        if(numberOfPosts != 0 && numberOfUsers !=0) {
            this.avgPostsPerUser = numberOfPosts / numberOfUsers;
        }
        else {
            this.avgPostsPerUser = 0;
        }
        if(numberOfComments !=0 && numberOfPosts !=0) {
            this.avgCommentsPerPost = numberOfComments / numberOfPosts;
        }
        else{
            this.avgCommentsPerPost = 0;
        }


    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public int getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public int getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public String showStatistics() {
        return  "Statistics :\n"+
                "{ numberOfUsers= " + numberOfUsers +
                ", numberOfPosts= " + numberOfPosts +
                ", numberOfComments= " + numberOfComments +
                ", avgPostsPerUser= " + avgPostsPerUser +
                ", avgCommentsPerUser =" + avgCommentsPerUser +
                ", avgCommentsPerPost =" + avgCommentsPerPost +
                "}";
    }
}
