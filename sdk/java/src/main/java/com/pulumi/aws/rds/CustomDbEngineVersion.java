// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rds.CustomDbEngineVersionArgs;
import com.pulumi.aws.rds.inputs.CustomDbEngineVersionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an custom engine version (CEV) resource for Amazon RDS Custom. For additional information, see [Working with CEVs for RDS Custom for Oracle](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html) and [Working with CEVs for RDS Custom for SQL Server](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev-sqlserver.html) in the the [RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Welcome.html).
 * 
 * ## Example Usage
 * ### RDS Custom for Oracle Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.kms.Key;
 * import com.pulumi.aws.kms.KeyArgs;
 * import com.pulumi.aws.rds.CustomDbEngineVersion;
 * import com.pulumi.aws.rds.CustomDbEngineVersionArgs;
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
 *         var exampleKey = new Key(&#34;exampleKey&#34;, KeyArgs.builder()        
 *             .description(&#34;KMS symmetric key for RDS Custom for Oracle&#34;)
 *             .build());
 * 
 *         var exampleCustomDbEngineVersion = new CustomDbEngineVersion(&#34;exampleCustomDbEngineVersion&#34;, CustomDbEngineVersionArgs.builder()        
 *             .databaseInstallationFilesS3BucketName(&#34;DOC-EXAMPLE-BUCKET&#34;)
 *             .databaseInstallationFilesS3Prefix(&#34;1915_GI/&#34;)
 *             .engine(&#34;custom-oracle-ee-cdb&#34;)
 *             .engineVersion(&#34;19.cdb_cev1&#34;)
 *             .kmsKeyId(exampleKey.arn())
 *             .manifest(&#34;&#34;&#34;
 *   {
 * 	&#34;databaseInstallationFileNames&#34;:[&#34;V982063-01.zip&#34;]
 *   }
 *             &#34;&#34;&#34;)
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Name&#34;, &#34;example&#34;),
 *                 Map.entry(&#34;Key&#34;, &#34;value&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### RDS Custom for Oracle External Manifest Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.kms.Key;
 * import com.pulumi.aws.kms.KeyArgs;
 * import com.pulumi.aws.rds.CustomDbEngineVersion;
 * import com.pulumi.aws.rds.CustomDbEngineVersionArgs;
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
 *         var exampleKey = new Key(&#34;exampleKey&#34;, KeyArgs.builder()        
 *             .description(&#34;KMS symmetric key for RDS Custom for Oracle&#34;)
 *             .build());
 * 
 *         var exampleCustomDbEngineVersion = new CustomDbEngineVersion(&#34;exampleCustomDbEngineVersion&#34;, CustomDbEngineVersionArgs.builder()        
 *             .databaseInstallationFilesS3BucketName(&#34;DOC-EXAMPLE-BUCKET&#34;)
 *             .databaseInstallationFilesS3Prefix(&#34;1915_GI/&#34;)
 *             .engine(&#34;custom-oracle-ee-cdb&#34;)
 *             .engineVersion(&#34;19.cdb_cev1&#34;)
 *             .kmsKeyId(exampleKey.arn())
 *             .filename(&#34;manifest_1915_GI.json&#34;)
 *             .manifestHash(computeFileBase64Sha256(manifest_1915_GI.json()))
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Name&#34;, &#34;example&#34;),
 *                 Map.entry(&#34;Key&#34;, &#34;value&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### RDS Custom for SQL Server Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.rds.CustomDbEngineVersion;
 * import com.pulumi.aws.rds.CustomDbEngineVersionArgs;
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
 *         var test = new CustomDbEngineVersion(&#34;test&#34;, CustomDbEngineVersionArgs.builder()        
 *             .engine(&#34;custom-sqlserver-se&#34;)
 *             .engineVersion(&#34;15.00.4249.2.cev-1&#34;)
 *             .sourceImageId(&#34;ami-0aa12345678a12ab1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### RDS Custom for SQL Server Usage with AMI from another region
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.AmiCopy;
 * import com.pulumi.aws.ec2.AmiCopyArgs;
 * import com.pulumi.aws.rds.CustomDbEngineVersion;
 * import com.pulumi.aws.rds.CustomDbEngineVersionArgs;
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
 *         var example = new AmiCopy(&#34;example&#34;, AmiCopyArgs.builder()        
 *             .description(&#34;A copy of ami-xxxxxxxx&#34;)
 *             .sourceAmiId(&#34;ami-xxxxxxxx&#34;)
 *             .sourceAmiRegion(&#34;us-east-1&#34;)
 *             .build());
 * 
 *         var test = new CustomDbEngineVersion(&#34;test&#34;, CustomDbEngineVersionArgs.builder()        
 *             .engine(&#34;custom-sqlserver-se&#34;)
 *             .engineVersion(&#34;15.00.4249.2.cev-1&#34;)
 *             .sourceImageId(example.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import custom engine versions for Amazon RDS custom using the `engine` and `engine_version` separated by a colon (`:`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:rds/customDbEngineVersion:CustomDbEngineVersion example custom-oracle-ee-cdb:19.cdb_cev1
 * ```
 * 
 */
@ResourceType(type="aws:rds/customDbEngineVersion:CustomDbEngineVersion")
public class CustomDbEngineVersion extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) for the custom engine version.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) for the custom engine version.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The date and time that the CEV was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The date and time that the CEV was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The name of the Amazon S3 bucket that contains the database installation files.
     * 
     */
    @Export(name="databaseInstallationFilesS3BucketName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> databaseInstallationFilesS3BucketName;

    /**
     * @return The name of the Amazon S3 bucket that contains the database installation files.
     * 
     */
    public Output<Optional<String>> databaseInstallationFilesS3BucketName() {
        return Codegen.optional(this.databaseInstallationFilesS3BucketName);
    }
    /**
     * The prefix for the Amazon S3 bucket that contains the database installation files.
     * 
     */
    @Export(name="databaseInstallationFilesS3Prefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> databaseInstallationFilesS3Prefix;

    /**
     * @return The prefix for the Amazon S3 bucket that contains the database installation files.
     * 
     */
    public Output<Optional<String>> databaseInstallationFilesS3Prefix() {
        return Codegen.optional(this.databaseInstallationFilesS3Prefix);
    }
    /**
     * The name of the DB parameter group family for the CEV.
     * 
     */
    @Export(name="dbParameterGroupFamily", refs={String.class}, tree="[0]")
    private Output<String> dbParameterGroupFamily;

    /**
     * @return The name of the DB parameter group family for the CEV.
     * 
     */
    public Output<String> dbParameterGroupFamily() {
        return this.dbParameterGroupFamily;
    }
    /**
     * The description of the CEV.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the CEV.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the database engine. Valid values are `custom-oracle*`, `custom-sqlserver*`.
     * 
     */
    @Export(name="engine", refs={String.class}, tree="[0]")
    private Output<String> engine;

    /**
     * @return The name of the database engine. Valid values are `custom-oracle*`, `custom-sqlserver*`.
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    /**
     * The version of the database engine.
     * 
     */
    @Export(name="engineVersion", refs={String.class}, tree="[0]")
    private Output<String> engineVersion;

    /**
     * @return The version of the database engine.
     * 
     */
    public Output<String> engineVersion() {
        return this.engineVersion;
    }
    /**
     * The name of the manifest file within the local filesystem. Conflicts with `manifest`.
     * 
     */
    @Export(name="filename", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> filename;

    /**
     * @return The name of the manifest file within the local filesystem. Conflicts with `manifest`.
     * 
     */
    public Output<Optional<String>> filename() {
        return Codegen.optional(this.filename);
    }
    /**
     * The ID of the AMI that was created with the CEV.
     * 
     */
    @Export(name="imageId", refs={String.class}, tree="[0]")
    private Output<String> imageId;

    /**
     * @return The ID of the AMI that was created with the CEV.
     * 
     */
    public Output<String> imageId() {
        return this.imageId;
    }
    /**
     * The ARN of the AWS KMS key that is used to encrypt the database installation files. Required for RDS Custom for Oracle.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyId;

    /**
     * @return The ARN of the AWS KMS key that is used to encrypt the database installation files. Required for RDS Custom for Oracle.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The major version of the database engine.
     * 
     */
    @Export(name="majorEngineVersion", refs={String.class}, tree="[0]")
    private Output<String> majorEngineVersion;

    /**
     * @return The major version of the database engine.
     * 
     */
    public Output<String> majorEngineVersion() {
        return this.majorEngineVersion;
    }
    /**
     * The manifest file, in JSON format, that contains the list of database installation files. Conflicts with `filename`.
     * 
     */
    @Export(name="manifest", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> manifest;

    /**
     * @return The manifest file, in JSON format, that contains the list of database installation files. Conflicts with `filename`.
     * 
     */
    public Output<Optional<String>> manifest() {
        return Codegen.optional(this.manifest);
    }
    /**
     * The returned manifest file, in JSON format, service generated and often different from input `manifest`.
     * 
     */
    @Export(name="manifestComputed", refs={String.class}, tree="[0]")
    private Output<String> manifestComputed;

    /**
     * @return The returned manifest file, in JSON format, service generated and often different from input `manifest`.
     * 
     */
    public Output<String> manifestComputed() {
        return this.manifestComputed;
    }
    /**
     * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the manifest source specified with `filename`. The usual way to set this is filebase64sha256(&#34;manifest.json&#34;) where &#34;manifest.json&#34; is the local filename of the manifest source.
     * 
     */
    @Export(name="manifestHash", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> manifestHash;

    /**
     * @return Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the manifest source specified with `filename`. The usual way to set this is filebase64sha256(&#34;manifest.json&#34;) where &#34;manifest.json&#34; is the local filename of the manifest source.
     * 
     */
    public Output<Optional<String>> manifestHash() {
        return Codegen.optional(this.manifestHash);
    }
    /**
     * The ID of the AMI to create the CEV from. Required for RDS Custom for SQL Server. For RDS Custom for Oracle, you can specify an AMI ID that was used in a different Oracle CEV.
     * 
     */
    @Export(name="sourceImageId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceImageId;

    /**
     * @return The ID of the AMI to create the CEV from. Required for RDS Custom for SQL Server. For RDS Custom for Oracle, you can specify an AMI ID that was used in a different Oracle CEV.
     * 
     */
    public Output<Optional<String>> sourceImageId() {
        return Codegen.optional(this.sourceImageId);
    }
    /**
     * The status of the CEV. Valid values are `available`, `inactive`, `inactive-except-restore`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the CEV. Valid values are `available`, `inactive`, `inactive-except-restore`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public CustomDbEngineVersion(String name) {
        this(name, CustomDbEngineVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomDbEngineVersion(String name, CustomDbEngineVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomDbEngineVersion(String name, CustomDbEngineVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/customDbEngineVersion:CustomDbEngineVersion", name, args == null ? CustomDbEngineVersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomDbEngineVersion(String name, Output<String> id, @Nullable CustomDbEngineVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/customDbEngineVersion:CustomDbEngineVersion", name, state, makeResourceOptions(options, id));
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
    public static CustomDbEngineVersion get(String name, Output<String> id, @Nullable CustomDbEngineVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomDbEngineVersion(name, id, state, options);
    }
}
