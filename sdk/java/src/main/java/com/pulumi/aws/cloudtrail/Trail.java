// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudtrail;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudtrail.TrailArgs;
import com.pulumi.aws.cloudtrail.inputs.TrailState;
import com.pulumi.aws.cloudtrail.outputs.TrailAdvancedEventSelector;
import com.pulumi.aws.cloudtrail.outputs.TrailEventSelector;
import com.pulumi.aws.cloudtrail.outputs.TrailInsightSelector;
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
 * Provides a CloudTrail resource.
 * 
 * &gt; **Tip:** For a multi-region trail, this resource must be in the home region of the trail.
 * 
 * &gt; **Tip:** For an organization trail, this resource must be in the master account of the organization.
 * 
 * ## Example Usage
 * ### Basic
 * 
 * Enable CloudTrail to capture all compatible management events in region.
 * For capturing events from services like IAM, `include_global_service_events` must be enabled.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.cloudtrail.Trail;
 * import com.pulumi.aws.cloudtrail.TrailArgs;
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
 *         final var current = AwsFunctions.getCallerIdentity();
 * 
 *         var fooBucketV2 = new BucketV2(&#34;fooBucketV2&#34;, BucketV2Args.builder()        
 *             .forceDestroy(true)
 *             .build());
 * 
 *         var foobar = new Trail(&#34;foobar&#34;, TrailArgs.builder()        
 *             .s3BucketName(fooBucketV2.id())
 *             .s3KeyPrefix(&#34;prefix&#34;)
 *             .includeGlobalServiceEvents(false)
 *             .build());
 * 
 *         var fooBucketPolicy = new BucketPolicy(&#34;fooBucketPolicy&#34;, BucketPolicyArgs.builder()        
 *             .bucket(fooBucketV2.id())
 *             .policy(Output.tuple(fooBucketV2.arn(), fooBucketV2.arn()).applyValue(values -&gt; {
 *                 var fooBucketV2Arn = values.t1;
 *                 var fooBucketV2Arn1 = values.t2;
 *                 return &#34;&#34;&#34;
 * {
 *     &#34;Version&#34;: &#34;2012-10-17&#34;,
 *     &#34;Statement&#34;: [
 *         {
 *             &#34;Sid&#34;: &#34;AWSCloudTrailAclCheck&#34;,
 *             &#34;Effect&#34;: &#34;Allow&#34;,
 *             &#34;Principal&#34;: {
 *               &#34;Service&#34;: &#34;cloudtrail.amazonaws.com&#34;
 *             },
 *             &#34;Action&#34;: &#34;s3:GetBucketAcl&#34;,
 *             &#34;Resource&#34;: &#34;%s&#34;
 *         },
 *         {
 *             &#34;Sid&#34;: &#34;AWSCloudTrailWrite&#34;,
 *             &#34;Effect&#34;: &#34;Allow&#34;,
 *             &#34;Principal&#34;: {
 *               &#34;Service&#34;: &#34;cloudtrail.amazonaws.com&#34;
 *             },
 *             &#34;Action&#34;: &#34;s3:PutObject&#34;,
 *             &#34;Resource&#34;: &#34;%s/prefix/AWSLogs/%s/*&#34;,
 *             &#34;Condition&#34;: {
 *                 &#34;StringEquals&#34;: {
 *                     &#34;s3:x-amz-acl&#34;: &#34;bucket-owner-full-control&#34;
 *                 }
 *             }
 *         }
 *     ]
 * }
 * &#34;, fooBucketV2Arn,fooBucketV2Arn1,current.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId()));
 *             }))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Data Event Logging
 * 
 * CloudTrail can log [Data Events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html) for certain services such as S3 objects and Lambda function invocations. Additional information about data event configuration can be found in the following links:
 * 
 * * [CloudTrail API DataResource documentation](https://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_DataResource.html) (for basic event selector).
 * * [CloudTrail API AdvancedFieldSelector documentation](https://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_AdvancedFieldSelector.html) (for advanced event selector).
 * ### Logging All Lambda Function Invocations By Using Basic Event Selectors
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudtrail.Trail;
 * import com.pulumi.aws.cloudtrail.TrailArgs;
 * import com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs;
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
 *         var example = new Trail(&#34;example&#34;, TrailArgs.builder()        
 *             .eventSelectors(TrailEventSelectorArgs.builder()
 *                 .dataResources(TrailEventSelectorDataResourceArgs.builder()
 *                     .type(&#34;AWS::Lambda::Function&#34;)
 *                     .values(&#34;arn:aws:lambda&#34;)
 *                     .build())
 *                 .includeManagementEvents(true)
 *                 .readWriteType(&#34;All&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Logging All S3 Object Events By Using Basic Event Selectors
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudtrail.Trail;
 * import com.pulumi.aws.cloudtrail.TrailArgs;
 * import com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs;
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
 *         var example = new Trail(&#34;example&#34;, TrailArgs.builder()        
 *             .eventSelectors(TrailEventSelectorArgs.builder()
 *                 .dataResources(TrailEventSelectorDataResourceArgs.builder()
 *                     .type(&#34;AWS::S3::Object&#34;)
 *                     .values(&#34;arn:aws:s3&#34;)
 *                     .build())
 *                 .includeManagementEvents(true)
 *                 .readWriteType(&#34;All&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Logging Individual S3 Bucket Events By Using Basic Event Selectors
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.S3Functions;
 * import com.pulumi.aws.s3.inputs.GetBucketArgs;
 * import com.pulumi.aws.cloudtrail.Trail;
 * import com.pulumi.aws.cloudtrail.TrailArgs;
 * import com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs;
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
 *         final var important-bucket = S3Functions.getBucket(GetBucketArgs.builder()
 *             .bucket(&#34;important-bucket&#34;)
 *             .build());
 * 
 *         var example = new Trail(&#34;example&#34;, TrailArgs.builder()        
 *             .eventSelectors(TrailEventSelectorArgs.builder()
 *                 .dataResources(TrailEventSelectorDataResourceArgs.builder()
 *                     .type(&#34;AWS::S3::Object&#34;)
 *                     .values(String.format(&#34;%s/&#34;, important_bucket.arn()))
 *                     .build())
 *                 .includeManagementEvents(true)
 *                 .readWriteType(&#34;All&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Logging All S3 Object Events Except For Two S3 Buckets By Using Advanced Event Selectors
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.S3Functions;
 * import com.pulumi.aws.s3.inputs.GetBucketArgs;
 * import com.pulumi.aws.cloudtrail.Trail;
 * import com.pulumi.aws.cloudtrail.TrailArgs;
 * import com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs;
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
 *         final var not-important-bucket-1 = S3Functions.getBucket(GetBucketArgs.builder()
 *             .bucket(&#34;not-important-bucket-1&#34;)
 *             .build());
 * 
 *         final var not-important-bucket-2 = S3Functions.getBucket(GetBucketArgs.builder()
 *             .bucket(&#34;not-important-bucket-2&#34;)
 *             .build());
 * 
 *         var example = new Trail(&#34;example&#34;, TrailArgs.builder()        
 *             .advancedEventSelectors(            
 *                 TrailAdvancedEventSelectorArgs.builder()
 *                     .fieldSelectors(                    
 *                         TrailAdvancedEventSelectorFieldSelectorArgs.builder()
 *                             .equals(&#34;Data&#34;)
 *                             .field(&#34;eventCategory&#34;)
 *                             .build(),
 *                         TrailAdvancedEventSelectorFieldSelectorArgs.builder()
 *                             .field(&#34;resources.ARN&#34;)
 *                             .notEquals(                            
 *                                 String.format(&#34;%s/&#34;, not_important_bucket_1.arn()),
 *                                 String.format(&#34;%s/&#34;, not_important_bucket_2.arn()))
 *                             .build(),
 *                         TrailAdvancedEventSelectorFieldSelectorArgs.builder()
 *                             .equals(&#34;AWS::S3::Object&#34;)
 *                             .field(&#34;resources.type&#34;)
 *                             .build())
 *                     .name(&#34;Log all S3 objects events except for two S3 buckets&#34;)
 *                     .build(),
 *                 TrailAdvancedEventSelectorArgs.builder()
 *                     .fieldSelectors(TrailAdvancedEventSelectorFieldSelectorArgs.builder()
 *                         .equals(&#34;Management&#34;)
 *                         .field(&#34;eventCategory&#34;)
 *                         .build())
 *                     .name(&#34;Log readOnly and writeOnly management events&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Logging Individual S3 Buckets And Specific Event Names By Using Advanced Event Selectors
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.S3Functions;
 * import com.pulumi.aws.s3.inputs.GetBucketArgs;
 * import com.pulumi.aws.cloudtrail.Trail;
 * import com.pulumi.aws.cloudtrail.TrailArgs;
 * import com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs;
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
 *         final var important-bucket-1 = S3Functions.getBucket(GetBucketArgs.builder()
 *             .bucket(&#34;important-bucket-1&#34;)
 *             .build());
 * 
 *         final var important-bucket-2 = S3Functions.getBucket(GetBucketArgs.builder()
 *             .bucket(&#34;important-bucket-2&#34;)
 *             .build());
 * 
 *         final var important-bucket-3 = S3Functions.getBucket(GetBucketArgs.builder()
 *             .bucket(&#34;important-bucket-3&#34;)
 *             .build());
 * 
 *         var example = new Trail(&#34;example&#34;, TrailArgs.builder()        
 *             .advancedEventSelectors(            
 *                 TrailAdvancedEventSelectorArgs.builder()
 *                     .fieldSelectors(                    
 *                         TrailAdvancedEventSelectorFieldSelectorArgs.builder()
 *                             .equals(&#34;Data&#34;)
 *                             .field(&#34;eventCategory&#34;)
 *                             .build(),
 *                         TrailAdvancedEventSelectorFieldSelectorArgs.builder()
 *                             .equals(                            
 *                                 &#34;PutObject&#34;,
 *                                 &#34;DeleteObject&#34;)
 *                             .field(&#34;eventName&#34;)
 *                             .build(),
 *                         TrailAdvancedEventSelectorFieldSelectorArgs.builder()
 *                             .equals(                            
 *                                 String.format(&#34;%s/&#34;, important_bucket_1.arn()),
 *                                 String.format(&#34;%s/&#34;, important_bucket_2.arn()))
 *                             .field(&#34;resources.ARN&#34;)
 *                             .build(),
 *                         TrailAdvancedEventSelectorFieldSelectorArgs.builder()
 *                             .equals(&#34;false&#34;)
 *                             .field(&#34;readOnly&#34;)
 *                             .build(),
 *                         TrailAdvancedEventSelectorFieldSelectorArgs.builder()
 *                             .equals(&#34;AWS::S3::Object&#34;)
 *                             .field(&#34;resources.type&#34;)
 *                             .build())
 *                     .name(&#34;Log PutObject and DeleteObject events for two S3 buckets&#34;)
 *                     .build(),
 *                 TrailAdvancedEventSelectorArgs.builder()
 *                     .fieldSelectors(                    
 *                         TrailAdvancedEventSelectorFieldSelectorArgs.builder()
 *                             .equals(&#34;Data&#34;)
 *                             .field(&#34;eventCategory&#34;)
 *                             .build(),
 *                         TrailAdvancedEventSelectorFieldSelectorArgs.builder()
 *                             .field(&#34;eventName&#34;)
 *                             .startsWith(&#34;Delete&#34;)
 *                             .build(),
 *                         TrailAdvancedEventSelectorFieldSelectorArgs.builder()
 *                             .equals(String.format(&#34;%s/important-prefix&#34;, important_bucket_3.arn()))
 *                             .field(&#34;resources.ARN&#34;)
 *                             .build(),
 *                         TrailAdvancedEventSelectorFieldSelectorArgs.builder()
 *                             .equals(&#34;false&#34;)
 *                             .field(&#34;readOnly&#34;)
 *                             .build(),
 *                         TrailAdvancedEventSelectorFieldSelectorArgs.builder()
 *                             .equals(&#34;AWS::S3::Object&#34;)
 *                             .field(&#34;resources.type&#34;)
 *                             .build())
 *                     .name(&#34;Log Delete* events for one S3 bucket&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Sending Events to CloudWatch Logs
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudwatch.LogGroup;
 * import com.pulumi.aws.cloudtrail.Trail;
 * import com.pulumi.aws.cloudtrail.TrailArgs;
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
 *         var exampleLogGroup = new LogGroup(&#34;exampleLogGroup&#34;);
 * 
 *         var exampleTrail = new Trail(&#34;exampleTrail&#34;, TrailArgs.builder()        
 *             .cloudWatchLogsGroupArn(exampleLogGroup.arn().applyValue(arn -&gt; String.format(&#34;%s:*&#34;, arn)))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloudtrails can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudtrail/trail:Trail sample my-sample-trail
 * ```
 * 
 */
@ResourceType(type="aws:cloudtrail/trail:Trail")
public class Trail extends com.pulumi.resources.CustomResource {
    /**
     * Specifies an advanced event selector for enabling data event logging. Fields documented below. Conflicts with `event_selector`.
     * 
     */
    @Export(name="advancedEventSelectors", refs={List.class,TrailAdvancedEventSelector.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TrailAdvancedEventSelector>> advancedEventSelectors;

    /**
     * @return Specifies an advanced event selector for enabling data event logging. Fields documented below. Conflicts with `event_selector`.
     * 
     */
    public Output<Optional<List<TrailAdvancedEventSelector>>> advancedEventSelectors() {
        return Codegen.optional(this.advancedEventSelectors);
    }
    /**
     * ARN of the trail.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the trail.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Log group name using an ARN that represents the log group to which CloudTrail logs will be delivered. Note that CloudTrail requires the Log Stream wildcard.
     * 
     */
    @Export(name="cloudWatchLogsGroupArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cloudWatchLogsGroupArn;

    /**
     * @return Log group name using an ARN that represents the log group to which CloudTrail logs will be delivered. Note that CloudTrail requires the Log Stream wildcard.
     * 
     */
    public Output<Optional<String>> cloudWatchLogsGroupArn() {
        return Codegen.optional(this.cloudWatchLogsGroupArn);
    }
    /**
     * Role for the CloudWatch Logs endpoint to assume to write to a user’s log group.
     * 
     */
    @Export(name="cloudWatchLogsRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cloudWatchLogsRoleArn;

    /**
     * @return Role for the CloudWatch Logs endpoint to assume to write to a user’s log group.
     * 
     */
    public Output<Optional<String>> cloudWatchLogsRoleArn() {
        return Codegen.optional(this.cloudWatchLogsRoleArn);
    }
    /**
     * Whether log file integrity validation is enabled. Defaults to `false`.
     * 
     */
    @Export(name="enableLogFileValidation", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableLogFileValidation;

    /**
     * @return Whether log file integrity validation is enabled. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> enableLogFileValidation() {
        return Codegen.optional(this.enableLogFileValidation);
    }
    /**
     * Enables logging for the trail. Defaults to `true`. Setting this to `false` will pause logging.
     * 
     */
    @Export(name="enableLogging", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableLogging;

    /**
     * @return Enables logging for the trail. Defaults to `true`. Setting this to `false` will pause logging.
     * 
     */
    public Output<Optional<Boolean>> enableLogging() {
        return Codegen.optional(this.enableLogging);
    }
    /**
     * Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these. Conflicts with `advanced_event_selector`.
     * 
     */
    @Export(name="eventSelectors", refs={List.class,TrailEventSelector.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TrailEventSelector>> eventSelectors;

    /**
     * @return Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these. Conflicts with `advanced_event_selector`.
     * 
     */
    public Output<Optional<List<TrailEventSelector>>> eventSelectors() {
        return Codegen.optional(this.eventSelectors);
    }
    /**
     * Region in which the trail was created.
     * 
     */
    @Export(name="homeRegion", refs={String.class}, tree="[0]")
    private Output<String> homeRegion;

    /**
     * @return Region in which the trail was created.
     * 
     */
    public Output<String> homeRegion() {
        return this.homeRegion;
    }
    /**
     * Whether the trail is publishing events from global services such as IAM to the log files. Defaults to `true`.
     * 
     */
    @Export(name="includeGlobalServiceEvents", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> includeGlobalServiceEvents;

    /**
     * @return Whether the trail is publishing events from global services such as IAM to the log files. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> includeGlobalServiceEvents() {
        return Codegen.optional(this.includeGlobalServiceEvents);
    }
    /**
     * Configuration block for identifying unusual operational activity. See details below.
     * 
     */
    @Export(name="insightSelectors", refs={List.class,TrailInsightSelector.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TrailInsightSelector>> insightSelectors;

    /**
     * @return Configuration block for identifying unusual operational activity. See details below.
     * 
     */
    public Output<Optional<List<TrailInsightSelector>>> insightSelectors() {
        return Codegen.optional(this.insightSelectors);
    }
    /**
     * Whether the trail is created in the current region or in all regions. Defaults to `false`.
     * 
     */
    @Export(name="isMultiRegionTrail", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isMultiRegionTrail;

    /**
     * @return Whether the trail is created in the current region or in all regions. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> isMultiRegionTrail() {
        return Codegen.optional(this.isMultiRegionTrail);
    }
    /**
     * Whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
     * 
     */
    @Export(name="isOrganizationTrail", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isOrganizationTrail;

    /**
     * @return Whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> isOrganizationTrail() {
        return Codegen.optional(this.isOrganizationTrail);
    }
    /**
     * KMS key ARN to use to encrypt the logs delivered by CloudTrail.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return KMS key ARN to use to encrypt the logs delivered by CloudTrail.
     * 
     */
    public Output<Optional<String>> kmsKeyId() {
        return Codegen.optional(this.kmsKeyId);
    }
    /**
     * Name of the advanced event selector.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the advanced event selector.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Name of the S3 bucket designated for publishing log files.
     * 
     */
    @Export(name="s3BucketName", refs={String.class}, tree="[0]")
    private Output<String> s3BucketName;

    /**
     * @return Name of the S3 bucket designated for publishing log files.
     * 
     */
    public Output<String> s3BucketName() {
        return this.s3BucketName;
    }
    /**
     * S3 key prefix that follows the name of the bucket you have designated for log file delivery.
     * 
     */
    @Export(name="s3KeyPrefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> s3KeyPrefix;

    /**
     * @return S3 key prefix that follows the name of the bucket you have designated for log file delivery.
     * 
     */
    public Output<Optional<String>> s3KeyPrefix() {
        return Codegen.optional(this.s3KeyPrefix);
    }
    /**
     * Name of the Amazon SNS topic defined for notification of log file delivery.
     * 
     */
    @Export(name="snsTopicName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> snsTopicName;

    /**
     * @return Name of the Amazon SNS topic defined for notification of log file delivery.
     * 
     */
    public Output<Optional<String>> snsTopicName() {
        return Codegen.optional(this.snsTopicName);
    }
    /**
     * Map of tags to assign to the trail. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the trail. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Trail(String name) {
        this(name, TrailArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Trail(String name, TrailArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Trail(String name, TrailArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudtrail/trail:Trail", name, args == null ? TrailArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Trail(String name, Output<String> id, @Nullable TrailState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudtrail/trail:Trail", name, state, makeResourceOptions(options, id));
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
    public static Trail get(String name, Output<String> id, @Nullable TrailState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Trail(name, id, state, options);
    }
}
