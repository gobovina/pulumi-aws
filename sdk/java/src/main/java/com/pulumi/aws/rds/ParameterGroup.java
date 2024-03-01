// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rds.ParameterGroupArgs;
import com.pulumi.aws.rds.inputs.ParameterGroupState;
import com.pulumi.aws.rds.outputs.ParameterGroupParameter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an RDS DB parameter group resource. Documentation of the available parameters for various RDS engines can be found at:
 * 
 * * [Aurora MySQL Parameters](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Reference.html)
 * * [Aurora PostgreSQL Parameters](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraPostgreSQL.Reference.html)
 * * [MariaDB Parameters](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.MariaDB.Parameters.html)
 * * [Oracle Parameters](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ModifyInstance.Oracle.html#USER_ModifyInstance.Oracle.sqlnet)
 * * [PostgreSQL Parameters](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.PostgreSQL.CommonDBATasks.html#Appendix.PostgreSQL.CommonDBATasks.Parameters)
 * 
 * &gt; **NOTE:** After applying your changes, you may encounter a perpetual diff in your pulumi preview
 * output for a `parameter` whose `value` remains unchanged but whose `apply_method` is changing
 * (e.g., from `immediate` to `pending-reboot`, or `pending-reboot` to `immediate`). If only the
 * apply method of a parameter is changing, the AWS API will not register this change. To change
 * the `apply_method` of a parameter, its value must also change.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.rds.ParameterGroup;
 * import com.pulumi.aws.rds.ParameterGroupArgs;
 * import com.pulumi.aws.rds.inputs.ParameterGroupParameterArgs;
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
 *         var default_ = new ParameterGroup(&#34;default&#34;, ParameterGroupArgs.builder()        
 *             .name(&#34;rds-pg&#34;)
 *             .family(&#34;mysql5.6&#34;)
 *             .parameters(            
 *                 ParameterGroupParameterArgs.builder()
 *                     .name(&#34;character_set_server&#34;)
 *                     .value(&#34;utf8&#34;)
 *                     .build(),
 *                 ParameterGroupParameterArgs.builder()
 *                     .name(&#34;character_set_client&#34;)
 *                     .value(&#34;utf8&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### `create_before_destroy` Lifecycle Configuration
 * 
 * The `create_before_destroy`
 * lifecycle configuration is necessary for modifications that force re-creation of an existing,
 * in-use parameter group. This includes common situations like changing the group `name` or
 * bumping the `family` version during a major version upgrade. This configuration will prevent destruction
 * of the deposed parameter group while still in use by the database during upgrade.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.rds.ParameterGroup;
 * import com.pulumi.aws.rds.ParameterGroupArgs;
 * import com.pulumi.aws.rds.inputs.ParameterGroupParameterArgs;
 * import com.pulumi.aws.rds.Instance;
 * import com.pulumi.aws.rds.InstanceArgs;
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
 *         var example = new ParameterGroup(&#34;example&#34;, ParameterGroupArgs.builder()        
 *             .name(&#34;my-pg&#34;)
 *             .family(&#34;postgres13&#34;)
 *             .parameters(ParameterGroupParameterArgs.builder()
 *                 .name(&#34;log_connections&#34;)
 *                 .value(&#34;1&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleInstance = new Instance(&#34;exampleInstance&#34;, InstanceArgs.builder()        
 *             .parameterGroupName(example.name())
 *             .applyImmediately(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import DB Parameter groups using the `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:rds/parameterGroup:ParameterGroup rds_pg rds-pg
 * ```
 * 
 */
@ResourceType(type="aws:rds/parameterGroup:ParameterGroup")
public class ParameterGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the db parameter group.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the db parameter group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The description of the DB parameter group. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return The description of the DB parameter group. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The family of the DB parameter group.
     * 
     */
    @Export(name="family", refs={String.class}, tree="[0]")
    private Output<String> family;

    /**
     * @return The family of the DB parameter group.
     * 
     */
    public Output<String> family() {
        return this.family;
    }
    /**
     * The name of the DB parameter group. If omitted, this provider will assign a random, unique name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the DB parameter group. If omitted, this provider will assign a random, unique name.
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
     * The DB parameters to apply. See `parameter` Block below for more details. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-parameters.html) after initial creation of the group.
     * 
     */
    @Export(name="parameters", refs={List.class,ParameterGroupParameter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ParameterGroupParameter>> parameters;

    /**
     * @return The DB parameters to apply. See `parameter` Block below for more details. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-parameters.html) after initial creation of the group.
     * 
     */
    public Output<Optional<List<ParameterGroupParameter>>> parameters() {
        return Codegen.optional(this.parameters);
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
    public ParameterGroup(String name) {
        this(name, ParameterGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ParameterGroup(String name, ParameterGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ParameterGroup(String name, ParameterGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/parameterGroup:ParameterGroup", name, args == null ? ParameterGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ParameterGroup(String name, Output<String> id, @Nullable ParameterGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/parameterGroup:ParameterGroup", name, state, makeResourceOptions(options, id));
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
    public static ParameterGroup get(String name, Output<String> id, @Nullable ParameterGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ParameterGroup(name, id, state, options);
    }
}
