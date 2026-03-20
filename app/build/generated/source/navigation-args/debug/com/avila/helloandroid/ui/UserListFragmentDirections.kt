package com.avila.helloandroid.ui

import android.os.Bundle
import androidx.navigation.NavDirections
import com.avila.helloandroid.R
import kotlin.Int

public class UserListFragmentDirections private constructor() {
  private data class ActionListToDetail(
    public val userId: Int,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_list_to_detail

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("userId", this.userId)
        return result
      }
  }

  public companion object {
    public fun actionListToDetail(userId: Int): NavDirections = ActionListToDetail(userId)
  }
}
