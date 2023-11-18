package com.gauravsapplication.app.modules.signuploginmodule.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gauravsapplication.app.modules.signuploginmodule.`data`.model.SignupLoginModuleModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import org.json.JSONObject
import org.koin.core.KoinComponent

class SignupLoginModuleVM : ViewModel(), KoinComponent {
  val signupLoginModuleModel: MutableLiveData<SignupLoginModuleModel> =
      MutableLiveData(SignupLoginModuleModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount

  var facebookAuthResponse: JSONObject = JSONObject()
}
