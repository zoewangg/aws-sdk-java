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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateMembersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account whose members you want to disassociate from the
     * administrator account.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * A list of account IDs of the GuardDuty member accounts that you want to disassociate from the administrator
     * account.
     * </p>
     */
    private java.util.List<String> accountIds;

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account whose members you want to disassociate from the
     * administrator account.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the detector of the GuardDuty account whose members you want to disassociate from the
     *        administrator account.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account whose members you want to disassociate from the
     * administrator account.
     * </p>
     * 
     * @return The unique ID of the detector of the GuardDuty account whose members you want to disassociate from the
     *         administrator account.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account whose members you want to disassociate from the
     * administrator account.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the detector of the GuardDuty account whose members you want to disassociate from the
     *        administrator account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateMembersRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * A list of account IDs of the GuardDuty member accounts that you want to disassociate from the administrator
     * account.
     * </p>
     * 
     * @return A list of account IDs of the GuardDuty member accounts that you want to disassociate from the
     *         administrator account.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * A list of account IDs of the GuardDuty member accounts that you want to disassociate from the administrator
     * account.
     * </p>
     * 
     * @param accountIds
     *        A list of account IDs of the GuardDuty member accounts that you want to disassociate from the
     *        administrator account.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * A list of account IDs of the GuardDuty member accounts that you want to disassociate from the administrator
     * account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        A list of account IDs of the GuardDuty member accounts that you want to disassociate from the
     *        administrator account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateMembersRequest withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of account IDs of the GuardDuty member accounts that you want to disassociate from the administrator
     * account.
     * </p>
     * 
     * @param accountIds
     *        A list of account IDs of the GuardDuty member accounts that you want to disassociate from the
     *        administrator account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateMembersRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateMembersRequest == false)
            return false;
        DisassociateMembersRequest other = (DisassociateMembersRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateMembersRequest clone() {
        return (DisassociateMembersRequest) super.clone();
    }

}
