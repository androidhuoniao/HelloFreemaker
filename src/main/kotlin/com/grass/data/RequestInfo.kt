package com.grass.studyfreemaker.data

/**
 * Created by grass on 2017/8/19.
 */
data class RequestInfo(
        /**
         * 请求接口描述
         */
        val description: String?,

        /**
         * read接口还是base接口
         */

        val baseUrl: String,
        /**
         * 请求url
         */
        val url: String,

        /**
         * 请求函数
         */
        val method: String,

        /**
         * 请求参数
         */
        val params: MutableMap<String, ParamInfo>?

)