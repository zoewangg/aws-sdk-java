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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetSchemaVersionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSchemaVersionResultJsonUnmarshaller implements Unmarshaller<GetSchemaVersionResult, JsonUnmarshallerContext> {

    public GetSchemaVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSchemaVersionResult getSchemaVersionResult = new GetSchemaVersionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getSchemaVersionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("SchemaVersionId", targetDepth)) {
                    context.nextToken();
                    getSchemaVersionResult.setSchemaVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaDefinition", targetDepth)) {
                    context.nextToken();
                    getSchemaVersionResult.setSchemaDefinition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataFormat", targetDepth)) {
                    context.nextToken();
                    getSchemaVersionResult.setDataFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaArn", targetDepth)) {
                    context.nextToken();
                    getSchemaVersionResult.setSchemaArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VersionNumber", targetDepth)) {
                    context.nextToken();
                    getSchemaVersionResult.setVersionNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getSchemaVersionResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    getSchemaVersionResult.setCreatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getSchemaVersionResult;
    }

    private static GetSchemaVersionResultJsonUnmarshaller instance;

    public static GetSchemaVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSchemaVersionResultJsonUnmarshaller();
        return instance;
    }
}
