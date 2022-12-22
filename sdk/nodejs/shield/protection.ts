// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Enables AWS Shield Advanced for a specific AWS resource.
 * The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route 53 hosted zone.
 *
 * ## Example Usage
 * ### Create protection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const available = aws.getAvailabilityZones({});
 * const currentRegion = aws.getRegion({});
 * const currentCallerIdentity = aws.getCallerIdentity({});
 * const exampleEip = new aws.ec2.Eip("exampleEip", {vpc: true});
 * const exampleProtection = new aws.shield.Protection("exampleProtection", {
 *     resourceArn: pulumi.all([currentRegion, currentCallerIdentity, exampleEip.id]).apply(([currentRegion, currentCallerIdentity, id]) => `arn:aws:ec2:${currentRegion.name}:${currentCallerIdentity.accountId}:eip-allocation/${id}`),
 *     tags: {
 *         Environment: "Dev",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Shield protection resources can be imported by specifying their ID e.g.,
 *
 * ```sh
 *  $ pulumi import aws:shield/protection:Protection example ff9592dc-22f3-4e88-afa1-7b29fde9669a
 * ```
 */
export class Protection extends pulumi.CustomResource {
    /**
     * Get an existing Protection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProtectionState, opts?: pulumi.CustomResourceOptions): Protection {
        return new Protection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:shield/protection:Protection';

    /**
     * Returns true if the given object is an instance of Protection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Protection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Protection.__pulumiType;
    }

    /**
     * The ARN of the Protection.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A friendly name for the Protection you are creating.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ARN (Amazon Resource Name) of the resource to be protected.
     */
    public readonly resourceArn!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Protection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProtectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProtectionArgs | ProtectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProtectionState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceArn"] = state ? state.resourceArn : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ProtectionArgs | undefined;
            if ((!args || args.resourceArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceArn'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceArn"] = args ? args.resourceArn : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Protection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Protection resources.
 */
export interface ProtectionState {
    /**
     * The ARN of the Protection.
     */
    arn?: pulumi.Input<string>;
    /**
     * A friendly name for the Protection you are creating.
     */
    name?: pulumi.Input<string>;
    /**
     * The ARN (Amazon Resource Name) of the resource to be protected.
     */
    resourceArn?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Protection resource.
 */
export interface ProtectionArgs {
    /**
     * A friendly name for the Protection you are creating.
     */
    name?: pulumi.Input<string>;
    /**
     * The ARN (Amazon Resource Name) of the resource to be protected.
     */
    resourceArn: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
