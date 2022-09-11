package com.pedrohlimadev.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.pedrohlimadev.entities.Comment;
import com.pedrohlimadev.entities.Post;

public class Program {
    static LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
    static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:s");

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow thats awsome!");
        Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
        "Im going to visit this wonderful country!", 12);
        post1.addComment(c1);
        post1.addComment(c2);



        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with you");
        Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys",
        "See you tomorrow", 5);
        post2.addComment(c3);
        post2.addComment(c4);



        System.out.println(post1);
        System.out.println("--------------------------------");
        System.out.println(post2);





    }
}
