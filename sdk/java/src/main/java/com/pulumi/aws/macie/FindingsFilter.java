// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.macie.FindingsFilterArgs;
import com.pulumi.aws.macie.inputs.FindingsFilterState;
import com.pulumi.aws.macie.outputs.FindingsFilterFindingCriteria;
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
 * Provides a resource to manage an [Amazon Macie Findings Filter](https://docs.aws.amazon.com/macie/latest/APIReference/findingsfilters-id.html).
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.macie2.Account;
 * import com.pulumi.aws.macie.FindingsFilter;
 * import com.pulumi.aws.macie.FindingsFilterArgs;
 * import com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaArgs;
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
 *         var example = new Account("example");
 * 
 *         var test = new FindingsFilter("test", FindingsFilterArgs.builder()
 *             .name("NAME OF THE FINDINGS FILTER")
 *             .description("DESCRIPTION")
 *             .position(1)
 *             .action("ARCHIVE")
 *             .findingCriteria(FindingsFilterFindingCriteriaArgs.builder()
 *                 .criterions(FindingsFilterFindingCriteriaCriterionArgs.builder()
 *                     .field("region")
 *                     .eqs(current.name())
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(testAwsMacie2Account)
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
 * Using `pulumi import`, import `aws_macie2_findings_filter` using the id. For example:
 * 
 * ```sh
 * $ pulumi import aws:macie/findingsFilter:FindingsFilter example abcd1
 * ```
 * 
 */
@ResourceType(type="aws:macie/findingsFilter:FindingsFilter")
public class FindingsFilter extends com.pulumi.resources.CustomResource {
    /**
     * The action to perform on findings that meet the filter criteria (`finding_criteria`). Valid values are: `ARCHIVE`, suppress (automatically archive) the findings; and, `NOOP`, don&#39;t perform any action on the findings.
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output<String> action;

    /**
     * @return The action to perform on findings that meet the filter criteria (`finding_criteria`). Valid values are: `ARCHIVE`, suppress (automatically archive) the findings; and, `NOOP`, don&#39;t perform any action on the findings.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * The Amazon Resource Name (ARN) of the Findings Filter.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Findings Filter.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A custom description of the filter. The description can contain as many as 512 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A custom description of the filter. The description can contain as many as 512 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The criteria to use to filter findings.
     * 
     */
    @Export(name="findingCriteria", refs={FindingsFilterFindingCriteria.class}, tree="[0]")
    private Output<FindingsFilterFindingCriteria> findingCriteria;

    /**
     * @return The criteria to use to filter findings.
     * 
     */
    public Output<FindingsFilterFindingCriteria> findingCriteria() {
        return this.findingCriteria;
    }
    /**
     * A custom name for the filter. The name must contain at least 3 characters and can contain as many as 64 characters. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A custom name for the filter. The name must contain at least 3 characters and can contain as many as 64 characters. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", refs={String.class}, tree="[0]")
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines the order in which the filter is applied to findings, relative to other filters that are also applied to the findings.
     * 
     */
    @Export(name="position", refs={Integer.class}, tree="[0]")
    private Output<Integer> position;

    /**
     * @return The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines the order in which the filter is applied to findings, relative to other filters that are also applied to the findings.
     * 
     */
    public Output<Integer> position() {
        return this.position;
    }
    /**
     * A map of key-value pairs that specifies the tags to associate with the filter.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of key-value pairs that specifies the tags to associate with the filter.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FindingsFilter(String name) {
        this(name, FindingsFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FindingsFilter(String name, FindingsFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FindingsFilter(String name, FindingsFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:macie/findingsFilter:FindingsFilter", name, args == null ? FindingsFilterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FindingsFilter(String name, Output<String> id, @Nullable FindingsFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:macie/findingsFilter:FindingsFilter", name, state, makeResourceOptions(options, id));
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
    public static FindingsFilter get(String name, Output<String> id, @Nullable FindingsFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FindingsFilter(name, id, state, options);
    }
}
