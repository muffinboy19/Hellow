package com.gauravsapplication.app.modules.signuploginmodule.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.gauravsapplication.app.R
import com.gauravsapplication.app.appcomponents.base.BaseActivity
import com.gauravsapplication.app.appcomponents.facebookauth.FacebookHelper
import com.gauravsapplication.app.appcomponents.googleauth.GoogleHelper
import com.gauravsapplication.app.databinding.ActivitySignupLoginModuleBinding
import com.gauravsapplication.app.modules.signuploginmodule.`data`.viewmodel.SignupLoginModuleVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignupLoginModuleActivity :
    BaseActivity<ActivitySignupLoginModuleBinding>(R.layout.activity_signup_login_module) {
  private val viewModel: SignupLoginModuleVM by viewModels<SignupLoginModuleVM>()

  private lateinit var googleLogin: GoogleHelper

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signupLoginModuleVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowgoogleone.setOnClickListener {
        googleLogin.login()
      }
      binding.linearRowvectorOne.setOnClickListener {
        LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
        facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
          override fun onSuccess(result: LoginResult?) {
          }
          override fun onError(error: FacebookException?) {
          }
          override fun onCancel() {
          }
          })
        }
        binding.imageArrowleft.setOnClickListener {
          // TODO please, add your navigation code here
          finish()
        }
      }

      companion object {
        const val TAG: String = "SIGNUP_LOGIN_MODULE_ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, SignupLoginModuleActivity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
