package cz.pikadorama.roumingclient

import android.content.Context
import android.widget.Toast

fun <T> Collection<T>.orElse(other: () -> Collection<T>) = if (this.isEmpty()) other() else this
fun Context.toast(messageResId: Int) = Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show()