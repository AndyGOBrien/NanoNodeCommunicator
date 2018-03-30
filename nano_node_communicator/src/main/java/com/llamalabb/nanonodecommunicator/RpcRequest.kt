package com.llamalabb.nanonodecommunicator

import com.google.gson.Gson
import com.google.gson.JsonObject


class RpcRequest(private val action: String) {
    private val params = HashMap<String, Any>()

    fun addParam(param: String, value: String) : RpcRequest {
        params[param] = value
        return this
    }

    fun addParam(param: String, value: List<String>) : RpcRequest{
        params[param] = value
        return this
    }

    fun create() : JsonObject{
        val json = JsonObject()
        json.addProperty("action", action)
        params.forEach {
            json.addProperty(it.key, Gson().toJson(it.value))
        }
        return json
    }
}