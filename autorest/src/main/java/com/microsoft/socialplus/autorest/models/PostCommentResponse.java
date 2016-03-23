/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * This file was generated using AutoRest.
 */

package com.microsoft.socialplus.autorest.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response from post (create) comment.
 */
public class PostCommentResponse {
    /**
     * Gets or sets comment handle of the comment.
     */
    @JsonProperty(required = true)
    private String commentHandle;

    /**
     * Get the commentHandle value.
     *
     * @return the commentHandle value
     */
    public String getCommentHandle() {
        return this.commentHandle;
    }

    /**
     * Set the commentHandle value.
     *
     * @param commentHandle the commentHandle value to set
     */
    public void setCommentHandle(String commentHandle) {
        this.commentHandle = commentHandle;
    }

}
