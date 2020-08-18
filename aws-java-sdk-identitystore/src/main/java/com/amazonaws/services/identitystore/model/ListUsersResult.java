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
package com.amazonaws.services.identitystore.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListUsers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>User</code> objects in the identity store.
     * </p>
     */
    private java.util.List<User> users;
    /**
     * <p>
     * The pagination token used for the <code>ListUsers</code> and <code>ListGroups</code> APIs. This value is
     * generated by the identity store service and is returned in the API response if the total results are more than
     * the size of one page, and when this token is used in the API request to search for the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>User</code> objects in the identity store.
     * </p>
     * 
     * @return A list of <code>User</code> objects in the identity store.
     */

    public java.util.List<User> getUsers() {
        return users;
    }

    /**
     * <p>
     * A list of <code>User</code> objects in the identity store.
     * </p>
     * 
     * @param users
     *        A list of <code>User</code> objects in the identity store.
     */

    public void setUsers(java.util.Collection<User> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<User>(users);
    }

    /**
     * <p>
     * A list of <code>User</code> objects in the identity store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsers(java.util.Collection)} or {@link #withUsers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param users
     *        A list of <code>User</code> objects in the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withUsers(User... users) {
        if (this.users == null) {
            setUsers(new java.util.ArrayList<User>(users.length));
        }
        for (User ele : users) {
            this.users.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>User</code> objects in the identity store.
     * </p>
     * 
     * @param users
     *        A list of <code>User</code> objects in the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withUsers(java.util.Collection<User> users) {
        setUsers(users);
        return this;
    }

    /**
     * <p>
     * The pagination token used for the <code>ListUsers</code> and <code>ListGroups</code> APIs. This value is
     * generated by the identity store service and is returned in the API response if the total results are more than
     * the size of one page, and when this token is used in the API request to search for the next page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used for the <code>ListUsers</code> and <code>ListGroups</code> APIs. This value is
     *        generated by the identity store service and is returned in the API response if the total results are more
     *        than the size of one page, and when this token is used in the API request to search for the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used for the <code>ListUsers</code> and <code>ListGroups</code> APIs. This value is
     * generated by the identity store service and is returned in the API response if the total results are more than
     * the size of one page, and when this token is used in the API request to search for the next page.
     * </p>
     * 
     * @return The pagination token used for the <code>ListUsers</code> and <code>ListGroups</code> APIs. This value is
     *         generated by the identity store service and is returned in the API response if the total results are more
     *         than the size of one page, and when this token is used in the API request to search for the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used for the <code>ListUsers</code> and <code>ListGroups</code> APIs. This value is
     * generated by the identity store service and is returned in the API response if the total results are more than
     * the size of one page, and when this token is used in the API request to search for the next page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used for the <code>ListUsers</code> and <code>ListGroups</code> APIs. This value is
     *        generated by the identity store service and is returned in the API response if the total results are more
     *        than the size of one page, and when this token is used in the API request to search for the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withNextToken(String nextToken) {
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
        if (getUsers() != null)
            sb.append("Users: ").append(getUsers()).append(",");
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

        if (obj instanceof ListUsersResult == false)
            return false;
        ListUsersResult other = (ListUsersResult) obj;
        if (other.getUsers() == null ^ this.getUsers() == null)
            return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false)
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

        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListUsersResult clone() {
        try {
            return (ListUsersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
