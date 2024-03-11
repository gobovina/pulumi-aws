// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.efs.FileSystemArgs;
import com.pulumi.aws.efs.inputs.FileSystemState;
import com.pulumi.aws.efs.outputs.FileSystemLifecyclePolicy;
import com.pulumi.aws.efs.outputs.FileSystemProtection;
import com.pulumi.aws.efs.outputs.FileSystemSizeInByte;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Elastic File System (EFS) File System resource.
 * 
 * ## Example Usage
 * 
 * ### EFS File System w/ tags
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.efs.FileSystem;
 * import com.pulumi.aws.efs.FileSystemArgs;
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
 *         var foo = new FileSystem(&#34;foo&#34;, FileSystemArgs.builder()        
 *             .creationToken(&#34;my-product&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;MyProduct&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Using lifecycle policy
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.efs.FileSystem;
 * import com.pulumi.aws.efs.FileSystemArgs;
 * import com.pulumi.aws.efs.inputs.FileSystemLifecyclePolicyArgs;
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
 *         var fooWithLifecylePolicy = new FileSystem(&#34;fooWithLifecylePolicy&#34;, FileSystemArgs.builder()        
 *             .creationToken(&#34;my-product&#34;)
 *             .lifecyclePolicies(FileSystemLifecyclePolicyArgs.builder()
 *                 .transitionToIa(&#34;AFTER_30_DAYS&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import the EFS file systems using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:efs/fileSystem:FileSystem foo fs-6fa144c6
 * ```
 * 
 */
@ResourceType(type="aws:efs/fileSystem:FileSystem")
public class FileSystem extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name of the file system.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name of the file system.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The identifier of the Availability Zone in which the file system&#39;s One Zone storage classes exist.
     * 
     */
    @Export(name="availabilityZoneId", refs={String.class}, tree="[0]")
    private Output<String> availabilityZoneId;

    /**
     * @return The identifier of the Availability Zone in which the file system&#39;s One Zone storage classes exist.
     * 
     */
    public Output<String> availabilityZoneId() {
        return this.availabilityZoneId;
    }
    /**
     * the AWS Availability Zone in which to create the file system. Used to create a file system that uses One Zone storage classes. See [user guide](https://docs.aws.amazon.com/efs/latest/ug/availability-durability.html) for more information.
     * 
     */
    @Export(name="availabilityZoneName", refs={String.class}, tree="[0]")
    private Output<String> availabilityZoneName;

    /**
     * @return the AWS Availability Zone in which to create the file system. Used to create a file system that uses One Zone storage classes. See [user guide](https://docs.aws.amazon.com/efs/latest/ug/availability-durability.html) for more information.
     * 
     */
    public Output<String> availabilityZoneName() {
        return this.availabilityZoneName;
    }
    /**
     * A unique name (a maximum of 64 characters are allowed)
     * used as reference when creating the Elastic File System to ensure idempotent file
     * system creation. By default generated by this provider. See [Elastic File System]
     * user guide for more information.
     * 
     */
    @Export(name="creationToken", refs={String.class}, tree="[0]")
    private Output<String> creationToken;

    /**
     * @return A unique name (a maximum of 64 characters are allowed)
     * used as reference when creating the Elastic File System to ensure idempotent file
     * system creation. By default generated by this provider. See [Elastic File System]
     * user guide for more information.
     * 
     */
    public Output<String> creationToken() {
        return this.creationToken;
    }
    /**
     * The DNS name for the filesystem per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
     * 
     */
    @Export(name="dnsName", refs={String.class}, tree="[0]")
    private Output<String> dnsName;

    /**
     * @return The DNS name for the filesystem per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    /**
     * If true, the disk will be encrypted.
     * 
     */
    @Export(name="encrypted", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> encrypted;

    /**
     * @return If true, the disk will be encrypted.
     * 
     */
    public Output<Boolean> encrypted() {
        return this.encrypted;
    }
    /**
     * The ARN for the KMS encryption key. When specifying kms_key_id, encrypted needs to be set to true.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyId;

    /**
     * @return The ARN for the KMS encryption key. When specifying kms_key_id, encrypted needs to be set to true.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object. See `lifecycle_policy` block below for details.
     * 
     */
    @Export(name="lifecyclePolicies", refs={List.class,FileSystemLifecyclePolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<FileSystemLifecyclePolicy>> lifecyclePolicies;

    /**
     * @return A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object. See `lifecycle_policy` block below for details.
     * 
     */
    public Output<Optional<List<FileSystemLifecyclePolicy>>> lifecyclePolicies() {
        return Codegen.optional(this.lifecyclePolicies);
    }
    /**
     * The value of the file system&#39;s `Name` tag.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The value of the file system&#39;s `Name` tag.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The current number of mount targets that the file system has.
     * 
     */
    @Export(name="numberOfMountTargets", refs={Integer.class}, tree="[0]")
    private Output<Integer> numberOfMountTargets;

    /**
     * @return The current number of mount targets that the file system has.
     * 
     */
    public Output<Integer> numberOfMountTargets() {
        return this.numberOfMountTargets;
    }
    /**
     * The AWS account that created the file system. If the file system was createdby an IAM user, the parent account to which the user belongs is the owner.
     * 
     */
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    /**
     * @return The AWS account that created the file system. If the file system was createdby an IAM user, the parent account to which the user belongs is the owner.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * The file system performance mode. Can be either `&#34;generalPurpose&#34;` or `&#34;maxIO&#34;` (Default: `&#34;generalPurpose&#34;`).
     * 
     */
    @Export(name="performanceMode", refs={String.class}, tree="[0]")
    private Output<String> performanceMode;

    /**
     * @return The file system performance mode. Can be either `&#34;generalPurpose&#34;` or `&#34;maxIO&#34;` (Default: `&#34;generalPurpose&#34;`).
     * 
     */
    public Output<String> performanceMode() {
        return this.performanceMode;
    }
    /**
     * A file system [protection](https://docs.aws.amazon.com/efs/latest/ug/API_FileSystemProtectionDescription.html) object. See `protection` block below for details.
     * 
     */
    @Export(name="protection", refs={FileSystemProtection.class}, tree="[0]")
    private Output<FileSystemProtection> protection;

    /**
     * @return A file system [protection](https://docs.aws.amazon.com/efs/latest/ug/API_FileSystemProtectionDescription.html) object. See `protection` block below for details.
     * 
     */
    public Output<FileSystemProtection> protection() {
        return this.protection;
    }
    /**
     * The throughput, measured in MiB/s, that you want to provision for the file system. Only applicable with `throughput_mode` set to `provisioned`.
     * 
     */
    @Export(name="provisionedThroughputInMibps", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> provisionedThroughputInMibps;

    /**
     * @return The throughput, measured in MiB/s, that you want to provision for the file system. Only applicable with `throughput_mode` set to `provisioned`.
     * 
     */
    public Output<Optional<Double>> provisionedThroughputInMibps() {
        return Codegen.optional(this.provisionedThroughputInMibps);
    }
    /**
     * The latest known metered size (in bytes) of data stored in the file system, the value is not the exact size that the file system was at any point in time. See Size In Bytes.
     * 
     */
    @Export(name="sizeInBytes", refs={List.class,FileSystemSizeInByte.class}, tree="[0,1]")
    private Output<List<FileSystemSizeInByte>> sizeInBytes;

    /**
     * @return The latest known metered size (in bytes) of data stored in the file system, the value is not the exact size that the file system was at any point in time. See Size In Bytes.
     * 
     */
    public Output<List<FileSystemSizeInByte>> sizeInBytes() {
        return this.sizeInBytes;
    }
    /**
     * A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Throughput mode for the file system. Defaults to `bursting`. Valid values: `bursting`, `provisioned`, or `elastic`. When using `provisioned`, also set `provisioned_throughput_in_mibps`.
     * 
     */
    @Export(name="throughputMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> throughputMode;

    /**
     * @return Throughput mode for the file system. Defaults to `bursting`. Valid values: `bursting`, `provisioned`, or `elastic`. When using `provisioned`, also set `provisioned_throughput_in_mibps`.
     * 
     */
    public Output<Optional<String>> throughputMode() {
        return Codegen.optional(this.throughputMode);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FileSystem(String name) {
        this(name, FileSystemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FileSystem(String name, @Nullable FileSystemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FileSystem(String name, @Nullable FileSystemArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:efs/fileSystem:FileSystem", name, args == null ? FileSystemArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FileSystem(String name, Output<String> id, @Nullable FileSystemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:efs/fileSystem:FileSystem", name, state, makeResourceOptions(options, id));
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
    public static FileSystem get(String name, Output<String> id, @Nullable FileSystemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FileSystem(name, id, state, options);
    }
}
