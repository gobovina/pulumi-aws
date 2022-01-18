// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Provides an EC2 launch template resource. Can be used to create instances or auto scaling groups.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * from "fs";
 *
 * const foo = new aws.ec2.LaunchTemplate("foo", {
 *     blockDeviceMappings: [{
 *         deviceName: "/dev/sda1",
 *         ebs: {
 *             volumeSize: 20,
 *         },
 *     }],
 *     capacityReservationSpecification: {
 *         capacityReservationPreference: "open",
 *     },
 *     cpuOptions: {
 *         coreCount: 4,
 *         threadsPerCore: 2,
 *     },
 *     creditSpecification: {
 *         cpuCredits: "standard",
 *     },
 *     disableApiTermination: true,
 *     ebsOptimized: true,
 *     elasticGpuSpecifications: [{
 *         type: "test",
 *     }],
 *     elasticInferenceAccelerator: {
 *         type: "eia1.medium",
 *     },
 *     iamInstanceProfile: {
 *         name: "test",
 *     },
 *     imageId: "ami-test",
 *     instanceInitiatedShutdownBehavior: "terminate",
 *     instanceMarketOptions: {
 *         marketType: "spot",
 *     },
 *     instanceType: "t2.micro",
 *     kernelId: "test",
 *     keyName: "test",
 *     licenseSpecifications: [{
 *         licenseConfigurationArn: "arn:aws:license-manager:eu-west-1:123456789012:license-configuration:lic-0123456789abcdef0123456789abcdef",
 *     }],
 *     metadataOptions: {
 *         httpEndpoint: "enabled",
 *         httpTokens: "required",
 *         httpPutResponseHopLimit: 1,
 *         instanceMetadataTags: "enabled",
 *     },
 *     monitoring: {
 *         enabled: true,
 *     },
 *     networkInterfaces: [{
 *         associatePublicIpAddress: true,
 *     }],
 *     placement: {
 *         availabilityZone: "us-west-2a",
 *     },
 *     ramDiskId: "test",
 *     vpcSecurityGroupIds: ["sg-12345678"],
 *     tagSpecifications: [{
 *         resourceType: "instance",
 *         tags: {
 *             Name: "test",
 *         },
 *     }],
 *     userData: Buffer.from(fs.readFileSync(`${path.module}/example.sh`), 'binary').toString('base64'),
 * });
 * ```
 *
 * ## Import
 *
 * Launch Templates can be imported using the `id`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:ec2/launchTemplate:LaunchTemplate web lt-12345678
 * ```
 */
