// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing a Verified Access Instance.
 *
 * ## Example Usage
 * ### Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.verifiedaccess.Instance("example", {
 *     description: "example",
 *     tags: {
 *         Name: "example",
 *     },
 * });
 * ```
 * ### With `fipsEnabled`
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.verifiedaccess.Instance("example", {fipsEnabled: true});
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Verified Access Instances using the
 *
 * `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:verifiedaccess/instance:Instance example vai-1234567890abcdef0
 * ```
 */
export class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState, opts?: pulumi.CustomResourceOptions): Instance {
        return new Instance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:verifiedaccess/instance:Instance';

    /**
     * Returns true if the given object is an instance of Instance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Instance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Instance.__pulumiType;
    }

    /**
     * The time that the Verified Access Instance was created.
     */
    public /*out*/ readonly creationTime!: pulumi.Output<string>;
    /**
     * A description for the AWS Verified Access Instance.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Enable or disable support for Federal Information Processing Standards (FIPS) on the AWS Verified Access Instance.
     */
    public readonly fipsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The time that the Verified Access Instance was last updated.
     */
    public /*out*/ readonly lastUpdatedTime!: pulumi.Output<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * One or more blocks of providing information about the AWS Verified Access Trust Providers. See verifiedAccessTrustProviders below for details.One or more blocks
     */
    public /*out*/ readonly verifiedAccessTrustProviders!: pulumi.Output<outputs.verifiedaccess.InstanceVerifiedAccessTrustProvider[]>;

    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: InstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceArgs | InstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceState | undefined;
            resourceInputs["creationTime"] = state ? state.creationTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["fipsEnabled"] = state ? state.fipsEnabled : undefined;
            resourceInputs["lastUpdatedTime"] = state ? state.lastUpdatedTime : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["verifiedAccessTrustProviders"] = state ? state.verifiedAccessTrustProviders : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["fipsEnabled"] = args ? args.fipsEnabled : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["creationTime"] = undefined /*out*/;
            resourceInputs["lastUpdatedTime"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["verifiedAccessTrustProviders"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Instance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * The time that the Verified Access Instance was created.
     */
    creationTime?: pulumi.Input<string>;
    /**
     * A description for the AWS Verified Access Instance.
     */
    description?: pulumi.Input<string>;
    /**
     * Enable or disable support for Federal Information Processing Standards (FIPS) on the AWS Verified Access Instance.
     */
    fipsEnabled?: pulumi.Input<boolean>;
    /**
     * The time that the Verified Access Instance was last updated.
     */
    lastUpdatedTime?: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * One or more blocks of providing information about the AWS Verified Access Trust Providers. See verifiedAccessTrustProviders below for details.One or more blocks
     */
    verifiedAccessTrustProviders?: pulumi.Input<pulumi.Input<inputs.verifiedaccess.InstanceVerifiedAccessTrustProvider>[]>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * A description for the AWS Verified Access Instance.
     */
    description?: pulumi.Input<string>;
    /**
     * Enable or disable support for Federal Information Processing Standards (FIPS) on the AWS Verified Access Instance.
     */
    fipsEnabled?: pulumi.Input<boolean>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
