// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./acl";
export * from "./cluster";
export * from "./parameterGroup";
export * from "./snapshot";
export * from "./subnetGroup";
export * from "./user";

// Import resources to register:
import { Acl } from "./acl";
import { Cluster } from "./cluster";
import { ParameterGroup } from "./parameterGroup";
import { Snapshot } from "./snapshot";
import { SubnetGroup } from "./subnetGroup";
import { User } from "./user";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:memorydb/acl:Acl":
                return new Acl(name, <any>undefined, { urn })
            case "aws:memorydb/cluster:Cluster":
                return new Cluster(name, <any>undefined, { urn })
            case "aws:memorydb/parameterGroup:ParameterGroup":
                return new ParameterGroup(name, <any>undefined, { urn })
            case "aws:memorydb/snapshot:Snapshot":
                return new Snapshot(name, <any>undefined, { urn })
            case "aws:memorydb/subnetGroup:SubnetGroup":
                return new SubnetGroup(name, <any>undefined, { urn })
            case "aws:memorydb/user:User":
                return new User(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "memorydb/acl", _module)
pulumi.runtime.registerResourceModule("aws", "memorydb/cluster", _module)
pulumi.runtime.registerResourceModule("aws", "memorydb/parameterGroup", _module)
pulumi.runtime.registerResourceModule("aws", "memorydb/snapshot", _module)
pulumi.runtime.registerResourceModule("aws", "memorydb/subnetGroup", _module)
pulumi.runtime.registerResourceModule("aws", "memorydb/user", _module)
