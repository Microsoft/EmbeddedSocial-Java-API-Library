/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 */

package com.microsoft.socialplus.autorest.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response from post (create) blob.
 */
public class PostBlobResponse {
    /**
     * Gets or sets blob handle.
     */
    @JsonProperty(required = true)
    private String blobHandle;

    /**
     * Get the blobHandle value.
     *
     * @return the blobHandle value
     */
    public String getBlobHandle() {
        return this.blobHandle;
    }

    /**
     * Set the blobHandle value.
     *
     * @param blobHandle the blobHandle value to set
     */
    public void setBlobHandle(String blobHandle) {
        this.blobHandle = blobHandle;
    }

}
