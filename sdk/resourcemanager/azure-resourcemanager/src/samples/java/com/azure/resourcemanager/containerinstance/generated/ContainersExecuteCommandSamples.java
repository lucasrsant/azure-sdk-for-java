// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.containerinstance.models.ContainerExecRequest;
import com.azure.resourcemanager.containerinstance.models.ContainerExecRequestTerminalSize;

/** Samples for Containers ExecuteCommand. */
public final class ContainersExecuteCommandSamples {
    /*
     * x-ms-original-file: specification/containerinstance/resource-manager/Microsoft.ContainerInstance/stable/2021-09-01/examples/ContainerExec.json
     */
    /**
     * Sample code: ContainerExec.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void containerExec(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerGroups()
            .manager()
            .serviceClient()
            .getContainers()
            .executeCommandWithResponse(
                "demo",
                "demo1",
                "container1",
                new ContainerExecRequest()
                    .withCommand("/bin/bash")
                    .withTerminalSize(new ContainerExecRequestTerminalSize().withRows(12).withCols(12)),
                Context.NONE);
    }
}
