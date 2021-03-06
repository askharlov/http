package ua.com.samples.ash.http;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by aGerasimov on 03.11.2017.
 */

public interface GithubApiInterface{
    @GET("/users/{username}")
    Call<GithubUser> getUser(@Path("username") String username);
    @GET("/users/{username}")
    Call<ResponseBody> getUserAsString(@Path("username") String username);
}
