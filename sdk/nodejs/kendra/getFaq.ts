// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides details about a specific Amazon Kendra Faq.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.kendra.getFaq({
 *     faqId: "87654321-1234-4321-4321-321987654321",
 *     indexId: "12345678-1234-1234-1234-123456789123",
 * });
 * ```
 */
export function getFaq(args: GetFaqArgs, opts?: pulumi.InvokeOptions): Promise<GetFaqResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:kendra/getFaq:getFaq", {
        "faqId": args.faqId,
        "indexId": args.indexId,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getFaq.
 */
export interface GetFaqArgs {
    /**
     * Identifier of the FAQ.
     */
    faqId: string;
    /**
     * Identifier of the index that contains the FAQ.
     */
    indexId: string;
    /**
     * Metadata that helps organize the FAQs you create.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getFaq.
 */
export interface GetFaqResult {
    /**
     * ARN of the FAQ.
     */
    readonly arn: string;
    /**
     * Unix datetime that the faq was created.
     */
    readonly createdAt: string;
    /**
     * Description of the FAQ.
     */
    readonly description: string;
    /**
     * When the `status` field value is `FAILED`, this contains a message that explains why.
     */
    readonly errorMessage: string;
    readonly faqId: string;
    /**
     * File format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
     */
    readonly fileFormat: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly indexId: string;
    /**
     * Code for a language. This shows a supported language for the FAQ document. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
     */
    readonly languageCode: string;
    /**
     * Name of the FAQ.
     */
    readonly name: string;
    /**
     * ARN of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
     */
    readonly roleArn: string;
    /**
     * S3 location of the FAQ input data. Detailed below.
     */
    readonly s3Paths: outputs.kendra.GetFaqS3Path[];
    /**
     * Status of the FAQ. It is ready to use when the status is ACTIVE.
     */
    readonly status: string;
    /**
     * Metadata that helps organize the FAQs you create.
     */
    readonly tags: {[key: string]: string};
    /**
     * Date and time that the FAQ was last updated.
     */
    readonly updatedAt: string;
}
/**
 * Provides details about a specific Amazon Kendra Faq.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.kendra.getFaq({
 *     faqId: "87654321-1234-4321-4321-321987654321",
 *     indexId: "12345678-1234-1234-1234-123456789123",
 * });
 * ```
 */
export function getFaqOutput(args: GetFaqOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFaqResult> {
    return pulumi.output(args).apply((a: any) => getFaq(a, opts))
}

/**
 * A collection of arguments for invoking getFaq.
 */
export interface GetFaqOutputArgs {
    /**
     * Identifier of the FAQ.
     */
    faqId: pulumi.Input<string>;
    /**
     * Identifier of the index that contains the FAQ.
     */
    indexId: pulumi.Input<string>;
    /**
     * Metadata that helps organize the FAQs you create.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
