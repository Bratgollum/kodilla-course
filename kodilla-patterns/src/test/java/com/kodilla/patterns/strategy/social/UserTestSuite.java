package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTestSuite {
    private static int counter = 0;
    @Before
    public void beforeEachTest(){
        counter++;
        System.out.println("Test nr. "+counter+" begin");
    }



    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User userFacebook = new Millenials("John Rambo");
        User userTwitter = new YGeneration("Christina Sells");
        User userSnapChat = new ZGeneration("Rychu Debinski");
        //When
        String john =  userFacebook.sharePost();
        System.out.println("John uses : " +  john);
        String christina = userTwitter.sharePost();
        System.out.println("Christina uses : " + christina);
        String rychu = userSnapChat.sharePost();
        System.out.println("Rychu uses: "+ rychu);
        //Then
        Assert.assertEquals("Facebook website",john);
        Assert.assertEquals("Twitter website",christina);
        Assert.assertEquals("Snapchat website",rychu);
        System.out.println();
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User userFacebook = new Millenials("John Rambo");
        //When
        String john = userFacebook.sharePost();
        System.out.println("John uses: " + john);
        userFacebook.setShareMediaPost(new SnapchatPublisher());
        john = userFacebook.sharePost();
        System.out.println("John now uses: "+ john);
        //Then
        Assert.assertEquals("Snapchat website",john);

    }

}
