package com.aryan.joblisting;

import java.util.List;

public interface SearchRepo {
    List<Post> findByText(String text);

}
