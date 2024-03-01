// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an [EC2 key pair](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html) resource. A key pair is used to control login access to EC2 instances.
 *
 * Currently this resource requires an existing user-supplied key pair. This key pair's public key will be registered with AWS to allow logging-in to EC2 instances.
 *
 * When importing an existing key pair the public key material may be in any format supported by AWS. Supported formats (per the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html#how-to-generate-your-own-key-and-import-it-to-aws)) are:
 *
 * * OpenSSH public key format (the format in ~/.ssh/authorized_keys)
 * * Base64 encoded DER format
 * * SSH public key file format as specified in RFC4716
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const deployer = new aws.ec2.KeyPair("deployer", {
 *     keyName: "deployer-key",
 *     publicKey: "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQD3F6tyPEFEzV0LX3X8BsXdMsQz1x2cEikKDEY0aIj41qgxMCP/iteneqXSIFZBp5vizPvaoIR3Um9xK7PGoW8giupGn+EPuxIA4cDM4vzOqOkiMPhz5XK0whEjkVzTo4+S0puvDZuwIsdiW9mxhJc7tgBNL0cYlWSYVkz4G/fslNfRPW5mYAM49f4fhtxPb5ok4Q2Lg9dPKVHO/Bgeu5woMc7RY0p1ej6D4CKFE6lymSDJpW0YHX/wqE9+cfEauh7xZcG0q9t2ta6F6fmX0agvpFyZo8aFbXeUBr7osSCJNgvavWbM/06niWrOvYX2xwWdhXmXSrbX8ZbabVohBK41 email@example.com",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Key Pairs using the `key_name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:ec2/keyPair:KeyPair deployer deployer-key
 * ```
 *  ~> __NOTE:__ The AWS API does not include the public key in the response, so `pulumi up` will attempt to replace the key pair. There is currently no supported workaround for this limitation.
 */
export class KeyPair extends pulumi.CustomResource {
    /**
     * Get an existing KeyPair resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KeyPairState, opts?: pulumi.CustomResourceOptions): KeyPair {
        return new KeyPair(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/keyPair:KeyPair';

    /**
     * Returns true if the given object is an instance of KeyPair.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KeyPair {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KeyPair.__pulumiType;
    }

    /**
     * The key pair ARN.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     */
    public /*out*/ readonly fingerprint!: pulumi.Output<string>;
    /**
     * The name for the key pair. If neither `keyName` nor `keyNamePrefix` is provided, the provider will create a unique key name.
     */
    public readonly keyName!: pulumi.Output<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `keyName`. If neither `keyName` nor `keyNamePrefix` is provided, the provider will create a unique key name.
     */
    public readonly keyNamePrefix!: pulumi.Output<string>;
    /**
     * The key pair ID.
     */
    public /*out*/ readonly keyPairId!: pulumi.Output<string>;
    /**
     * The type of key pair.
     */
    public /*out*/ readonly keyType!: pulumi.Output<string>;
    /**
     * The public key material.
     */
    public readonly publicKey!: pulumi.Output<string>;
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
     * Create a KeyPair resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KeyPairArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KeyPairArgs | KeyPairState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KeyPairState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["fingerprint"] = state ? state.fingerprint : undefined;
            resourceInputs["keyName"] = state ? state.keyName : undefined;
            resourceInputs["keyNamePrefix"] = state ? state.keyNamePrefix : undefined;
            resourceInputs["keyPairId"] = state ? state.keyPairId : undefined;
            resourceInputs["keyType"] = state ? state.keyType : undefined;
            resourceInputs["publicKey"] = state ? state.publicKey : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as KeyPairArgs | undefined;
            if ((!args || args.publicKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'publicKey'");
            }
            resourceInputs["keyName"] = args ? args.keyName : undefined;
            resourceInputs["keyNamePrefix"] = args ? args.keyNamePrefix : undefined;
            resourceInputs["publicKey"] = args ? args.publicKey : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["fingerprint"] = undefined /*out*/;
            resourceInputs["keyPairId"] = undefined /*out*/;
            resourceInputs["keyType"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(KeyPair.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KeyPair resources.
 */
export interface KeyPairState {
    /**
     * The key pair ARN.
     */
    arn?: pulumi.Input<string>;
    /**
     * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     */
    fingerprint?: pulumi.Input<string>;
    /**
     * The name for the key pair. If neither `keyName` nor `keyNamePrefix` is provided, the provider will create a unique key name.
     */
    keyName?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `keyName`. If neither `keyName` nor `keyNamePrefix` is provided, the provider will create a unique key name.
     */
    keyNamePrefix?: pulumi.Input<string>;
    /**
     * The key pair ID.
     */
    keyPairId?: pulumi.Input<string>;
    /**
     * The type of key pair.
     */
    keyType?: pulumi.Input<string>;
    /**
     * The public key material.
     */
    publicKey?: pulumi.Input<string>;
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
 * The set of arguments for constructing a KeyPair resource.
 */
export interface KeyPairArgs {
    /**
     * The name for the key pair. If neither `keyName` nor `keyNamePrefix` is provided, the provider will create a unique key name.
     */
    keyName?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `keyName`. If neither `keyName` nor `keyNamePrefix` is provided, the provider will create a unique key name.
     */
    keyNamePrefix?: pulumi.Input<string>;
    /**
     * The public key material.
     */
    publicKey: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
