// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3.BucketReplicationConfigArgs;
import com.pulumi.aws.s3.inputs.BucketReplicationConfigState;
import com.pulumi.aws.s3.outputs.BucketReplicationConfigRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an independent configuration resource for S3 bucket [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html).
 * 
 * &gt; **NOTE:** S3 Buckets only support a single replication configuration. Declaring multiple `aws.s3.BucketReplicationConfig` resources to the same S3 Bucket will cause a perpetual difference in configuration.
 * 
 * &gt; This resource cannot be used with S3 directory buckets.
 * 
 * ## Example Usage
 * 
 * ### Using replication configuration
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.iam.Policy;
 * import com.pulumi.aws.iam.PolicyArgs;
 * import com.pulumi.aws.iam.RolePolicyAttachment;
 * import com.pulumi.aws.iam.RolePolicyAttachmentArgs;
 * import com.pulumi.aws.s3.BucketVersioningV2;
 * import com.pulumi.aws.s3.BucketVersioningV2Args;
 * import com.pulumi.aws.s3.inputs.BucketVersioningV2VersioningConfigurationArgs;
 * import com.pulumi.aws.s3.BucketAclV2;
 * import com.pulumi.aws.s3.BucketAclV2Args;
 * import com.pulumi.aws.s3.BucketReplicationConfig;
 * import com.pulumi.aws.s3.BucketReplicationConfigArgs;
 * import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs;
 * import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterArgs;
 * import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         final var assumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect("Allow")
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type("Service")
 *                     .identifiers("s3.amazonaws.com")
 *                     .build())
 *                 .actions("sts:AssumeRole")
 *                 .build())
 *             .build());
 * 
 *         var replicationRole = new Role("replicationRole", RoleArgs.builder()
 *             .name("tf-iam-role-replication-12345")
 *             .assumeRolePolicy(assumeRole.applyValue(getPolicyDocumentResult -> getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var destination = new BucketV2("destination", BucketV2Args.builder()
 *             .bucket("tf-test-bucket-destination-12345")
 *             .build());
 * 
 *         var source = new BucketV2("source", BucketV2Args.builder()
 *             .bucket("tf-test-bucket-source-12345")
 *             .build());
 * 
 *         final var replication = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(            
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .effect("Allow")
 *                     .actions(                    
 *                         "s3:GetReplicationConfiguration",
 *                         "s3:ListBucket")
 *                     .resources(source.arn())
 *                     .build(),
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .effect("Allow")
 *                     .actions(                    
 *                         "s3:GetObjectVersionForReplication",
 *                         "s3:GetObjectVersionAcl",
 *                         "s3:GetObjectVersionTagging")
 *                     .resources(source.arn().applyValue(arn -> String.format("%s/*", arn)))
 *                     .build(),
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .effect("Allow")
 *                     .actions(                    
 *                         "s3:ReplicateObject",
 *                         "s3:ReplicateDelete",
 *                         "s3:ReplicateTags")
 *                     .resources(destination.arn().applyValue(arn -> String.format("%s/*", arn)))
 *                     .build())
 *             .build());
 * 
 *         var replicationPolicy = new Policy("replicationPolicy", PolicyArgs.builder()
 *             .name("tf-iam-role-policy-replication-12345")
 *             .policy(replication.applyValue(getPolicyDocumentResult -> getPolicyDocumentResult).applyValue(replication -> replication.applyValue(getPolicyDocumentResult -> getPolicyDocumentResult.json())))
 *             .build());
 * 
 *         var replicationRolePolicyAttachment = new RolePolicyAttachment("replicationRolePolicyAttachment", RolePolicyAttachmentArgs.builder()
 *             .role(replicationRole.name())
 *             .policyArn(replicationPolicy.arn())
 *             .build());
 * 
 *         var destinationBucketVersioningV2 = new BucketVersioningV2("destinationBucketVersioningV2", BucketVersioningV2Args.builder()
 *             .bucket(destination.id())
 *             .versioningConfiguration(BucketVersioningV2VersioningConfigurationArgs.builder()
 *                 .status("Enabled")
 *                 .build())
 *             .build());
 * 
 *         var sourceBucketAcl = new BucketAclV2("sourceBucketAcl", BucketAclV2Args.builder()
 *             .bucket(source.id())
 *             .acl("private")
 *             .build());
 * 
 *         var sourceBucketVersioningV2 = new BucketVersioningV2("sourceBucketVersioningV2", BucketVersioningV2Args.builder()
 *             .bucket(source.id())
 *             .versioningConfiguration(BucketVersioningV2VersioningConfigurationArgs.builder()
 *                 .status("Enabled")
 *                 .build())
 *             .build());
 * 
 *         var replicationBucketReplicationConfig = new BucketReplicationConfig("replicationBucketReplicationConfig", BucketReplicationConfigArgs.builder()
 *             .role(replicationRole.arn())
 *             .bucket(source.id())
 *             .rules(BucketReplicationConfigRuleArgs.builder()
 *                 .id("foobar")
 *                 .filter(BucketReplicationConfigRuleFilterArgs.builder()
 *                     .prefix("foo")
 *                     .build())
 *                 .status("Enabled")
 *                 .destination(BucketReplicationConfigRuleDestinationArgs.builder()
 *                     .bucket(destination.arn())
 *                     .storageClass("STANDARD")
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(sourceBucketVersioningV2)
 *                 .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Bi-Directional Replication
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
 * import com.pulumi.aws.s3.BucketVersioningV2;
 * import com.pulumi.aws.s3.BucketVersioningV2Args;
 * import com.pulumi.aws.s3.inputs.BucketVersioningV2VersioningConfigurationArgs;
 * import com.pulumi.aws.s3.BucketReplicationConfig;
 * import com.pulumi.aws.s3.BucketReplicationConfigArgs;
 * import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs;
 * import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterArgs;
 * import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         // ... other configuration ...
 *         var east = new BucketV2("east", BucketV2Args.builder()
 *             .bucket("tf-test-bucket-east-12345")
 *             .build());
 * 
 *         var eastBucketVersioningV2 = new BucketVersioningV2("eastBucketVersioningV2", BucketVersioningV2Args.builder()
 *             .bucket(east.id())
 *             .versioningConfiguration(BucketVersioningV2VersioningConfigurationArgs.builder()
 *                 .status("Enabled")
 *                 .build())
 *             .build());
 * 
 *         var west = new BucketV2("west", BucketV2Args.builder()
 *             .bucket("tf-test-bucket-west-12345")
 *             .build());
 * 
 *         var westBucketVersioningV2 = new BucketVersioningV2("westBucketVersioningV2", BucketVersioningV2Args.builder()
 *             .bucket(west.id())
 *             .versioningConfiguration(BucketVersioningV2VersioningConfigurationArgs.builder()
 *                 .status("Enabled")
 *                 .build())
 *             .build());
 * 
 *         var eastToWest = new BucketReplicationConfig("eastToWest", BucketReplicationConfigArgs.builder()
 *             .role(eastReplication.arn())
 *             .bucket(east.id())
 *             .rules(BucketReplicationConfigRuleArgs.builder()
 *                 .id("foobar")
 *                 .filter(BucketReplicationConfigRuleFilterArgs.builder()
 *                     .prefix("foo")
 *                     .build())
 *                 .status("Enabled")
 *                 .destination(BucketReplicationConfigRuleDestinationArgs.builder()
 *                     .bucket(west.arn())
 *                     .storageClass("STANDARD")
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(eastBucketVersioningV2)
 *                 .build());
 * 
 *         var westToEast = new BucketReplicationConfig("westToEast", BucketReplicationConfigArgs.builder()
 *             .role(westReplication.arn())
 *             .bucket(west.id())
 *             .rules(BucketReplicationConfigRuleArgs.builder()
 *                 .id("foobar")
 *                 .filter(BucketReplicationConfigRuleFilterArgs.builder()
 *                     .prefix("foo")
 *                     .build())
 *                 .status("Enabled")
 *                 .destination(BucketReplicationConfigRuleDestinationArgs.builder()
 *                     .bucket(east.arn())
 *                     .storageClass("STANDARD")
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(westBucketVersioningV2)
 *                 .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import S3 bucket replication configuration using the `bucket`. For example:
 * 
 * ```sh
 * $ pulumi import aws:s3/bucketReplicationConfig:BucketReplicationConfig replication bucket-name
 * ```
 * 
 */
@ResourceType(type="aws:s3/bucketReplicationConfig:BucketReplicationConfig")
public class BucketReplicationConfig extends com.pulumi.resources.CustomResource {
    /**
     * Name of the source S3 bucket you want Amazon S3 to monitor.
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output<String> bucket;

    /**
     * @return Name of the source S3 bucket you want Amazon S3 to monitor.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * ARN of the IAM role for Amazon S3 to assume when replicating the objects.
     * 
     */
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output<String> role;

    /**
     * @return ARN of the IAM role for Amazon S3 to assume when replicating the objects.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * List of configuration blocks describing the rules managing the replication. See below.
     * 
     */
    @Export(name="rules", refs={List.class,BucketReplicationConfigRule.class}, tree="[0,1]")
    private Output<List<BucketReplicationConfigRule>> rules;

    /**
     * @return List of configuration blocks describing the rules managing the replication. See below.
     * 
     */
    public Output<List<BucketReplicationConfigRule>> rules() {
        return this.rules;
    }
    /**
     * Token to allow replication to be enabled on an Object Lock-enabled bucket. You must contact AWS support for the bucket&#39;s &#34;Object Lock token&#34;.
     * For more details, see [Using S3 Object Lock with replication](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-managing.html#object-lock-managing-replication).
     * 
     */
    @Export(name="token", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> token;

    /**
     * @return Token to allow replication to be enabled on an Object Lock-enabled bucket. You must contact AWS support for the bucket&#39;s &#34;Object Lock token&#34;.
     * For more details, see [Using S3 Object Lock with replication](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-managing.html#object-lock-managing-replication).
     * 
     */
    public Output<Optional<String>> token() {
        return Codegen.optional(this.token);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketReplicationConfig(String name) {
        this(name, BucketReplicationConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketReplicationConfig(String name, BucketReplicationConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketReplicationConfig(String name, BucketReplicationConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketReplicationConfig:BucketReplicationConfig", name, args == null ? BucketReplicationConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketReplicationConfig(String name, Output<String> id, @Nullable BucketReplicationConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketReplicationConfig:BucketReplicationConfig", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "token"
            ))
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
    public static BucketReplicationConfig get(String name, Output<String> id, @Nullable BucketReplicationConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketReplicationConfig(name, id, state, options);
    }
}
