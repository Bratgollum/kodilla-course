package com.kodilla.stream.forumuser;



import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum (){
        theForumUserList.add(new ForumUser(40512,"Lolek17",'M',1987,8,
                             26,30 ));
        theForumUserList.add(new ForumUser(55678,"Radek20", 'M',1956,5,
                             22,0 ));
        theForumUserList.add(new ForumUser(32145,"Wiola21", 'F',1990,11,
                             24,5 ));
        theForumUserList.add(new ForumUser(89021,"Mirek87", 'M',1994,12,
                             11,3 ));
        theForumUserList.add(new ForumUser(87654,"Krysia40",'F',2000,3,
                             16,22 ));
        theForumUserList.add(new ForumUser(90345,"Zbychu15",'M',2002,4,
                             17,15 ));
        theForumUserList.add(new ForumUser(12378,"Justyna34",'F',2006,6,
                             29,12 ));

    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(theForumUserList);
    }

    }

