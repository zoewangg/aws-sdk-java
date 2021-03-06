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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannelBan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeChannelBanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel from which the user is banned.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The ARN of the member being banned.
     * </p>
     */
    private String memberArn;

    /**
     * <p>
     * The ARN of the channel from which the user is banned.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel from which the user is banned.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel from which the user is banned.
     * </p>
     * 
     * @return The ARN of the channel from which the user is banned.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the channel from which the user is banned.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel from which the user is banned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelBanRequest withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the member being banned.
     * </p>
     * 
     * @param memberArn
     *        The ARN of the member being banned.
     */

    public void setMemberArn(String memberArn) {
        this.memberArn = memberArn;
    }

    /**
     * <p>
     * The ARN of the member being banned.
     * </p>
     * 
     * @return The ARN of the member being banned.
     */

    public String getMemberArn() {
        return this.memberArn;
    }

    /**
     * <p>
     * The ARN of the member being banned.
     * </p>
     * 
     * @param memberArn
     *        The ARN of the member being banned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelBanRequest withMemberArn(String memberArn) {
        setMemberArn(memberArn);
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getMemberArn() != null)
            sb.append("MemberArn: ").append(getMemberArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChannelBanRequest == false)
            return false;
        DescribeChannelBanRequest other = (DescribeChannelBanRequest) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getMemberArn() == null ^ this.getMemberArn() == null)
            return false;
        if (other.getMemberArn() != null && other.getMemberArn().equals(this.getMemberArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getMemberArn() == null) ? 0 : getMemberArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeChannelBanRequest clone() {
        return (DescribeChannelBanRequest) super.clone();
    }

}
