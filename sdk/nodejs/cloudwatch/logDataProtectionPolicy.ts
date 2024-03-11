// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a CloudWatch Log Data Protection Policy resource.
 *
 * Read more about protecting sensitive user data in the [User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html).
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.cloudwatch.LogGroup("example", {name: "example"});
 * const exampleBucketV2 = new aws.s3.BucketV2("example", {bucket: "example"});
 * const exampleLogDataProtectionPolicy = new aws.cloudwatch.LogDataProtectionPolicy("example", {
 *     logGroupName: example.name,
 *     policyDocument: pulumi.jsonStringify({
 *         name: "Example",
 *         version: "2021-06-01",
 *         statement: [
 *             {
 *                 sid: "Audit",
 *                 dataIdentifier: ["arn:aws:dataprotection::aws:data-identifier/EmailAddress"],
 *                 operation: {
 *                     audit: {
 *                         findingsDestination: {
 *                             S3: {
 *                                 bucket: exampleBucketV2.bucket,
 *                             },
 *                         },
 *                     },
 *                 },
 *             },
 *             {
 *                 sid: "Redact",
 *                 dataIdentifier: ["arn:aws:dataprotection::aws:data-identifier/EmailAddress"],
 *                 operation: {
 *                     deidentify: {
 *                         maskConfig: {},
 *                     },
 *                 },
 *             },
 *         ],
 *     }),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import this resource using the `log_group_name`. For example:
 *
 * ```sh
 * $ pulumi import aws:cloudwatch/logDataProtectionPolicy:LogDataProtectionPolicy example my-log-group
 * ```
 */
export class LogDataProtectionPolicy extends pulumi.CustomResource {
    /**
     * Get an existing LogDataProtectionPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LogDataProtectionPolicyState, opts?: pulumi.CustomResourceOptions): LogDataProtectionPolicy {
        return new LogDataProtectionPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cloudwatch/logDataProtectionPolicy:LogDataProtectionPolicy';

    /**
     * Returns true if the given object is an instance of LogDataProtectionPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LogDataProtectionPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LogDataProtectionPolicy.__pulumiType;
    }

    /**
     * The name of the log group under which the log stream is to be created.
     */
    public readonly logGroupName!: pulumi.Output<string>;
    /**
     * Specifies the data protection policy in JSON. Read more at [Data protection policy syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-start.html#mask-sensitive-log-data-policysyntax).
     */
    public readonly policyDocument!: pulumi.Output<string>;

    /**
     * Create a LogDataProtectionPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LogDataProtectionPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LogDataProtectionPolicyArgs | LogDataProtectionPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LogDataProtectionPolicyState | undefined;
            resourceInputs["logGroupName"] = state ? state.logGroupName : undefined;
            resourceInputs["policyDocument"] = state ? state.policyDocument : undefined;
        } else {
            const args = argsOrState as LogDataProtectionPolicyArgs | undefined;
            if ((!args || args.logGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'logGroupName'");
            }
            if ((!args || args.policyDocument === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyDocument'");
            }
            resourceInputs["logGroupName"] = args ? args.logGroupName : undefined;
            resourceInputs["policyDocument"] = args ? args.policyDocument : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LogDataProtectionPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LogDataProtectionPolicy resources.
 */
export interface LogDataProtectionPolicyState {
    /**
     * The name of the log group under which the log stream is to be created.
     */
    logGroupName?: pulumi.Input<string>;
    /**
     * Specifies the data protection policy in JSON. Read more at [Data protection policy syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-start.html#mask-sensitive-log-data-policysyntax).
     */
    policyDocument?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LogDataProtectionPolicy resource.
 */
export interface LogDataProtectionPolicyArgs {
    /**
     * The name of the log group under which the log stream is to be created.
     */
    logGroupName: pulumi.Input<string>;
    /**
     * Specifies the data protection policy in JSON. Read more at [Data protection policy syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-start.html#mask-sensitive-log-data-policysyntax).
     */
    policyDocument: pulumi.Input<string>;
}
