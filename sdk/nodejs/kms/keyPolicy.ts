// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Attaches a policy to a KMS Key.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kms.Key("example", {description: "example"});
 * const exampleKeyPolicy = new aws.kms.KeyPolicy("example", {
 *     keyId: example.id,
 *     policy: JSON.stringify({
 *         id: "example",
 *         statement: [{
 *             action: "kms:*",
 *             effect: "Allow",
 *             principal: {
 *                 AWS: "*",
 *             },
 *             resource: "*",
 *             sid: "Enable IAM User Permissions",
 *         }],
 *         version: "2012-10-17",
 *     }),
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import KMS Key Policies using the `key_id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:kms/keyPolicy:KeyPolicy a 1234abcd-12ab-34cd-56ef-1234567890ab
 * ```
 */
export class KeyPolicy extends pulumi.CustomResource {
    /**
     * Get an existing KeyPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KeyPolicyState, opts?: pulumi.CustomResourceOptions): KeyPolicy {
        return new KeyPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:kms/keyPolicy:KeyPolicy';

    /**
     * Returns true if the given object is an instance of KeyPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KeyPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KeyPolicy.__pulumiType;
    }

    /**
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately. If this value is set, and the resource is destroyed, a warning will be shown, and the resource will be removed from state.
     * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
     */
    public readonly bypassPolicyLockoutSafetyCheck!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the KMS Key to attach the policy.
     */
    public readonly keyId!: pulumi.Output<string>;
    /**
     * A valid policy JSON document. Although this is a key policy, not an IAM policy, an `aws.iam.getPolicyDocument`, in the form that designates a principal, can be used. For more information about building policy documents, see the AWS IAM Policy Document Guide.
     *
     * > **NOTE:** Note: All KMS keys must have a key policy. If a key policy is not specified, or this resource is destroyed, AWS gives the KMS key a [default key policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default) that gives all principals in the owning account unlimited access to all KMS operations for the key. This default key policy effectively delegates all access control to IAM policies and KMS grants.
     */
    public readonly policy!: pulumi.Output<string>;

    /**
     * Create a KeyPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KeyPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KeyPolicyArgs | KeyPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KeyPolicyState | undefined;
            resourceInputs["bypassPolicyLockoutSafetyCheck"] = state ? state.bypassPolicyLockoutSafetyCheck : undefined;
            resourceInputs["keyId"] = state ? state.keyId : undefined;
            resourceInputs["policy"] = state ? state.policy : undefined;
        } else {
            const args = argsOrState as KeyPolicyArgs | undefined;
            if ((!args || args.keyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'keyId'");
            }
            if ((!args || args.policy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policy'");
            }
            resourceInputs["bypassPolicyLockoutSafetyCheck"] = args ? args.bypassPolicyLockoutSafetyCheck : undefined;
            resourceInputs["keyId"] = args ? args.keyId : undefined;
            resourceInputs["policy"] = args ? args.policy : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(KeyPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KeyPolicy resources.
 */
export interface KeyPolicyState {
    /**
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately. If this value is set, and the resource is destroyed, a warning will be shown, and the resource will be removed from state.
     * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
     */
    bypassPolicyLockoutSafetyCheck?: pulumi.Input<boolean>;
    /**
     * The ID of the KMS Key to attach the policy.
     */
    keyId?: pulumi.Input<string>;
    /**
     * A valid policy JSON document. Although this is a key policy, not an IAM policy, an `aws.iam.getPolicyDocument`, in the form that designates a principal, can be used. For more information about building policy documents, see the AWS IAM Policy Document Guide.
     *
     * > **NOTE:** Note: All KMS keys must have a key policy. If a key policy is not specified, or this resource is destroyed, AWS gives the KMS key a [default key policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default) that gives all principals in the owning account unlimited access to all KMS operations for the key. This default key policy effectively delegates all access control to IAM policies and KMS grants.
     */
    policy?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a KeyPolicy resource.
 */
export interface KeyPolicyArgs {
    /**
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately. If this value is set, and the resource is destroyed, a warning will be shown, and the resource will be removed from state.
     * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
     */
    bypassPolicyLockoutSafetyCheck?: pulumi.Input<boolean>;
    /**
     * The ID of the KMS Key to attach the policy.
     */
    keyId: pulumi.Input<string>;
    /**
     * A valid policy JSON document. Although this is a key policy, not an IAM policy, an `aws.iam.getPolicyDocument`, in the form that designates a principal, can be used. For more information about building policy documents, see the AWS IAM Policy Document Guide.
     *
     * > **NOTE:** Note: All KMS keys must have a key policy. If a key policy is not specified, or this resource is destroyed, AWS gives the KMS key a [default key policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default) that gives all principals in the owning account unlimited access to all KMS operations for the key. This default key policy effectively delegates all access control to IAM policies and KMS grants.
     */
    policy: pulumi.Input<string>;
}
