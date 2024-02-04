package com.aryan.joblisting;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;
import org.bson.Document;


@Component
public class SearchRepoImplementation implements SearchRepo{



    @Override
    public List<Post> findByText(String text) {
        final List<Post> posts=new ArrayList<>();

        Arrays.asList(new Document("$search",
                new Document("text",
                        new Document("query", "java")
                                .append("path", "techs"))));
        return posts;
    }
}
