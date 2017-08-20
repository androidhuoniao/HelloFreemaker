package com.grass

import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import com.grass.studyfreemaker.TAG_REQUEST
import com.grass.studyfreemaker.data.RequestInfo
import com.grass.studyfreemaker.homeFeed
import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import freemarker.template.Configuration
import java.io.File
import java.io.OutputStreamWriter

/**
 * Created by grass on 2017/8/19.
 */

fun main(args: Array<String>) {
    generateCode()

}

fun generateCode() {

    val fmConfig = Configuration(Configuration.VERSION_2_3_26)
    fmConfig.defaultEncoding = "UTF-8"
    fmConfig.setDirectoryForTemplateLoading(File("/Users/grass/Documents/"))

    val requestFtlPath = "request.ftl"
    var requestTemplate = fmConfig.getTemplate(requestFtlPath)

    var root = getRequestInfo() as RequestInfo
    println("root: "+root.toString())


    var writer = OutputStreamWriter(System.out)

    requestTemplate.process(root, writer)

}


fun getRequestInfo():RequestInfo? {
    val parser: Parser = Parser()
    val jsonSb = StringBuilder(homeFeed)
    val ijson: JsonObject = parser.parse(jsonSb) as JsonObject
    if (ijson.containsKey(TAG_REQUEST)) {
        val requestJson = ijson.get(TAG_REQUEST) as JsonObject
        println("----\n"+requestJson.toJsonString())
        val moshi = Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build();

        val requestInfo = moshi.adapter(RequestInfo::class.java)
                .fromJson(requestJson.toJsonString())
        return requestInfo;
    }
    return null;

}
