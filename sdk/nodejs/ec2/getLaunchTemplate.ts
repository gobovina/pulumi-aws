// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides information about a Launch Template.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const default = aws.ec2.getLaunchTemplate({
 *     name: "my-launch-template",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Filter
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.ec2.getLaunchTemplate({
 *     filters: [{
 *         name: "launch-template-name",
 *         values: ["some-template"],
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getLaunchTemplate(args?: GetLaunchTemplateArgs, opts?: pulumi.InvokeOptions): Promise<GetLaunchTemplateResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ec2/getLaunchTemplate:getLaunchTemplate", {
        "filters": args.filters,
        "id": args.id,
        "name": args.name,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getLaunchTemplate.
 */
export interface GetLaunchTemplateArgs {
    /**
     * Configuration block(s) for filtering. Detailed below.
     */
    filters?: inputs.ec2.GetLaunchTemplateFilter[];
    /**
     * ID of the specific launch template to retrieve.
     */
    id?: string;
    /**
     * Name of the launch template.
     */
    name?: string;
    /**
     * Map of tags, each pair of which must exactly match a pair on the desired Launch Template.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getLaunchTemplate.
 */
export interface GetLaunchTemplateResult {
    readonly arn: string;
    readonly blockDeviceMappings: outputs.ec2.GetLaunchTemplateBlockDeviceMapping[];
    readonly capacityReservationSpecifications: outputs.ec2.GetLaunchTemplateCapacityReservationSpecification[];
    readonly cpuOptions: outputs.ec2.GetLaunchTemplateCpuOption[];
    readonly creditSpecifications: outputs.ec2.GetLaunchTemplateCreditSpecification[];
    readonly defaultVersion: number;
    readonly description: string;
    readonly disableApiStop: boolean;
    readonly disableApiTermination: boolean;
    readonly ebsOptimized: string;
    readonly elasticGpuSpecifications: outputs.ec2.GetLaunchTemplateElasticGpuSpecification[];
    readonly elasticInferenceAccelerators: outputs.ec2.GetLaunchTemplateElasticInferenceAccelerator[];
    readonly enclaveOptions: outputs.ec2.GetLaunchTemplateEnclaveOption[];
    readonly filters?: outputs.ec2.GetLaunchTemplateFilter[];
    readonly hibernationOptions: outputs.ec2.GetLaunchTemplateHibernationOption[];
    readonly iamInstanceProfiles: outputs.ec2.GetLaunchTemplateIamInstanceProfile[];
    /**
     * ID of the launch template.
     */
    readonly id: string;
    readonly imageId: string;
    readonly instanceInitiatedShutdownBehavior: string;
    readonly instanceMarketOptions: outputs.ec2.GetLaunchTemplateInstanceMarketOption[];
    readonly instanceRequirements: outputs.ec2.GetLaunchTemplateInstanceRequirement[];
    readonly instanceType: string;
    readonly kernelId: string;
    readonly keyName: string;
    readonly latestVersion: number;
    readonly licenseSpecifications: outputs.ec2.GetLaunchTemplateLicenseSpecification[];
    readonly maintenanceOptions: outputs.ec2.GetLaunchTemplateMaintenanceOption[];
    readonly metadataOptions: outputs.ec2.GetLaunchTemplateMetadataOption[];
    readonly monitorings: outputs.ec2.GetLaunchTemplateMonitoring[];
    readonly name: string;
    readonly networkInterfaces: outputs.ec2.GetLaunchTemplateNetworkInterface[];
    readonly placements: outputs.ec2.GetLaunchTemplatePlacement[];
    readonly privateDnsNameOptions: outputs.ec2.GetLaunchTemplatePrivateDnsNameOption[];
    readonly ramDiskId: string;
    readonly securityGroupNames: string[];
    readonly tagSpecifications: outputs.ec2.GetLaunchTemplateTagSpecification[];
    readonly tags: {[key: string]: string};
    readonly userData: string;
    readonly vpcSecurityGroupIds: string[];
}
/**
 * Provides information about a Launch Template.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const default = aws.ec2.getLaunchTemplate({
 *     name: "my-launch-template",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Filter
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.ec2.getLaunchTemplate({
 *     filters: [{
 *         name: "launch-template-name",
 *         values: ["some-template"],
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getLaunchTemplateOutput(args?: GetLaunchTemplateOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLaunchTemplateResult> {
    return pulumi.output(args).apply((a: any) => getLaunchTemplate(a, opts))
}

/**
 * A collection of arguments for invoking getLaunchTemplate.
 */
export interface GetLaunchTemplateOutputArgs {
    /**
     * Configuration block(s) for filtering. Detailed below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2.GetLaunchTemplateFilterArgs>[]>;
    /**
     * ID of the specific launch template to retrieve.
     */
    id?: pulumi.Input<string>;
    /**
     * Name of the launch template.
     */
    name?: pulumi.Input<string>;
    /**
     * Map of tags, each pair of which must exactly match a pair on the desired Launch Template.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