export class LaunchTemplate extends pulumi.CustomResource {
    /**
     * Get an existing LaunchTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LaunchTemplateState, opts?: pulumi.CustomResourceOptions): LaunchTemplate {
        return new LaunchTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/launchTemplate:LaunchTemplate';

    /**
     * Returns true if the given object is an instance of LaunchTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LaunchTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LaunchTemplate.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the instance profile.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Specify volumes to attach to the instance besides the volumes specified by the AMI.
     * See Block Devices below for details.
     */
    public readonly blockDeviceMappings!: pulumi.Output<outputs.ec2.LaunchTemplateBlockDeviceMapping[] | undefined>;
    /**
     * Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
     */
    public readonly capacityReservationSpecification!: pulumi.Output<outputs.ec2.LaunchTemplateCapacityReservationSpecification | undefined>;
    /**
     * The CPU options for the instance. See CPU Options below for more details.
     */
    public readonly cpuOptions!: pulumi.Output<outputs.ec2.LaunchTemplateCpuOptions | undefined>;
    /**
     * Customize the credit specification of the instance. See Credit
     * Specification below for more details.
     */
    public readonly creditSpecification!: pulumi.Output<outputs.ec2.LaunchTemplateCreditSpecification | undefined>;
    /**
     * Default Version of the launch template.
     */
    public readonly defaultVersion!: pulumi.Output<number>;
    /**
     * Description of the launch template.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * If `true`, enables [EC2 Instance
     * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
     */
    public readonly disableApiTermination!: pulumi.Output<boolean | undefined>;
    /**
     * If `true`, the launched EC2 instance will be EBS-optimized.
     */
    public readonly ebsOptimized!: pulumi.Output<string | undefined>;
    /**
     * The elastic GPU to attach to the instance. See Elastic GPU
     * below for more details.
     */
    public readonly elasticGpuSpecifications!: pulumi.Output<outputs.ec2.LaunchTemplateElasticGpuSpecification[] | undefined>;
    /**
     * Configuration block containing an Elastic Inference Accelerator to attach to the instance. See Elastic Inference Accelerator below for more details.
     */
    public readonly elasticInferenceAccelerator!: pulumi.Output<outputs.ec2.LaunchTemplateElasticInferenceAccelerator | undefined>;
    /**
     * Enable Nitro Enclaves on launched instances. See Enclave Options below for more details.
     */
    public readonly enclaveOptions!: pulumi.Output<outputs.ec2.LaunchTemplateEnclaveOptions | undefined>;
    /**
     * The hibernation options for the instance. See Hibernation Options below for more details.
     */
    public readonly hibernationOptions!: pulumi.Output<outputs.ec2.LaunchTemplateHibernationOptions | undefined>;
    /**
     * The IAM Instance Profile to launch the instance with. See Instance Profile
     * below for more details.
     */
    public readonly iamInstanceProfile!: pulumi.Output<outputs.ec2.LaunchTemplateIamInstanceProfile | undefined>;
    /**
     * The AMI from which to launch the instance.
     */
    public readonly imageId!: pulumi.Output<string | undefined>;
    /**
     * Shutdown behavior for the instance. Can be `stop` or `terminate`.
     * (Default: `stop`).
     */
    public readonly instanceInitiatedShutdownBehavior!: pulumi.Output<string | undefined>;
    /**
     * The market (purchasing) option for the instance. See Market Options
     * below for details.
     */
    public readonly instanceMarketOptions!: pulumi.Output<outputs.ec2.LaunchTemplateInstanceMarketOptions | undefined>;
    /**
     * The type of the instance.
     */
    public readonly instanceType!: pulumi.Output<string | undefined>;
    /**
     * The kernel ID.
     */
    public readonly kernelId!: pulumi.Output<string | undefined>;
    /**
     * The key name to use for the instance.
     */
    public readonly keyName!: pulumi.Output<string | undefined>;
    /**
     * The latest version of the launch template.
     */
    public /*out*/ readonly latestVersion!: pulumi.Output<number>;
    /**
     * A list of license specifications to associate with. See License Specification below for more details.
     */
    public readonly licenseSpecifications!: pulumi.Output<outputs.ec2.LaunchTemplateLicenseSpecification[] | undefined>;
    /**
     * Customize the metadata options for the instance. See Metadata Options below for more details.
     */
    public readonly metadataOptions!: pulumi.Output<outputs.ec2.LaunchTemplateMetadataOptions>;
    /**
     * The monitoring option for the instance. See Monitoring below for more details.
     */
    public readonly monitoring!: pulumi.Output<outputs.ec2.LaunchTemplateMonitoring | undefined>;
    /**
     * The name of the launch template. If you leave this blank, this provider will auto-generate a unique name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     */
    public readonly namePrefix!: pulumi.Output<string>;
    /**
     * Customize network interfaces to be attached at instance boot time. See Network
     * Interfaces below for more details.
     */
    public readonly networkInterfaces!: pulumi.Output<outputs.ec2.LaunchTemplateNetworkInterface[] | undefined>;
    /**
     * The placement of the instance. See Placement below for more details.
     */
    public readonly placement!: pulumi.Output<outputs.ec2.LaunchTemplatePlacement | undefined>;
    /**
     * The ID of the RAM disk.
     */
    public readonly ramDiskId!: pulumi.Output<string | undefined>;
    /**
     * A list of security group names to associate with. If you are creating Instances in a VPC, use
     * `vpcSecurityGroupIds` instead.
     */
    public readonly securityGroupNames!: pulumi.Output<string[] | undefined>;
    /**
     * The tags to apply to the resources during launch. See Tag Specifications below for more details.
     */
    public readonly tagSpecifications!: pulumi.Output<outputs.ec2.LaunchTemplateTagSpecification[] | undefined>;
    /**
     * A map of tags to assign to the launch template. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Whether to update Default Version each update. Conflicts with `defaultVersion`.
     */
    public readonly updateDefaultVersion!: pulumi.Output<boolean | undefined>;
    /**
     * The Base64-encoded user data to provide when launching the instance.
     */
    public readonly userData!: pulumi.Output<string | undefined>;
    /**
     * A list of security group IDs to associate with. Conflicts with `network_interfaces.security_groups`
     */
    public readonly vpcSecurityGroupIds!: pulumi.Output<string[] | undefined>;

