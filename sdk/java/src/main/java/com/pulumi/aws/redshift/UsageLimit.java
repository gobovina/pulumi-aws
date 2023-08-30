// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.redshift.UsageLimitArgs;
import com.pulumi.aws.redshift.inputs.UsageLimitState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new Amazon Redshift Usage Limit.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.redshift.UsageLimit;
 * import com.pulumi.aws.redshift.UsageLimitArgs;
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
 *         var example = new UsageLimit(&#34;example&#34;, UsageLimitArgs.builder()        
 *             .clusterIdentifier(aws_redshift_cluster.example().id())
 *             .featureType(&#34;concurrency-scaling&#34;)
 *             .limitType(&#34;time&#34;)
 *             .amount(60)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Redshift usage limits using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:redshift/usageLimit:UsageLimit example example-id
 * ```
 * 
 */
@ResourceType(type="aws:redshift/usageLimit:UsageLimit")
public class UsageLimit extends com.pulumi.resources.CustomResource {
    /**
     * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB). The value must be a positive number.
     * 
     */
    @Export(name="amount", refs={Integer.class}, tree="[0]")
    private Output<Integer> amount;

    /**
     * @return The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB). The value must be a positive number.
     * 
     */
    public Output<Integer> amount() {
        return this.amount;
    }
    /**
     * Amazon Resource Name (ARN) of the Redshift Usage Limit.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Redshift Usage Limit.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The action that Amazon Redshift takes when the limit is reached. The default is `log`. Valid values are `log`, `emit-metric`, and `disable`.
     * 
     */
    @Export(name="breachAction", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> breachAction;

    /**
     * @return The action that Amazon Redshift takes when the limit is reached. The default is `log`. Valid values are `log`, `emit-metric`, and `disable`.
     * 
     */
    public Output<Optional<String>> breachAction() {
        return Codegen.optional(this.breachAction);
    }
    /**
     * The identifier of the cluster that you want to limit usage.
     * 
     */
    @Export(name="clusterIdentifier", refs={String.class}, tree="[0]")
    private Output<String> clusterIdentifier;

    /**
     * @return The identifier of the cluster that you want to limit usage.
     * 
     */
    public Output<String> clusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * The Amazon Redshift feature that you want to limit. Valid values are `spectrum`, `concurrency-scaling`, and `cross-region-datasharing`.
     * 
     */
    @Export(name="featureType", refs={String.class}, tree="[0]")
    private Output<String> featureType;

    /**
     * @return The Amazon Redshift feature that you want to limit. Valid values are `spectrum`, `concurrency-scaling`, and `cross-region-datasharing`.
     * 
     */
    public Output<String> featureType() {
        return this.featureType;
    }
    /**
     * The type of limit. Depending on the feature type, this can be based on a time duration or data size. If FeatureType is `spectrum`, then LimitType must be `data-scanned`. If FeatureType is `concurrency-scaling`, then LimitType must be `time`. If FeatureType is `cross-region-datasharing`, then LimitType must be `data-scanned`. Valid values are `data-scanned`, and `time`.
     * 
     */
    @Export(name="limitType", refs={String.class}, tree="[0]")
    private Output<String> limitType;

    /**
     * @return The type of limit. Depending on the feature type, this can be based on a time duration or data size. If FeatureType is `spectrum`, then LimitType must be `data-scanned`. If FeatureType is `concurrency-scaling`, then LimitType must be `time`. If FeatureType is `cross-region-datasharing`, then LimitType must be `data-scanned`. Valid values are `data-scanned`, and `time`.
     * 
     */
    public Output<String> limitType() {
        return this.limitType;
    }
    /**
     * The time period that the amount applies to. A weekly period begins on Sunday. The default is `monthly`. Valid values are `daily`, `weekly`, and `monthly`.
     * 
     */
    @Export(name="period", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> period;

    /**
     * @return The time period that the amount applies to. A weekly period begins on Sunday. The default is `monthly`. Valid values are `daily`, `weekly`, and `monthly`.
     * 
     */
    public Output<Optional<String>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
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
    public UsageLimit(String name) {
        this(name, UsageLimitArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UsageLimit(String name, UsageLimitArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UsageLimit(String name, UsageLimitArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/usageLimit:UsageLimit", name, args == null ? UsageLimitArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UsageLimit(String name, Output<String> id, @Nullable UsageLimitState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/usageLimit:UsageLimit", name, state, makeResourceOptions(options, id));
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
    public static UsageLimit get(String name, Output<String> id, @Nullable UsageLimitState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UsageLimit(name, id, state, options);
    }
}
