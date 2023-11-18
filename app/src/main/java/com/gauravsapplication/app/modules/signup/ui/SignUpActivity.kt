package com.gauravsapplication.app.modules.signup.ui

import androidx.activity.viewModels
import com.gauravsapplication.app.R
import com.gauravsapplication.app.appcomponents.base.BaseActivity
import com.gauravsapplication.app.databinding.ActivitySignUpBinding
import com.gauravsapplication.app.modules.signup.`data`.viewmodel.SignUpVM
import kotlin.String
import kotlin.Unit

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_ACTIVITY"

  }
}
