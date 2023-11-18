package com.gauravsapplication.app.modules.passwordencryption.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gauravsapplication.app.modules.passwordencryption.`data`.model.PasswordEncryptionModel
import org.koin.core.KoinComponent

class PasswordEncryptionVM : ViewModel(), KoinComponent {
  val passwordEncryptionModel: MutableLiveData<PasswordEncryptionModel> =
      MutableLiveData(PasswordEncryptionModel())

  var navArguments: Bundle? = null
}
