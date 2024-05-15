// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { DomainArgs, DomainState } from "./domain";
export type Domain = import("./domain").Domain;
export const Domain: typeof import("./domain").Domain = null as any;
utilities.lazyLoad(exports, ["Domain"], () => require("./domain"));

export { EnvironmentBlueprintConfigurationArgs, EnvironmentBlueprintConfigurationState } from "./environmentBlueprintConfiguration";
export type EnvironmentBlueprintConfiguration = import("./environmentBlueprintConfiguration").EnvironmentBlueprintConfiguration;
export const EnvironmentBlueprintConfiguration: typeof import("./environmentBlueprintConfiguration").EnvironmentBlueprintConfiguration = null as any;
utilities.lazyLoad(exports, ["EnvironmentBlueprintConfiguration"], () => require("./environmentBlueprintConfiguration"));

export { GetEnvironmentBlueprintArgs, GetEnvironmentBlueprintResult, GetEnvironmentBlueprintOutputArgs } from "./getEnvironmentBlueprint";
export const getEnvironmentBlueprint: typeof import("./getEnvironmentBlueprint").getEnvironmentBlueprint = null as any;
export const getEnvironmentBlueprintOutput: typeof import("./getEnvironmentBlueprint").getEnvironmentBlueprintOutput = null as any;
utilities.lazyLoad(exports, ["getEnvironmentBlueprint","getEnvironmentBlueprintOutput"], () => require("./getEnvironmentBlueprint"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:datazone/domain:Domain":
                return new Domain(name, <any>undefined, { urn })
            case "aws:datazone/environmentBlueprintConfiguration:EnvironmentBlueprintConfiguration":
                return new EnvironmentBlueprintConfiguration(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "datazone/domain", _module)
pulumi.runtime.registerResourceModule("aws", "datazone/environmentBlueprintConfiguration", _module)
