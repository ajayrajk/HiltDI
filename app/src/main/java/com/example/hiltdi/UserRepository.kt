package com.example.hiltdi

import android.util.Log
import javax.inject.Inject

const val TAG="Hiltandroid"
class UserRepository  @Inject constructor() {

    fun saveUser(email:String,password: String){
         Log.d(TAG, email+" test  "+ password)
    }
}