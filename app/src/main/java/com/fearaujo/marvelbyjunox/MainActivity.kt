package com.fearaujo.marvelbyjunox

import android.os.Bundle
import android.widget.Toast
import com.fearaujo.data.CryptoUtil
import com.fearaujo.data.util.AppKey

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val crypt: CryptoUtil = CryptoUtil()

        Toast.makeText(this, "Hash : ${crypt.MD5_Hash(AppKey.PUBLIC_KEY)}", Toast.LENGTH_LONG).show()
    }

}
