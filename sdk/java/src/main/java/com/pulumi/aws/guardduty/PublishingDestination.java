// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.guardduty.PublishingDestinationArgs;
import com.pulumi.aws.guardduty.inputs.PublishingDestinationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a GuardDuty PublishingDestination. Requires an existing GuardDuty Detector.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetCallerIdentityArgs;
 * import com.pulumi.aws.inputs.GetRegionArgs;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.guardduty.Detector;
 * import com.pulumi.aws.guardduty.DetectorArgs;
 * import com.pulumi.aws.s3.BucketAclV2;
 * import com.pulumi.aws.s3.BucketAclV2Args;
 * import com.pulumi.aws.s3.BucketPolicy;
 * import com.pulumi.aws.s3.BucketPolicyArgs;
 * import com.pulumi.aws.kms.Key;
 * import com.pulumi.aws.kms.KeyArgs;
 * import com.pulumi.aws.guardduty.PublishingDestination;
 * import com.pulumi.aws.guardduty.PublishingDestinationArgs;
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
 *         final var current = AwsFunctions.getCallerIdentity();
 * 
 *         final var currentGetRegion = AwsFunctions.getRegion();
 * 
 *         var gdBucket = new BucketV2(&#34;gdBucket&#34;, BucketV2Args.builder()        
 *             .bucket(&#34;example&#34;)
 *             .forceDestroy(true)
 *             .build());
 * 
 *         final var bucketPol = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(            
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .sid(&#34;Allow PutObject&#34;)
 *                     .actions(&#34;s3:PutObject&#34;)
 *                     .resources(gdBucket.arn().applyValue(arn -&gt; String.format(&#34;%s/*&#34;, arn)))
 *                     .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                         .type(&#34;Service&#34;)
 *                         .identifiers(&#34;guardduty.amazonaws.com&#34;)
 *                         .build())
 *                     .build(),
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .sid(&#34;Allow GetBucketLocation&#34;)
 *                     .actions(&#34;s3:GetBucketLocation&#34;)
 *                     .resources(gdBucket.arn())
 *                     .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                         .type(&#34;Service&#34;)
 *                         .identifiers(&#34;guardduty.amazonaws.com&#34;)
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *         final var kmsPol = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(            
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .sid(&#34;Allow GuardDuty to encrypt findings&#34;)
 *                     .actions(&#34;kms:GenerateDataKey&#34;)
 *                     .resources(String.format(&#34;arn:aws:kms:%s:%s:key/*&#34;, currentGetRegion.applyValue(getRegionResult -&gt; getRegionResult.name()),current.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId())))
 *                     .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                         .type(&#34;Service&#34;)
 *                         .identifiers(&#34;guardduty.amazonaws.com&#34;)
 *                         .build())
 *                     .build(),
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .sid(&#34;Allow all users to modify/delete key (test only)&#34;)
 *                     .actions(&#34;kms:*&#34;)
 *                     .resources(String.format(&#34;arn:aws:kms:%s:%s:key/*&#34;, currentGetRegion.applyValue(getRegionResult -&gt; getRegionResult.name()),current.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId())))
 *                     .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                         .type(&#34;AWS&#34;)
 *                         .identifiers(String.format(&#34;arn:aws:iam::%s:root&#34;, current.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId())))
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *         var testGd = new Detector(&#34;testGd&#34;, DetectorArgs.builder()        
 *             .enable(true)
 *             .build());
 * 
 *         var gdBucketAcl = new BucketAclV2(&#34;gdBucketAcl&#34;, BucketAclV2Args.builder()        
 *             .bucket(gdBucket.id())
 *             .acl(&#34;private&#34;)
 *             .build());
 * 
 *         var gdBucketPolicy = new BucketPolicy(&#34;gdBucketPolicy&#34;, BucketPolicyArgs.builder()        
 *             .bucket(gdBucket.id())
 *             .policy(bucketPol.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult).applyValue(bucketPol -&gt; bucketPol.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json())))
 *             .build());
 * 
 *         var gdKey = new Key(&#34;gdKey&#34;, KeyArgs.builder()        
 *             .description(&#34;Temporary key for AccTest of TF&#34;)
 *             .deletionWindowInDays(7)
 *             .policy(kmsPol.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var test = new PublishingDestination(&#34;test&#34;, PublishingDestinationArgs.builder()        
 *             .detectorId(testGd.id())
 *             .destinationArn(gdBucket.arn())
 *             .kmsKeyArn(gdKey.arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &gt; **Note:** Please do not use this simple example for Bucket-Policy and KMS Key Policy in a production environment. It is much too open for such a use-case. Refer to the AWS documentation here: https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_exportfindings.html
 * 
 * ## Import
 * 
 * Using `pulumi import`, import GuardDuty PublishingDestination using the master GuardDuty detector ID and PublishingDestinationID. For example:
 * 
 * ```sh
 * $ pulumi import aws:guardduty/publishingDestination:PublishingDestination test a4b86f26fa42e7e7cf0d1c333ea77777:a4b86f27a0e464e4a7e0516d242f1234
 * ```
 * 
 */
@ResourceType(type="aws:guardduty/publishingDestination:PublishingDestination")
public class PublishingDestination extends com.pulumi.resources.CustomResource {
    /**
     * The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
     * 
     */
    @Export(name="destinationArn", refs={String.class}, tree="[0]")
    private Output<String> destinationArn;

    /**
     * @return The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
     * 
     */
    public Output<String> destinationArn() {
        return this.destinationArn;
    }
    /**
     * Currently there is only &#34;S3&#34; available as destination type which is also the default value
     * 
     * &gt; **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the &#34;DescribePublishingDestination&#34; call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
     * 
     */
    @Export(name="destinationType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> destinationType;

    /**
     * @return Currently there is only &#34;S3&#34; available as destination type which is also the default value
     * 
     * &gt; **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the &#34;DescribePublishingDestination&#34; call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
     * 
     */
    public Output<Optional<String>> destinationType() {
        return Codegen.optional(this.destinationType);
    }
    /**
     * The detector ID of the GuardDuty.
     * 
     */
    @Export(name="detectorId", refs={String.class}, tree="[0]")
    private Output<String> detectorId;

    /**
     * @return The detector ID of the GuardDuty.
     * 
     */
    public Output<String> detectorId() {
        return this.detectorId;
    }
    /**
     * The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
     * 
     */
    @Export(name="kmsKeyArn", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyArn;

    /**
     * @return The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
     * 
     */
    public Output<String> kmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PublishingDestination(String name) {
        this(name, PublishingDestinationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PublishingDestination(String name, PublishingDestinationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PublishingDestination(String name, PublishingDestinationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/publishingDestination:PublishingDestination", name, args == null ? PublishingDestinationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PublishingDestination(String name, Output<String> id, @Nullable PublishingDestinationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/publishingDestination:PublishingDestination", name, state, makeResourceOptions(options, id));
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
    public static PublishingDestination get(String name, Output<String> id, @Nullable PublishingDestinationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PublishingDestination(name, id, state, options);
    }
}
