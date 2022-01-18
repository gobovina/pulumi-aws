// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./protection";
export * from "./protectionGroup";
export * from "./protectionHealthCheckAssociation";

// Import resources to register:
import { Protection } from "./protection";
import { ProtectionGroup } from "./protectionGroup";
import { ProtectionHealthCheckAssociation } from "./protectionHealthCheckAssociation";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:shield/protection:Protection":
                return new Protection(name, <any>undefined, { urn })
            case "aws:shield/protectionGroup:ProtectionGroup":
                return new ProtectionGroup(name, <any>undefined, { urn })
            case "aws:shield/protectionHealthCheckAssociation:ProtectionHealthCheckAssociation":
                return new ProtectionHealthCheckAssociation(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "shield/protection", _module)
pulumi.runtime.registerResourceModule("aws", "shield/protectionGroup", _module)
pulumi.runtime.registerResourceModule("aws", "shield/protectionHealthCheckAssociation", _module)
