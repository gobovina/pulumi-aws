// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AutoScalingConfigurationVersionArgs, AutoScalingConfigurationVersionState } from "./autoScalingConfigurationVersion";
export type AutoScalingConfigurationVersion = import("./autoScalingConfigurationVersion").AutoScalingConfigurationVersion;
export const AutoScalingConfigurationVersion: typeof import("./autoScalingConfigurationVersion").AutoScalingConfigurationVersion = null as any;
utilities.lazyLoad(exports, ["AutoScalingConfigurationVersion"], () => require("./autoScalingConfigurationVersion"));

export { ConnectionArgs, ConnectionState } from "./connection";
export type Connection = import("./connection").Connection;
export const Connection: typeof import("./connection").Connection = null as any;
utilities.lazyLoad(exports, ["Connection"], () => require("./connection"));

export { CustomDomainAssociationArgs, CustomDomainAssociationState } from "./customDomainAssociation";
export type CustomDomainAssociation = import("./customDomainAssociation").CustomDomainAssociation;
export const CustomDomainAssociation: typeof import("./customDomainAssociation").CustomDomainAssociation = null as any;
utilities.lazyLoad(exports, ["CustomDomainAssociation"], () => require("./customDomainAssociation"));

export { DefaultAutoScalingConfigurationVersionArgs, DefaultAutoScalingConfigurationVersionState } from "./defaultAutoScalingConfigurationVersion";
export type DefaultAutoScalingConfigurationVersion = import("./defaultAutoScalingConfigurationVersion").DefaultAutoScalingConfigurationVersion;
export const DefaultAutoScalingConfigurationVersion: typeof import("./defaultAutoScalingConfigurationVersion").DefaultAutoScalingConfigurationVersion = null as any;
utilities.lazyLoad(exports, ["DefaultAutoScalingConfigurationVersion"], () => require("./defaultAutoScalingConfigurationVersion"));

export { DeploymentArgs, DeploymentState } from "./deployment";
export type Deployment = import("./deployment").Deployment;
export const Deployment: typeof import("./deployment").Deployment = null as any;
utilities.lazyLoad(exports, ["Deployment"], () => require("./deployment"));

export { GetHostedZoneIdArgs, GetHostedZoneIdResult, GetHostedZoneIdOutputArgs } from "./getHostedZoneId";
export const getHostedZoneId: typeof import("./getHostedZoneId").getHostedZoneId = null as any;
export const getHostedZoneIdOutput: typeof import("./getHostedZoneId").getHostedZoneIdOutput = null as any;
utilities.lazyLoad(exports, ["getHostedZoneId","getHostedZoneIdOutput"], () => require("./getHostedZoneId"));

export { ObservabilityConfigurationArgs, ObservabilityConfigurationState } from "./observabilityConfiguration";
export type ObservabilityConfiguration = import("./observabilityConfiguration").ObservabilityConfiguration;
export const ObservabilityConfiguration: typeof import("./observabilityConfiguration").ObservabilityConfiguration = null as any;
utilities.lazyLoad(exports, ["ObservabilityConfiguration"], () => require("./observabilityConfiguration"));

export { ServiceArgs, ServiceState } from "./service";
export type Service = import("./service").Service;
export const Service: typeof import("./service").Service = null as any;
utilities.lazyLoad(exports, ["Service"], () => require("./service"));

export { VpcConnectorArgs, VpcConnectorState } from "./vpcConnector";
export type VpcConnector = import("./vpcConnector").VpcConnector;
export const VpcConnector: typeof import("./vpcConnector").VpcConnector = null as any;
utilities.lazyLoad(exports, ["VpcConnector"], () => require("./vpcConnector"));

export { VpcIngressConnectionArgs, VpcIngressConnectionState } from "./vpcIngressConnection";
export type VpcIngressConnection = import("./vpcIngressConnection").VpcIngressConnection;
export const VpcIngressConnection: typeof import("./vpcIngressConnection").VpcIngressConnection = null as any;
utilities.lazyLoad(exports, ["VpcIngressConnection"], () => require("./vpcIngressConnection"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:apprunner/autoScalingConfigurationVersion:AutoScalingConfigurationVersion":
                return new AutoScalingConfigurationVersion(name, <any>undefined, { urn })
            case "aws:apprunner/connection:Connection":
                return new Connection(name, <any>undefined, { urn })
            case "aws:apprunner/customDomainAssociation:CustomDomainAssociation":
                return new CustomDomainAssociation(name, <any>undefined, { urn })
            case "aws:apprunner/defaultAutoScalingConfigurationVersion:DefaultAutoScalingConfigurationVersion":
                return new DefaultAutoScalingConfigurationVersion(name, <any>undefined, { urn })
            case "aws:apprunner/deployment:Deployment":
                return new Deployment(name, <any>undefined, { urn })
            case "aws:apprunner/observabilityConfiguration:ObservabilityConfiguration":
                return new ObservabilityConfiguration(name, <any>undefined, { urn })
            case "aws:apprunner/service:Service":
                return new Service(name, <any>undefined, { urn })
            case "aws:apprunner/vpcConnector:VpcConnector":
                return new VpcConnector(name, <any>undefined, { urn })
            case "aws:apprunner/vpcIngressConnection:VpcIngressConnection":
                return new VpcIngressConnection(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "apprunner/autoScalingConfigurationVersion", _module)
pulumi.runtime.registerResourceModule("aws", "apprunner/connection", _module)
pulumi.runtime.registerResourceModule("aws", "apprunner/customDomainAssociation", _module)
pulumi.runtime.registerResourceModule("aws", "apprunner/defaultAutoScalingConfigurationVersion", _module)
pulumi.runtime.registerResourceModule("aws", "apprunner/deployment", _module)
pulumi.runtime.registerResourceModule("aws", "apprunner/observabilityConfiguration", _module)
pulumi.runtime.registerResourceModule("aws", "apprunner/service", _module)
pulumi.runtime.registerResourceModule("aws", "apprunner/vpcConnector", _module)
pulumi.runtime.registerResourceModule("aws", "apprunner/vpcIngressConnection", _module)
