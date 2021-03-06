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

package com.aliyuncs.drds.model.v20171016;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyFullTableScanRequest extends RpcAcsRequest<ModifyFullTableScanResponse> {
	   

	private String tableNames;

	private String drdsInstanceId;

	private String dbName;

	private Boolean fullTableScan;
	public ModifyFullTableScanRequest() {
		super("Drds", "2017-10-16", "ModifyFullTableScan", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTableNames() {
		return this.tableNames;
	}

	public void setTableNames(String tableNames) {
		this.tableNames = tableNames;
		if(tableNames != null){
			putQueryParameter("TableNames", tableNames);
		}
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public Boolean getFullTableScan() {
		return this.fullTableScan;
	}

	public void setFullTableScan(Boolean fullTableScan) {
		this.fullTableScan = fullTableScan;
		if(fullTableScan != null){
			putQueryParameter("FullTableScan", fullTableScan.toString());
		}
	}

	@Override
	public Class<ModifyFullTableScanResponse> getResponseClass() {
		return ModifyFullTableScanResponse.class;
	}

}
