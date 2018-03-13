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
package com.aliyuncs.batchcompute.model.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchComputeRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetClusterRequest extends BatchComputeRequest<GetClusterResponse> {
	
	public GetClusterRequest() {
		super("BatchCompute", "2015-11-11", "GetCluster");
		setUriPattern("/clusters/[ResourceName]");
		setMethod(MethodType.GET);
	}

	private String resourceName;

	public String getClusterId() {
		return this.resourceName;
	}

	public void setClusterId(String clusterId) {
		this.resourceName = clusterId;
		putPathParameter("ResourceName", resourceName);
	}

	@Override
	public Class<GetClusterResponse> getResponseClass() {
		return GetClusterResponse.class;
	}

}
