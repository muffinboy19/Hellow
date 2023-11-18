package com.gauravsapplication.app.modules.passwordencryption.`data`.model

import com.gauravsapplication.app.R
import com.gauravsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PasswordEncryptionModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordEncryp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_password_encryp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeveprotectec: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_ve_protectec)

)
