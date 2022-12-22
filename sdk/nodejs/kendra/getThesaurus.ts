// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides details about a specific Amazon Kendra Thesaurus.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.kendra.getThesaurus({
 *     indexId: "12345678-1234-1234-1234-123456789123",
 *     thesaurusId: "87654321-1234-4321-4321-321987654321",
 * });
 * ```
 */
export function getThesaurus(args: GetThesaurusArgs, opts?: pulumi.InvokeOptions): Promise<GetThesaurusResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:kendra/getThesaurus:getThesaurus", {
        "indexId": args.indexId,
        "tags": args.tags,
        "thesaurusId": args.thesaurusId,
    }, opts);
}

/**
 * A collection of arguments for invoking getThesaurus.
 */
export interface GetThesaurusArgs {
    /**
     * Identifier of the index that contains the Thesaurus.
     */
    indexId: string;
    /**
     * Metadata that helps organize the Thesaurus you create.
     */
    tags?: {[key: string]: string};
    /**
     * Identifier of the Thesaurus.
     */
    thesaurusId: string;
}

/**
 * A collection of values returned by getThesaurus.
 */
export interface GetThesaurusResult {
    /**
     * ARN of the Thesaurus.
     */
    readonly arn: string;
    /**
     * Unix datetime that the Thesaurus was created.
     */
    readonly createdAt: string;
    /**
     * Description of the Thesaurus.
     */
    readonly description: string;
    /**
     * When the `status` field value is `FAILED`, this contains a message that explains why.
     */
    readonly errorMessage: string;
    /**
     * Size of the Thesaurus file in bytes.
     */
    readonly fileSizeBytes: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly indexId: string;
    /**
     * Name of the Thesaurus.
     */
    readonly name: string;
    /**
     * ARN of a role with permission to access the S3 bucket that contains the Thesaurus. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
     */
    readonly roleArn: string;
    /**
     * S3 location of the Thesaurus input data. Detailed below.
     */
    readonly sourceS3Paths: outputs.kendra.GetThesaurusSourceS3Path[];
    /**
     * Status of the Thesaurus. It is ready to use when the status is `ACTIVE`.
     */
    readonly status: string;
    /**
     * Number of synonym rules in the Thesaurus file.
     */
    readonly synonymRuleCount: number;
    /**
     * Metadata that helps organize the Thesaurus you create.
     */
    readonly tags: {[key: string]: string};
    /**
     * Number of unique terms in the Thesaurus file. For example, the synonyms `a,b,c` and `a=>d`, the term count would be 4.
     */
    readonly termCount: number;
    readonly thesaurusId: string;
    /**
     * Date and time that the Thesaurus was last updated.
     */
    readonly updatedAt: string;
}
/**
 * Provides details about a specific Amazon Kendra Thesaurus.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.kendra.getThesaurus({
 *     indexId: "12345678-1234-1234-1234-123456789123",
 *     thesaurusId: "87654321-1234-4321-4321-321987654321",
 * });
 * ```
 */
export function getThesaurusOutput(args: GetThesaurusOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetThesaurusResult> {
    return pulumi.output(args).apply((a: any) => getThesaurus(a, opts))
}

/**
 * A collection of arguments for invoking getThesaurus.
 */
export interface GetThesaurusOutputArgs {
    /**
     * Identifier of the index that contains the Thesaurus.
     */
    indexId: pulumi.Input<string>;
    /**
     * Metadata that helps organize the Thesaurus you create.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Identifier of the Thesaurus.
     */
    thesaurusId: pulumi.Input<string>;
}
