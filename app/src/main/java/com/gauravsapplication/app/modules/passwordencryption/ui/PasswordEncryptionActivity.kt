package com.gauravsapplication.app.modules.passwordencryption.ui

import androidx.activity.viewModels
import com.gauravsapplication.app.R
import com.gauravsapplication.app.appcomponents.base.BaseActivity
import com.gauravsapplication.app.databinding.ActivityPasswordEncryptionBinding
import com.gauravsapplication.app.modules.passwordencryption.`data`.viewmodel.PasswordEncryptionVM
import kotlin.String
import kotlin.Unit

class PasswordEncryptionActivity :
    BaseActivity<ActivityPasswordEncryptionBinding>(R.layout.activity_password_encryption) {
  private val viewModel: PasswordEncryptionVM by viewModels<PasswordEncryptionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.passwordEncryptionVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PASSWORD_ENCRYPTION_ACTIVITY"

  }
}
