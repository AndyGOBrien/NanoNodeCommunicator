package com.llamalabb.nanoshare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.llamalabb.nanonodecommunicator.RpcRequest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rpcRequest = RpcRequest("account_balance")
                .addParam("account", "xrb_asdfasdfasdflkj")
                .addParam("accounts", listOf("asdf","asdfa","asdfa"))
                .create()


        Log.d("test", "test")
    }
}
