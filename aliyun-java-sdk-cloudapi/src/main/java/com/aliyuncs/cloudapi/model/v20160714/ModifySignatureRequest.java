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
public class ModifySignatureRequest extends RpcAcsRequest<ModifySignatureResponse> {
	
	public ModifySignatureRequest() {
		super("CloudAPI", "2016-07-14", "ModifySignature", "apigateway");
	}

	private String signatureId;

	private String signatureName;

	private String signatureKey;

	private String signatureSecret;

	public String getSignatureId() {
		return this.signatureId;
	}

	public void setSignatureId(String signatureId) {
		this.signatureId = signatureId;
		putQueryParameter("SignatureId", signatureId);
	}

	public String getSignatureName() {
		return this.signatureName;
	}

	public void setSignatureName(String signatureName) {
		this.signatureName = signatureName;
		putQueryParameter("SignatureName", signatureName);
	}

	public String getSignatureKey() {
		return this.signatureKey;
	}

	public void setSignatureKey(String signatureKey) {
		this.signatureKey = signatureKey;
		putQueryParameter("SignatureKey", signatureKey);
	}

	public String getSignatureSecret() {
		return this.signatureSecret;
	}

	public void setSignatureSecret(String signatureSecret) {
		this.signatureSecret = signatureSecret;
		putQueryParameter("SignatureSecret", signatureSecret);
	}

	@Override
	public Class<ModifySignatureResponse> getResponseClass() {
		return ModifySignatureResponse.class;
	}

}
