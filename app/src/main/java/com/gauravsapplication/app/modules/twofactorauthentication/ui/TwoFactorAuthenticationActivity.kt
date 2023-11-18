package com.gauravsapplication.app.modules.twofactorauthentication.ui

import androidx.activity.viewModels
import com.gauravsapplication.app.R
import com.gauravsapplication.app.appcomponents.base.BaseActivity
import com.gauravsapplication.app.databinding.ActivityTwoFactorAuthenticationBinding
import com.gauravsapplication.app.modules.twofactorauthentication.`data`.viewmodel.TwoFactorAuthenticationVM
import kotlin.String
import kotlin.Unit

class TwoFactorAuthenticationActivity :
    BaseActivity<ActivityTwoFactorAuthenticationBinding>(R.layout.activity_two_factor_authentication)
    {
  private val viewModel: TwoFactorAuthenticationVM by viewModels<TwoFactorAuthenticationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.twoFactorAuthenticationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TWO_FACTOR_AUTHENTICATION_ACTIVITY"

  }
}
