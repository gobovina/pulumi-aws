// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides information about a Launch Configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const ubuntu = aws.ec2.getLaunchConfiguration({
 *     name: "test-launch-config",
 * });
 * ```
 */
export function getLaunchConfiguration(args: GetLaunchConfigurationArgs, opts?: pulumi.InvokeOptions): Promise<GetLaunchConfigurationResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ec2/getLaunchConfiguration:getLaunchConfiguration", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getLaunchConfiguration.
 */
export interface GetLaunchConfigurationArgs {
    /**
     * Name of the launch configuration.
     */
    name: string;
}

/**
 * A collection of values returned by getLaunchConfiguration.
 */
export interface GetLaunchConfigurationResult {
    /**
     * Amazon Resource Name of the launch configuration.
     */
    readonly arn: string;
    /**
     * Whether a Public IP address is associated with the instance.
     */
    readonly associatePublicIpAddress: boolean;
    /**
     * EBS Block Devices attached to the instance.
     */
    readonly ebsBlockDevices: outputs.ec2.GetLaunchConfigurationEbsBlockDevice[];
    /**
     * Whether the launched EC2 instance will be EBS-optimized.
     */
    readonly ebsOptimized: boolean;
    /**
     * Whether Detailed Monitoring is Enabled.
     */
    readonly enableMonitoring: boolean;
    /**
     * The Ephemeral volumes on the instance.
     */
    readonly ephemeralBlockDevices: outputs.ec2.GetLaunchConfigurationEphemeralBlockDevice[];
    /**
     * The IAM Instance Profile to associate with launched instances.
     */
    readonly iamInstanceProfile: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * EC2 Image ID of the instance.
     */
    readonly imageId: string;
    /**
     * Instance Type of the instance to launch.
     */
    readonly instanceType: string;
    /**
     * Key Name that should be used for the instance.
     */
    readonly keyName: string;
    /**
     * Metadata options for the instance.
     */
    readonly metadataOptions: outputs.ec2.GetLaunchConfigurationMetadataOption[];
    /**
     * Name of the launch configuration.
     */
    readonly name: string;
    /**
     * Tenancy of the instance.
     */
    readonly placementTenancy: string;
    /**
     * Root Block Device of the instance.
     */
    readonly rootBlockDevices: outputs.ec2.GetLaunchConfigurationRootBlockDevice[];
    /**
     * List of associated Security Group IDS.
     */
    readonly securityGroups: string[];
    /**
     * Price to use for reserving Spot instances.
     */
    readonly spotPrice: string;
    /**
     * User Data of the instance.
     */
    readonly userData: string;
    /**
     * ID of a ClassicLink-enabled VPC.
     */
    readonly vpcClassicLinkId: string;
    /**
     * The IDs of one or more Security Groups for the specified ClassicLink-enabled VPC.
     */
    readonly vpcClassicLinkSecurityGroups: string[];
}
/**
 * Provides information about a Launch Configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const ubuntu = aws.ec2.getLaunchConfiguration({
 *     name: "test-launch-config",
 * });
 * ```
 */
export function getLaunchConfigurationOutput(args: GetLaunchConfigurationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLaunchConfigurationResult> {
    return pulumi.output(args).apply((a: any) => getLaunchConfiguration(a, opts))
}

/**
 * A collection of arguments for invoking getLaunchConfiguration.
 */
export interface GetLaunchConfigurationOutputArgs {
    /**
     * Name of the launch configuration.
     */
    name: pulumi.Input<string>;
}
