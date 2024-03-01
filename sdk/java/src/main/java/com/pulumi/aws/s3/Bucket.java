// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3.BucketArgs;
import com.pulumi.aws.s3.inputs.BucketState;
import com.pulumi.aws.s3.outputs.BucketCorsRule;
import com.pulumi.aws.s3.outputs.BucketGrant;
import com.pulumi.aws.s3.outputs.BucketLifecycleRule;
import com.pulumi.aws.s3.outputs.BucketLogging;
import com.pulumi.aws.s3.outputs.BucketObjectLockConfiguration;
import com.pulumi.aws.s3.outputs.BucketReplicationConfiguration;
import com.pulumi.aws.s3.outputs.BucketServerSideEncryptionConfiguration;
import com.pulumi.aws.s3.outputs.BucketVersioning;
import com.pulumi.aws.s3.outputs.BucketWebsite;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a S3 bucket resource.
 * 
 * &gt; This functionality is for managing S3 in an AWS Partition. To manage [S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/dev/S3onOutposts.html), see the `aws.s3control.Bucket` resource.
 * 
 * &gt; **NOTE:** This resource might not work well if using an alternative s3-compatible provider. Please use `aws.s3.BucketV2` instead.
 * 
 * ## Example Usage
 * ### Private Bucket w/ Tags
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.Bucket;
 * import com.pulumi.aws.s3.BucketArgs;
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
 *         var b = new Bucket(&#34;b&#34;, BucketArgs.builder()        
 *             .bucket(&#34;my-tf-test-bucket&#34;)
 *             .acl(&#34;private&#34;)
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Name&#34;, &#34;My bucket&#34;),
 *                 Map.entry(&#34;Environment&#34;, &#34;Dev&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Static Website Hosting
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.Bucket;
 * import com.pulumi.aws.s3.BucketArgs;
 * import com.pulumi.aws.s3.inputs.BucketWebsiteArgs;
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
 *         var b = new Bucket(&#34;b&#34;, BucketArgs.builder()        
 *             .bucket(&#34;s3-website-test.mydomain.com&#34;)
 *             .acl(&#34;public-read&#34;)
 *             .policy(StdFunctions.file(FileArgs.builder()
 *                 .input(&#34;policy.json&#34;)
 *                 .build()).result())
 *             .website(BucketWebsiteArgs.builder()
 *                 .indexDocument(&#34;index.html&#34;)
 *                 .errorDocument(&#34;error.html&#34;)
 *                 .routingRules(&#34;&#34;&#34;
 * [{
 *     &#34;Condition&#34;: {
 *         &#34;KeyPrefixEquals&#34;: &#34;docs/&#34;
 *     },
 *     &#34;Redirect&#34;: {
 *         &#34;ReplaceKeyPrefixWith&#34;: &#34;documents/&#34;
 *     }
 * }]
 *                 &#34;&#34;&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Using CORS
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.Bucket;
 * import com.pulumi.aws.s3.BucketArgs;
 * import com.pulumi.aws.s3.inputs.BucketCorsRuleArgs;
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
 *         var b = new Bucket(&#34;b&#34;, BucketArgs.builder()        
 *             .bucket(&#34;s3-website-test.mydomain.com&#34;)
 *             .acl(&#34;public-read&#34;)
 *             .corsRules(BucketCorsRuleArgs.builder()
 *                 .allowedHeaders(&#34;*&#34;)
 *                 .allowedMethods(                
 *                     &#34;PUT&#34;,
 *                     &#34;POST&#34;)
 *                 .allowedOrigins(&#34;https://s3-website-test.mydomain.com&#34;)
 *                 .exposeHeaders(&#34;ETag&#34;)
 *                 .maxAgeSeconds(3000)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Using versioning
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.Bucket;
 * import com.pulumi.aws.s3.BucketArgs;
 * import com.pulumi.aws.s3.inputs.BucketVersioningArgs;
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
 *         var b = new Bucket(&#34;b&#34;, BucketArgs.builder()        
 *             .bucket(&#34;my-tf-test-bucket&#34;)
 *             .acl(&#34;private&#34;)
 *             .versioning(BucketVersioningArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Enable Logging
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.Bucket;
 * import com.pulumi.aws.s3.BucketArgs;
 * import com.pulumi.aws.s3.inputs.BucketLoggingArgs;
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
 *         var logBucket = new Bucket(&#34;logBucket&#34;, BucketArgs.builder()        
 *             .bucket(&#34;my-tf-log-bucket&#34;)
 *             .acl(&#34;log-delivery-write&#34;)
 *             .build());
 * 
 *         var b = new Bucket(&#34;b&#34;, BucketArgs.builder()        
 *             .bucket(&#34;my-tf-test-bucket&#34;)
 *             .acl(&#34;private&#34;)
 *             .loggings(BucketLoggingArgs.builder()
 *                 .targetBucket(logBucket.id())
 *                 .targetPrefix(&#34;log/&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Using object lifecycle
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.Bucket;
 * import com.pulumi.aws.s3.BucketArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleRuleExpirationArgs;
 * import com.pulumi.aws.s3.inputs.BucketVersioningArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleRuleNoncurrentVersionExpirationArgs;
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
 *         var bucket = new Bucket(&#34;bucket&#34;, BucketArgs.builder()        
 *             .bucket(&#34;my-bucket&#34;)
 *             .acl(&#34;private&#34;)
 *             .lifecycleRules(            
 *                 BucketLifecycleRuleArgs.builder()
 *                     .id(&#34;log&#34;)
 *                     .enabled(true)
 *                     .prefix(&#34;log/&#34;)
 *                     .tags(Map.ofEntries(
 *                         Map.entry(&#34;rule&#34;, &#34;log&#34;),
 *                         Map.entry(&#34;autoclean&#34;, &#34;true&#34;)
 *                     ))
 *                     .transitions(                    
 *                         BucketLifecycleRuleTransitionArgs.builder()
 *                             .days(30)
 *                             .storageClass(&#34;STANDARD_IA&#34;)
 *                             .build(),
 *                         BucketLifecycleRuleTransitionArgs.builder()
 *                             .days(60)
 *                             .storageClass(&#34;GLACIER&#34;)
 *                             .build())
 *                     .expiration(BucketLifecycleRuleExpirationArgs.builder()
 *                         .days(90)
 *                         .build())
 *                     .build(),
 *                 BucketLifecycleRuleArgs.builder()
 *                     .id(&#34;tmp&#34;)
 *                     .prefix(&#34;tmp/&#34;)
 *                     .enabled(true)
 *                     .expiration(BucketLifecycleRuleExpirationArgs.builder()
 *                         .date(&#34;2016-01-12&#34;)
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *         var versioningBucket = new Bucket(&#34;versioningBucket&#34;, BucketArgs.builder()        
 *             .bucket(&#34;my-versioning-bucket&#34;)
 *             .acl(&#34;private&#34;)
 *             .versioning(BucketVersioningArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .lifecycleRules(BucketLifecycleRuleArgs.builder()
 *                 .prefix(&#34;config/&#34;)
 *                 .enabled(true)
 *                 .noncurrentVersionTransitions(                
 *                     BucketLifecycleRuleNoncurrentVersionTransitionArgs.builder()
 *                         .days(30)
 *                         .storageClass(&#34;STANDARD_IA&#34;)
 *                         .build(),
 *                     BucketLifecycleRuleNoncurrentVersionTransitionArgs.builder()
 *                         .days(60)
 *                         .storageClass(&#34;GLACIER&#34;)
 *                         .build())
 *                 .noncurrentVersionExpiration(BucketLifecycleRuleNoncurrentVersionExpirationArgs.builder()
 *                     .days(90)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Using replication configuration
 * 
 * &gt; **NOTE:** See the `aws.s3.BucketReplicationConfig` resource to support bi-directional replication configuration and additional features.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.s3.Bucket;
 * import com.pulumi.aws.s3.BucketArgs;
 * import com.pulumi.aws.s3.inputs.BucketVersioningArgs;
 * import com.pulumi.aws.s3.inputs.BucketReplicationConfigurationArgs;
 * import com.pulumi.aws.iam.Policy;
 * import com.pulumi.aws.iam.PolicyArgs;
 * import com.pulumi.aws.iam.RolePolicyAttachment;
 * import com.pulumi.aws.iam.RolePolicyAttachmentArgs;
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
 *         var replication = new Role(&#34;replication&#34;, RoleArgs.builder()        
 *             .name(&#34;tf-iam-role-replication-12345&#34;)
 *             .assumeRolePolicy(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Action&#34;: &#34;sts:AssumeRole&#34;,
 *       &#34;Principal&#34;: {
 *         &#34;Service&#34;: &#34;s3.amazonaws.com&#34;
 *       },
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Sid&#34;: &#34;&#34;
 *     }
 *   ]
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var destination = new Bucket(&#34;destination&#34;, BucketArgs.builder()        
 *             .bucket(&#34;tf-test-bucket-destination-12345&#34;)
 *             .versioning(BucketVersioningArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .build());
 * 
 *         var source = new Bucket(&#34;source&#34;, BucketArgs.builder()        
 *             .bucket(&#34;tf-test-bucket-source-12345&#34;)
 *             .acl(&#34;private&#34;)
 *             .versioning(BucketVersioningArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .replicationConfiguration(BucketReplicationConfigurationArgs.builder()
 *                 .role(replication.arn())
 *                 .rules(BucketReplicationConfigurationRuleArgs.builder()
 *                     .id(&#34;foobar&#34;)
 *                     .status(&#34;Enabled&#34;)
 *                     .filter(BucketReplicationConfigurationRuleFilterArgs.builder()
 *                         .tags()
 *                         .build())
 *                     .destination(BucketReplicationConfigurationRuleDestinationArgs.builder()
 *                         .bucket(destination.arn())
 *                         .storageClass(&#34;STANDARD&#34;)
 *                         .replicationTime(BucketReplicationConfigurationRuleDestinationReplicationTimeArgs.builder()
 *                             .status(&#34;Enabled&#34;)
 *                             .minutes(15)
 *                             .build())
 *                         .metrics(BucketReplicationConfigurationRuleDestinationMetricsArgs.builder()
 *                             .status(&#34;Enabled&#34;)
 *                             .minutes(15)
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var replicationPolicy = new Policy(&#34;replicationPolicy&#34;, PolicyArgs.builder()        
 *             .name(&#34;tf-iam-role-policy-replication-12345&#34;)
 *             .policy(Output.tuple(source.arn(), source.arn(), destination.arn()).applyValue(values -&gt; {
 *                 var sourceArn = values.t1;
 *                 var sourceArn1 = values.t2;
 *                 var destinationArn = values.t3;
 *                 return &#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Action&#34;: [
 *         &#34;s3:GetReplicationConfiguration&#34;,
 *         &#34;s3:ListBucket&#34;
 *       ],
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Resource&#34;: [
 *         &#34;%s&#34;
 *       ]
 *     },
 *     {
 *       &#34;Action&#34;: [
 *         &#34;s3:GetObjectVersionForReplication&#34;,
 *         &#34;s3:GetObjectVersionAcl&#34;,
 *          &#34;s3:GetObjectVersionTagging&#34;
 *       ],
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Resource&#34;: [
 *         &#34;%s/*&#34;
 *       ]
 *     },
 *     {
 *       &#34;Action&#34;: [
 *         &#34;s3:ReplicateObject&#34;,
 *         &#34;s3:ReplicateDelete&#34;,
 *         &#34;s3:ReplicateTags&#34;
 *       ],
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Resource&#34;: &#34;%s/*&#34;
 *     }
 *   ]
 * }
 * &#34;, sourceArn,sourceArn1,destinationArn);
 *             }))
 *             .build());
 * 
 *         var replicationRolePolicyAttachment = new RolePolicyAttachment(&#34;replicationRolePolicyAttachment&#34;, RolePolicyAttachmentArgs.builder()        
 *             .role(replication.name())
 *             .policyArn(replicationPolicy.arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Enable Default Server Side Encryption
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.kms.Key;
 * import com.pulumi.aws.kms.KeyArgs;
 * import com.pulumi.aws.s3.Bucket;
 * import com.pulumi.aws.s3.BucketArgs;
 * import com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationArgs;
 * import com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs;
 * import com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs;
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
 *         var mykey = new Key(&#34;mykey&#34;, KeyArgs.builder()        
 *             .description(&#34;This key is used to encrypt bucket objects&#34;)
 *             .deletionWindowInDays(10)
 *             .build());
 * 
 *         var mybucket = new Bucket(&#34;mybucket&#34;, BucketArgs.builder()        
 *             .bucket(&#34;mybucket&#34;)
 *             .serverSideEncryptionConfiguration(BucketServerSideEncryptionConfigurationArgs.builder()
 *                 .rule(BucketServerSideEncryptionConfigurationRuleArgs.builder()
 *                     .applyServerSideEncryptionByDefault(BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs.builder()
 *                         .kmsMasterKeyId(mykey.arn())
 *                         .sseAlgorithm(&#34;aws:kms&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Using ACL policy grants
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.S3Functions;
 * import com.pulumi.aws.s3.Bucket;
 * import com.pulumi.aws.s3.BucketArgs;
 * import com.pulumi.aws.s3.inputs.BucketGrantArgs;
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
 *         final var currentUser = S3Functions.getCanonicalUserId();
 * 
 *         var bucket = new Bucket(&#34;bucket&#34;, BucketArgs.builder()        
 *             .bucket(&#34;mybucket&#34;)
 *             .grants(            
 *                 BucketGrantArgs.builder()
 *                     .id(currentUser.applyValue(getCanonicalUserIdResult -&gt; getCanonicalUserIdResult.id()))
 *                     .type(&#34;CanonicalUser&#34;)
 *                     .permissions(&#34;FULL_CONTROL&#34;)
 *                     .build(),
 *                 BucketGrantArgs.builder()
 *                     .type(&#34;Group&#34;)
 *                     .permissions(                    
 *                         &#34;READ_ACP&#34;,
 *                         &#34;WRITE&#34;)
 *                     .uri(&#34;http://acs.amazonaws.com/groups/s3/LogDelivery&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * S3 bucket can be imported using the `bucket`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucket:Bucket bucket bucket-name
 * ```
 *  The `policy` argument is not imported and will be deprecated in a future version of the provider. Use the `aws_s3_bucket_policy` resource to manage the S3 Bucket Policy instead.
 * 
 */
@ResourceType(type="aws:s3/bucket:Bucket")
public class Bucket extends com.pulumi.resources.CustomResource {
    /**
     * Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
     * 
     */
    @Export(name="accelerationStatus", refs={String.class}, tree="[0]")
    private Output<String> accelerationStatus;

    /**
     * @return Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
     * 
     */
    public Output<String> accelerationStatus() {
        return this.accelerationStatus;
    }
    /**
     * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, and `log-delivery-write`. Defaults to `private`.  Conflicts with `grant`.
     * 
     */
    @Export(name="acl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> acl;

    /**
     * @return The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, and `log-delivery-write`. Defaults to `private`.  Conflicts with `grant`.
     * 
     */
    public Output<Optional<String>> acl() {
        return Codegen.optional(this.acl);
    }
    /**
     * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of the bucket. If omitted, this provider will assign a random, unique name. Must be lowercase and less than or equal to 63 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output<String> bucket;

    /**
     * @return The name of the bucket. If omitted, this provider will assign a random, unique name. Must be lowercase and less than or equal to 63 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
     * 
     */
    @Export(name="bucketDomainName", refs={String.class}, tree="[0]")
    private Output<String> bucketDomainName;

    /**
     * @return The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
     * 
     */
    public Output<String> bucketDomainName() {
        return this.bucketDomainName;
    }
    /**
     * Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`. Must be lowercase and less than or equal to 37 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
     * 
     */
    @Export(name="bucketPrefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> bucketPrefix;

    /**
     * @return Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`. Must be lowercase and less than or equal to 37 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
     * 
     */
    public Output<Optional<String>> bucketPrefix() {
        return Codegen.optional(this.bucketPrefix);
    }
    /**
     * The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
     * 
     */
    @Export(name="bucketRegionalDomainName", refs={String.class}, tree="[0]")
    private Output<String> bucketRegionalDomainName;

    /**
     * @return The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
     * 
     */
    public Output<String> bucketRegionalDomainName() {
        return this.bucketRegionalDomainName;
    }
    /**
     * A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
     * 
     */
    @Export(name="corsRules", refs={List.class,BucketCorsRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<BucketCorsRule>> corsRules;

    /**
     * @return A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
     * 
     */
    public Output<Optional<List<BucketCorsRule>>> corsRules() {
        return Codegen.optional(this.corsRules);
    }
    /**
     * A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
     * 
     */
    @Export(name="forceDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl) (documented below). Conflicts with `acl`.
     * 
     */
    @Export(name="grants", refs={List.class,BucketGrant.class}, tree="[0,1]")
    private Output</* @Nullable */ List<BucketGrant>> grants;

    /**
     * @return An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl) (documented below). Conflicts with `acl`.
     * 
     */
    public Output<Optional<List<BucketGrant>>> grants() {
        return Codegen.optional(this.grants);
    }
    /**
     * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket&#39;s region.
     * 
     */
    @Export(name="hostedZoneId", refs={String.class}, tree="[0]")
    private Output<String> hostedZoneId;

    /**
     * @return The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket&#39;s region.
     * 
     */
    public Output<String> hostedZoneId() {
        return this.hostedZoneId;
    }
    /**
     * A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
     * 
     */
    @Export(name="lifecycleRules", refs={List.class,BucketLifecycleRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<BucketLifecycleRule>> lifecycleRules;

    /**
     * @return A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
     * 
     */
    public Output<Optional<List<BucketLifecycleRule>>> lifecycleRules() {
        return Codegen.optional(this.lifecycleRules);
    }
    /**
     * A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
     * 
     */
    @Export(name="loggings", refs={List.class,BucketLogging.class}, tree="[0,1]")
    private Output</* @Nullable */ List<BucketLogging>> loggings;

    /**
     * @return A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
     * 
     */
    public Output<Optional<List<BucketLogging>>> loggings() {
        return Codegen.optional(this.loggings);
    }
    /**
     * A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
     * 
     * &gt; **NOTE:** You cannot use `acceleration_status` in `cn-north-1` or `us-gov-west-1`
     * 
     */
    @Export(name="objectLockConfiguration", refs={BucketObjectLockConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ BucketObjectLockConfiguration> objectLockConfiguration;

    /**
     * @return A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
     * 
     * &gt; **NOTE:** You cannot use `acceleration_status` in `cn-north-1` or `us-gov-west-1`
     * 
     */
    public Output<Optional<BucketObjectLockConfiguration>> objectLockConfiguration() {
        return Codegen.optional(this.objectLockConfiguration);
    }
    /**
     * A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), this provider may view the policy as constantly changing in a `pulumi preview`. In this case, please make sure you use the verbose/specific version of the policy.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> policy;

    /**
     * @return A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), this provider may view the policy as constantly changing in a `pulumi preview`. In this case, please make sure you use the verbose/specific version of the policy.
     * 
     */
    public Output<Optional<String>> policy() {
        return Codegen.optional(this.policy);
    }
    /**
     * The AWS region this bucket resides in.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The AWS region this bucket resides in.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
     * 
     */
    @Export(name="replicationConfiguration", refs={BucketReplicationConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ BucketReplicationConfiguration> replicationConfiguration;

    /**
     * @return A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
     * 
     */
    public Output<Optional<BucketReplicationConfiguration>> replicationConfiguration() {
        return Codegen.optional(this.replicationConfiguration);
    }
    /**
     * Specifies who should bear the cost of Amazon S3 data transfer.
     * Can be either `BucketOwner` or `Requester`. By default, the owner of the S3 bucket would incur
     * the costs of any data transfer. See [Requester Pays Buckets](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html)
     * developer guide for more information.
     * 
     */
    @Export(name="requestPayer", refs={String.class}, tree="[0]")
    private Output<String> requestPayer;

    /**
     * @return Specifies who should bear the cost of Amazon S3 data transfer.
     * Can be either `BucketOwner` or `Requester`. By default, the owner of the S3 bucket would incur
     * the costs of any data transfer. See [Requester Pays Buckets](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html)
     * developer guide for more information.
     * 
     */
    public Output<String> requestPayer() {
        return this.requestPayer;
    }
    /**
     * A configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) (documented below)
     * 
     */
    @Export(name="serverSideEncryptionConfiguration", refs={BucketServerSideEncryptionConfiguration.class}, tree="[0]")
    private Output<BucketServerSideEncryptionConfiguration> serverSideEncryptionConfiguration;

    /**
     * @return A configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) (documented below)
     * 
     */
    public Output<BucketServerSideEncryptionConfiguration> serverSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }
    /**
     * A map of tags to assign to the bucket. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the bucket. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
     * 
     */
    @Export(name="versioning", refs={BucketVersioning.class}, tree="[0]")
    private Output<BucketVersioning> versioning;

    /**
     * @return A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
     * 
     */
    public Output<BucketVersioning> versioning() {
        return this.versioning;
    }
    /**
     * A website object (documented below).
     * 
     */
    @Export(name="website", refs={BucketWebsite.class}, tree="[0]")
    private Output</* @Nullable */ BucketWebsite> website;

    /**
     * @return A website object (documented below).
     * 
     */
    public Output<Optional<BucketWebsite>> website() {
        return Codegen.optional(this.website);
    }
    /**
     * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
     * 
     */
    @Export(name="websiteDomain", refs={String.class}, tree="[0]")
    private Output<String> websiteDomain;

    /**
     * @return The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
     * 
     */
    public Output<String> websiteDomain() {
        return this.websiteDomain;
    }
    /**
     * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
     * 
     */
    @Export(name="websiteEndpoint", refs={String.class}, tree="[0]")
    private Output<String> websiteEndpoint;

    /**
     * @return The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
     * 
     */
    public Output<String> websiteEndpoint() {
        return this.websiteEndpoint;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Bucket(String name) {
        this(name, BucketArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Bucket(String name, @Nullable BucketArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Bucket(String name, @Nullable BucketArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucket:Bucket", name, args == null ? BucketArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Bucket(String name, Output<String> id, @Nullable BucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucket:Bucket", name, state, makeResourceOptions(options, id));
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
    public static Bucket get(String name, Output<String> id, @Nullable BucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Bucket(name, id, state, options);
    }
}
