// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Use this data source to get the ID of an Amazon EC2 Instance for use in other resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const foo = aws.ec2.getInstance({
 *     filters: [
 *         {
 *             name: "image-id",
 *             values: ["ami-xxxxxxxx"],
 *         },
 *         {
 *             name: "tag:Name",
 *             values: ["instance-name-tag"],
 *         },
 *     ],
 *     instanceId: "i-instanceid",
 * });
 * ```
 */
export function getInstance(args?: GetInstanceArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ec2/getInstance:getInstance", {
        "filters": args.filters,
        "getPasswordData": args.getPasswordData,
        "getUserData": args.getUserData,
        "instanceId": args.instanceId,
        "instanceTags": args.instanceTags,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstance.
 */
export interface GetInstanceArgs {
    /**
     * One or more name/value pairs to use as filters. There are
     * several valid keys, for a full reference, check out
     * [describe-instances in the AWS CLI reference][1].
     */
    filters?: inputs.ec2.GetInstanceFilter[];
    /**
     * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `passwordData` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
     */
    getPasswordData?: boolean;
    /**
     * Retrieve Base64 encoded User Data contents into the `userDataBase64` attribute. A SHA-1 hash of the User Data contents will always be present in the `userData` attribute. Defaults to `false`.
     */
    getUserData?: boolean;
    /**
     * Specify the exact Instance ID with which to populate the data source.
     */
    instanceId?: string;
    /**
     * Map of tags, each pair of which must
     * exactly match a pair on the desired Instance.
     */
    instanceTags?: {[key: string]: string};
    /**
     * Map of tags assigned to the Instance.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getInstance.
 */
export interface GetInstanceResult {
    /**
     * ID of the AMI used to launch the instance.
     */
    readonly ami: string;
    /**
     * ARN of the instance.
     */
    readonly arn: string;
    /**
     * Whether or not the Instance is associated with a public IP address or not (Boolean).
     */
    readonly associatePublicIpAddress: boolean;
    /**
     * Availability zone of the Instance.
     */
    readonly availabilityZone: string;
    /**
     * Credit specification of the Instance.
     */
    readonly creditSpecifications: outputs.ec2.GetInstanceCreditSpecification[];
    /**
     * Whether or not EC2 Instance Stop Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection) is enabled (Boolean).
     */
    readonly disableApiStop: boolean;
    /**
     * Whether or not [EC2 Instance Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination) is enabled (Boolean).
     */
    readonly disableApiTermination: boolean;
    /**
     * EBS block device mappings of the Instance.
     */
    readonly ebsBlockDevices: outputs.ec2.GetInstanceEbsBlockDevice[];
    /**
     * Whether the Instance is EBS optimized or not (Boolean).
     */
    readonly ebsOptimized: boolean;
    /**
     * Enclave options of the instance.
     */
    readonly enclaveOptions: outputs.ec2.GetInstanceEnclaveOption[];
    /**
     * Ephemeral block device mappings of the Instance.
     */
    readonly ephemeralBlockDevices: outputs.ec2.GetInstanceEphemeralBlockDevice[];
    readonly filters?: outputs.ec2.GetInstanceFilter[];
    readonly getPasswordData?: boolean;
    readonly getUserData?: boolean;
    /**
     * ID of the dedicated host the instance will be assigned to.
     */
    readonly hostId: string;
    /**
     * ARN of the host resource group the instance is associated with.
     */
    readonly hostResourceGroupArn: string;
    /**
     * Name of the instance profile associated with the Instance.
     */
    readonly iamInstanceProfile: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly instanceId?: string;
    /**
     * State of the instance. One of: `pending`, `running`, `shutting-down`, `terminated`, `stopping`, `stopped`. See [Instance Lifecycle](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html) for more information.
     */
    readonly instanceState: string;
    readonly instanceTags: {[key: string]: string};
    /**
     * Type of the Instance.
     */
    readonly instanceType: string;
    /**
     * IPv6 addresses associated to the Instance, if applicable. **NOTE**: Unlike the IPv4 address, this doesn't change if you attach an EIP to the instance.
     */
    readonly ipv6Addresses: string[];
    /**
     * Key name of the Instance.
     */
    readonly keyName: string;
    /**
     * Maintenance and recovery options for the instance.
     */
    readonly maintenanceOptions: outputs.ec2.GetInstanceMaintenanceOption[];
    /**
     * Metadata options of the Instance.
     */
    readonly metadataOptions: outputs.ec2.GetInstanceMetadataOption[];
    /**
     * Whether detailed monitoring is enabled or disabled for the Instance (Boolean).
     */
    readonly monitoring: boolean;
    /**
     * ID of the network interface that was created with the Instance.
     */
    readonly networkInterfaceId: string;
    /**
     * ARN of the Outpost.
     */
    readonly outpostArn: string;
    /**
     * Base-64 encoded encrypted password data for the instance. Useful for getting the administrator password for instances running Microsoft Windows. This attribute is only exported if `getPasswordData` is true. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
     */
    readonly passwordData: string;
    /**
     * Placement group of the Instance.
     */
    readonly placementGroup: string;
    /**
     * Number of the partition the instance is in.
     */
    readonly placementPartitionNumber: number;
    /**
     * Private DNS name assigned to the Instance. Can only be used inside the Amazon EC2, and only available if you've enabled DNS hostnames for your VPC.
     */
    readonly privateDns: string;
    /**
     * Options for the instance hostname.
     */
    readonly privateDnsNameOptions: outputs.ec2.GetInstancePrivateDnsNameOption[];
    /**
     * Private IP address assigned to the Instance.
     */
    readonly privateIp: string;
    /**
     * Public DNS name assigned to the Instance. For EC2-VPC, this is only available if you've enabled DNS hostnames for your VPC.
     */
    readonly publicDns: string;
    /**
     * Public IP address assigned to the Instance, if applicable. **NOTE**: If you are using an `aws.ec2.Eip` with your instance, you should refer to the EIP's address directly and not use `publicIp`, as this field will change after the EIP is attached.
     */
    readonly publicIp: string;
    /**
     * Root block device mappings of the Instance
     */
    readonly rootBlockDevices: outputs.ec2.GetInstanceRootBlockDevice[];
    /**
     * Secondary private IPv4 addresses assigned to the instance's primary network interface (eth0) in a VPC.
     */
    readonly secondaryPrivateIps: string[];
    /**
     * Associated security groups.
     */
    readonly securityGroups: string[];
    /**
     * Whether the network interface performs source/destination checking (Boolean).
     */
    readonly sourceDestCheck: boolean;
    /**
     * VPC subnet ID.
     */
    readonly subnetId: string;
    /**
     * Map of tags assigned to the Instance.
     */
    readonly tags: {[key: string]: string};
    /**
     * Tenancy of the instance: `dedicated`, `default`, `host`.
     */
    readonly tenancy: string;
    /**
     * SHA-1 hash of User Data supplied to the Instance.
     */
    readonly userData: string;
    /**
     * Base64 encoded contents of User Data supplied to the Instance. This attribute is only exported if `getUserData` is true.
     */
    readonly userDataBase64: string;
    /**
     * Associated security groups in a non-default VPC.
     */
    readonly vpcSecurityGroupIds: string[];
}
/**
 * Use this data source to get the ID of an Amazon EC2 Instance for use in other resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const foo = aws.ec2.getInstance({
 *     filters: [
 *         {
 *             name: "image-id",
 *             values: ["ami-xxxxxxxx"],
 *         },
 *         {
 *             name: "tag:Name",
 *             values: ["instance-name-tag"],
 *         },
 *     ],
 *     instanceId: "i-instanceid",
 * });
 * ```
 */
export function getInstanceOutput(args?: GetInstanceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInstanceResult> {
    return pulumi.output(args).apply((a: any) => getInstance(a, opts))
}

/**
 * A collection of arguments for invoking getInstance.
 */
export interface GetInstanceOutputArgs {
    /**
     * One or more name/value pairs to use as filters. There are
     * several valid keys, for a full reference, check out
     * [describe-instances in the AWS CLI reference][1].
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2.GetInstanceFilterArgs>[]>;
    /**
     * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `passwordData` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
     */
    getPasswordData?: pulumi.Input<boolean>;
    /**
     * Retrieve Base64 encoded User Data contents into the `userDataBase64` attribute. A SHA-1 hash of the User Data contents will always be present in the `userData` attribute. Defaults to `false`.
     */
    getUserData?: pulumi.Input<boolean>;
    /**
     * Specify the exact Instance ID with which to populate the data source.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * Map of tags, each pair of which must
     * exactly match a pair on the desired Instance.
     */
    instanceTags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the Instance.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
