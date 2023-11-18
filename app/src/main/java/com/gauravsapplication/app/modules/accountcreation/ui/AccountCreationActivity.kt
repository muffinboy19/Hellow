package com.gauravsapplication.app.modules.accountcreation.ui

import androidx.activity.viewModels
import com.gauravsapplication.app.R
import com.gauravsapplication.app.appcomponents.base.BaseActivity
import com.gauravsapplication.app.databinding.ActivityAccountCreationBinding
import com.gauravsapplication.app.modules.accountcreation.`data`.viewmodel.AccountCreationVM
import kotlin.String
import kotlin.Unit

class AccountCreationActivity :
    BaseActivity<ActivityAccountCreationBinding>(R.layout.activity_account_creation) {
  private val viewModel: AccountCreationVM by viewModels<AccountCreationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountCreationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ACCOUNT_CREATION_ACTIVITY"

  }
}
