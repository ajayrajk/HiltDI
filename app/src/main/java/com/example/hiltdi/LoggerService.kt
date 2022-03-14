package com.example.hiltdi

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor() {
   fun log(messages:String){
       Log.d(TAG,messages)
   }
}