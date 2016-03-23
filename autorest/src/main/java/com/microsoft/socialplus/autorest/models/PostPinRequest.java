/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * This file was generated using AutoRest.
 */

package com.microsoft.socialplus.autorest.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request to post (create) a pin.
 */
public class PostPinRequest {
    /**
     * Gets or sets topic handle.
     */
    @JsonProperty(required = true)
    private String topicHandle;

    /**
     * Get the topicHandle value.
     *
     * @return the topicHandle value
     */
    public String getTopicHandle() {
        return this.topicHandle;
    }

    /**
     * Set the topicHandle value.
     *
     * @param topicHandle the topicHandle value to set
     */
    public void setTopicHandle(String topicHandle) {
        this.topicHandle = topicHandle;
    }

}
