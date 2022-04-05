package com.example.hiltdi

import android.util.Log
import javax.inject.Inject

const val TAG="Hiltandroid"

interface UserRepository{
    fun saveUser(email: String,password: String)
}

class SQLRepository  @Inject constructor(): UserRepository{

    override fun saveUser(email:String, password: String){
         Log.d(TAG, "$email Saved in DB  $password")
        //loggerService.log("$TAG email $email password $password")
    }
}

class FirebaseRepository @Inject constructor() :UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "$email Saved in Firebase  $password")

    }

}