/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeviceSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceSummaryJsonUnmarshaller implements Unmarshaller<DeviceSummary, JsonUnmarshallerContext> {

    public DeviceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeviceSummary deviceSummary = new DeviceSummary();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DeviceName", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setDeviceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceArn", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setDeviceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceFleetName", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setDeviceFleetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IotThingName", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setIotThingName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistrationTime", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setRegistrationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LatestHeartbeat", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setLatestHeartbeat(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Models", targetDepth)) {
                    context.nextToken();
                    deviceSummary.setModels(new ListUnmarshaller<EdgeModelSummary>(EdgeModelSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return deviceSummary;
    }

    private static DeviceSummaryJsonUnmarshaller instance;

    public static DeviceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeviceSummaryJsonUnmarshaller();
        return instance;
    }
}
