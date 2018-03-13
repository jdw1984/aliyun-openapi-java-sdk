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
package com.aliyuncs.itaas.model.v20170505;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateEnterpriseConfigRequest extends RpcAcsRequest<UpdateEnterpriseConfigResponse> {
	
	public UpdateEnterpriseConfigRequest() {
		super("ITaaS", "2017-05-05", "UpdateEnterpriseConfig");
	}

	private String sysfrom;

	private String operator;

	private String clientappid;

	private String configKey;

	private String configValue;

	private String memo;

	public String getSysfrom() {
		return this.sysfrom;
	}

	public void setSysfrom(String sysfrom) {
		this.sysfrom = sysfrom;
		putQueryParameter("Sysfrom", sysfrom);
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		putQueryParameter("Operator", operator);
	}

	public String getClientappid() {
		return this.clientappid;
	}

	public void setClientappid(String clientappid) {
		this.clientappid = clientappid;
		putQueryParameter("Clientappid", clientappid);
	}

	public String getConfigKey() {
		return this.configKey;
	}

	public void setConfigKey(String configKey) {
		this.configKey = configKey;
		putQueryParameter("ConfigKey", configKey);
	}

	public String getConfigValue() {
		return this.configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
		putQueryParameter("ConfigValue", configValue);
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
		putQueryParameter("Memo", memo);
	}

	@Override
	public Class<UpdateEnterpriseConfigResponse> getResponseClass() {
		return UpdateEnterpriseConfigResponse.class;
	}

}
