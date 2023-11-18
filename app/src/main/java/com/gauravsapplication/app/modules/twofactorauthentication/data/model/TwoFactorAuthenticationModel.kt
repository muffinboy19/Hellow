package com.gauravsapplication.app.modules.twofactorauthentication.`data`.model

import com.gauravsapplication.app.R
import com.gauravsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TwoFactorAuthenticationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOTPVerificatio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_otp_verificatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOTPIsSendto: String? = MyApp.getInstance().resources.getString(R.string.msg_otp_is_send_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_didn_t_recieved)

)
