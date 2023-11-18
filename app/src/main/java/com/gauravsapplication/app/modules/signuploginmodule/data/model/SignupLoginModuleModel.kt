package com.gauravsapplication.app.modules.signuploginmodule.`data`.model

import com.gauravsapplication.app.R
import com.gauravsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignupLoginModuleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelM: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelSOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrcontinuewit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_continue_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithGo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithFa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_fa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithLi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_li)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10198Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10198OneValue: String? = null
)
