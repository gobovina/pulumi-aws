// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3.BucketPolicyArgs;
import com.pulumi.aws.s3.inputs.BucketPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Attaches a policy to an S3 bucket resource.
 * 
 * &gt; Policies can be attached to both S3 general purpose buckets and S3 directory buckets.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.s3.BucketPolicy;
 * import com.pulumi.aws.s3.BucketPolicyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new BucketV2("example", BucketV2Args.builder()
 *             .bucket("my-tf-test-bucket")
 *             .build());
 * 
 *         final var allowAccessFromAnotherAccount = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type("AWS")
 *                     .identifiers("123456789012")
 *                     .build())
 *                 .actions(                
 *                     "s3:GetObject",
 *                     "s3:ListBucket")
 *                 .resources(                
 *                     example.arn(),
 *                     example.arn().applyValue(arn -> String.format("%s/*", arn)))
 *                 .build())
 *             .build());
 * 
 *         var allowAccessFromAnotherAccountBucketPolicy = new BucketPolicy("allowAccessFromAnotherAccountBucketPolicy", BucketPolicyArgs.builder()
 *             .bucket(example.id())
 *             .policy(allowAccessFromAnotherAccount.applyValue(getPolicyDocumentResult -> getPolicyDocumentResult).applyValue(allowAccessFromAnotherAccount -> allowAccessFromAnotherAccount.applyValue(getPolicyDocumentResult -> getPolicyDocumentResult.json())))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import S3 bucket policies using the bucket name. For example:
 * 
 * ```sh
 * $ pulumi import aws:s3/bucketPolicy:BucketPolicy allow_access_from_another_account my-tf-test-bucket
 * ```
 * 
 */
@ResourceType(type="aws:s3/bucketPolicy:BucketPolicy")
public class BucketPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Name of the bucket to which to apply the policy.
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output<String> bucket;

    /**
     * @return Name of the bucket to which to apply the policy.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * Text of the policy. Although this is a bucket policy rather than an IAM policy, the `aws.iam.getPolicyDocument` data source may be used, so long as it specifies a principal. For more information about building AWS IAM policy documents, see the AWS IAM Policy Document Guide. Note: Bucket policies are limited to 20 KB in size.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return Text of the policy. Although this is a bucket policy rather than an IAM policy, the `aws.iam.getPolicyDocument` data source may be used, so long as it specifies a principal. For more information about building AWS IAM policy documents, see the AWS IAM Policy Document Guide. Note: Bucket policies are limited to 20 KB in size.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketPolicy(String name) {
        this(name, BucketPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketPolicy(String name, BucketPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketPolicy(String name, BucketPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketPolicy:BucketPolicy", name, args == null ? BucketPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketPolicy(String name, Output<String> id, @Nullable BucketPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketPolicy:BucketPolicy", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BucketPolicy get(String name, Output<String> id, @Nullable BucketPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketPolicy(name, id, state, options);
    }
}
