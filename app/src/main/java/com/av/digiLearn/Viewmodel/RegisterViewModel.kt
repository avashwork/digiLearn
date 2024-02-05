package com.av.digiLearn.Viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class RegisterViewModel: ViewModel() {

    private val TAG ="REGISTER_TAG";
    var auth = Firebase.auth;


    fun createUserWithEmailAndPassword(email: String, password: String)
    {
        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener { task ->
            if (task.isSuccessful)
            {
                Log.d(TAG,"create user with email: success")
            }
                else
            {
                Log.d(TAG,"createuserWithEmail: failure", task.exception);
            }

            }
    }
}