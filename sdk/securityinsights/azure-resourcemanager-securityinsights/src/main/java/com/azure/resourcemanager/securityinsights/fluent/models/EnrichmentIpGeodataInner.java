// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Geodata information for a given IP address. */
@Fluent
public final class EnrichmentIpGeodataInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EnrichmentIpGeodataInner.class);

    /*
     * The autonomous system number associated with this IP address
     */
    @JsonProperty(value = "asn")
    private String asn;

    /*
     * The name of the carrier for this IP address
     */
    @JsonProperty(value = "carrier")
    private String carrier;

    /*
     * The city this IP address is located in
     */
    @JsonProperty(value = "city")
    private String city;

    /*
     * A numeric rating of confidence that the value in the 'city' field is
     * correct, on a scale of 0-100
     */
    @JsonProperty(value = "cityCf")
    private Integer cityCf;

    /*
     * The continent this IP address is located on
     */
    @JsonProperty(value = "continent")
    private String continent;

    /*
     * The county this IP address is located in
     */
    @JsonProperty(value = "country")
    private String country;

    /*
     * A numeric rating of confidence that the value in the 'country' field is
     * correct on a scale of 0-100
     */
    @JsonProperty(value = "countryCf")
    private Integer countryCf;

    /*
     * The dotted-decimal or colon-separated string representation of the IP
     * address
     */
    @JsonProperty(value = "ipAddr")
    private String ipAddr;

    /*
     * A description of the connection type of this IP address
     */
    @JsonProperty(value = "ipRoutingType")
    private String ipRoutingType;

    /*
     * The latitude of this IP address
     */
    @JsonProperty(value = "latitude")
    private String latitude;

    /*
     * The longitude of this IP address
     */
    @JsonProperty(value = "longitude")
    private String longitude;

    /*
     * The name of the organization for this IP address
     */
    @JsonProperty(value = "organization")
    private String organization;

    /*
     * The type of the organization for this IP address
     */
    @JsonProperty(value = "organizationType")
    private String organizationType;

    /*
     * The geographic region this IP address is located in
     */
    @JsonProperty(value = "region")
    private String region;

    /*
     * The state this IP address is located in
     */
    @JsonProperty(value = "state")
    private String state;

    /*
     * A numeric rating of confidence that the value in the 'state' field is
     * correct on a scale of 0-100
     */
    @JsonProperty(value = "stateCf")
    private Integer stateCf;

    /*
     * The abbreviated name for the state this IP address is located in
     */
    @JsonProperty(value = "stateCode")
    private String stateCode;

    /**
     * Get the asn property: The autonomous system number associated with this IP address.
     *
     * @return the asn value.
     */
    public String asn() {
        return this.asn;
    }

    /**
     * Set the asn property: The autonomous system number associated with this IP address.
     *
     * @param asn the asn value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withAsn(String asn) {
        this.asn = asn;
        return this;
    }

    /**
     * Get the carrier property: The name of the carrier for this IP address.
     *
     * @return the carrier value.
     */
    public String carrier() {
        return this.carrier;
    }

    /**
     * Set the carrier property: The name of the carrier for this IP address.
     *
     * @param carrier the carrier value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * Get the city property: The city this IP address is located in.
     *
     * @return the city value.
     */
    public String city() {
        return this.city;
    }

    /**
     * Set the city property: The city this IP address is located in.
     *
     * @param city the city value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the cityCf property: A numeric rating of confidence that the value in the 'city' field is correct, on a scale
     * of 0-100.
     *
     * @return the cityCf value.
     */
    public Integer cityCf() {
        return this.cityCf;
    }

    /**
     * Set the cityCf property: A numeric rating of confidence that the value in the 'city' field is correct, on a scale
     * of 0-100.
     *
     * @param cityCf the cityCf value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withCityCf(Integer cityCf) {
        this.cityCf = cityCf;
        return this;
    }

    /**
     * Get the continent property: The continent this IP address is located on.
     *
     * @return the continent value.
     */
    public String continent() {
        return this.continent;
    }

    /**
     * Set the continent property: The continent this IP address is located on.
     *
     * @param continent the continent value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withContinent(String continent) {
        this.continent = continent;
        return this;
    }

    /**
     * Get the country property: The county this IP address is located in.
     *
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: The county this IP address is located in.
     *
     * @param country the country value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the countryCf property: A numeric rating of confidence that the value in the 'country' field is correct on a
     * scale of 0-100.
     *
     * @return the countryCf value.
     */
    public Integer countryCf() {
        return this.countryCf;
    }

    /**
     * Set the countryCf property: A numeric rating of confidence that the value in the 'country' field is correct on a
     * scale of 0-100.
     *
     * @param countryCf the countryCf value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withCountryCf(Integer countryCf) {
        this.countryCf = countryCf;
        return this;
    }

    /**
     * Get the ipAddr property: The dotted-decimal or colon-separated string representation of the IP address.
     *
     * @return the ipAddr value.
     */
    public String ipAddr() {
        return this.ipAddr;
    }

    /**
     * Set the ipAddr property: The dotted-decimal or colon-separated string representation of the IP address.
     *
     * @param ipAddr the ipAddr value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
        return this;
    }

    /**
     * Get the ipRoutingType property: A description of the connection type of this IP address.
     *
     * @return the ipRoutingType value.
     */
    public String ipRoutingType() {
        return this.ipRoutingType;
    }

    /**
     * Set the ipRoutingType property: A description of the connection type of this IP address.
     *
     * @param ipRoutingType the ipRoutingType value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withIpRoutingType(String ipRoutingType) {
        this.ipRoutingType = ipRoutingType;
        return this;
    }

    /**
     * Get the latitude property: The latitude of this IP address.
     *
     * @return the latitude value.
     */
    public String latitude() {
        return this.latitude;
    }

    /**
     * Set the latitude property: The latitude of this IP address.
     *
     * @param latitude the latitude value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Get the longitude property: The longitude of this IP address.
     *
     * @return the longitude value.
     */
    public String longitude() {
        return this.longitude;
    }

    /**
     * Set the longitude property: The longitude of this IP address.
     *
     * @param longitude the longitude value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Get the organization property: The name of the organization for this IP address.
     *
     * @return the organization value.
     */
    public String organization() {
        return this.organization;
    }

    /**
     * Set the organization property: The name of the organization for this IP address.
     *
     * @param organization the organization value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the organizationType property: The type of the organization for this IP address.
     *
     * @return the organizationType value.
     */
    public String organizationType() {
        return this.organizationType;
    }

    /**
     * Set the organizationType property: The type of the organization for this IP address.
     *
     * @param organizationType the organizationType value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withOrganizationType(String organizationType) {
        this.organizationType = organizationType;
        return this;
    }

    /**
     * Get the region property: The geographic region this IP address is located in.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: The geographic region this IP address is located in.
     *
     * @param region the region value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the state property: The state this IP address is located in.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: The state this IP address is located in.
     *
     * @param state the state value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the stateCf property: A numeric rating of confidence that the value in the 'state' field is correct on a
     * scale of 0-100.
     *
     * @return the stateCf value.
     */
    public Integer stateCf() {
        return this.stateCf;
    }

    /**
     * Set the stateCf property: A numeric rating of confidence that the value in the 'state' field is correct on a
     * scale of 0-100.
     *
     * @param stateCf the stateCf value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withStateCf(Integer stateCf) {
        this.stateCf = stateCf;
        return this;
    }

    /**
     * Get the stateCode property: The abbreviated name for the state this IP address is located in.
     *
     * @return the stateCode value.
     */
    public String stateCode() {
        return this.stateCode;
    }

    /**
     * Set the stateCode property: The abbreviated name for the state this IP address is located in.
     *
     * @param stateCode the stateCode value to set.
     * @return the EnrichmentIpGeodataInner object itself.
     */
    public EnrichmentIpGeodataInner withStateCode(String stateCode) {
        this.stateCode = stateCode;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
