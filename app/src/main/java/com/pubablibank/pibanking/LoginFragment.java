package com.pubablibank.pibanking;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.JsonElement;
import com.pubablibank.pibanking.databinding.FragmentLoginBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @author Hasan Masum
 * @since  v1.0
 */
public class LoginFragment extends Fragment {

    public static final String TAG = "D:LoginFragment";

    private FragmentLoginBinding mVB;
    private MainActivity hostActivity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hostActivity = (MainActivity) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        mVB = FragmentLoginBinding.inflate(inflater, container, false);
        return mVB.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mVB.loginBtn.setOnClickListener(v -> {
            Log.d(TAG, "onViewCreated: logging in...");
            login();
            test();
        });
    }

    private void login(){

    }

    private void test(){
        // call api
        Log.d(TAG,"calling todo");
        Call<JsonElement> call =  hostActivity.api.getProduct(1);

        call.enqueue(new Callback<JsonElement>() {
            @Override
            public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {
                Log.d(TAG,"response: "+response.body());
            }

            @Override
            public void onFailure(Call<JsonElement> call, Throwable t) {
                Log.d(TAG,"error: "+t.getMessage());
            }
        });
    }
}