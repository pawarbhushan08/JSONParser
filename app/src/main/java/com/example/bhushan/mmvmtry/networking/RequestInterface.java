package com.example.bhushan.mmvmtry.networking;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Bhushan on 6/15/2017.
 */

public interface RequestInterface {
    String url = "bins/10pvr7";

    @GET(url)
    Call<JSONResponse> getJSON();
}
