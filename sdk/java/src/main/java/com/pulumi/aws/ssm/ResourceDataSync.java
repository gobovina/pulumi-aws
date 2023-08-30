// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssm.ResourceDataSyncArgs;
import com.pulumi.aws.ssm.inputs.ResourceDataSyncState;
import com.pulumi.aws.ssm.outputs.ResourceDataSyncS3Destination;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a SSM resource data sync.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.s3.BucketPolicy;
 * import com.pulumi.aws.s3.BucketPolicyArgs;
 * import com.pulumi.aws.ssm.ResourceDataSync;
 * import com.pulumi.aws.ssm.ResourceDataSyncArgs;
 * import com.pulumi.aws.ssm.inputs.ResourceDataSyncS3DestinationArgs;
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
 *         var hogeBucketV2 = new BucketV2(&#34;hogeBucketV2&#34;);
 * 
 *         final var hogePolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(            
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .sid(&#34;SSMBucketPermissionsCheck&#34;)
 *                     .effect(&#34;Allow&#34;)
 *                     .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                         .type(&#34;Service&#34;)
 *                         .identifiers(&#34;ssm.amazonaws.com&#34;)
 *                         .build())
 *                     .actions(&#34;s3:GetBucketAcl&#34;)
 *                     .resources(&#34;arn:aws:s3:::tf-test-bucket-1234&#34;)
 *                     .build(),
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .sid(&#34;SSMBucketDelivery&#34;)
 *                     .effect(&#34;Allow&#34;)
 *                     .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                         .type(&#34;Service&#34;)
 *                         .identifiers(&#34;ssm.amazonaws.com&#34;)
 *                         .build())
 *                     .actions(&#34;s3:PutObject&#34;)
 *                     .resources(&#34;arn:aws:s3:::tf-test-bucket-1234/*&#34;)
 *                     .conditions(GetPolicyDocumentStatementConditionArgs.builder()
 *                         .test(&#34;StringEquals&#34;)
 *                         .variable(&#34;s3:x-amz-acl&#34;)
 *                         .values(&#34;bucket-owner-full-control&#34;)
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *         var hogeBucketPolicy = new BucketPolicy(&#34;hogeBucketPolicy&#34;, BucketPolicyArgs.builder()        
 *             .bucket(hogeBucketV2.id())
 *             .policy(hogePolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var foo = new ResourceDataSync(&#34;foo&#34;, ResourceDataSyncArgs.builder()        
 *             .s3Destination(ResourceDataSyncS3DestinationArgs.builder()
 *                 .bucketName(hogeBucketV2.bucket())
 *                 .region(hogeBucketV2.region())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SSM resource data sync using the `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ssm/resourceDataSync:ResourceDataSync example example-name
 * ```
 * 
 */
@ResourceType(type="aws:ssm/resourceDataSync:ResourceDataSync")
public class ResourceDataSync extends com.pulumi.resources.CustomResource {
    /**
     * Name for the configuration.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name for the configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Amazon S3 configuration details for the sync.
     * 
     */
    @Export(name="s3Destination", refs={ResourceDataSyncS3Destination.class}, tree="[0]")
    private Output<ResourceDataSyncS3Destination> s3Destination;

    /**
     * @return Amazon S3 configuration details for the sync.
     * 
     */
    public Output<ResourceDataSyncS3Destination> s3Destination() {
        return this.s3Destination;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceDataSync(String name) {
        this(name, ResourceDataSyncArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceDataSync(String name, ResourceDataSyncArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceDataSync(String name, ResourceDataSyncArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/resourceDataSync:ResourceDataSync", name, args == null ? ResourceDataSyncArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceDataSync(String name, Output<String> id, @Nullable ResourceDataSyncState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/resourceDataSync:ResourceDataSync", name, state, makeResourceOptions(options, id));
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
    public static ResourceDataSync get(String name, Output<String> id, @Nullable ResourceDataSyncState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceDataSync(name, id, state, options);
    }
}
