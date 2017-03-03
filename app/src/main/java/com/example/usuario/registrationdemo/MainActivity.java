package com.example.usuario.registrationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.usuario.registrationdemo.response.LoginResponse;
import com.example.usuario.registrationdemo.rest.Client;
import com.example.usuario.registrationdemo.rest.Service;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEntrar = (Button) findViewById(R.id.btn_entrar);
        btnEntrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_entrar) {

            Log.i(TAG, "entrar");
            Intent intent = new Intent(this, MapActivity.class);
            startActivity(intent);
            //postLogin();
        }
    }

    private void postLogin() {

        Service service = Client.getClubService();
        Call<LoginResponse> call = service.postLogin("lchapa@idteam.pe", "lchapa");
        call.enqueue(new Callback<LoginResponse>() {

            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {

                if(response.isSuccessful()){

                    Log.i(TAG, response.body().toString());
                    //LoginResponse l = stringToArray(response.body().toString());
                    Log.i(TAG, "" + response.body());
                    Log.w("Full json", new Gson().toJson(response));
                    LoginResponse l = response.body();

                    Log.i(TAG, "" + l.getApellido());
                    Log.i(TAG, "error " + l.isError());

                    if(l.isError()){
                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(), "Exito", Toast.LENGTH_SHORT).show();
                    }
                }

                Log.i(TAG, response.raw().toString());
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Log.i(TAG, "on failure");
                Log.i(TAG, call.toString());
            }
        });
    }
}
