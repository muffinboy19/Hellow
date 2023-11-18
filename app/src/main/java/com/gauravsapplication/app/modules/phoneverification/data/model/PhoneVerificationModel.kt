package com.gauravsapplication.app.modules.phoneverification.`data`.model

import com.gauravsapplication.app.R
import com.gauravsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PhoneVerificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPhoneVerificat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_phone_verificat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAtextmessage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_text_message)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDidntgetthe: String? = MyApp.getInstance().resources.getString(R.string.msg_didn_t_get_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResend: String? = MyApp.getInstance().resources.getString(R.string.lbl_resend)

)
