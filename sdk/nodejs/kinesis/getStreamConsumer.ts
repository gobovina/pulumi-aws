// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides details about a Kinesis Stream Consumer.
 *
 * For more details, see the [Amazon Kinesis Stream Consumer Documentation](https://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-consumers.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.kinesis.getStreamConsumer({
 *     name: "example-consumer",
 *     streamArn: aws_kinesis_stream.example.arn,
 * });
 * ```
 */
export function getStreamConsumer(args: GetStreamConsumerArgs, opts?: pulumi.InvokeOptions): Promise<GetStreamConsumerResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:kinesis/getStreamConsumer:getStreamConsumer", {
        "arn": args.arn,
        "name": args.name,
        "streamArn": args.streamArn,
    }, opts);
}

/**
 * A collection of arguments for invoking getStreamConsumer.
 */
export interface GetStreamConsumerArgs {
    /**
     * ARN of the stream consumer.
     */
    arn?: string;
    /**
     * Name of the stream consumer.
     */
    name?: string;
    /**
     * ARN of the data stream the consumer is registered with.
     */
    streamArn: string;
}

/**
 * A collection of values returned by getStreamConsumer.
 */
export interface GetStreamConsumerResult {
    readonly arn: string;
    /**
     * Approximate timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of when the stream consumer was created.
     */
    readonly creationTimestamp: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * Current status of the stream consumer.
     */
    readonly status: string;
    readonly streamArn: string;
}
/**
 * Provides details about a Kinesis Stream Consumer.
 *
 * For more details, see the [Amazon Kinesis Stream Consumer Documentation](https://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-consumers.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.kinesis.getStreamConsumer({
 *     name: "example-consumer",
 *     streamArn: aws_kinesis_stream.example.arn,
 * });
 * ```
 */
export function getStreamConsumerOutput(args: GetStreamConsumerOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetStreamConsumerResult> {
    return pulumi.output(args).apply((a: any) => getStreamConsumer(a, opts))
}

/**
 * A collection of arguments for invoking getStreamConsumer.
 */
export interface GetStreamConsumerOutputArgs {
    /**
     * ARN of the stream consumer.
     */
    arn?: pulumi.Input<string>;
    /**
     * Name of the stream consumer.
     */
    name?: pulumi.Input<string>;
    /**
     * ARN of the data stream the consumer is registered with.
     */
    streamArn: pulumi.Input<string>;
}
