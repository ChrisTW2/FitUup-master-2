package com.example.dsuappacademy.fituup;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by echessa on 6/18/15.
 */
public interface SCService {

    @GET("/users/user8581820/favorites?client_id=" + Config.CLIENT_ID)
    public void getRecentTracks(@Query("created_at[from]") String date, Callback<List<Track>> cb);

}
