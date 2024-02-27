// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a resource to manage an S3 Access Grants location.
 * A location is an S3 resource (bucket or prefix) in a permission grant that the grantee can access.
 * The S3 data must be in the same Region as your S3 Access Grants instance.
 * When you register a location, you must include the IAM role that has permission to manage the S3 location that you are registering.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleAccessGrantsInstance = new aws.s3control.AccessGrantsInstance("exampleAccessGrantsInstance", {});
 * const exampleAccessGrantsLocation = new aws.s3control.AccessGrantsLocation("exampleAccessGrantsLocation", {
 *     iamRoleArn: aws_iam_role.example.arn,
 *     locationScope: "s3://",
 * }, {
 *     dependsOn: [exampleAccessGrantsInstance],
 * });
 * // Default scope.
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import S3 Access Grants locations using the `account_id` and `access_grants_location_id`, separated by a comma (`,`). For example:
 *
 * ```sh
 *  $ pulumi import aws:s3control/accessGrantsLocation:AccessGrantsLocation example 123456789012,default
 * ```
 */
export class AccessGrantsLocation extends pulumi.CustomResource {
    /**
     * Get an existing AccessGrantsLocation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessGrantsLocationState, opts?: pulumi.CustomResourceOptions): AccessGrantsLocation {
        return new AccessGrantsLocation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:s3control/accessGrantsLocation:AccessGrantsLocation';

    /**
     * Returns true if the given object is an instance of AccessGrantsLocation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessGrantsLocation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessGrantsLocation.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) of the S3 Access Grants location.
     */
    public /*out*/ readonly accessGrantsLocationArn!: pulumi.Output<string>;
    /**
     * Unique ID of the S3 Access Grants location.
     */
    public /*out*/ readonly accessGrantsLocationId!: pulumi.Output<string>;
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The ARN of the IAM role that S3 Access Grants should use when fulfilling runtime access
     * requests to the location.
     */
    public readonly iamRoleArn!: pulumi.Output<string>;
    /**
     * The default S3 URI `s3://` or the URI to a custom location, a specific bucket or prefix.
     */
    public readonly locationScope!: pulumi.Output<string>;
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
     * Create a AccessGrantsLocation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessGrantsLocationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessGrantsLocationArgs | AccessGrantsLocationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessGrantsLocationState | undefined;
            resourceInputs["accessGrantsLocationArn"] = state ? state.accessGrantsLocationArn : undefined;
            resourceInputs["accessGrantsLocationId"] = state ? state.accessGrantsLocationId : undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["iamRoleArn"] = state ? state.iamRoleArn : undefined;
            resourceInputs["locationScope"] = state ? state.locationScope : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as AccessGrantsLocationArgs | undefined;
            if ((!args || args.iamRoleArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'iamRoleArn'");
            }
            if ((!args || args.locationScope === undefined) && !opts.urn) {
                throw new Error("Missing required property 'locationScope'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["iamRoleArn"] = args ? args.iamRoleArn : undefined;
            resourceInputs["locationScope"] = args ? args.locationScope : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["accessGrantsLocationArn"] = undefined /*out*/;
            resourceInputs["accessGrantsLocationId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessGrantsLocation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessGrantsLocation resources.
 */
export interface AccessGrantsLocationState {
    /**
     * Amazon Resource Name (ARN) of the S3 Access Grants location.
     */
    accessGrantsLocationArn?: pulumi.Input<string>;
    /**
     * Unique ID of the S3 Access Grants location.
     */
    accessGrantsLocationId?: pulumi.Input<string>;
    accountId?: pulumi.Input<string>;
    /**
     * The ARN of the IAM role that S3 Access Grants should use when fulfilling runtime access
     * requests to the location.
     */
    iamRoleArn?: pulumi.Input<string>;
    /**
     * The default S3 URI `s3://` or the URI to a custom location, a specific bucket or prefix.
     */
    locationScope?: pulumi.Input<string>;
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
 * The set of arguments for constructing a AccessGrantsLocation resource.
 */
export interface AccessGrantsLocationArgs {
    accountId?: pulumi.Input<string>;
    /**
     * The ARN of the IAM role that S3 Access Grants should use when fulfilling runtime access
     * requests to the location.
     */
    iamRoleArn: pulumi.Input<string>;
    /**
     * The default S3 URI `s3://` or the URI to a custom location, a specific bucket or prefix.
     */
    locationScope: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
