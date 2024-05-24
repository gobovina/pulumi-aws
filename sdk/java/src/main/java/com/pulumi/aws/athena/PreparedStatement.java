// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.athena;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.athena.PreparedStatementArgs;
import com.pulumi.aws.athena.inputs.PreparedStatementState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an Athena Prepared Statement.
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
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.athena.Workgroup;
 * import com.pulumi.aws.athena.WorkgroupArgs;
 * import com.pulumi.aws.athena.Database;
 * import com.pulumi.aws.athena.DatabaseArgs;
 * import com.pulumi.aws.athena.PreparedStatement;
 * import com.pulumi.aws.athena.PreparedStatementArgs;
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
 *         var test = new BucketV2("test", BucketV2Args.builder()
 *             .bucket("tf-test")
 *             .forceDestroy(true)
 *             .build());
 * 
 *         var testWorkgroup = new Workgroup("testWorkgroup", WorkgroupArgs.builder()
 *             .name("tf-test")
 *             .build());
 * 
 *         var testDatabase = new Database("testDatabase", DatabaseArgs.builder()
 *             .name("example")
 *             .bucket(test.bucket())
 *             .build());
 * 
 *         var testPreparedStatement = new PreparedStatement("testPreparedStatement", PreparedStatementArgs.builder()
 *             .name("tf_test")
 *             .queryStatement(testDatabase.name().applyValue(name -> String.format("SELECT * FROM %s WHERE x = ?", name)))
 *             .workgroup(testWorkgroup.name())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Athena Prepared Statement using the `WORKGROUP-NAME/STATEMENT-NAME`. For example:
 * 
 * ```sh
 * $ pulumi import aws:athena/preparedStatement:PreparedStatement example 12345abcde/example
 * ```
 * 
 */
@ResourceType(type="aws:athena/preparedStatement:PreparedStatement")
public class PreparedStatement extends com.pulumi.resources.CustomResource {
    /**
     * Brief explanation of prepared statement. Maximum length of 1024.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Brief explanation of prepared statement. Maximum length of 1024.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the prepared statement. Maximum length of 256.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the prepared statement. Maximum length of 256.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The query string for the prepared statement.
     * 
     */
    @Export(name="queryStatement", refs={String.class}, tree="[0]")
    private Output<String> queryStatement;

    /**
     * @return The query string for the prepared statement.
     * 
     */
    public Output<String> queryStatement() {
        return this.queryStatement;
    }
    /**
     * The name of the workgroup to which the prepared statement belongs.
     * 
     */
    @Export(name="workgroup", refs={String.class}, tree="[0]")
    private Output<String> workgroup;

    /**
     * @return The name of the workgroup to which the prepared statement belongs.
     * 
     */
    public Output<String> workgroup() {
        return this.workgroup;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PreparedStatement(String name) {
        this(name, PreparedStatementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PreparedStatement(String name, PreparedStatementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PreparedStatement(String name, PreparedStatementArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:athena/preparedStatement:PreparedStatement", name, args == null ? PreparedStatementArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PreparedStatement(String name, Output<String> id, @Nullable PreparedStatementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:athena/preparedStatement:PreparedStatement", name, state, makeResourceOptions(options, id));
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
    public static PreparedStatement get(String name, Output<String> id, @Nullable PreparedStatementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PreparedStatement(name, id, state, options);
    }
}
