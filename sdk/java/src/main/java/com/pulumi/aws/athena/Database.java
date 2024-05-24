// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.athena;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.athena.DatabaseArgs;
import com.pulumi.aws.athena.inputs.DatabaseState;
import com.pulumi.aws.athena.outputs.DatabaseAclConfiguration;
import com.pulumi.aws.athena.outputs.DatabaseEncryptionConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Athena database.
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
 * import com.pulumi.aws.athena.Database;
 * import com.pulumi.aws.athena.DatabaseArgs;
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
 *         var example = new BucketV2("example", BucketV2Args.builder()
 *             .bucket("example")
 *             .build());
 * 
 *         var exampleDatabase = new Database("exampleDatabase", DatabaseArgs.builder()
 *             .name("database_name")
 *             .bucket(example.id())
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
 * Using `pulumi import`, import Athena Databases using their name. For example:
 * 
 * ```sh
 * $ pulumi import aws:athena/database:Database example example
 * ```
 * Certain resource arguments, like `encryption_configuration` and `bucket`, do not have an API method for reading the information after creation. If the argument is set in the Pulumi program on an imported resource, Pulumi will always show a difference. To workaround this behavior, either omit the argument from the Pulumi program or use `ignore_changes` to hide the difference. For example:
 * 
 */
@ResourceType(type="aws:athena/database:Database")
public class Database extends com.pulumi.resources.CustomResource {
    /**
     * That an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
     * 
     */
    @Export(name="aclConfiguration", refs={DatabaseAclConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ DatabaseAclConfiguration> aclConfiguration;

    /**
     * @return That an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
     * 
     */
    public Output<Optional<DatabaseAclConfiguration>> aclConfiguration() {
        return Codegen.optional(this.aclConfiguration);
    }
    /**
     * Name of S3 bucket to save the results of the query execution.
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> bucket;

    /**
     * @return Name of S3 bucket to save the results of the query execution.
     * 
     */
    public Output<Optional<String>> bucket() {
        return Codegen.optional(this.bucket);
    }
    /**
     * Description of the database.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Description of the database.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. See Encryption Configuration below.
     * 
     */
    @Export(name="encryptionConfiguration", refs={DatabaseEncryptionConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ DatabaseEncryptionConfiguration> encryptionConfiguration;

    /**
     * @return Encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. See Encryption Configuration below.
     * 
     */
    public Output<Optional<DatabaseEncryptionConfiguration>> encryptionConfiguration() {
        return Codegen.optional(this.encryptionConfiguration);
    }
    /**
     * AWS account ID that you expect to be the owner of the Amazon S3 bucket.
     * 
     */
    @Export(name="expectedBucketOwner", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expectedBucketOwner;

    /**
     * @return AWS account ID that you expect to be the owner of the Amazon S3 bucket.
     * 
     */
    public Output<Optional<String>> expectedBucketOwner() {
        return Codegen.optional(this.expectedBucketOwner);
    }
    /**
     * Boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
     * 
     */
    @Export(name="forceDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * Name of the database to create.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the database to create.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Key-value map of custom metadata properties for the database definition.
     * 
     */
    @Export(name="properties", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> properties;

    /**
     * @return Key-value map of custom metadata properties for the database definition.
     * 
     */
    public Output<Optional<Map<String,String>>> properties() {
        return Codegen.optional(this.properties);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(String name, @Nullable DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(String name, @Nullable DatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:athena/database:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Database(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:athena/database:Database", name, state, makeResourceOptions(options, id));
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
    public static Database get(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, state, options);
    }
}
