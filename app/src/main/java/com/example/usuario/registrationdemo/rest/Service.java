package com.example.usuario.registrationdemo.rest;

import com.example.usuario.registrationdemo.response.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by USUARIO on 28/02/2017.
 */

public interface Service {

    @FormUrlEncoded
    @POST("login")
    Call<LoginResponse> postLogin(@Field("correo") String email, @Field("contrasena") String password);
}
