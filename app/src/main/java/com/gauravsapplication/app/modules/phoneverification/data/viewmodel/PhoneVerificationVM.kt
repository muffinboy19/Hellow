package com.gauravsapplication.app.modules.phoneverification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gauravsapplication.app.modules.phoneverification.`data`.model.PhoneVerificationModel
import org.koin.core.KoinComponent

class PhoneVerificationVM : ViewModel(), KoinComponent {
  val phoneVerificationModel: MutableLiveData<PhoneVerificationModel> =
      MutableLiveData(PhoneVerificationModel())

  var navArguments: Bundle? = null
}
