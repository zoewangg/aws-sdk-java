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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DisableRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is used.
     * </p>
     */
    private String eventBusName;

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param name
     *        The name of the rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @return The name of the rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param name
     *        The name of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableRuleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is used.
     * </p>
     * 
     * @param eventBusName
     *        The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is
     *        used.
     */

    public void setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
    }

    /**
     * <p>
     * The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is used.
     * </p>
     * 
     * @return The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is
     *         used.
     */

    public String getEventBusName() {
        return this.eventBusName;
    }

    /**
     * <p>
     * The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is used.
     * </p>
     * 
     * @param eventBusName
     *        The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is
     *        used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableRuleRequest withEventBusName(String eventBusName) {
        setEventBusName(eventBusName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEventBusName() != null)
            sb.append("EventBusName: ").append(getEventBusName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableRuleRequest == false)
            return false;
        DisableRuleRequest other = (DisableRuleRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEventBusName() == null ^ this.getEventBusName() == null)
            return false;
        if (other.getEventBusName() != null && other.getEventBusName().equals(this.getEventBusName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEventBusName() == null) ? 0 : getEventBusName().hashCode());
        return hashCode;
    }

    @Override
    public DisableRuleRequest clone() {
        return (DisableRuleRequest) super.clone();
    }

}
