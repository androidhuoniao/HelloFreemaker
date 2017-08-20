package com.grass.studyfreemaker.freemaker

import freemarker.template.Configuration

/**
 * Created by grass on 2017/8/19.
 */
class HelloFreemaker {

    fun helloFreeMaker() {
        val fmConfig = Configuration(Configuration.VERSION_2_3_26)
        fmConfig.defaultEncoding = "UTF-8"

        val requestFtlPath = "/sdcard/ftl/request.ftl"
        var requestTemplate = fmConfig.getTemplate(requestFtlPath)




    }
}