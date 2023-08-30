// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a CloudWatch Logs destination policy resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const testDestination = new aws.cloudwatch.LogDestination("testDestination", {
 *     roleArn: aws_iam_role.iam_for_cloudwatch.arn,
 *     targetArn: aws_kinesis_stream.kinesis_for_cloudwatch.arn,
 * });
 * const testDestinationPolicyPolicyDocument = aws.iam.getPolicyDocumentOutput({
 *     statements: [{
 *         effect: "Allow",
 *         principals: [{
 *             type: "AWS",
 *             identifiers: ["123456789012"],
 *         }],
 *         actions: ["logs:PutSubscriptionFilter"],
 *         resources: [testDestination.arn],
 *     }],
 * });
 * const testDestinationPolicyLogDestinationPolicy = new aws.cloudwatch.LogDestinationPolicy("testDestinationPolicyLogDestinationPolicy", {
 *     destinationName: testDestination.name,
 *     accessPolicy: testDestinationPolicyPolicyDocument.apply(testDestinationPolicyPolicyDocument => testDestinationPolicyPolicyDocument.json),
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import CloudWatch Logs destination policies using the `destination_name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:cloudwatch/logDestinationPolicy:LogDestinationPolicy test_destination_policy test_destination
 * ```
 */
export class LogDestinationPolicy extends pulumi.CustomResource {
    /**
     * Get an existing LogDestinationPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LogDestinationPolicyState, opts?: pulumi.CustomResourceOptions): LogDestinationPolicy {
        return new LogDestinationPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cloudwatch/logDestinationPolicy:LogDestinationPolicy';

    /**
     * Returns true if the given object is an instance of LogDestinationPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LogDestinationPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LogDestinationPolicy.__pulumiType;
    }

    /**
     * The policy document. This is a JSON formatted string.
     */
    public readonly accessPolicy!: pulumi.Output<string>;
    /**
     * A name for the subscription filter
     */
    public readonly destinationName!: pulumi.Output<string>;
    /**
     * Specify true if you are updating an existing destination policy to grant permission to an organization ID instead of granting permission to individual AWS accounts.
     */
    public readonly forceUpdate!: pulumi.Output<boolean | undefined>;

    /**
     * Create a LogDestinationPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LogDestinationPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LogDestinationPolicyArgs | LogDestinationPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LogDestinationPolicyState | undefined;
            resourceInputs["accessPolicy"] = state ? state.accessPolicy : undefined;
            resourceInputs["destinationName"] = state ? state.destinationName : undefined;
            resourceInputs["forceUpdate"] = state ? state.forceUpdate : undefined;
        } else {
            const args = argsOrState as LogDestinationPolicyArgs | undefined;
            if ((!args || args.accessPolicy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessPolicy'");
            }
            if ((!args || args.destinationName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destinationName'");
            }
            resourceInputs["accessPolicy"] = args ? args.accessPolicy : undefined;
            resourceInputs["destinationName"] = args ? args.destinationName : undefined;
            resourceInputs["forceUpdate"] = args ? args.forceUpdate : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LogDestinationPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LogDestinationPolicy resources.
 */
export interface LogDestinationPolicyState {
    /**
     * The policy document. This is a JSON formatted string.
     */
    accessPolicy?: pulumi.Input<string>;
    /**
     * A name for the subscription filter
     */
    destinationName?: pulumi.Input<string>;
    /**
     * Specify true if you are updating an existing destination policy to grant permission to an organization ID instead of granting permission to individual AWS accounts.
     */
    forceUpdate?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a LogDestinationPolicy resource.
 */
export interface LogDestinationPolicyArgs {
    /**
     * The policy document. This is a JSON formatted string.
     */
    accessPolicy: pulumi.Input<string>;
    /**
     * A name for the subscription filter
     */
    destinationName: pulumi.Input<string>;
    /**
     * Specify true if you are updating an existing destination policy to grant permission to an organization ID instead of granting permission to individual AWS accounts.
     */
    forceUpdate?: pulumi.Input<boolean>;
}
