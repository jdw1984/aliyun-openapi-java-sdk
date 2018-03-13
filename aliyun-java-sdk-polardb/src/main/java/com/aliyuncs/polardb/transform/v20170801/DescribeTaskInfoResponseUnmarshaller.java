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
package com.aliyuncs.polardb.transform.v20170801;

import com.aliyuncs.polardb.model.v20170801.DescribeTaskInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTaskInfoResponseUnmarshaller {

	public static DescribeTaskInfoResponse unmarshall(DescribeTaskInfoResponse describeTaskInfoResponse, UnmarshallerContext context) {
		
		describeTaskInfoResponse.setRequestId(context.stringValue("DescribeTaskInfoResponse.RequestId"));
		describeTaskInfoResponse.setTaskId(context.stringValue("DescribeTaskInfoResponse.TaskId"));
		describeTaskInfoResponse.setBeginTime(context.stringValue("DescribeTaskInfoResponse.BeginTime"));
		describeTaskInfoResponse.setFinishTime(context.stringValue("DescribeTaskInfoResponse.FinishTime"));
		describeTaskInfoResponse.setExpectedFinishTime(context.stringValue("DescribeTaskInfoResponse.ExpectedFinishTime"));
		describeTaskInfoResponse.setTaskAction(context.stringValue("DescribeTaskInfoResponse.TaskAction"));
		describeTaskInfoResponse.setProgress(context.integerValue("DescribeTaskInfoResponse.Progress"));
		describeTaskInfoResponse.setDBName(context.stringValue("DescribeTaskInfoResponse.DBName"));
		describeTaskInfoResponse.setProgressInfo(context.stringValue("DescribeTaskInfoResponse.ProgressInfo"));
	 
	 	return describeTaskInfoResponse;
	}
}