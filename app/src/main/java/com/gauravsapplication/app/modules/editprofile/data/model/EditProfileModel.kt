package com.gauravsapplication.app.modules.editprofile.`data`.model

import com.gauravsapplication.app.R
import com.gauravsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EditProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEditProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelM: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_id2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_website)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mobile_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10198Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10198OneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etWeburlValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etMobileNoValue: String? = null
)
