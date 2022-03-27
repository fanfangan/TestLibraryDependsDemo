package com.example.toastlibrary

import android.content.Context
import android.widget.Toast

object ToastUtils {
    fun showToast(ctx:Context,str:String){
        Toast.makeText(ctx,str,Toast.LENGTH_LONG).show()
    }
}
