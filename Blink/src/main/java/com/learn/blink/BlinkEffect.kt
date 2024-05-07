package com.learn.blink

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.content.Context
import android.graphics.Color
import android.view.View
import android.view.animation.Animation
import android.widget.Toast

/**
created by Rachit on 5/2/2024.
 */
object BlinkEffect {
    fun blink(view: View) {
        // adding the color to be shown
        Toast.makeText(view.context, "Blink", Toast.LENGTH_SHORT).show()
    }
}