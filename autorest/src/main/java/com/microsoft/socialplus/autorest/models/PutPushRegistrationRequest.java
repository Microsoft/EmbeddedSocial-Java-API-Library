/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * This file was generated using AutoRest.
 */

package com.microsoft.socialplus.autorest.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request to put push registration (register or update).
 */
public class PutPushRegistrationRequest {
    /**
     * Gets or sets last updated time from the OS
     * This is used to expire out registrations that have not been
     * updated every 30 days.
     */
    @JsonProperty(required = true)
    private DateTime lastUpdatedTime;

    /**
     * Gets or sets language of the user.
     */
    @JsonProperty(required = true)
    private String language;

    /**
     * Get the lastUpdatedTime value.
     *
     * @return the lastUpdatedTime value
     */
    public DateTime getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Set the lastUpdatedTime value.
     *
     * @param lastUpdatedTime the lastUpdatedTime value to set
     */
    public void setLastUpdatedTime(DateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
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
