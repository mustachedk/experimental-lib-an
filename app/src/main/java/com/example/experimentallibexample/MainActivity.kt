package com.example.experimentallibexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.experimentallib.utils.getVisibleKeyboardHeight
import com.example.experimentallib.utils.hideKeyboard
import com.example.experimentallib.utils.isKeyboardVisible
import com.example.experimentallib.utils.showKeyboard
import com.example.experimentallibexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.del = this
    }

    fun buttonOneMethod(view : View) {
        Log.d("TEST", "getVisibleKeyboardHeight: " + getVisibleKeyboardHeight(view))
    }

    fun buttonTwoMethod(view : View) {
        Log.d("TEST", "isKeyboardVisible: " + isKeyboardVisible(view))
    }

    fun buttonThreeMethod(view : View) {
        Log.d("TEST", "show/hide keyboard: ")
        if (isKeyboardVisible(view)) {
            hideKeyboard(view)
        } else {
            showKeyboard(view)
        }
    }
}