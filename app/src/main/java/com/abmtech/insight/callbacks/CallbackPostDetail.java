package com.abmtech.insight.callbacks;

import com.abmtech.insight.models.Images;
import com.abmtech.insight.models.Post;

import java.util.ArrayList;
import java.util.List;

public class CallbackPostDetail {

    public String status = "";
    public Post post = null;
    public List<Images> images = new ArrayList<>();
    public List<Post> related = new ArrayList<>();

}
