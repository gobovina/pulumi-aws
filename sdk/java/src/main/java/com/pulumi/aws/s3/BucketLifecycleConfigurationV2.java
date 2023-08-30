// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args;
import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2State;
import com.pulumi.aws.s3.outputs.BucketLifecycleConfigurationV2Rule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an independent configuration resource for S3 bucket [lifecycle configuration](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lifecycle-mgmt.html).
 * 
 * An S3 Lifecycle configuration consists of one or more Lifecycle rules. Each rule consists of the following:
 * 
 * * Rule metadata (`id` and `status`)
 * * Filter identifying objects to which the rule applies
 * * One or more transition or expiration actions
 * 
 * For more information see the Amazon S3 User Guide on [`Lifecycle Configuration Elements`](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html).
 * 
 * &gt; **NOTE:** S3 Buckets only support a single lifecycle configuration. Declaring multiple `aws.s3.BucketLifecycleConfigurationV2` resources to the same S3 Bucket will cause a perpetual difference in configuration.
 * 
 * ## Example Usage
 * ### With neither a filter nor prefix specified
 * 
 * The Lifecycle rule applies to a subset of objects based on the key name prefix (`&#34;&#34;`).
 * 
 * This configuration is intended to replicate the default behavior of the `lifecycle_rule`
 * parameter in the AWS Provider `aws.s3.BucketV2` resource prior to `v4.0`.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs;
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
 *         var example = new BucketLifecycleConfigurationV2(&#34;example&#34;, BucketLifecycleConfigurationV2Args.builder()        
 *             .bucket(aws_s3_bucket.bucket().id())
 *             .rules(BucketLifecycleConfigurationV2RuleArgs.builder()
 *                 .id(&#34;rule-1&#34;)
 *                 .status(&#34;Enabled&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Specifying an empty filter
 * 
 * The Lifecycle rule applies to all objects in the bucket.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs;
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
 *         var example = new BucketLifecycleConfigurationV2(&#34;example&#34;, BucketLifecycleConfigurationV2Args.builder()        
 *             .bucket(aws_s3_bucket.bucket().id())
 *             .rules(BucketLifecycleConfigurationV2RuleArgs.builder()
 *                 .id(&#34;rule-1&#34;)
 *                 .filter()
 *                 .status(&#34;Enabled&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Specifying a filter using key prefixes
 * 
 * The Lifecycle rule applies to a subset of objects based on the key name prefix (`logs/`).
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs;
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
 *         var example = new BucketLifecycleConfigurationV2(&#34;example&#34;, BucketLifecycleConfigurationV2Args.builder()        
 *             .bucket(aws_s3_bucket.bucket().id())
 *             .rules(BucketLifecycleConfigurationV2RuleArgs.builder()
 *                 .id(&#34;rule-1&#34;)
 *                 .filter(BucketLifecycleConfigurationV2RuleFilterArgs.builder()
 *                     .prefix(&#34;logs/&#34;)
 *                     .build())
 *                 .status(&#34;Enabled&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * If you want to apply a Lifecycle action to a subset of objects based on different key name prefixes, specify separate rules.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs;
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
 *         var example = new BucketLifecycleConfigurationV2(&#34;example&#34;, BucketLifecycleConfigurationV2Args.builder()        
 *             .bucket(aws_s3_bucket.bucket().id())
 *             .rules(            
 *                 BucketLifecycleConfigurationV2RuleArgs.builder()
 *                     .id(&#34;rule-1&#34;)
 *                     .filter(BucketLifecycleConfigurationV2RuleFilterArgs.builder()
 *                         .prefix(&#34;logs/&#34;)
 *                         .build())
 *                     .status(&#34;Enabled&#34;)
 *                     .build(),
 *                 BucketLifecycleConfigurationV2RuleArgs.builder()
 *                     .id(&#34;rule-2&#34;)
 *                     .filter(BucketLifecycleConfigurationV2RuleFilterArgs.builder()
 *                         .prefix(&#34;tmp/&#34;)
 *                         .build())
 *                     .status(&#34;Enabled&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Specifying a filter based on an object tag
 * 
 * The Lifecycle rule specifies a filter based on a tag key and value. The rule then applies only to a subset of objects with the specific tag.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterTagArgs;
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
 *         var example = new BucketLifecycleConfigurationV2(&#34;example&#34;, BucketLifecycleConfigurationV2Args.builder()        
 *             .bucket(aws_s3_bucket.bucket().id())
 *             .rules(BucketLifecycleConfigurationV2RuleArgs.builder()
 *                 .id(&#34;rule-1&#34;)
 *                 .filter(BucketLifecycleConfigurationV2RuleFilterArgs.builder()
 *                     .tag(BucketLifecycleConfigurationV2RuleFilterTagArgs.builder()
 *                         .key(&#34;Name&#34;)
 *                         .value(&#34;Staging&#34;)
 *                         .build())
 *                     .build())
 *                 .status(&#34;Enabled&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Specifying a filter based on multiple tags
 * 
 * The Lifecycle rule directs Amazon S3 to perform lifecycle actions on objects with two tags (with the specific tag keys and values). Notice `tags` is wrapped in the `and` configuration block.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterAndArgs;
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
 *         var example = new BucketLifecycleConfigurationV2(&#34;example&#34;, BucketLifecycleConfigurationV2Args.builder()        
 *             .bucket(aws_s3_bucket.bucket().id())
 *             .rules(BucketLifecycleConfigurationV2RuleArgs.builder()
 *                 .id(&#34;rule-1&#34;)
 *                 .filter(BucketLifecycleConfigurationV2RuleFilterArgs.builder()
 *                     .and(BucketLifecycleConfigurationV2RuleFilterAndArgs.builder()
 *                         .tags(Map.ofEntries(
 *                             Map.entry(&#34;Key1&#34;, &#34;Value1&#34;),
 *                             Map.entry(&#34;Key2&#34;, &#34;Value2&#34;)
 *                         ))
 *                         .build())
 *                     .build())
 *                 .status(&#34;Enabled&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Specifying a filter based on both prefix and one or more tags
 * 
 * The Lifecycle rule directs Amazon S3 to perform lifecycle actions on objects with the specified prefix and two tags (with the specific tag keys and values). Notice both `prefix` and `tags` are wrapped in the `and` configuration block.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterAndArgs;
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
 *         var example = new BucketLifecycleConfigurationV2(&#34;example&#34;, BucketLifecycleConfigurationV2Args.builder()        
 *             .bucket(aws_s3_bucket.bucket().id())
 *             .rules(BucketLifecycleConfigurationV2RuleArgs.builder()
 *                 .id(&#34;rule-1&#34;)
 *                 .filter(BucketLifecycleConfigurationV2RuleFilterArgs.builder()
 *                     .and(BucketLifecycleConfigurationV2RuleFilterAndArgs.builder()
 *                         .prefix(&#34;logs/&#34;)
 *                         .tags(Map.ofEntries(
 *                             Map.entry(&#34;Key1&#34;, &#34;Value1&#34;),
 *                             Map.entry(&#34;Key2&#34;, &#34;Value2&#34;)
 *                         ))
 *                         .build())
 *                     .build())
 *                 .status(&#34;Enabled&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Specifying a filter based on object size
 * 
 * Object size values are in bytes. Maximum filter size is 5TB. Some storage classes have minimum object size limitations, for more information, see [Comparing the Amazon S3 storage classes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-class-intro.html#sc-compare).
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs;
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
 *         var example = new BucketLifecycleConfigurationV2(&#34;example&#34;, BucketLifecycleConfigurationV2Args.builder()        
 *             .bucket(aws_s3_bucket.bucket().id())
 *             .rules(BucketLifecycleConfigurationV2RuleArgs.builder()
 *                 .id(&#34;rule-1&#34;)
 *                 .filter(BucketLifecycleConfigurationV2RuleFilterArgs.builder()
 *                     .objectSizeGreaterThan(500)
 *                     .build())
 *                 .status(&#34;Enabled&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Specifying a filter based on object size range and prefix
 * 
 * The `object_size_greater_than` must be less than the `object_size_less_than`. Notice both the object size range and prefix are wrapped in the `and` configuration block.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterAndArgs;
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
 *         var example = new BucketLifecycleConfigurationV2(&#34;example&#34;, BucketLifecycleConfigurationV2Args.builder()        
 *             .bucket(aws_s3_bucket.bucket().id())
 *             .rules(BucketLifecycleConfigurationV2RuleArgs.builder()
 *                 .id(&#34;rule-1&#34;)
 *                 .filter(BucketLifecycleConfigurationV2RuleFilterArgs.builder()
 *                     .and(BucketLifecycleConfigurationV2RuleFilterAndArgs.builder()
 *                         .prefix(&#34;logs/&#34;)
 *                         .objectSizeGreaterThan(500)
 *                         .objectSizeLessThan(64000)
 *                         .build())
 *                     .build())
 *                 .status(&#34;Enabled&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Creating a Lifecycle Configuration for a bucket with versioning
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketAclV2;
 * import com.pulumi.aws.s3.BucketAclV2Args;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2;
 * import com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleExpirationArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterAndArgs;
 * import com.pulumi.aws.s3.BucketVersioningV2;
 * import com.pulumi.aws.s3.BucketVersioningV2Args;
 * import com.pulumi.aws.s3.inputs.BucketVersioningV2VersioningConfigurationArgs;
 * import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleNoncurrentVersionExpirationArgs;
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
 *         var bucket = new BucketV2(&#34;bucket&#34;);
 * 
 *         var bucketAcl = new BucketAclV2(&#34;bucketAcl&#34;, BucketAclV2Args.builder()        
 *             .bucket(bucket.id())
 *             .acl(&#34;private&#34;)
 *             .build());
 * 
 *         var bucket_config = new BucketLifecycleConfigurationV2(&#34;bucket-config&#34;, BucketLifecycleConfigurationV2Args.builder()        
 *             .bucket(bucket.id())
 *             .rules(            
 *                 BucketLifecycleConfigurationV2RuleArgs.builder()
 *                     .id(&#34;log&#34;)
 *                     .expiration(BucketLifecycleConfigurationV2RuleExpirationArgs.builder()
 *                         .days(90)
 *                         .build())
 *                     .filter(BucketLifecycleConfigurationV2RuleFilterArgs.builder()
 *                         .and(BucketLifecycleConfigurationV2RuleFilterAndArgs.builder()
 *                             .prefix(&#34;log/&#34;)
 *                             .tags(Map.ofEntries(
 *                                 Map.entry(&#34;rule&#34;, &#34;log&#34;),
 *                                 Map.entry(&#34;autoclean&#34;, &#34;true&#34;)
 *                             ))
 *                             .build())
 *                         .build())
 *                     .status(&#34;Enabled&#34;)
 *                     .transitions(                    
 *                         BucketLifecycleConfigurationV2RuleTransitionArgs.builder()
 *                             .days(30)
 *                             .storageClass(&#34;STANDARD_IA&#34;)
 *                             .build(),
 *                         BucketLifecycleConfigurationV2RuleTransitionArgs.builder()
 *                             .days(60)
 *                             .storageClass(&#34;GLACIER&#34;)
 *                             .build())
 *                     .build(),
 *                 BucketLifecycleConfigurationV2RuleArgs.builder()
 *                     .id(&#34;tmp&#34;)
 *                     .filter(BucketLifecycleConfigurationV2RuleFilterArgs.builder()
 *                         .prefix(&#34;tmp/&#34;)
 *                         .build())
 *                     .expiration(BucketLifecycleConfigurationV2RuleExpirationArgs.builder()
 *                         .date(&#34;2023-01-13T00:00:00Z&#34;)
 *                         .build())
 *                     .status(&#34;Enabled&#34;)
 *                     .build())
 *             .build());
 * 
 *         var versioningBucket = new BucketV2(&#34;versioningBucket&#34;);
 * 
 *         var versioningBucketAcl = new BucketAclV2(&#34;versioningBucketAcl&#34;, BucketAclV2Args.builder()        
 *             .bucket(versioningBucket.id())
 *             .acl(&#34;private&#34;)
 *             .build());
 * 
 *         var versioning = new BucketVersioningV2(&#34;versioning&#34;, BucketVersioningV2Args.builder()        
 *             .bucket(versioningBucket.id())
 *             .versioningConfiguration(BucketVersioningV2VersioningConfigurationArgs.builder()
 *                 .status(&#34;Enabled&#34;)
 *                 .build())
 *             .build());
 * 
 *         var versioning_bucket_config = new BucketLifecycleConfigurationV2(&#34;versioning-bucket-config&#34;, BucketLifecycleConfigurationV2Args.builder()        
 *             .bucket(versioningBucket.id())
 *             .rules(BucketLifecycleConfigurationV2RuleArgs.builder()
 *                 .id(&#34;config&#34;)
 *                 .filter(BucketLifecycleConfigurationV2RuleFilterArgs.builder()
 *                     .prefix(&#34;config/&#34;)
 *                     .build())
 *                 .noncurrentVersionExpiration(BucketLifecycleConfigurationV2RuleNoncurrentVersionExpirationArgs.builder()
 *                     .noncurrentDays(90)
 *                     .build())
 *                 .noncurrentVersionTransitions(                
 *                     BucketLifecycleConfigurationV2RuleNoncurrentVersionTransitionArgs.builder()
 *                         .noncurrentDays(30)
 *                         .storageClass(&#34;STANDARD_IA&#34;)
 *                         .build(),
 *                     BucketLifecycleConfigurationV2RuleNoncurrentVersionTransitionArgs.builder()
 *                         .noncurrentDays(60)
 *                         .storageClass(&#34;GLACIER&#34;)
 *                         .build())
 *                 .status(&#34;Enabled&#34;)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(versioning)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * If the owner (account ID) of the source bucket is the same account used to configure the AWS Provider, import using the `bucket`:
 * 
 * If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):
 * 
 * __Using `pulumi import` to import__ S3 bucket lifecycle configuration using the `bucket` or using the `bucket` and `expected_bucket_owner` separated by a comma (`,`). For example:
 * 
 * If the owner (account ID) of the source bucket is the same account used to configure the AWS Provider, import using the `bucket`:
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketLifecycleConfigurationV2:BucketLifecycleConfigurationV2 example bucket-name
 * ```
 *  If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketLifecycleConfigurationV2:BucketLifecycleConfigurationV2 example bucket-name,123456789012
 * ```
 * 
 */
@ResourceType(type="aws:s3/bucketLifecycleConfigurationV2:BucketLifecycleConfigurationV2")
public class BucketLifecycleConfigurationV2 extends com.pulumi.resources.CustomResource {
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
     * Account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     * 
     */
    @Export(name="expectedBucketOwner", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expectedBucketOwner;

    /**
     * @return Account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     * 
     */
    public Output<Optional<String>> expectedBucketOwner() {
        return Codegen.optional(this.expectedBucketOwner);
    }
    /**
     * List of configuration blocks describing the rules managing the replication. See below.
     * 
     */
    @Export(name="rules", refs={List.class,BucketLifecycleConfigurationV2Rule.class}, tree="[0,1]")
    private Output<List<BucketLifecycleConfigurationV2Rule>> rules;

    /**
     * @return List of configuration blocks describing the rules managing the replication. See below.
     * 
     */
    public Output<List<BucketLifecycleConfigurationV2Rule>> rules() {
        return this.rules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketLifecycleConfigurationV2(String name) {
        this(name, BucketLifecycleConfigurationV2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketLifecycleConfigurationV2(String name, BucketLifecycleConfigurationV2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketLifecycleConfigurationV2(String name, BucketLifecycleConfigurationV2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketLifecycleConfigurationV2:BucketLifecycleConfigurationV2", name, args == null ? BucketLifecycleConfigurationV2Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketLifecycleConfigurationV2(String name, Output<String> id, @Nullable BucketLifecycleConfigurationV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketLifecycleConfigurationV2:BucketLifecycleConfigurationV2", name, state, makeResourceOptions(options, id));
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
    public static BucketLifecycleConfigurationV2 get(String name, Output<String> id, @Nullable BucketLifecycleConfigurationV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketLifecycleConfigurationV2(name, id, state, options);
    }
}
