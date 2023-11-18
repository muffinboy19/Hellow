package com.gauravsapplication.app.modules.securitypolicy.ui

import androidx.activity.viewModels
import com.gauravsapplication.app.R
import com.gauravsapplication.app.appcomponents.base.BaseActivity
import com.gauravsapplication.app.databinding.ActivitySecurityPolicyBinding
import com.gauravsapplication.app.modules.securitypolicy.`data`.model.SpinnerGroup10198OneModel
import com.gauravsapplication.app.modules.securitypolicy.`data`.viewmodel.SecurityPolicyVM
import kotlin.String
import kotlin.Unit

class SecurityPolicyActivity :
    BaseActivity<ActivitySecurityPolicyBinding>(R.layout.activity_security_policy) {
  private val viewModel: SecurityPolicyVM by viewModels<SecurityPolicyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup10198OneList.value = mutableListOf(
    SpinnerGroup10198OneModel("Item1"),
    SpinnerGroup10198OneModel("Item2"),
    SpinnerGroup10198OneModel("Item3"),
    SpinnerGroup10198OneModel("Item4"),
    SpinnerGroup10198OneModel("Item5")
    )
    val spinnerGroup10198OneAdapter =
    SpinnerGroup10198OneAdapter(this,R.layout.spinner_item,viewModel.spinnerGroup10198OneList.value?:
    mutableListOf())
    binding.spinnerGroup10198One.adapter = spinnerGroup10198OneAdapter
    binding.securityPolicyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "SECURITY_POLICY_ACTIVITY"

  }
}
