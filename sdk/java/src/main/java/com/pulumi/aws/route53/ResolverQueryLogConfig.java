// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53.ResolverQueryLogConfigArgs;
import com.pulumi.aws.route53.inputs.ResolverQueryLogConfigState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Route 53 Resolver query logging configuration resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.route53.ResolverQueryLogConfig;
 * import com.pulumi.aws.route53.ResolverQueryLogConfigArgs;
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
 *         var example = new ResolverQueryLogConfig(&#34;example&#34;, ResolverQueryLogConfigArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .destinationArn(exampleAwsS3Bucket.arn())
 *             .tags(Map.of(&#34;Environment&#34;, &#34;Prod&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import
 * 
 * Route 53 Resolver query logging configurations using the Route 53 Resolver query logging configuration ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:route53/resolverQueryLogConfig:ResolverQueryLogConfig example rqlc-92edc3b1838248bf
 * ```
 * 
 */
@ResourceType(type="aws:route53/resolverQueryLogConfig:ResolverQueryLogConfig")
public class ResolverQueryLogConfig extends com.pulumi.resources.CustomResource {
    /**
     * The ARN (Amazon Resource Name) of the Route 53 Resolver query logging configuration.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN (Amazon Resource Name) of the Route 53 Resolver query logging configuration.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ARN of the resource that you want Route 53 Resolver to send query logs.
     * You can send query logs to an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     * 
     */
    @Export(name="destinationArn", refs={String.class}, tree="[0]")
    private Output<String> destinationArn;

    /**
     * @return The ARN of the resource that you want Route 53 Resolver to send query logs.
     * You can send query logs to an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     * 
     */
    public Output<String> destinationArn() {
        return this.destinationArn;
    }
    /**
     * The name of the Route 53 Resolver query logging configuration.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Route 53 Resolver query logging configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The AWS account ID of the account that created the query logging configuration.
     * 
     */
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    /**
     * @return The AWS account ID of the account that created the query logging configuration.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with the current account by another AWS account.
     * Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    @Export(name="shareStatus", refs={String.class}, tree="[0]")
    private Output<String> shareStatus;

    /**
     * @return An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with the current account by another AWS account.
     * Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    public Output<String> shareStatus() {
        return this.shareStatus;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverQueryLogConfig(String name) {
        this(name, ResolverQueryLogConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverQueryLogConfig(String name, ResolverQueryLogConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverQueryLogConfig(String name, ResolverQueryLogConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverQueryLogConfig:ResolverQueryLogConfig", name, args == null ? ResolverQueryLogConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResolverQueryLogConfig(String name, Output<String> id, @Nullable ResolverQueryLogConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverQueryLogConfig:ResolverQueryLogConfig", name, state, makeResourceOptions(options, id));
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
    public static ResolverQueryLogConfig get(String name, Output<String> id, @Nullable ResolverQueryLogConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResolverQueryLogConfig(name, id, state, options);
    }
}
