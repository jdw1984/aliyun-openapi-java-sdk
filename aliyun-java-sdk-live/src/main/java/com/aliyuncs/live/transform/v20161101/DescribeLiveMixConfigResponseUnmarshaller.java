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
package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveMixConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveMixConfigResponse.MixConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveMixConfigResponseUnmarshaller {

	public static DescribeLiveMixConfigResponse unmarshall(DescribeLiveMixConfigResponse describeLiveMixConfigResponse, UnmarshallerContext context) {
		
		describeLiveMixConfigResponse.setRequestId(context.stringValue("DescribeLiveMixConfigResponse.RequestId"));

		List<MixConfig> mixConfigList = new ArrayList<MixConfig>();
		for (int i = 0; i < context.lengthValue("DescribeLiveMixConfigResponse.MixConfigList.Length"); i++) {
			MixConfig mixConfig = new MixConfig();
			mixConfig.setDomainName(context.stringValue("DescribeLiveMixConfigResponse.MixConfigList["+ i +"].DomainName"));
			mixConfig.setAppName(context.stringValue("DescribeLiveMixConfigResponse.MixConfigList["+ i +"].AppName"));
			mixConfig.setTemplate(context.stringValue("DescribeLiveMixConfigResponse.MixConfigList["+ i +"].Template"));

			mixConfigList.add(mixConfig);
		}
		describeLiveMixConfigResponse.setMixConfigList(mixConfigList);
	 
	 	return describeLiveMixConfigResponse;
	}
}