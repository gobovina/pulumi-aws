// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing an Amazon File Cache cache.
 * See the [Create File Cache](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CreateFileCache.html) for more information.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.fsx.FileCache("example", {
 *     dataRepositoryAssociations: [{
 *         dataRepositoryPath: "nfs://filer.domain.com",
 *         dataRepositorySubdirectories: [
 *             "test",
 *             "test2",
 *         ],
 *         fileCachePath: "/ns1",
 *         nfs: [{
 *             dnsIps: [
 *                 "192.168.0.1",
 *                 "192.168.0.2",
 *             ],
 *             version: "NFS3",
 *         }],
 *     }],
 *     fileCacheType: "LUSTRE",
 *     fileCacheTypeVersion: "2.12",
 *     lustreConfigurations: [{
 *         deploymentType: "CACHE_1",
 *         metadataConfigurations: [{
 *             storageCapacity: 2400,
 *         }],
 *         perUnitStorageThroughput: 1000,
 *         weeklyMaintenanceStartTime: "2:05:00",
 *     }],
 *     subnetIds: [test1.id],
 *     storageCapacity: 1200,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Amazon File Cache cache using the resource `id`. For example:
 *
 * ```sh
 * $ pulumi import aws:fsx/fileCache:FileCache example fc-8012925589
 * ```
 */
export class FileCache extends pulumi.CustomResource {
    /**
     * Get an existing FileCache resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FileCacheState, opts?: pulumi.CustomResourceOptions): FileCache {
        return new FileCache(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:fsx/fileCache:FileCache';

    /**
     * Returns true if the given object is an instance of FileCache.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FileCache {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FileCache.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) for the resource.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value defaults to false.
     */
    public readonly copyTagsToDataRepositoryAssociations!: pulumi.Output<boolean | undefined>;
    /**
     * A list of IDs of data repository associations that are associated with this cache.
     */
    public /*out*/ readonly dataRepositoryAssociationIds!: pulumi.Output<string[]>;
    /**
     * See the `dataRepositoryAssociation` configuration block. Max of 8.
     * A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements: 1) All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can't link to different data repository types at the same time. 2) An NFS DRA must link to an NFS file system that supports the NFSv3 protocol. DRA automatic import and automatic export is not supported.
     */
    public readonly dataRepositoryAssociations!: pulumi.Output<outputs.fsx.FileCacheDataRepositoryAssociation[] | undefined>;
    /**
     * The Domain Name System (DNS) name for the cache.
     */
    public /*out*/ readonly dnsName!: pulumi.Output<string>;
    /**
     * The system-generated, unique ID of the cache.
     */
    public /*out*/ readonly fileCacheId!: pulumi.Output<string>;
    /**
     * The type of cache that you're creating. The only supported value is `LUSTRE`.
     */
    public readonly fileCacheType!: pulumi.Output<string>;
    /**
     * The version for the type of cache that you're creating. The only supported value is `2.12`.
     */
    public readonly fileCacheTypeVersion!: pulumi.Output<string>;
    /**
     * Specifies the ID of the AWS Key Management Service (AWS KMS) key to use for encrypting data on an Amazon File Cache. If a KmsKeyId isn't specified, the Amazon FSx-managed AWS KMS key for your account is used.
     */
    public readonly kmsKeyId!: pulumi.Output<string>;
    /**
     * See the `lustreConfiguration` block. Required when `fileCacheType` is `LUSTRE`.
     */
    public readonly lustreConfigurations!: pulumi.Output<outputs.fsx.FileCacheLustreConfiguration[] | undefined>;
    /**
     * A list of network interface IDs.
     */
    public /*out*/ readonly networkInterfaceIds!: pulumi.Output<string[]>;
    public /*out*/ readonly ownerId!: pulumi.Output<string>;
    /**
     * A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache access.
     */
    public readonly securityGroupIds!: pulumi.Output<string[] | undefined>;
    /**
     * The storage capacity of the cache in gibibytes (GiB). Valid values are `1200` GiB, `2400` GiB, and increments of `2400` GiB.
     */
    public readonly storageCapacity!: pulumi.Output<number>;
    /**
     * A list of subnet IDs that the cache will be accessible from. You can specify only one subnet ID.
     *
     * The following arguments are optional:
     */
    public readonly subnetIds!: pulumi.Output<string[]>;
    /**
     * A map of tags to assign to the file cache. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The ID of your virtual private cloud (VPC).
     */
    public /*out*/ readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a FileCache resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FileCacheArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FileCacheArgs | FileCacheState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FileCacheState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["copyTagsToDataRepositoryAssociations"] = state ? state.copyTagsToDataRepositoryAssociations : undefined;
            resourceInputs["dataRepositoryAssociationIds"] = state ? state.dataRepositoryAssociationIds : undefined;
            resourceInputs["dataRepositoryAssociations"] = state ? state.dataRepositoryAssociations : undefined;
            resourceInputs["dnsName"] = state ? state.dnsName : undefined;
            resourceInputs["fileCacheId"] = state ? state.fileCacheId : undefined;
            resourceInputs["fileCacheType"] = state ? state.fileCacheType : undefined;
            resourceInputs["fileCacheTypeVersion"] = state ? state.fileCacheTypeVersion : undefined;
            resourceInputs["kmsKeyId"] = state ? state.kmsKeyId : undefined;
            resourceInputs["lustreConfigurations"] = state ? state.lustreConfigurations : undefined;
            resourceInputs["networkInterfaceIds"] = state ? state.networkInterfaceIds : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["securityGroupIds"] = state ? state.securityGroupIds : undefined;
            resourceInputs["storageCapacity"] = state ? state.storageCapacity : undefined;
            resourceInputs["subnetIds"] = state ? state.subnetIds : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as FileCacheArgs | undefined;
            if ((!args || args.fileCacheType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fileCacheType'");
            }
            if ((!args || args.fileCacheTypeVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fileCacheTypeVersion'");
            }
            if ((!args || args.storageCapacity === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageCapacity'");
            }
            if ((!args || args.subnetIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetIds'");
            }
            resourceInputs["copyTagsToDataRepositoryAssociations"] = args ? args.copyTagsToDataRepositoryAssociations : undefined;
            resourceInputs["dataRepositoryAssociations"] = args ? args.dataRepositoryAssociations : undefined;
            resourceInputs["fileCacheType"] = args ? args.fileCacheType : undefined;
            resourceInputs["fileCacheTypeVersion"] = args ? args.fileCacheTypeVersion : undefined;
            resourceInputs["kmsKeyId"] = args ? args.kmsKeyId : undefined;
            resourceInputs["lustreConfigurations"] = args ? args.lustreConfigurations : undefined;
            resourceInputs["securityGroupIds"] = args ? args.securityGroupIds : undefined;
            resourceInputs["storageCapacity"] = args ? args.storageCapacity : undefined;
            resourceInputs["subnetIds"] = args ? args.subnetIds : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["dataRepositoryAssociationIds"] = undefined /*out*/;
            resourceInputs["dnsName"] = undefined /*out*/;
            resourceInputs["fileCacheId"] = undefined /*out*/;
            resourceInputs["networkInterfaceIds"] = undefined /*out*/;
            resourceInputs["ownerId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["vpcId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FileCache.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FileCache resources.
 */
export interface FileCacheState {
    /**
     * The Amazon Resource Name (ARN) for the resource.
     */
    arn?: pulumi.Input<string>;
    /**
     * A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value defaults to false.
     */
    copyTagsToDataRepositoryAssociations?: pulumi.Input<boolean>;
    /**
     * A list of IDs of data repository associations that are associated with this cache.
     */
    dataRepositoryAssociationIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * See the `dataRepositoryAssociation` configuration block. Max of 8.
     * A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements: 1) All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can't link to different data repository types at the same time. 2) An NFS DRA must link to an NFS file system that supports the NFSv3 protocol. DRA automatic import and automatic export is not supported.
     */
    dataRepositoryAssociations?: pulumi.Input<pulumi.Input<inputs.fsx.FileCacheDataRepositoryAssociation>[]>;
    /**
     * The Domain Name System (DNS) name for the cache.
     */
    dnsName?: pulumi.Input<string>;
    /**
     * The system-generated, unique ID of the cache.
     */
    fileCacheId?: pulumi.Input<string>;
    /**
     * The type of cache that you're creating. The only supported value is `LUSTRE`.
     */
    fileCacheType?: pulumi.Input<string>;
    /**
     * The version for the type of cache that you're creating. The only supported value is `2.12`.
     */
    fileCacheTypeVersion?: pulumi.Input<string>;
    /**
     * Specifies the ID of the AWS Key Management Service (AWS KMS) key to use for encrypting data on an Amazon File Cache. If a KmsKeyId isn't specified, the Amazon FSx-managed AWS KMS key for your account is used.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * See the `lustreConfiguration` block. Required when `fileCacheType` is `LUSTRE`.
     */
    lustreConfigurations?: pulumi.Input<pulumi.Input<inputs.fsx.FileCacheLustreConfiguration>[]>;
    /**
     * A list of network interface IDs.
     */
    networkInterfaceIds?: pulumi.Input<pulumi.Input<string>[]>;
    ownerId?: pulumi.Input<string>;
    /**
     * A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache access.
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The storage capacity of the cache in gibibytes (GiB). Valid values are `1200` GiB, `2400` GiB, and increments of `2400` GiB.
     */
    storageCapacity?: pulumi.Input<number>;
    /**
     * A list of subnet IDs that the cache will be accessible from. You can specify only one subnet ID.
     *
     * The following arguments are optional:
     */
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A map of tags to assign to the file cache. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of your virtual private cloud (VPC).
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FileCache resource.
 */
export interface FileCacheArgs {
    /**
     * A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value defaults to false.
     */
    copyTagsToDataRepositoryAssociations?: pulumi.Input<boolean>;
    /**
     * See the `dataRepositoryAssociation` configuration block. Max of 8.
     * A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements: 1) All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can't link to different data repository types at the same time. 2) An NFS DRA must link to an NFS file system that supports the NFSv3 protocol. DRA automatic import and automatic export is not supported.
     */
    dataRepositoryAssociations?: pulumi.Input<pulumi.Input<inputs.fsx.FileCacheDataRepositoryAssociation>[]>;
    /**
     * The type of cache that you're creating. The only supported value is `LUSTRE`.
     */
    fileCacheType: pulumi.Input<string>;
    /**
     * The version for the type of cache that you're creating. The only supported value is `2.12`.
     */
    fileCacheTypeVersion: pulumi.Input<string>;
    /**
     * Specifies the ID of the AWS Key Management Service (AWS KMS) key to use for encrypting data on an Amazon File Cache. If a KmsKeyId isn't specified, the Amazon FSx-managed AWS KMS key for your account is used.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * See the `lustreConfiguration` block. Required when `fileCacheType` is `LUSTRE`.
     */
    lustreConfigurations?: pulumi.Input<pulumi.Input<inputs.fsx.FileCacheLustreConfiguration>[]>;
    /**
     * A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache access.
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The storage capacity of the cache in gibibytes (GiB). Valid values are `1200` GiB, `2400` GiB, and increments of `2400` GiB.
     */
    storageCapacity: pulumi.Input<number>;
    /**
     * A list of subnet IDs that the cache will be accessible from. You can specify only one subnet ID.
     *
     * The following arguments are optional:
     */
    subnetIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A map of tags to assign to the file cache. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
