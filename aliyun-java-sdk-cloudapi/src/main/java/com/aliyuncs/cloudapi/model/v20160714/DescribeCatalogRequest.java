/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeCatalogRequest extends RpcAcsRequest<DescribeCatalogResponse> {
	
	public DescribeCatalogRequest() {
		super("CloudAPI", "2016-07-14", "DescribeCatalog", "apigateway");
	}



	private String catalogId;



	public String getCatalogId() {

		return this.catalogId;

	}



	public void setCatalogId(String catalogId) {

		this.catalogId = catalogId;

		putQueryParameter("CatalogId", catalogId);

	}

	@Override
	public Class<DescribeCatalogResponse> getResponseClass() {
		return DescribeCatalogResponse.class;
	}

}
