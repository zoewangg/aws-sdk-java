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
package com.amazonaws.services.iotwireless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotwireless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdatePartnerAccountResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePartnerAccountResultJsonUnmarshaller implements Unmarshaller<UpdatePartnerAccountResult, JsonUnmarshallerContext> {

    public UpdatePartnerAccountResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdatePartnerAccountResult updatePartnerAccountResult = new UpdatePartnerAccountResult();

        return updatePartnerAccountResult;
    }

    private static UpdatePartnerAccountResultJsonUnmarshaller instance;

    public static UpdatePartnerAccountResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdatePartnerAccountResultJsonUnmarshaller();
        return instance;
    }
}
