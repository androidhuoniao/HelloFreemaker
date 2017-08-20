package com.baidu.iknow.model.v9.request;

import com.baidu.common.volley.Request;
import com.baidu.iknow.core.util.KsConfig;
import com.baidu.iknow.model.v9.HomefeedListV9;
import com.baidu.net.GsonRequest;
import com.baidu.net.RequestParams;

public class HomefeedListV9Request extends GsonRequest<HomefeedListV9> {

		    
	<#list params?keys as key>

	// ${params["${key}"].note}
	private ${params["${key}"].type}  ${key};

	</#list>


	
	private HomefeedListV9Request(Builder builder){
		<#list params?keys as key>
		this.${key} = builder.${key}
		</#list>
		
	}


	
	@Override
	protected RequestParams params(){
		RequestParams requestParams = new RequestParams();
		requestParams.put("rn", rn);
		requestParams.put("base", base);
		return requestParams;
	}
	

	@Override
	protected String url(){
		<#if baseUrl == "read">
		return "readUrl: " + "${url}";
			
		<#else>
			
			return "writeUrl: " + "${url}";
		</#if>
		
	}
	
	@Override
	protected int method() {
        return "${method}";
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static final class Builder {
        <#list params?keys as key>

		// ${params["${key}"].note}
		private ${params["${key}"].type}  ${key};

		</#list>

        public Builder() {

        }


		<#list params?keys as key>

		public Builder with${key?cap_first}(@NonNull ${params["${key}"].type} ${key}) {
            this.${key} = ${key};
            return this;
        }

		</#list>


        public HomefeedListV9Request build() {
            return new HomefeedListV9Request(this);
        }
    }
		
		
}