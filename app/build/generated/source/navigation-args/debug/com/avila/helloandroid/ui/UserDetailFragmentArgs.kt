package com.avila.helloandroid.ui

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class UserDetailFragmentArgs(
  public val userId: Int,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("userId", this.userId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("userId", this.userId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): UserDetailFragmentArgs {
      bundle.setClassLoader(UserDetailFragmentArgs::class.java.classLoader)
      val __userId : Int
      if (bundle.containsKey("userId")) {
        __userId = bundle.getInt("userId")
      } else {
        throw IllegalArgumentException("Required argument \"userId\" is missing and does not have an android:defaultValue")
      }
      return UserDetailFragmentArgs(__userId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): UserDetailFragmentArgs {
      val __userId : Int?
      if (savedStateHandle.contains("userId")) {
        __userId = savedStateHandle["userId"]
        if (__userId == null) {
          throw IllegalArgumentException("Argument \"userId\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"userId\" is missing and does not have an android:defaultValue")
      }
      return UserDetailFragmentArgs(__userId)
    }
  }
}
