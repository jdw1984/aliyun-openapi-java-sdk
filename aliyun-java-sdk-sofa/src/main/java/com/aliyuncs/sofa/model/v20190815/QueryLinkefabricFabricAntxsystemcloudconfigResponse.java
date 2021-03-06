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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryLinkefabricFabricAntxsystemcloudconfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkefabricFabricAntxsystemcloudconfigResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String commonConfig;

		private String devStage;

		private String env;

		private String envDisplayName;

		private Long envId;

		private Long orders;

		private String sysConfigType;

		private Long tenangId;

		private String uniqueConfig;

		public String getCommonConfig() {
			return this.commonConfig;
		}

		public void setCommonConfig(String commonConfig) {
			this.commonConfig = commonConfig;
		}

		public String getDevStage() {
			return this.devStage;
		}

		public void setDevStage(String devStage) {
			this.devStage = devStage;
		}

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
		}

		public String getEnvDisplayName() {
			return this.envDisplayName;
		}

		public void setEnvDisplayName(String envDisplayName) {
			this.envDisplayName = envDisplayName;
		}

		public Long getEnvId() {
			return this.envId;
		}

		public void setEnvId(Long envId) {
			this.envId = envId;
		}

		public Long getOrders() {
			return this.orders;
		}

		public void setOrders(Long orders) {
			this.orders = orders;
		}

		public String getSysConfigType() {
			return this.sysConfigType;
		}

		public void setSysConfigType(String sysConfigType) {
			this.sysConfigType = sysConfigType;
		}

		public Long getTenangId() {
			return this.tenangId;
		}

		public void setTenangId(Long tenangId) {
			this.tenangId = tenangId;
		}

		public String getUniqueConfig() {
			return this.uniqueConfig;
		}

		public void setUniqueConfig(String uniqueConfig) {
			this.uniqueConfig = uniqueConfig;
		}
	}

	@Override
	public QueryLinkefabricFabricAntxsystemcloudconfigResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkefabricFabricAntxsystemcloudconfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
