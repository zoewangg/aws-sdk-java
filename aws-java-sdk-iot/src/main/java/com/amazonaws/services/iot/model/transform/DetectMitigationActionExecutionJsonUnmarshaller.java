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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DetectMitigationActionExecution JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectMitigationActionExecutionJsonUnmarshaller implements Unmarshaller<DetectMitigationActionExecution, JsonUnmarshallerContext> {

    public DetectMitigationActionExecution unmarshall(JsonUnmarshallerContext context) throws Exception {
        DetectMitigationActionExecution detectMitigationActionExecution = new DetectMitigationActionExecution();

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
                if (context.testExpression("taskId", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionExecution.setTaskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("violationId", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionExecution.setViolationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionName", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionExecution.setActionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("thingName", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionExecution.setThingName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executionStartDate", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionExecution.setExecutionStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("executionEndDate", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionExecution.setExecutionEndDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionExecution.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorCode", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionExecution.setErrorCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionExecution.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return detectMitigationActionExecution;
    }

    private static DetectMitigationActionExecutionJsonUnmarshaller instance;

    public static DetectMitigationActionExecutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DetectMitigationActionExecutionJsonUnmarshaller();
        return instance;
    }
}
