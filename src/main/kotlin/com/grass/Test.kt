package com.grass.studyfreemaker

/**
 * Created by grass on 2017/8/19.
 */

val homeFeed: String = """
        {
   "description": "7.2首页 feed 流",
    "request": {
        "description": "7.2首页 feed 流请求",
        "url": "mapi/home/v9/homefeedlist",
        "baseUrl":"read",
        "method": "get",
        "params":{
            "rn": {
            "type": "int32",
            "note": "获取总数"
            },
            "base": {
                "type": "string",
                "note": "feed 流基准"
            }
        }

    },
    "output": {
        "base": {
            "type": "string",
            "note": "基准值，server返回"
        },
        "hasMore": {
            "type": "bool",
            "note": "是否有更多，0没有；1有"
        },
        "ihome_type": {
            "type": "string",
            "note": "feed|card"
        },
        "list": {
            "type": "list",
            "note": "feed-list",
            "subDefine": {
                "type": "dict",
                "note": "问题列表结构体",
                "subDefine": {
                    "type": {
                        "type": "int32",
                        "note": "feed type"
                    },
                    "value": {
                        "type": "string",
                        "note": "json字符串"
                    }
                }
            }
        }
    }
}
        """


val homeFeedNoParam: String = """
        {
   "description": "7.2首页 feed 流",
    "request": {
        "description": "7.2首页 feed 流请求",
        "url": "mapi/home/v9/homefeedlist",
        "baseUrl":"read",
        "method": "get"

    },
    "output": {
        "base": {
            "type": "string",
            "note": "基准值，server返回"
        },
        "hasMore": {
            "type": "bool",
            "note": "是否有更多，0没有；1有"
        },
        "ihome_type": {
            "type": "string",
            "note": "feed|card"
        },
        "list": {
            "type": "list",
            "note": "feed-list",
            "subDefine": {
                "type": "dict",
                "note": "问题列表结构体",
                "subDefine": {
                    "type": {
                        "type": "int32",
                        "note": "feed type"
                    },
                    "value": {
                        "type": "string",
                        "note": "json字符串"
                    }
                }
            }
        }
    }
}
        """
