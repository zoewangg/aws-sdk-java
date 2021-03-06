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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListTrackers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrackersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains tracker resources in your AWS account. Details include tracker name, description and timestamps for when
     * the tracker was created and last updated.
     * </p>
     */
    private java.util.List<ListTrackersResponseEntry> entries;
    /**
     * <p>
     * A pagination token indicating there are additional pages available. You can use the token in a following request
     * to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains tracker resources in your AWS account. Details include tracker name, description and timestamps for when
     * the tracker was created and last updated.
     * </p>
     * 
     * @return Contains tracker resources in your AWS account. Details include tracker name, description and timestamps
     *         for when the tracker was created and last updated.
     */

    public java.util.List<ListTrackersResponseEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * Contains tracker resources in your AWS account. Details include tracker name, description and timestamps for when
     * the tracker was created and last updated.
     * </p>
     * 
     * @param entries
     *        Contains tracker resources in your AWS account. Details include tracker name, description and timestamps
     *        for when the tracker was created and last updated.
     */

    public void setEntries(java.util.Collection<ListTrackersResponseEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<ListTrackersResponseEntry>(entries);
    }

    /**
     * <p>
     * Contains tracker resources in your AWS account. Details include tracker name, description and timestamps for when
     * the tracker was created and last updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        Contains tracker resources in your AWS account. Details include tracker name, description and timestamps
     *        for when the tracker was created and last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrackersResult withEntries(ListTrackersResponseEntry... entries) {
        if (this.entries == null) {
            setEntries(new java.util.ArrayList<ListTrackersResponseEntry>(entries.length));
        }
        for (ListTrackersResponseEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains tracker resources in your AWS account. Details include tracker name, description and timestamps for when
     * the tracker was created and last updated.
     * </p>
     * 
     * @param entries
     *        Contains tracker resources in your AWS account. Details include tracker name, description and timestamps
     *        for when the tracker was created and last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrackersResult withEntries(java.util.Collection<ListTrackersResponseEntry> entries) {
        setEntries(entries);
        return this;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You can use the token in a following request
     * to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token indicating there are additional pages available. You can use the token in a following
     *        request to fetch the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You can use the token in a following request
     * to fetch the next set of results.
     * </p>
     * 
     * @return A pagination token indicating there are additional pages available. You can use the token in a following
     *         request to fetch the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You can use the token in a following request
     * to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token indicating there are additional pages available. You can use the token in a following
     *        request to fetch the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrackersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrackersResult == false)
            return false;
        ListTrackersResult other = (ListTrackersResult) obj;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTrackersResult clone() {
        try {
            return (ListTrackersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
