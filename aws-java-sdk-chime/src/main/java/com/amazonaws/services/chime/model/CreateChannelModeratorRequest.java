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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateChannelModerator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChannelModeratorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The ARN of the moderator.
     * </p>
     */
    private String channelModeratorArn;

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @return The ARN of the channel.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelModeratorRequest withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the moderator.
     * </p>
     * 
     * @param channelModeratorArn
     *        The ARN of the moderator.
     */

    public void setChannelModeratorArn(String channelModeratorArn) {
        this.channelModeratorArn = channelModeratorArn;
    }

    /**
     * <p>
     * The ARN of the moderator.
     * </p>
     * 
     * @return The ARN of the moderator.
     */

    public String getChannelModeratorArn() {
        return this.channelModeratorArn;
    }

    /**
     * <p>
     * The ARN of the moderator.
     * </p>
     * 
     * @param channelModeratorArn
     *        The ARN of the moderator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelModeratorRequest withChannelModeratorArn(String channelModeratorArn) {
        setChannelModeratorArn(channelModeratorArn);
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
        if (getChannelModeratorArn() != null)
            sb.append("ChannelModeratorArn: ").append(getChannelModeratorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChannelModeratorRequest == false)
            return false;
        CreateChannelModeratorRequest other = (CreateChannelModeratorRequest) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getChannelModeratorArn() == null ^ this.getChannelModeratorArn() == null)
            return false;
        if (other.getChannelModeratorArn() != null && other.getChannelModeratorArn().equals(this.getChannelModeratorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getChannelModeratorArn() == null) ? 0 : getChannelModeratorArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateChannelModeratorRequest clone() {
        return (CreateChannelModeratorRequest) super.clone();
    }

}
