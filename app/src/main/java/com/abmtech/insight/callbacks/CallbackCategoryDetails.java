package com.abmtech.insight.callbacks;

import com.abmtech.insight.models.Category;
import com.abmtech.insight.models.Post;

import java.util.ArrayList;
import java.util.List;

public class CallbackCategoryDetails {

    public String status = "";
    public int count = -1;
    public int count_total = -1;
    public int pages = -1;
    public Category category = null;
    public List<Post> posts = new ArrayList<>();

}
