// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a resource to manage a GuardDuty IPSet.
 *
 * > **Note:** Currently in GuardDuty, users from member accounts cannot upload and further manage IPSets. IPSets that are uploaded by the primary account are imposed on GuardDuty functionality in its member accounts. See the [GuardDuty API Documentation](https://docs.aws.amazon.com/guardduty/latest/ug/create-ip-set.html)
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const primary = new aws.guardduty.Detector("primary", {enable: true});
 * const bucket = new aws.s3.BucketV2("bucket", {});
 * const myIPSet = new aws.s3.BucketObjectv2("MyIPSet", {
 *     content: "10.0.0.0/8\n",
 *     bucket: bucket.id,
 *     key: "MyIPSet",
 * });
 * const example = new aws.guardduty.IPSet("example", {
 *     activate: true,
 *     detectorId: primary.id,
 *     format: "TXT",
 *     location: pulumi.interpolate`https://s3.amazonaws.com/${myIPSet.bucket}/${myIPSet.key}`,
 *     name: "MyIPSet",
 * });
 * const bucketAcl = new aws.s3.BucketAclV2("bucket_acl", {
 *     bucket: bucket.id,
 *     acl: "private",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import GuardDuty IPSet using the primary GuardDuty detector ID and IPSet ID. For example:
 *
 * ```sh
 * $ pulumi import aws:guardduty/iPSet:IPSet MyIPSet 00b00fd5aecc0ab60a708659477e9617:123456789012
 * ```
 */
export class IPSet extends pulumi.CustomResource {
    /**
     * Get an existing IPSet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IPSetState, opts?: pulumi.CustomResourceOptions): IPSet {
        return new IPSet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:guardduty/iPSet:IPSet';

    /**
     * Returns true if the given object is an instance of IPSet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IPSet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IPSet.__pulumiType;
    }

    /**
     * Specifies whether GuardDuty is to start using the uploaded IPSet.
     */
    public readonly activate!: pulumi.Output<boolean>;
    /**
     * Amazon Resource Name (ARN) of the GuardDuty IPSet.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The detector ID of the GuardDuty.
     */
    public readonly detectorId!: pulumi.Output<string>;
    /**
     * The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
     */
    public readonly format!: pulumi.Output<string>;
    /**
     * The URI of the file that contains the IPSet.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The friendly name to identify the IPSet.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a IPSet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IPSetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IPSetArgs | IPSetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IPSetState | undefined;
            resourceInputs["activate"] = state ? state.activate : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["detectorId"] = state ? state.detectorId : undefined;
            resourceInputs["format"] = state ? state.format : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as IPSetArgs | undefined;
            if ((!args || args.activate === undefined) && !opts.urn) {
                throw new Error("Missing required property 'activate'");
            }
            if ((!args || args.detectorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'detectorId'");
            }
            if ((!args || args.format === undefined) && !opts.urn) {
                throw new Error("Missing required property 'format'");
            }
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            resourceInputs["activate"] = args ? args.activate : undefined;
            resourceInputs["detectorId"] = args ? args.detectorId : undefined;
            resourceInputs["format"] = args ? args.format : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IPSet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IPSet resources.
 */
export interface IPSetState {
    /**
     * Specifies whether GuardDuty is to start using the uploaded IPSet.
     */
    activate?: pulumi.Input<boolean>;
    /**
     * Amazon Resource Name (ARN) of the GuardDuty IPSet.
     */
    arn?: pulumi.Input<string>;
    /**
     * The detector ID of the GuardDuty.
     */
    detectorId?: pulumi.Input<string>;
    /**
     * The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
     */
    format?: pulumi.Input<string>;
    /**
     * The URI of the file that contains the IPSet.
     */
    location?: pulumi.Input<string>;
    /**
     * The friendly name to identify the IPSet.
     */
    name?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a IPSet resource.
 */
export interface IPSetArgs {
    /**
     * Specifies whether GuardDuty is to start using the uploaded IPSet.
     */
    activate: pulumi.Input<boolean>;
    /**
     * The detector ID of the GuardDuty.
     */
    detectorId: pulumi.Input<string>;
    /**
     * The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
     */
    format: pulumi.Input<string>;
    /**
     * The URI of the file that contains the IPSet.
     */
    location: pulumi.Input<string>;
    /**
     * The friendly name to identify the IPSet.
     */
    name?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
