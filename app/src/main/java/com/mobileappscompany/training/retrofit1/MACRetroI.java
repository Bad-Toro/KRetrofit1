package com.mobileappscompany.training.retrofit1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ferna on 3/28/2017.
 */

public interface MACRetroI {

    @GET("posts")
    Call<List<Post>> getAllPosts();

    @GET("posts")
    Call<List<Post>> getPostsById(@Query("userId") Integer id);

}
