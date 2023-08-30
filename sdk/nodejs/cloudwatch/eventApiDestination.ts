// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an EventBridge event API Destination resource.
 *
 * > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.cloudwatch.EventApiDestination("test", {
 *     description: "An API Destination",
 *     invocationEndpoint: "https://api.destination.com/endpoint",
 *     httpMethod: "POST",
 *     invocationRateLimitPerSecond: 20,
 *     connectionArn: aws_cloudwatch_event_connection.test.arn,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import EventBridge API Destinations using the `name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:cloudwatch/eventApiDestination:EventApiDestination test api-destination
 * ```
 */
export class EventApiDestination extends pulumi.CustomResource {
    /**
     * Get an existing EventApiDestination resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EventApiDestinationState, opts?: pulumi.CustomResourceOptions): EventApiDestination {
        return new EventApiDestination(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cloudwatch/eventApiDestination:EventApiDestination';

    /**
     * Returns true if the given object is an instance of EventApiDestination.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EventApiDestination {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EventApiDestination.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the event API Destination.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * ARN of the EventBridge Connection to use for the API Destination.
     */
    public readonly connectionArn!: pulumi.Output<string>;
    /**
     * The description of the new API Destination. Maximum of 512 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Select the HTTP method used for the invocation endpoint, such as GET, POST, PUT, etc.
     */
    public readonly httpMethod!: pulumi.Output<string>;
    /**
     * URL endpoint to invoke as a target. This could be a valid endpoint generated by a partner service. You can include "*" as path parameters wildcards to be set from the Target HttpParameters.
     */
    public readonly invocationEndpoint!: pulumi.Output<string>;
    /**
     * Enter the maximum number of invocations per second to allow for this destination. Enter a value greater than 0 (default 300).
     */
    public readonly invocationRateLimitPerSecond!: pulumi.Output<number | undefined>;
    /**
     * The name of the new API Destination. The name must be unique for your account. Maximum of 64 characters consisting of numbers, lower/upper case letters, .,-,_.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a EventApiDestination resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EventApiDestinationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EventApiDestinationArgs | EventApiDestinationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EventApiDestinationState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["connectionArn"] = state ? state.connectionArn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["httpMethod"] = state ? state.httpMethod : undefined;
            resourceInputs["invocationEndpoint"] = state ? state.invocationEndpoint : undefined;
            resourceInputs["invocationRateLimitPerSecond"] = state ? state.invocationRateLimitPerSecond : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as EventApiDestinationArgs | undefined;
            if ((!args || args.connectionArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionArn'");
            }
            if ((!args || args.httpMethod === undefined) && !opts.urn) {
                throw new Error("Missing required property 'httpMethod'");
            }
            if ((!args || args.invocationEndpoint === undefined) && !opts.urn) {
                throw new Error("Missing required property 'invocationEndpoint'");
            }
            resourceInputs["connectionArn"] = args ? args.connectionArn : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["httpMethod"] = args ? args.httpMethod : undefined;
            resourceInputs["invocationEndpoint"] = args ? args.invocationEndpoint : undefined;
            resourceInputs["invocationRateLimitPerSecond"] = args ? args.invocationRateLimitPerSecond : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["arn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EventApiDestination.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EventApiDestination resources.
 */
export interface EventApiDestinationState {
    /**
     * The Amazon Resource Name (ARN) of the event API Destination.
     */
    arn?: pulumi.Input<string>;
    /**
     * ARN of the EventBridge Connection to use for the API Destination.
     */
    connectionArn?: pulumi.Input<string>;
    /**
     * The description of the new API Destination. Maximum of 512 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * Select the HTTP method used for the invocation endpoint, such as GET, POST, PUT, etc.
     */
    httpMethod?: pulumi.Input<string>;
    /**
     * URL endpoint to invoke as a target. This could be a valid endpoint generated by a partner service. You can include "*" as path parameters wildcards to be set from the Target HttpParameters.
     */
    invocationEndpoint?: pulumi.Input<string>;
    /**
     * Enter the maximum number of invocations per second to allow for this destination. Enter a value greater than 0 (default 300).
     */
    invocationRateLimitPerSecond?: pulumi.Input<number>;
    /**
     * The name of the new API Destination. The name must be unique for your account. Maximum of 64 characters consisting of numbers, lower/upper case letters, .,-,_.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EventApiDestination resource.
 */
export interface EventApiDestinationArgs {
    /**
     * ARN of the EventBridge Connection to use for the API Destination.
     */
    connectionArn: pulumi.Input<string>;
    /**
     * The description of the new API Destination. Maximum of 512 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * Select the HTTP method used for the invocation endpoint, such as GET, POST, PUT, etc.
     */
    httpMethod: pulumi.Input<string>;
    /**
     * URL endpoint to invoke as a target. This could be a valid endpoint generated by a partner service. You can include "*" as path parameters wildcards to be set from the Target HttpParameters.
     */
    invocationEndpoint: pulumi.Input<string>;
    /**
     * Enter the maximum number of invocations per second to allow for this destination. Enter a value greater than 0 (default 300).
     */
    invocationRateLimitPerSecond?: pulumi.Input<number>;
    /**
     * The name of the new API Destination. The name must be unique for your account. Maximum of 64 characters consisting of numbers, lower/upper case letters, .,-,_.
     */
    name?: pulumi.Input<string>;
}
