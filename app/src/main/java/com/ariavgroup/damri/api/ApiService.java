package com.ariavgroup.damri.api;

import com.ariavgroup.damri.model.Root;

import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiService {
    @Headers("Authorization:eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6InRlc3QiLCJ0aW1lc3RhbXAiOjE1OTU0OTEzNDN9.kvtvrCZiFU726T26GacGf33xlppdnjnhyurwiOv8QlU")
    @POST("getOrigin")
    Call<Root> getData();

}
