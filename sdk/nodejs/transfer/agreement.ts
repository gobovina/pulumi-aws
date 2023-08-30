// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a AWS Transfer AS2 Agreement resource.
 *
 * ## Example Usage
 * ### Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.transfer.Agreement("example", {
 *     accessRole: aws_iam_role.test.arn,
 *     baseDirectory: "/DOC-EXAMPLE-BUCKET/home/mydirectory",
 *     description: "example",
 *     localProfileId: aws_transfer_profile.local.profile_id,
 *     partnerProfileId: aws_transfer_profile.partner.profile_id,
 *     serverId: aws_transfer_server.test.id,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Transfer AS2 Agreement using the `server_id/agreement_id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:transfer/agreement:Agreement example s-4221a88afd5f4362a/a-4221a88afd5f4362a
 * ```
 */
export class Agreement extends pulumi.CustomResource {
    /**
     * Get an existing Agreement resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AgreementState, opts?: pulumi.CustomResourceOptions): Agreement {
        return new Agreement(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:transfer/agreement:Agreement';

    /**
     * Returns true if the given object is an instance of Agreement.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Agreement {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Agreement.__pulumiType;
    }

    /**
     * The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
     */
    public readonly accessRole!: pulumi.Output<string>;
    /**
     * The unique identifier for the AS2 agreement
     */
    public /*out*/ readonly agreementId!: pulumi.Output<string>;
    /**
     * The landing directory for the files transferred by using the AS2 protocol.
     */
    public readonly baseDirectory!: pulumi.Output<string>;
    /**
     * The Optional description of the transdfer.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The unique identifier for the AS2 local profile.
     */
    public readonly localProfileId!: pulumi.Output<string>;
    /**
     * The unique identifier for the AS2 partner profile.
     */
    public readonly partnerProfileId!: pulumi.Output<string>;
    /**
     * The unique server identifier for the server instance. This is the specific server the agreement uses.
     */
    public readonly serverId!: pulumi.Output<string>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Agreement resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AgreementArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AgreementArgs | AgreementState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AgreementState | undefined;
            resourceInputs["accessRole"] = state ? state.accessRole : undefined;
            resourceInputs["agreementId"] = state ? state.agreementId : undefined;
            resourceInputs["baseDirectory"] = state ? state.baseDirectory : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["localProfileId"] = state ? state.localProfileId : undefined;
            resourceInputs["partnerProfileId"] = state ? state.partnerProfileId : undefined;
            resourceInputs["serverId"] = state ? state.serverId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as AgreementArgs | undefined;
            if ((!args || args.accessRole === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessRole'");
            }
            if ((!args || args.baseDirectory === undefined) && !opts.urn) {
                throw new Error("Missing required property 'baseDirectory'");
            }
            if ((!args || args.localProfileId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'localProfileId'");
            }
            if ((!args || args.partnerProfileId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'partnerProfileId'");
            }
            if ((!args || args.serverId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverId'");
            }
            resourceInputs["accessRole"] = args ? args.accessRole : undefined;
            resourceInputs["baseDirectory"] = args ? args.baseDirectory : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["localProfileId"] = args ? args.localProfileId : undefined;
            resourceInputs["partnerProfileId"] = args ? args.partnerProfileId : undefined;
            resourceInputs["serverId"] = args ? args.serverId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["agreementId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Agreement.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Agreement resources.
 */
export interface AgreementState {
    /**
     * The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
     */
    accessRole?: pulumi.Input<string>;
    /**
     * The unique identifier for the AS2 agreement
     */
    agreementId?: pulumi.Input<string>;
    /**
     * The landing directory for the files transferred by using the AS2 protocol.
     */
    baseDirectory?: pulumi.Input<string>;
    /**
     * The Optional description of the transdfer.
     */
    description?: pulumi.Input<string>;
    /**
     * The unique identifier for the AS2 local profile.
     */
    localProfileId?: pulumi.Input<string>;
    /**
     * The unique identifier for the AS2 partner profile.
     */
    partnerProfileId?: pulumi.Input<string>;
    /**
     * The unique server identifier for the server instance. This is the specific server the agreement uses.
     */
    serverId?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Agreement resource.
 */
export interface AgreementArgs {
    /**
     * The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
     */
    accessRole: pulumi.Input<string>;
    /**
     * The landing directory for the files transferred by using the AS2 protocol.
     */
    baseDirectory: pulumi.Input<string>;
    /**
     * The Optional description of the transdfer.
     */
    description?: pulumi.Input<string>;
    /**
     * The unique identifier for the AS2 local profile.
     */
    localProfileId: pulumi.Input<string>;
    /**
     * The unique identifier for the AS2 partner profile.
     */
    partnerProfileId: pulumi.Input<string>;
    /**
     * The unique server identifier for the server instance. This is the specific server the agreement uses.
     */
    serverId: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
