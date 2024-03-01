// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.securityhub.FindingAggregatorArgs;
import com.pulumi.aws.securityhub.inputs.FindingAggregatorState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Security Hub finding aggregator. Security Hub needs to be enabled in a region in order for the aggregator to pull through findings.
 * 
 * ## Example Usage
 * ### All Regions Usage
 * 
 * The following example will enable the aggregator for every region.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.securityhub.Account;
 * import com.pulumi.aws.securityhub.FindingAggregator;
 * import com.pulumi.aws.securityhub.FindingAggregatorArgs;
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
 *         var example = new Account(&#34;example&#34;);
 * 
 *         var exampleFindingAggregator = new FindingAggregator(&#34;exampleFindingAggregator&#34;, FindingAggregatorArgs.builder()        
 *             .linkingMode(&#34;ALL_REGIONS&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### All Regions Except Specified Regions Usage
 * 
 * The following example will enable the aggregator for every region except those specified in `specified_regions`.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.securityhub.Account;
 * import com.pulumi.aws.securityhub.FindingAggregator;
 * import com.pulumi.aws.securityhub.FindingAggregatorArgs;
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
 *         var example = new Account(&#34;example&#34;);
 * 
 *         var exampleFindingAggregator = new FindingAggregator(&#34;exampleFindingAggregator&#34;, FindingAggregatorArgs.builder()        
 *             .linkingMode(&#34;ALL_REGIONS_EXCEPT_SPECIFIED&#34;)
 *             .specifiedRegions(            
 *                 &#34;eu-west-1&#34;,
 *                 &#34;eu-west-2&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Specified Regions Usage
 * 
 * The following example will enable the aggregator for every region specified in `specified_regions`.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.securityhub.Account;
 * import com.pulumi.aws.securityhub.FindingAggregator;
 * import com.pulumi.aws.securityhub.FindingAggregatorArgs;
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
 *         var example = new Account(&#34;example&#34;);
 * 
 *         var exampleFindingAggregator = new FindingAggregator(&#34;exampleFindingAggregator&#34;, FindingAggregatorArgs.builder()        
 *             .linkingMode(&#34;SPECIFIED_REGIONS&#34;)
 *             .specifiedRegions(            
 *                 &#34;eu-west-1&#34;,
 *                 &#34;eu-west-2&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import an existing Security Hub finding aggregator using the `arn`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:securityhub/findingAggregator:FindingAggregator example arn:aws:securityhub:eu-west-1:123456789098:finding-aggregator/abcd1234-abcd-1234-1234-abcdef123456
 * ```
 * 
 */
@ResourceType(type="aws:securityhub/findingAggregator:FindingAggregator")
public class FindingAggregator extends com.pulumi.resources.CustomResource {
    /**
     * Indicates whether to aggregate findings from all of the available Regions or from a specified list. The options are `ALL_REGIONS`, `ALL_REGIONS_EXCEPT_SPECIFIED` or `SPECIFIED_REGIONS`. When `ALL_REGIONS` or `ALL_REGIONS_EXCEPT_SPECIFIED` are used, Security Hub will automatically aggregate findings from new Regions as Security Hub supports them and you opt into them.
     * 
     */
    @Export(name="linkingMode", refs={String.class}, tree="[0]")
    private Output<String> linkingMode;

    /**
     * @return Indicates whether to aggregate findings from all of the available Regions or from a specified list. The options are `ALL_REGIONS`, `ALL_REGIONS_EXCEPT_SPECIFIED` or `SPECIFIED_REGIONS`. When `ALL_REGIONS` or `ALL_REGIONS_EXCEPT_SPECIFIED` are used, Security Hub will automatically aggregate findings from new Regions as Security Hub supports them and you opt into them.
     * 
     */
    public Output<String> linkingMode() {
        return this.linkingMode;
    }
    /**
     * List of regions to include or exclude (required if `linking_mode` is set to `ALL_REGIONS_EXCEPT_SPECIFIED` or `SPECIFIED_REGIONS`)
     * 
     */
    @Export(name="specifiedRegions", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> specifiedRegions;

    /**
     * @return List of regions to include or exclude (required if `linking_mode` is set to `ALL_REGIONS_EXCEPT_SPECIFIED` or `SPECIFIED_REGIONS`)
     * 
     */
    public Output<Optional<List<String>>> specifiedRegions() {
        return Codegen.optional(this.specifiedRegions);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FindingAggregator(String name) {
        this(name, FindingAggregatorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FindingAggregator(String name, FindingAggregatorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FindingAggregator(String name, FindingAggregatorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/findingAggregator:FindingAggregator", name, args == null ? FindingAggregatorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FindingAggregator(String name, Output<String> id, @Nullable FindingAggregatorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/findingAggregator:FindingAggregator", name, state, makeResourceOptions(options, id));
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
    public static FindingAggregator get(String name, Output<String> id, @Nullable FindingAggregatorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FindingAggregator(name, id, state, options);
    }
}
