package dk.mustache.corelib.utils

import android.os.Build
import android.util.Log
import android.view.View
import android.view.WindowInsets

fun getVisibleKeyboardHeight(view: View): Int { //todo name specific view
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        val imeInsets = view.rootWindowInsets.getInsets(WindowInsets.Type.ime())
        return imeInsets.bottom
    }
    Log.e("KeyboardUtil", "getVisibleKeyboardHeight not supported on current Android version")
    return 0
}

fun isKeyboardVisible(view: View): Boolean { //todo name specific view
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        val imeInsets = view.rootWindowInsets.getInsets(WindowInsets.Type.ime())
        return imeInsets.bottom > 0
    }
    Log.e("KeyboardUtil", "isKeyboardVisible not supported on current Android version")
    return false
}

fun hideKeyboard(view: View) {
    view.windowInsetsController?.hide(WindowInsets.Type.ime())
}

fun showKeyboard(view: View) {
    view.windowInsetsController?.show(WindowInsets.Type.ime())
}

