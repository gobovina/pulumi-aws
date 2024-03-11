// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.athena;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.athena.NamedQueryArgs;
import com.pulumi.aws.athena.inputs.NamedQueryState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Athena Named Query resource.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.kms.Key;
 * import com.pulumi.aws.kms.KeyArgs;
 * import com.pulumi.aws.athena.Workgroup;
 * import com.pulumi.aws.athena.WorkgroupArgs;
 * import com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs;
 * import com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationArgs;
 * import com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationEncryptionConfigurationArgs;
 * import com.pulumi.aws.athena.Database;
 * import com.pulumi.aws.athena.DatabaseArgs;
 * import com.pulumi.aws.athena.NamedQuery;
 * import com.pulumi.aws.athena.NamedQueryArgs;
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
 *         var hoge = new BucketV2(&#34;hoge&#34;, BucketV2Args.builder()        
 *             .bucket(&#34;tf-test&#34;)
 *             .build());
 * 
 *         var test = new Key(&#34;test&#34;, KeyArgs.builder()        
 *             .deletionWindowInDays(7)
 *             .description(&#34;Athena KMS Key&#34;)
 *             .build());
 * 
 *         var testWorkgroup = new Workgroup(&#34;testWorkgroup&#34;, WorkgroupArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .configuration(WorkgroupConfigurationArgs.builder()
 *                 .resultConfiguration(WorkgroupConfigurationResultConfigurationArgs.builder()
 *                     .encryptionConfiguration(WorkgroupConfigurationResultConfigurationEncryptionConfigurationArgs.builder()
 *                         .encryptionOption(&#34;SSE_KMS&#34;)
 *                         .kmsKeyArn(test.arn())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var hogeDatabase = new Database(&#34;hogeDatabase&#34;, DatabaseArgs.builder()        
 *             .name(&#34;users&#34;)
 *             .bucket(hoge.id())
 *             .build());
 * 
 *         var foo = new NamedQuery(&#34;foo&#34;, NamedQueryArgs.builder()        
 *             .name(&#34;bar&#34;)
 *             .workgroup(testWorkgroup.id())
 *             .database(hogeDatabase.name())
 *             .query(hogeDatabase.name().applyValue(name -&gt; String.format(&#34;SELECT * FROM %s limit 10;&#34;, name)))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Athena Named Query using the query ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:athena/namedQuery:NamedQuery example 0123456789
 * ```
 * 
 */
@ResourceType(type="aws:athena/namedQuery:NamedQuery")
public class NamedQuery extends com.pulumi.resources.CustomResource {
    /**
     * Database to which the query belongs.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return Database to which the query belongs.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Brief explanation of the query. Maximum length of 1024.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Brief explanation of the query. Maximum length of 1024.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Plain language name for the query. Maximum length of 128.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Plain language name for the query. Maximum length of 128.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Text of the query itself. In other words, all query statements. Maximum length of 262144.
     * 
     */
    @Export(name="query", refs={String.class}, tree="[0]")
    private Output<String> query;

    /**
     * @return Text of the query itself. In other words, all query statements. Maximum length of 262144.
     * 
     */
    public Output<String> query() {
        return this.query;
    }
    /**
     * Workgroup to which the query belongs. Defaults to `primary`
     * 
     */
    @Export(name="workgroup", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> workgroup;

    /**
     * @return Workgroup to which the query belongs. Defaults to `primary`
     * 
     */
    public Output<Optional<String>> workgroup() {
        return Codegen.optional(this.workgroup);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamedQuery(String name) {
        this(name, NamedQueryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamedQuery(String name, NamedQueryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamedQuery(String name, NamedQueryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:athena/namedQuery:NamedQuery", name, args == null ? NamedQueryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NamedQuery(String name, Output<String> id, @Nullable NamedQueryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:athena/namedQuery:NamedQuery", name, state, makeResourceOptions(options, id));
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
    public static NamedQuery get(String name, Output<String> id, @Nullable NamedQueryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NamedQuery(name, id, state, options);
    }
}
