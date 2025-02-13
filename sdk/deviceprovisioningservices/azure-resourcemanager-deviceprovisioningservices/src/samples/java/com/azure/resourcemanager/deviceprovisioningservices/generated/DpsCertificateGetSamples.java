// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.generated;

import com.azure.core.util.Context;

/** Samples for DpsCertificate Get. */
public final class DpsCertificateGetSamples {
    /*
     * x-ms-original-file: specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/stable/2021-10-15/examples/DPSGetCertificate.json
     */
    /**
     * Sample code: DPSGetCertificate.
     *
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSGetCertificate(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager
            .dpsCertificates()
            .getWithResponse("cert", "myResourceGroup", "myFirstProvisioningService", null, Context.NONE);
    }
}
