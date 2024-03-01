// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS KMS (Key Management) Custom Key Store.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * const test = new aws.kms.CustomKeyStore("test", {
 *     cloudHsmClusterId: cloudHsmClusterId,
 *     customKeyStoreName: "kms-custom-key-store-test",
 *     keyStorePassword: "noplaintextpasswords1",
 *     trustAnchorCertificate: std.file({
 *         input: "anchor-certificate.crt",
 *     }).then(invoke => invoke.result),
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import KMS (Key Management) Custom Key Store using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:kms/customKeyStore:CustomKeyStore example cks-5ebd4ef395a96288e
 * ```
 */
export class CustomKeyStore extends pulumi.CustomResource {
    /**
     * Get an existing CustomKeyStore resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomKeyStoreState, opts?: pulumi.CustomResourceOptions): CustomKeyStore {
        return new CustomKeyStore(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:kms/customKeyStore:CustomKeyStore';

    /**
     * Returns true if the given object is an instance of CustomKeyStore.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomKeyStore {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomKeyStore.__pulumiType;
    }

    /**
     * Cluster ID of CloudHSM.
     */
    public readonly cloudHsmClusterId!: pulumi.Output<string>;
    /**
     * Unique name for Custom Key Store.
     */
    public readonly customKeyStoreName!: pulumi.Output<string>;
    /**
     * Password for `kmsuser` on CloudHSM.
     */
    public readonly keyStorePassword!: pulumi.Output<string>;
    /**
     * Customer certificate used for signing on CloudHSM.
     */
    public readonly trustAnchorCertificate!: pulumi.Output<string>;

    /**
     * Create a CustomKeyStore resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomKeyStoreArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomKeyStoreArgs | CustomKeyStoreState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomKeyStoreState | undefined;
            resourceInputs["cloudHsmClusterId"] = state ? state.cloudHsmClusterId : undefined;
            resourceInputs["customKeyStoreName"] = state ? state.customKeyStoreName : undefined;
            resourceInputs["keyStorePassword"] = state ? state.keyStorePassword : undefined;
            resourceInputs["trustAnchorCertificate"] = state ? state.trustAnchorCertificate : undefined;
        } else {
            const args = argsOrState as CustomKeyStoreArgs | undefined;
            if ((!args || args.cloudHsmClusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cloudHsmClusterId'");
            }
            if ((!args || args.customKeyStoreName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'customKeyStoreName'");
            }
            if ((!args || args.keyStorePassword === undefined) && !opts.urn) {
                throw new Error("Missing required property 'keyStorePassword'");
            }
            if ((!args || args.trustAnchorCertificate === undefined) && !opts.urn) {
                throw new Error("Missing required property 'trustAnchorCertificate'");
            }
            resourceInputs["cloudHsmClusterId"] = args ? args.cloudHsmClusterId : undefined;
            resourceInputs["customKeyStoreName"] = args ? args.customKeyStoreName : undefined;
            resourceInputs["keyStorePassword"] = args ? args.keyStorePassword : undefined;
            resourceInputs["trustAnchorCertificate"] = args ? args.trustAnchorCertificate : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CustomKeyStore.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomKeyStore resources.
 */
export interface CustomKeyStoreState {
    /**
     * Cluster ID of CloudHSM.
     */
    cloudHsmClusterId?: pulumi.Input<string>;
    /**
     * Unique name for Custom Key Store.
     */
    customKeyStoreName?: pulumi.Input<string>;
    /**
     * Password for `kmsuser` on CloudHSM.
     */
    keyStorePassword?: pulumi.Input<string>;
    /**
     * Customer certificate used for signing on CloudHSM.
     */
    trustAnchorCertificate?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CustomKeyStore resource.
 */
export interface CustomKeyStoreArgs {
    /**
     * Cluster ID of CloudHSM.
     */
    cloudHsmClusterId: pulumi.Input<string>;
    /**
     * Unique name for Custom Key Store.
     */
    customKeyStoreName: pulumi.Input<string>;
    /**
     * Password for `kmsuser` on CloudHSM.
     */
    keyStorePassword: pulumi.Input<string>;
    /**
     * Customer certificate used for signing on CloudHSM.
     */
    trustAnchorCertificate: pulumi.Input<string>;
}
