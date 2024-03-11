// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS MediaLive InputSecurityGroup.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.medialive.InputSecurityGroup("example", {
 *     whitelistRules: [{
 *         cidr: "10.0.0.8/32",
 *     }],
 *     tags: {
 *         ENVIRONMENT: "prod",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import MediaLive InputSecurityGroup using the `id`. For example:
 *
 * ```sh
 * $ pulumi import aws:medialive/inputSecurityGroup:InputSecurityGroup example 123456
 * ```
 */
export class InputSecurityGroup extends pulumi.CustomResource {
    /**
     * Get an existing InputSecurityGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InputSecurityGroupState, opts?: pulumi.CustomResourceOptions): InputSecurityGroup {
        return new InputSecurityGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:medialive/inputSecurityGroup:InputSecurityGroup';

    /**
     * Returns true if the given object is an instance of InputSecurityGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InputSecurityGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InputSecurityGroup.__pulumiType;
    }

    /**
     * ARN of the InputSecurityGroup.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The list of inputs currently using this InputSecurityGroup.
     */
    public /*out*/ readonly inputs!: pulumi.Output<string[]>;
    /**
     * A map of tags to assign to the InputSecurityGroup. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Whitelist rules. See Whitelist Rules for more details.
     *
     * The following arguments are optional:
     */
    public readonly whitelistRules!: pulumi.Output<outputs.medialive.InputSecurityGroupWhitelistRule[]>;

    /**
     * Create a InputSecurityGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InputSecurityGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InputSecurityGroupArgs | InputSecurityGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InputSecurityGroupState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["inputs"] = state ? state.inputs : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["whitelistRules"] = state ? state.whitelistRules : undefined;
        } else {
            const args = argsOrState as InputSecurityGroupArgs | undefined;
            if ((!args || args.whitelistRules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'whitelistRules'");
            }
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["whitelistRules"] = args ? args.whitelistRules : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["inputs"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InputSecurityGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InputSecurityGroup resources.
 */
export interface InputSecurityGroupState {
    /**
     * ARN of the InputSecurityGroup.
     */
    arn?: pulumi.Input<string>;
    /**
     * The list of inputs currently using this InputSecurityGroup.
     */
    inputs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A map of tags to assign to the InputSecurityGroup. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whitelist rules. See Whitelist Rules for more details.
     *
     * The following arguments are optional:
     */
    whitelistRules?: pulumi.Input<pulumi.Input<inputs.medialive.InputSecurityGroupWhitelistRule>[]>;
}

/**
 * The set of arguments for constructing a InputSecurityGroup resource.
 */
export interface InputSecurityGroupArgs {
    /**
     * A map of tags to assign to the InputSecurityGroup. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whitelist rules. See Whitelist Rules for more details.
     *
     * The following arguments are optional:
     */
    whitelistRules: pulumi.Input<pulumi.Input<inputs.medialive.InputSecurityGroupWhitelistRule>[]>;
}
