// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for managing a Verified Access Instance Trust Provider Attachment.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.verifiedaccess.Instance("example", {});
 * const exampleTrustProvider = new aws.verifiedaccess.TrustProvider("example", {
 *     deviceTrustProviderType: "jamf",
 *     policyReferenceName: "example",
 *     trustProviderType: "device",
 *     deviceOptions: {
 *         tenantId: "example",
 *     },
 * });
 * const exampleInstanceTrustProviderAttachment = new aws.verifiedaccess.InstanceTrustProviderAttachment("example", {
 *     verifiedaccessInstanceId: example.id,
 *     verifiedaccessTrustProviderId: exampleTrustProvider.id,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Verified Access Instance Trust Provider Attachments using the `verifiedaccess_instance_id` and `verifiedaccess_trust_provider_id` separated by a forward slash (`/`). For example:
 *
 * ```sh
 *  $ pulumi import aws:verifiedaccess/instanceTrustProviderAttachment:InstanceTrustProviderAttachment example vai-1234567890abcdef0/vatp-8012925589
 * ```
 */
export class InstanceTrustProviderAttachment extends pulumi.CustomResource {
    /**
     * Get an existing InstanceTrustProviderAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceTrustProviderAttachmentState, opts?: pulumi.CustomResourceOptions): InstanceTrustProviderAttachment {
        return new InstanceTrustProviderAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:verifiedaccess/instanceTrustProviderAttachment:InstanceTrustProviderAttachment';

    /**
     * Returns true if the given object is an instance of InstanceTrustProviderAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InstanceTrustProviderAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InstanceTrustProviderAttachment.__pulumiType;
    }

    /**
     * The ID of the Verified Access instance to attach the Trust Provider to.
     */
    public readonly verifiedaccessInstanceId!: pulumi.Output<string>;
    /**
     * The ID of the Verified Access trust provider.
     */
    public readonly verifiedaccessTrustProviderId!: pulumi.Output<string>;

    /**
     * Create a InstanceTrustProviderAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceTrustProviderAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceTrustProviderAttachmentArgs | InstanceTrustProviderAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceTrustProviderAttachmentState | undefined;
            resourceInputs["verifiedaccessInstanceId"] = state ? state.verifiedaccessInstanceId : undefined;
            resourceInputs["verifiedaccessTrustProviderId"] = state ? state.verifiedaccessTrustProviderId : undefined;
        } else {
            const args = argsOrState as InstanceTrustProviderAttachmentArgs | undefined;
            if ((!args || args.verifiedaccessInstanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'verifiedaccessInstanceId'");
            }
            if ((!args || args.verifiedaccessTrustProviderId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'verifiedaccessTrustProviderId'");
            }
            resourceInputs["verifiedaccessInstanceId"] = args ? args.verifiedaccessInstanceId : undefined;
            resourceInputs["verifiedaccessTrustProviderId"] = args ? args.verifiedaccessTrustProviderId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InstanceTrustProviderAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InstanceTrustProviderAttachment resources.
 */
export interface InstanceTrustProviderAttachmentState {
    /**
     * The ID of the Verified Access instance to attach the Trust Provider to.
     */
    verifiedaccessInstanceId?: pulumi.Input<string>;
    /**
     * The ID of the Verified Access trust provider.
     */
    verifiedaccessTrustProviderId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InstanceTrustProviderAttachment resource.
 */
export interface InstanceTrustProviderAttachmentArgs {
    /**
     * The ID of the Verified Access instance to attach the Trust Provider to.
     */
    verifiedaccessInstanceId: pulumi.Input<string>;
    /**
     * The ID of the Verified Access trust provider.
     */
    verifiedaccessTrustProviderId: pulumi.Input<string>;
}
