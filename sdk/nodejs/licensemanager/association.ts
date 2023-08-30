// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a License Manager association.
 *
 * > **Note:** License configurations can also be associated with launch templates by specifying the `licenseSpecifications` block for an `aws.ec2.LaunchTemplate`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleAmi = aws.ec2.getAmi({
 *     mostRecent: true,
 *     owners: ["amazon"],
 *     filters: [{
 *         name: "name",
 *         values: ["amzn-ami-vpc-nat*"],
 *     }],
 * });
 * const exampleInstance = new aws.ec2.Instance("exampleInstance", {
 *     ami: exampleAmi.then(exampleAmi => exampleAmi.id),
 *     instanceType: "t2.micro",
 * });
 * const exampleLicenseConfiguration = new aws.licensemanager.LicenseConfiguration("exampleLicenseConfiguration", {licenseCountingType: "Instance"});
 * const exampleAssociation = new aws.licensemanager.Association("exampleAssociation", {
 *     licenseConfigurationArn: exampleLicenseConfiguration.arn,
 *     resourceArn: exampleInstance.arn,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import license configurations using `resource_arn,license_configuration_arn`. For example:
 *
 * ```sh
 *  $ pulumi import aws:licensemanager/association:Association example arn:aws:ec2:eu-west-1:123456789012:image/ami-123456789abcdef01,arn:aws:license-manager:eu-west-1:123456789012:license-configuration:lic-0123456789abcdef0123456789abcdef
 * ```
 */
export class Association extends pulumi.CustomResource {
    /**
     * Get an existing Association resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AssociationState, opts?: pulumi.CustomResourceOptions): Association {
        return new Association(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:licensemanager/association:Association';

    /**
     * Returns true if the given object is an instance of Association.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Association {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Association.__pulumiType;
    }

    /**
     * ARN of the license configuration.
     */
    public readonly licenseConfigurationArn!: pulumi.Output<string>;
    /**
     * ARN of the resource associated with the license configuration.
     */
    public readonly resourceArn!: pulumi.Output<string>;

    /**
     * Create a Association resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AssociationArgs | AssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AssociationState | undefined;
            resourceInputs["licenseConfigurationArn"] = state ? state.licenseConfigurationArn : undefined;
            resourceInputs["resourceArn"] = state ? state.resourceArn : undefined;
        } else {
            const args = argsOrState as AssociationArgs | undefined;
            if ((!args || args.licenseConfigurationArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'licenseConfigurationArn'");
            }
            if ((!args || args.resourceArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceArn'");
            }
            resourceInputs["licenseConfigurationArn"] = args ? args.licenseConfigurationArn : undefined;
            resourceInputs["resourceArn"] = args ? args.resourceArn : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Association.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Association resources.
 */
export interface AssociationState {
    /**
     * ARN of the license configuration.
     */
    licenseConfigurationArn?: pulumi.Input<string>;
    /**
     * ARN of the resource associated with the license configuration.
     */
    resourceArn?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Association resource.
 */
export interface AssociationArgs {
    /**
     * ARN of the license configuration.
     */
    licenseConfigurationArn: pulumi.Input<string>;
    /**
     * ARN of the resource associated with the license configuration.
     */
    resourceArn: pulumi.Input<string>;
}
