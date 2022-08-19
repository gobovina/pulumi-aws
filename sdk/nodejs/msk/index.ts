// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./cluster";
export * from "./configuration";
export * from "./getBrokerNodes";
export * from "./getCluster";
export * from "./getConfiguration";
export * from "./getKafkaVersion";
export * from "./scramSecretAssociation";
export * from "./serverlessCluster";

// Import resources to register:
import { Cluster } from "./cluster";
import { Configuration } from "./configuration";
import { ScramSecretAssociation } from "./scramSecretAssociation";
import { ServerlessCluster } from "./serverlessCluster";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:msk/cluster:Cluster":
                return new Cluster(name, <any>undefined, { urn })
            case "aws:msk/configuration:Configuration":
                return new Configuration(name, <any>undefined, { urn })
            case "aws:msk/scramSecretAssociation:ScramSecretAssociation":
                return new ScramSecretAssociation(name, <any>undefined, { urn })
            case "aws:msk/serverlessCluster:ServerlessCluster":
                return new ServerlessCluster(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "msk/cluster", _module)
pulumi.runtime.registerResourceModule("aws", "msk/configuration", _module)
pulumi.runtime.registerResourceModule("aws", "msk/scramSecretAssociation", _module)
pulumi.runtime.registerResourceModule("aws", "msk/serverlessCluster", _module)
