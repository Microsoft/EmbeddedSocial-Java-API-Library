/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * This file was generated using AutoRest.
 */

package com.microsoft.socialplus.autorest.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request to post (create) comment.
 */
public class PostCommentRequest {
    /**
     * Gets or sets comment text.
     */
    @JsonProperty(required = true)
    private String text;

    /**
     * Gets or sets comment blob type. Possible values include: 'Unknown',
     * 'Image', 'Video', 'Custom'.
     */
    private BlobType blobType;

    /**
     * Gets or sets comment blob handle.
     */
    private String blobHandle;

    /**
     * Gets or sets comment language.
     */
    private String language;

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param text the text value to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Get the blobType value.
     *
     * @return the blobType value
     */
    public BlobType getBlobType() {
        return this.blobType;
    }

    /**
     * Set the blobType value.
     *
     * @param blobType the blobType value to set
     */
    public void setBlobType(BlobType blobType) {
        this.blobType = blobType;
    }

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

    /**
     * Get the language value.
     *
     * @return the language value
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Set the language value.
     *
     * @param language the language value to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

}
