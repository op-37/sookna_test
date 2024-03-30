package com.sookna.ma;




import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



import android.os.*;

import android.view.View;
import android.widget.*;

import android.util.*;


import android.widget.ImageView;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;


import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

import com.google.android.gms.common.api.ApiException;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;

import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

import android.content.Intent;


import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.sookna.ma.databinding.ActivityMainBinding;


public class MainActivity extends  AppCompatActivity  {


    private final ObjectAnimator ob = new ObjectAnimator();
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OTPActivity.class);
                finish();
            }
        });



    }













}
