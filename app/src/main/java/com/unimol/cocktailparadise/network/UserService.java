package com.unimol.cocktailparadise.network;

import com.unimol.cocktailparadise.models.LoginDTO;
import com.unimol.cocktailparadise.models.RegisterDTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UserService {

    @GET("CocktailParadiseWS/rest/user/login")
    Call<LoginDTO> login(@Query("mail") String mail, @Query("password") String password);

    @POST("CocktailParadiseWS/rest/user/register")
    Call<RegisterDTO> register(@Query("username") String username, @Query("mail") String mail, @Query("password") String password);

}
