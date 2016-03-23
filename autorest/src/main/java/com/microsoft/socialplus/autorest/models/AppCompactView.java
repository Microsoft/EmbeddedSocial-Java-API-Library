/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * This file was generated using AutoRest.
 */

package com.microsoft.socialplus.autorest.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * App compact view.
 */
public class AppCompactView {
    /**
     * Gets or sets app handle.
     */
    @JsonProperty(required = true)
    private String appHandle;

    /**
     * Gets or sets app name.
     */
    @JsonProperty(required = true)
    private String name;

    /**
     * Gets or sets app icon handle.
     */
    private String iconHandle;

    /**
     * Gets or sets app icon url.
     */
    private String iconUrl;

    /**
     * Gets or sets platform type. Possible values include: 'Windows',
     * 'Android', 'IOS'.
     */
    @JsonProperty(required = true)
    private PlatformType platformType;

    /**
     * Gets or sets app deep link.
     */
    private String deepLink;

    /**
     * Gets or sets app store link.
     */
    private String storeLink;

    /**
     * Get the appHandle value.
     *
     * @return the appHandle value
     */
    public String getAppHandle() {
        return this.appHandle;
    }

    /**
     * Set the appHandle value.
     *
     * @param appHandle the appHandle value to set
     */
    public void setAppHandle(String appHandle) {
        this.appHandle = appHandle;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the iconHandle value.
     *
     * @return the iconHandle value
     */
    public String getIconHandle() {
        return this.iconHandle;
    }

    /**
     * Set the iconHandle value.
     *
     * @param iconHandle the iconHandle value to set
     */
    public void setIconHandle(String iconHandle) {
        this.iconHandle = iconHandle;
    }

    /**
     * Get the iconUrl value.
     *
     * @return the iconUrl value
     */
    public String getIconUrl() {
        return this.iconUrl;
    }

    /**
     * Set the iconUrl value.
     *
     * @param iconUrl the iconUrl value to set
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * Get the platformType value.
     *
     * @return the platformType value
     */
    public PlatformType getPlatformType() {
        return this.platformType;
    }

    /**
     * Set the platformType value.
     *
     * @param platformType the platformType value to set
     */
    public void setPlatformType(PlatformType platformType) {
        this.platformType = platformType;
    }

    /**
     * Get the deepLink value.
     *
     * @return the deepLink value
     */
    public String getDeepLink() {
        return this.deepLink;
    }

    /**
     * Set the deepLink value.
     *
     * @param deepLink the deepLink value to set
     */
    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

    /**
     * Get the storeLink value.
     *
     * @return the storeLink value
     */
    public String getStoreLink() {
        return this.storeLink;
    }

    /**
     * Set the storeLink value.
     *
     * @param storeLink the storeLink value to set
     */
    public void setStoreLink(String storeLink) {
        this.storeLink = storeLink;
    }

}
