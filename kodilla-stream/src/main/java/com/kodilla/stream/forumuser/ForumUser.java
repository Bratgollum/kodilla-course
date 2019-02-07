package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    final private int idUser;
    final private String nameUser;
    final private char gender;
    final private LocalDate userBirthDate;
    final private int numberOfPosts;

    public ForumUser(final int idUser, final String nameUser, final char gender,
                     final int userYear, final int userMonth,
                     final int userDay, final int numberOfPosts) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.gender = gender;
        this.userBirthDate = LocalDate.of(userYear,userMonth,userDay);
        this.numberOfPosts = numberOfPosts;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", nameUser='" + nameUser + '\'' +
                ", gender=" + gender +
                ", userBirthDate=" + userBirthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
