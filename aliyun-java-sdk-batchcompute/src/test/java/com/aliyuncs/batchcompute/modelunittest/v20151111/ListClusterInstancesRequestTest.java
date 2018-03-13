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

package com.aliyuncs.batchcompute.modelunittest.v20151111;


import com.aliyuncs.batchcompute.model.v20151111.ListClusterInstancesRequest;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by guangchun.luo on 15/5/6.
 */
public class ListClusterInstancesRequestTest extends TestCase {

    @Test
    public void testConstructor() {

        ListClusterInstancesRequest req = new ListClusterInstancesRequest();
        req.setMarker("vvos");
        req.setMaxItemCount(60);
        req.setClusterId("cluster1");
        req.setGroupName("group1");


        assertEquals(req.getGroupName(), "group1");
        assertEquals(req.getClusterId(), "cluster1");
        assertEquals(req.getMarker(), "vvos");
        assertEquals(req.getMaxItemCount(), 60);
    }
}