    /**
     * Create a LaunchTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: LaunchTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LaunchTemplateArgs | LaunchTemplateState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LaunchTemplateState | undefined;
            inputs["arn"] = state ? state.arn : undefined;
            inputs["blockDeviceMappings"] = state ? state.blockDeviceMappings : undefined;
            inputs["capacityReservationSpecification"] = state ? state.capacityReservationSpecification : undefined;
            inputs["cpuOptions"] = state ? state.cpuOptions : undefined;
            inputs["creditSpecification"] = state ? state.creditSpecification : undefined;
            inputs["defaultVersion"] = state ? state.defaultVersion : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["disableApiTermination"] = state ? state.disableApiTermination : undefined;
            inputs["ebsOptimized"] = state ? state.ebsOptimized : undefined;
            inputs["elasticGpuSpecifications"] = state ? state.elasticGpuSpecifications : undefined;
            inputs["elasticInferenceAccelerator"] = state ? state.elasticInferenceAccelerator : undefined;
            inputs["enclaveOptions"] = state ? state.enclaveOptions : undefined;
            inputs["hibernationOptions"] = state ? state.hibernationOptions : undefined;
            inputs["iamInstanceProfile"] = state ? state.iamInstanceProfile : undefined;
            inputs["imageId"] = state ? state.imageId : undefined;
            inputs["instanceInitiatedShutdownBehavior"] = state ? state.instanceInitiatedShutdownBehavior : undefined;
            inputs["instanceMarketOptions"] = state ? state.instanceMarketOptions : undefined;
            inputs["instanceType"] = state ? state.instanceType : undefined;
            inputs["kernelId"] = state ? state.kernelId : undefined;
            inputs["keyName"] = state ? state.keyName : undefined;
            inputs["latestVersion"] = state ? state.latestVersion : undefined;
            inputs["licenseSpecifications"] = state ? state.licenseSpecifications : undefined;
            inputs["metadataOptions"] = state ? state.metadataOptions : undefined;
            inputs["monitoring"] = state ? state.monitoring : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["namePrefix"] = state ? state.namePrefix : undefined;
            inputs["networkInterfaces"] = state ? state.networkInterfaces : undefined;
            inputs["placement"] = state ? state.placement : undefined;
            inputs["ramDiskId"] = state ? state.ramDiskId : undefined;
            inputs["securityGroupNames"] = state ? state.securityGroupNames : undefined;
            inputs["tagSpecifications"] = state ? state.tagSpecifications : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["tagsAll"] = state ? state.tagsAll : undefined;
            inputs["updateDefaultVersion"] = state ? state.updateDefaultVersion : undefined;
            inputs["userData"] = state ? state.userData : undefined;
            inputs["vpcSecurityGroupIds"] = state ? state.vpcSecurityGroupIds : undefined;
        } else {
            const args = argsOrState as LaunchTemplateArgs | undefined;
            inputs["blockDeviceMappings"] = args ? args.blockDeviceMappings : undefined;
            inputs["capacityReservationSpecification"] = args ? args.capacityReservationSpecification : undefined;
            inputs["cpuOptions"] = args ? args.cpuOptions : undefined;
            inputs["creditSpecification"] = args ? args.creditSpecification : undefined;
            inputs["defaultVersion"] = args ? args.defaultVersion : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["disableApiTermination"] = args ? args.disableApiTermination : undefined;
            inputs["ebsOptimized"] = args ? args.ebsOptimized : undefined;
            inputs["elasticGpuSpecifications"] = args ? args.elasticGpuSpecifications : undefined;
            inputs["elasticInferenceAccelerator"] = args ? args.elasticInferenceAccelerator : undefined;
            inputs["enclaveOptions"] = args ? args.enclaveOptions : undefined;
            inputs["hibernationOptions"] = args ? args.hibernationOptions : undefined;
            inputs["iamInstanceProfile"] = args ? args.iamInstanceProfile : undefined;
            inputs["imageId"] = args ? args.imageId : undefined;
            inputs["instanceInitiatedShutdownBehavior"] = args ? args.instanceInitiatedShutdownBehavior : undefined;
            inputs["instanceMarketOptions"] = args ? args.instanceMarketOptions : undefined;
            inputs["instanceType"] = args ? args.instanceType : undefined;
            inputs["kernelId"] = args ? args.kernelId : undefined;
            inputs["keyName"] = args ? args.keyName : undefined;
            inputs["licenseSpecifications"] = args ? args.licenseSpecifications : undefined;
            inputs["metadataOptions"] = args ? args.metadataOptions : undefined;
            inputs["monitoring"] = args ? args.monitoring : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["namePrefix"] = args ? args.namePrefix : undefined;
            inputs["networkInterfaces"] = args ? args.networkInterfaces : undefined;
            inputs["placement"] = args ? args.placement : undefined;
            inputs["ramDiskId"] = args ? args.ramDiskId : undefined;
            inputs["securityGroupNames"] = args ? args.securityGroupNames : undefined;
            inputs["tagSpecifications"] = args ? args.tagSpecifications : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["updateDefaultVersion"] = args ? args.updateDefaultVersion : undefined;
            inputs["userData"] = args ? args.userData : undefined;
            inputs["vpcSecurityGroupIds"] = args ? args.vpcSecurityGroupIds : undefined;
            inputs["arn"] = undefined /*out*/;
            inputs["latestVersion"] = undefined /*out*/;
            inputs["tagsAll"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(LaunchTemplate.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LaunchTemplate resources.
 */
export interface LaunchTemplateState {
    /**
     * The Amazon Resource Name (ARN) of the instance profile.
     */
    arn?: pulumi.Input<string>;
    /**
     * Specify volumes to attach to the instance besides the volumes specified by the AMI.
     * See Block Devices below for details.
     */
    blockDeviceMappings?: pulumi.Input<pulumi.Input<inputs.ec2.LaunchTemplateBlockDeviceMapping>[]>;
    /**
     * Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
     */
    capacityReservationSpecification?: pulumi.Input<inputs.ec2.LaunchTemplateCapacityReservationSpecification>;
    /**
     * The CPU options for the instance. See CPU Options below for more details.
     */
    cpuOptions?: pulumi.Input<inputs.ec2.LaunchTemplateCpuOptions>;
    /**
     * Customize the credit specification of the instance. See Credit
     * Specification below for more details.
     */
    creditSpecification?: pulumi.Input<inputs.ec2.LaunchTemplateCreditSpecification>;
    /**
     * Default Version of the launch template.
     */
    defaultVersion?: pulumi.Input<number>;
    /**
     * Description of the launch template.
     */
    description?: pulumi.Input<string>;
    /**
     * If `true`, enables [EC2 Instance
     * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
     */
    disableApiTermination?: pulumi.Input<boolean>;
    /**
     * If `true`, the launched EC2 instance will be EBS-optimized.
     */
    ebsOptimized?: pulumi.Input<string>;
    /**
     * The elastic GPU to attach to the instance. See Elastic GPU
     * below for more details.
     */
    elasticGpuSpecifications?: pulumi.Input<pulumi.Input<inputs.ec2.LaunchTemplateElasticGpuSpecification>[]>;
    /**
     * Configuration block containing an Elastic Inference Accelerator to attach to the instance. See Elastic Inference Accelerator below for more details.
     */
    elasticInferenceAccelerator?: pulumi.Input<inputs.ec2.LaunchTemplateElasticInferenceAccelerator>;
    /**
     * Enable Nitro Enclaves on launched instances. See Enclave Options below for more details.
     */
    enclaveOptions?: pulumi.Input<inputs.ec2.LaunchTemplateEnclaveOptions>;
    /**
     * The hibernation options for the instance. See Hibernation Options below for more details.
     */
    hibernationOptions?: pulumi.Input<inputs.ec2.LaunchTemplateHibernationOptions>;
    /**
     * The IAM Instance Profile to launch the instance with. See Instance Profile
     * below for more details.
     */
    iamInstanceProfile?: pulumi.Input<inputs.ec2.LaunchTemplateIamInstanceProfile>;
    /**
     * The AMI from which to launch the instance.
     */
    imageId?: pulumi.Input<string>;
    /**
     * Shutdown behavior for the instance. Can be `stop` or `terminate`.
     * (Default: `stop`).
     */
    instanceInitiatedShutdownBehavior?: pulumi.Input<string>;
    /**
     * The market (purchasing) option for the instance. See Market Options
     * below for details.
     */
    instanceMarketOptions?: pulumi.Input<inputs.ec2.LaunchTemplateInstanceMarketOptions>;
    /**
     * The type of the instance.
     */
    instanceType?: pulumi.Input<string>;
    /**
     * The kernel ID.
     */
    kernelId?: pulumi.Input<string>;
    /**
     * The key name to use for the instance.
     */
    keyName?: pulumi.Input<string>;
    /**
     * The latest version of the launch template.
     */
    latestVersion?: pulumi.Input<number>;
    /**
     * A list of license specifications to associate with. See License Specification below for more details.
     */
    licenseSpecifications?: pulumi.Input<pulumi.Input<inputs.ec2.LaunchTemplateLicenseSpecification>[]>;
    /**
     * Customize the metadata options for the instance. See Metadata Options below for more details.
     */
    metadataOptions?: pulumi.Input<inputs.ec2.LaunchTemplateMetadataOptions>;
    /**
     * The monitoring option for the instance. See Monitoring below for more details.
     */
    monitoring?: pulumi.Input<inputs.ec2.LaunchTemplateMonitoring>;
    /**
     * The name of the launch template. If you leave this blank, this provider will auto-generate a unique name.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * Customize network interfaces to be attached at instance boot time. See Network
     * Interfaces below for more details.
     */
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.ec2.LaunchTemplateNetworkInterface>[]>;
    /**
     * The placement of the instance. See Placement below for more details.
     */
    placement?: pulumi.Input<inputs.ec2.LaunchTemplatePlacement>;
    /**
     * The ID of the RAM disk.
     */
    ramDiskId?: pulumi.Input<string>;
    /**
     * A list of security group names to associate with. If you are creating Instances in a VPC, use
     * `vpcSecurityGroupIds` instead.
     */
    securityGroupNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The tags to apply to the resources during launch. See Tag Specifications below for more details.
     */
    tagSpecifications?: pulumi.Input<pulumi.Input<inputs.ec2.LaunchTemplateTagSpecification>[]>;
    /**
     * A map of tags to assign to the launch template. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whether to update Default Version each update. Conflicts with `defaultVersion`.
     */
    updateDefaultVersion?: pulumi.Input<boolean>;
    /**
     * The Base64-encoded user data to provide when launching the instance.
     */
    userData?: pulumi.Input<string>;
    /**
     * A list of security group IDs to associate with. Conflicts with `network_interfaces.security_groups`
     */
    vpcSecurityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a LaunchTemplate resource.
 */
export interface LaunchTemplateArgs {
    /**
     * Specify volumes to attach to the instance besides the volumes specified by the AMI.
     * See Block Devices below for details.
     */
    blockDeviceMappings?: pulumi.Input<pulumi.Input<inputs.ec2.LaunchTemplateBlockDeviceMapping>[]>;
    /**
     * Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
     */
    capacityReservationSpecification?: pulumi.Input<inputs.ec2.LaunchTemplateCapacityReservationSpecification>;
    /**
     * The CPU options for the instance. See CPU Options below for more details.
     */
    cpuOptions?: pulumi.Input<inputs.ec2.LaunchTemplateCpuOptions>;
    /**
     * Customize the credit specification of the instance. See Credit
     * Specification below for more details.
     */
    creditSpecification?: pulumi.Input<inputs.ec2.LaunchTemplateCreditSpecification>;
    /**
     * Default Version of the launch template.
     */
    defaultVersion?: pulumi.Input<number>;
    /**
     * Description of the launch template.
     */
    description?: pulumi.Input<string>;
    /**
     * If `true`, enables [EC2 Instance
     * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
     */
    disableApiTermination?: pulumi.Input<boolean>;
    /**
     * If `true`, the launched EC2 instance will be EBS-optimized.
     */
    ebsOptimized?: pulumi.Input<string>;
    /**
     * The elastic GPU to attach to the instance. See Elastic GPU
     * below for more details.
     */
    elasticGpuSpecifications?: pulumi.Input<pulumi.Input<inputs.ec2.LaunchTemplateElasticGpuSpecification>[]>;
    /**
     * Configuration block containing an Elastic Inference Accelerator to attach to the instance. See Elastic Inference Accelerator below for more details.
     */
    elasticInferenceAccelerator?: pulumi.Input<inputs.ec2.LaunchTemplateElasticInferenceAccelerator>;
    /**
     * Enable Nitro Enclaves on launched instances. See Enclave Options below for more details.
     */
    enclaveOptions?: pulumi.Input<inputs.ec2.LaunchTemplateEnclaveOptions>;
    /**
     * The hibernation options for the instance. See Hibernation Options below for more details.
     */
    hibernationOptions?: pulumi.Input<inputs.ec2.LaunchTemplateHibernationOptions>;
    /**
     * The IAM Instance Profile to launch the instance with. See Instance Profile
     * below for more details.
     */
    iamInstanceProfile?: pulumi.Input<inputs.ec2.LaunchTemplateIamInstanceProfile>;
    /**
     * The AMI from which to launch the instance.
     */
    imageId?: pulumi.Input<string>;
    /**
     * Shutdown behavior for the instance. Can be `stop` or `terminate`.
     * (Default: `stop`).
     */
    instanceInitiatedShutdownBehavior?: pulumi.Input<string>;
    /**
     * The market (purchasing) option for the instance. See Market Options
     * below for details.
     */
    instanceMarketOptions?: pulumi.Input<inputs.ec2.LaunchTemplateInstanceMarketOptions>;
    /**
     * The type of the instance.
     */
    instanceType?: pulumi.Input<string>;
    /**
     * The kernel ID.
     */
    kernelId?: pulumi.Input<string>;
    /**
     * The key name to use for the instance.
     */
    keyName?: pulumi.Input<string>;
    /**
     * A list of license specifications to associate with. See License Specification below for more details.
     */
    licenseSpecifications?: pulumi.Input<pulumi.Input<inputs.ec2.LaunchTemplateLicenseSpecification>[]>;
    /**
     * Customize the metadata options for the instance. See Metadata Options below for more details.
     */
    metadataOptions?: pulumi.Input<inputs.ec2.LaunchTemplateMetadataOptions>;
    /**
     * The monitoring option for the instance. See Monitoring below for more details.
     */
    monitoring?: pulumi.Input<inputs.ec2.LaunchTemplateMonitoring>;
    /**
     * The name of the launch template. If you leave this blank, this provider will auto-generate a unique name.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * Customize network interfaces to be attached at instance boot time. See Network
     * Interfaces below for more details.
     */
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.ec2.LaunchTemplateNetworkInterface>[]>;
    /**
     * The placement of the instance. See Placement below for more details.
     */
    placement?: pulumi.Input<inputs.ec2.LaunchTemplatePlacement>;
    /**
     * The ID of the RAM disk.
     */
    ramDiskId?: pulumi.Input<string>;
    /**
     * A list of security group names to associate with. If you are creating Instances in a VPC, use
     * `vpcSecurityGroupIds` instead.
     */
    securityGroupNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The tags to apply to the resources during launch. See Tag Specifications below for more details.
     */
    tagSpecifications?: pulumi.Input<pulumi.Input<inputs.ec2.LaunchTemplateTagSpecification>[]>;
    /**
     * A map of tags to assign to the launch template. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whether to update Default Version each update. Conflicts with `defaultVersion`.
     */
    updateDefaultVersion?: pulumi.Input<boolean>;
    /**
     * The Base64-encoded user data to provide when launching the instance.
     */
    userData?: pulumi.Input<string>;
    /**
     * A list of security group IDs to associate with. Conflicts with `network_interfaces.security_groups`
     */
    vpcSecurityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
}
