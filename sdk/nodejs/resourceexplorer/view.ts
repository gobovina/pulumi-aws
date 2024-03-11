// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a resource to manage a Resource Explorer view.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.resourceexplorer.Index("example", {type: "LOCAL"});
 * const exampleView = new aws.resourceexplorer.View("example", {
 *     name: "exampleview",
 *     filters: {
 *         filterString: "resourcetype:ec2:instance",
 *     },
 *     includedProperties: [{
 *         name: "tags",
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Resource Explorer views using the `arn`. For example:
 *
 * ```sh
 * $ pulumi import aws:resourceexplorer/view:View example arn:aws:resource-explorer-2:us-west-2:123456789012:view/exampleview/e0914f6c-6c27-4b47-b5d4-6b28381a2421
 * ```
 */
export class View extends pulumi.CustomResource {
    /**
     * Get an existing View resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ViewState, opts?: pulumi.CustomResourceOptions): View {
        return new View(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:resourceexplorer/view:View';

    /**
     * Returns true if the given object is an instance of View.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is View {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === View.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) of the Resource Explorer view.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Specifies whether the view is the [_default view_](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-views-about.html#manage-views-about-default) for the AWS Region. Default: `false`.
     */
    public readonly defaultView!: pulumi.Output<boolean>;
    /**
     * Specifies which resources are included in the results of queries made using this view. See Filters below for more details.
     */
    public readonly filters!: pulumi.Output<outputs.resourceexplorer.ViewFilters | undefined>;
    /**
     * Optional fields to be included in search results from this view. See Included Properties below for more details.
     */
    public readonly includedProperties!: pulumi.Output<outputs.resourceexplorer.ViewIncludedProperty[] | undefined>;
    /**
     * The name of the view. The name must be no more than 64 characters long, and can include letters, digits, and the dash (-) character. The name must be unique within its AWS Region.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a View resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ViewArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ViewArgs | ViewState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ViewState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["defaultView"] = state ? state.defaultView : undefined;
            resourceInputs["filters"] = state ? state.filters : undefined;
            resourceInputs["includedProperties"] = state ? state.includedProperties : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ViewArgs | undefined;
            resourceInputs["defaultView"] = args ? args.defaultView : undefined;
            resourceInputs["filters"] = args ? args.filters : undefined;
            resourceInputs["includedProperties"] = args ? args.includedProperties : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(View.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering View resources.
 */
export interface ViewState {
    /**
     * Amazon Resource Name (ARN) of the Resource Explorer view.
     */
    arn?: pulumi.Input<string>;
    /**
     * Specifies whether the view is the [_default view_](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-views-about.html#manage-views-about-default) for the AWS Region. Default: `false`.
     */
    defaultView?: pulumi.Input<boolean>;
    /**
     * Specifies which resources are included in the results of queries made using this view. See Filters below for more details.
     */
    filters?: pulumi.Input<inputs.resourceexplorer.ViewFilters>;
    /**
     * Optional fields to be included in search results from this view. See Included Properties below for more details.
     */
    includedProperties?: pulumi.Input<pulumi.Input<inputs.resourceexplorer.ViewIncludedProperty>[]>;
    /**
     * The name of the view. The name must be no more than 64 characters long, and can include letters, digits, and the dash (-) character. The name must be unique within its AWS Region.
     */
    name?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
 * The set of arguments for constructing a View resource.
 */
export interface ViewArgs {
    /**
     * Specifies whether the view is the [_default view_](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-views-about.html#manage-views-about-default) for the AWS Region. Default: `false`.
     */
    defaultView?: pulumi.Input<boolean>;
    /**
     * Specifies which resources are included in the results of queries made using this view. See Filters below for more details.
     */
    filters?: pulumi.Input<inputs.resourceexplorer.ViewFilters>;
    /**
     * Optional fields to be included in search results from this view. See Included Properties below for more details.
     */
    includedProperties?: pulumi.Input<pulumi.Input<inputs.resourceexplorer.ViewIncludedProperty>[]>;
    /**
     * The name of the view. The name must be no more than 64 characters long, and can include letters, digits, and the dash (-) character. The name must be unique within its AWS Region.
     */
    name?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
