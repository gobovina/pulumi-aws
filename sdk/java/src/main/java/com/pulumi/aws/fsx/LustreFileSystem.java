// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.fsx.LustreFileSystemArgs;
import com.pulumi.aws.fsx.inputs.LustreFileSystemState;
import com.pulumi.aws.fsx.outputs.LustreFileSystemLogConfiguration;
import com.pulumi.aws.fsx.outputs.LustreFileSystemRootSquashConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a FSx Lustre File System. See the [FSx Lustre Guide](https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html) for more information.
 * 
 * &gt; **NOTE:** `auto_import_policy`, `export_path`, `import_path` and `imported_file_chunk_size` are not supported with the `PERSISTENT_2` deployment type. Use `aws.fsx.DataRepositoryAssociation` instead.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.fsx.LustreFileSystem;
 * import com.pulumi.aws.fsx.LustreFileSystemArgs;
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
 *         var example = new LustreFileSystem(&#34;example&#34;, LustreFileSystemArgs.builder()        
 *             .importPath(String.format(&#34;s3://%s&#34;, aws_s3_bucket.example().bucket()))
 *             .storageCapacity(1200)
 *             .subnetIds(aws_subnet.example().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import FSx File Systems using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:fsx/lustreFileSystem:LustreFileSystem example fs-543ab12b1ca672f33
 * ```
 *  Certain resource arguments, like `security_group_ids`, do not have a FSx API method for reading the information after creation. If the argument is set in the TODO configuration on an imported resource, TODO will always show a difference. To workaround this behavior, either omit the argument from the TODO configuration or use `ignore_changes` to hide the difference. For example:
 * 
 */
@ResourceType(type="aws:fsx/lustreFileSystem:LustreFileSystem")
public class LustreFileSystem extends com.pulumi.resources.CustomResource {
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
     * How Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your linked S3 bucket. see [Auto Import Data Repo](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) for more details. Only supported on `PERSISTENT_1` deployment types.
     * 
     */
    @Export(name="autoImportPolicy", refs={String.class}, tree="[0]")
    private Output<String> autoImportPolicy;

    /**
     * @return How Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your linked S3 bucket. see [Auto Import Data Repo](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) for more details. Only supported on `PERSISTENT_1` deployment types.
     * 
     */
    public Output<String> autoImportPolicy() {
        return this.autoImportPolicy;
    }
    /**
     * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days. only valid for `PERSISTENT_1` and `PERSISTENT_2` deployment_type.
     * 
     */
    @Export(name="automaticBackupRetentionDays", refs={Integer.class}, tree="[0]")
    private Output<Integer> automaticBackupRetentionDays;

    /**
     * @return The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days. only valid for `PERSISTENT_1` and `PERSISTENT_2` deployment_type.
     * 
     */
    public Output<Integer> automaticBackupRetentionDays() {
        return this.automaticBackupRetentionDays;
    }
    /**
     * The ID of the source backup to create the filesystem from.
     * 
     */
    @Export(name="backupId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> backupId;

    /**
     * @return The ID of the source backup to create the filesystem from.
     * 
     */
    public Output<Optional<String>> backupId() {
        return Codegen.optional(this.backupId);
    }
    /**
     * A boolean flag indicating whether tags for the file system should be copied to backups. Applicable for `PERSISTENT_1` and `PERSISTENT_2` deployment_type. The default value is false.
     * 
     */
    @Export(name="copyTagsToBackups", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> copyTagsToBackups;

    /**
     * @return A boolean flag indicating whether tags for the file system should be copied to backups. Applicable for `PERSISTENT_1` and `PERSISTENT_2` deployment_type. The default value is false.
     * 
     */
    public Output<Optional<Boolean>> copyTagsToBackups() {
        return Codegen.optional(this.copyTagsToBackups);
    }
    /**
     * A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. only valid for `PERSISTENT_1` and `PERSISTENT_2` deployment_type. Requires `automatic_backup_retention_days` to be set.
     * 
     */
    @Export(name="dailyAutomaticBackupStartTime", refs={String.class}, tree="[0]")
    private Output<String> dailyAutomaticBackupStartTime;

    /**
     * @return A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. only valid for `PERSISTENT_1` and `PERSISTENT_2` deployment_type. Requires `automatic_backup_retention_days` to be set.
     * 
     */
    public Output<String> dailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime;
    }
    /**
     * Sets the data compression configuration for the file system. Valid values are `LZ4` and `NONE`. Default value is `NONE`. Unsetting this value reverts the compression type back to `NONE`.
     * 
     */
    @Export(name="dataCompressionType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dataCompressionType;

    /**
     * @return Sets the data compression configuration for the file system. Valid values are `LZ4` and `NONE`. Default value is `NONE`. Unsetting this value reverts the compression type back to `NONE`.
     * 
     */
    public Output<Optional<String>> dataCompressionType() {
        return Codegen.optional(this.dataCompressionType);
    }
    /**
     * The filesystem deployment type. One of: `SCRATCH_1`, `SCRATCH_2`, `PERSISTENT_1`, `PERSISTENT_2`.
     * 
     */
    @Export(name="deploymentType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deploymentType;

    /**
     * @return The filesystem deployment type. One of: `SCRATCH_1`, `SCRATCH_2`, `PERSISTENT_1`, `PERSISTENT_2`.
     * 
     */
    public Output<Optional<String>> deploymentType() {
        return Codegen.optional(this.deploymentType);
    }
    /**
     * DNS name for the file system, e.g., `fs-12345678.fsx.us-west-2.amazonaws.com`
     * 
     */
    @Export(name="dnsName", refs={String.class}, tree="[0]")
    private Output<String> dnsName;

    /**
     * @return DNS name for the file system, e.g., `fs-12345678.fsx.us-west-2.amazonaws.com`
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    /**
     * The type of drive cache used by `PERSISTENT_1` filesystems that are provisioned with `HDD` storage_type. Required for `HDD` storage_type, set to either `READ` or `NONE`.
     * 
     */
    @Export(name="driveCacheType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> driveCacheType;

    /**
     * @return The type of drive cache used by `PERSISTENT_1` filesystems that are provisioned with `HDD` storage_type. Required for `HDD` storage_type, set to either `READ` or `NONE`.
     * 
     */
    public Output<Optional<String>> driveCacheType() {
        return Codegen.optional(this.driveCacheType);
    }
    /**
     * S3 URI (with optional prefix) where the root of your Amazon FSx file system is exported. Can only be specified with `import_path` argument and the path must use the same Amazon S3 bucket as specified in `import_path`. Set equal to `import_path` to overwrite files on export. Defaults to `s3://{IMPORT BUCKET}/FSxLustre{CREATION TIMESTAMP}`. Only supported on `PERSISTENT_1` deployment types.
     * 
     */
    @Export(name="exportPath", refs={String.class}, tree="[0]")
    private Output<String> exportPath;

    /**
     * @return S3 URI (with optional prefix) where the root of your Amazon FSx file system is exported. Can only be specified with `import_path` argument and the path must use the same Amazon S3 bucket as specified in `import_path`. Set equal to `import_path` to overwrite files on export. Defaults to `s3://{IMPORT BUCKET}/FSxLustre{CREATION TIMESTAMP}`. Only supported on `PERSISTENT_1` deployment types.
     * 
     */
    public Output<String> exportPath() {
        return this.exportPath;
    }
    /**
     * Sets the Lustre version for the file system that you&#39;re creating. Valid values are 2.10 for `SCRATCH_1`, `SCRATCH_2` and `PERSISTENT_1` deployment types. Valid values for 2.12 include all deployment types.
     * 
     */
    @Export(name="fileSystemTypeVersion", refs={String.class}, tree="[0]")
    private Output<String> fileSystemTypeVersion;

    /**
     * @return Sets the Lustre version for the file system that you&#39;re creating. Valid values are 2.10 for `SCRATCH_1`, `SCRATCH_2` and `PERSISTENT_1` deployment types. Valid values for 2.12 include all deployment types.
     * 
     */
    public Output<String> fileSystemTypeVersion() {
        return this.fileSystemTypeVersion;
    }
    /**
     * S3 URI (with optional prefix) that you&#39;re using as the data repository for your FSx for Lustre file system. For example, `s3://example-bucket/optional-prefix/`. Only supported on `PERSISTENT_1` deployment types.
     * 
     */
    @Export(name="importPath", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> importPath;

    /**
     * @return S3 URI (with optional prefix) that you&#39;re using as the data repository for your FSx for Lustre file system. For example, `s3://example-bucket/optional-prefix/`. Only supported on `PERSISTENT_1` deployment types.
     * 
     */
    public Output<Optional<String>> importPath() {
        return Codegen.optional(this.importPath);
    }
    /**
     * For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. Can only be specified with `import_path` argument. Defaults to `1024`. Minimum of `1` and maximum of `512000`. Only supported on `PERSISTENT_1` deployment types.
     * 
     */
    @Export(name="importedFileChunkSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> importedFileChunkSize;

    /**
     * @return For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. Can only be specified with `import_path` argument. Defaults to `1024`. Minimum of `1` and maximum of `512000`. Only supported on `PERSISTENT_1` deployment types.
     * 
     */
    public Output<Integer> importedFileChunkSize() {
        return this.importedFileChunkSize;
    }
    /**
     * ARN for the KMS Key to encrypt the file system at rest, applicable for `PERSISTENT_1` and `PERSISTENT_2` deployment_type. Defaults to an AWS managed KMS Key.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyId;

    /**
     * @return ARN for the KMS Key to encrypt the file system at rest, applicable for `PERSISTENT_1` and `PERSISTENT_2` deployment_type. Defaults to an AWS managed KMS Key.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The Lustre logging configuration used when creating an Amazon FSx for Lustre file system. When logging is enabled, Lustre logs error and warning events for data repositories associated with your file system to Amazon CloudWatch Logs.
     * 
     */
    @Export(name="logConfiguration", refs={LustreFileSystemLogConfiguration.class}, tree="[0]")
    private Output<LustreFileSystemLogConfiguration> logConfiguration;

    /**
     * @return The Lustre logging configuration used when creating an Amazon FSx for Lustre file system. When logging is enabled, Lustre logs error and warning events for data repositories associated with your file system to Amazon CloudWatch Logs.
     * 
     */
    public Output<LustreFileSystemLogConfiguration> logConfiguration() {
        return this.logConfiguration;
    }
    /**
     * The value to be used when mounting the filesystem.
     * 
     */
    @Export(name="mountName", refs={String.class}, tree="[0]")
    private Output<String> mountName;

    /**
     * @return The value to be used when mounting the filesystem.
     * 
     */
    public Output<String> mountName() {
        return this.mountName;
    }
    /**
     * Set of Elastic Network Interface identifiers from which the file system is accessible. As explained in the [documentation](https://docs.aws.amazon.com/fsx/latest/LustreGuide/mounting-on-premises.html), the first network interface returned is the primary network interface.
     * 
     */
    @Export(name="networkInterfaceIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> networkInterfaceIds;

    /**
     * @return Set of Elastic Network Interface identifiers from which the file system is accessible. As explained in the [documentation](https://docs.aws.amazon.com/fsx/latest/LustreGuide/mounting-on-premises.html), the first network interface returned is the primary network interface.
     * 
     */
    public Output<List<String>> networkInterfaceIds() {
        return this.networkInterfaceIds;
    }
    /**
     * AWS account identifier that created the file system.
     * 
     */
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    /**
     * @return AWS account identifier that created the file system.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * Describes the amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB, required for the `PERSISTENT_1` and `PERSISTENT_2` deployment_type. Valid values for `PERSISTENT_1` deployment_type and `SSD` storage_type are 50, 100, 200. Valid values for `PERSISTENT_1` deployment_type and `HDD` storage_type are 12, 40. Valid values for `PERSISTENT_2` deployment_type and `  SSD ` storage_type are 125, 250, 500, 1000.
     * 
     */
    @Export(name="perUnitStorageThroughput", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> perUnitStorageThroughput;

    /**
     * @return Describes the amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB, required for the `PERSISTENT_1` and `PERSISTENT_2` deployment_type. Valid values for `PERSISTENT_1` deployment_type and `SSD` storage_type are 50, 100, 200. Valid values for `PERSISTENT_1` deployment_type and `HDD` storage_type are 12, 40. Valid values for `PERSISTENT_2` deployment_type and `  SSD ` storage_type are 125, 250, 500, 1000.
     * 
     */
    public Output<Optional<Integer>> perUnitStorageThroughput() {
        return Codegen.optional(this.perUnitStorageThroughput);
    }
    /**
     * The Lustre root squash configuration used when creating an Amazon FSx for Lustre file system. When enabled, root squash restricts root-level access from clients that try to access your file system as a root user.
     * 
     */
    @Export(name="rootSquashConfiguration", refs={LustreFileSystemRootSquashConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ LustreFileSystemRootSquashConfiguration> rootSquashConfiguration;

    /**
     * @return The Lustre root squash configuration used when creating an Amazon FSx for Lustre file system. When enabled, root squash restricts root-level access from clients that try to access your file system as a root user.
     * 
     */
    public Output<Optional<LustreFileSystemRootSquashConfiguration>> rootSquashConfiguration() {
        return Codegen.optional(this.rootSquashConfiguration);
    }
    /**
     * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
     * 
     */
    @Export(name="securityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> securityGroupIds;

    /**
     * @return A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
     * 
     */
    public Output<Optional<List<String>>> securityGroupIds() {
        return Codegen.optional(this.securityGroupIds);
    }
    /**
     * The storage capacity (GiB) of the file system. Minimum of `1200`. See more details at [Allowed values for Fsx storage capacity](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CreateFileSystem.html#FSx-CreateFileSystem-request-StorageCapacity). Update is allowed only for `SCRATCH_2`, `PERSISTENT_1` and `PERSISTENT_2` deployment types, See more details at [Fsx Storage Capacity Update](https://docs.aws.amazon.com/fsx/latest/APIReference/API_UpdateFileSystem.html#FSx-UpdateFileSystem-request-StorageCapacity). Required when not creating filesystem for a backup.
     * 
     */
    @Export(name="storageCapacity", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> storageCapacity;

    /**
     * @return The storage capacity (GiB) of the file system. Minimum of `1200`. See more details at [Allowed values for Fsx storage capacity](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CreateFileSystem.html#FSx-CreateFileSystem-request-StorageCapacity). Update is allowed only for `SCRATCH_2`, `PERSISTENT_1` and `PERSISTENT_2` deployment types, See more details at [Fsx Storage Capacity Update](https://docs.aws.amazon.com/fsx/latest/APIReference/API_UpdateFileSystem.html#FSx-UpdateFileSystem-request-StorageCapacity). Required when not creating filesystem for a backup.
     * 
     */
    public Output<Optional<Integer>> storageCapacity() {
        return Codegen.optional(this.storageCapacity);
    }
    /**
     * The filesystem storage type. Either `SSD` or `HDD`, defaults to `SSD`. `HDD` is only supported on `PERSISTENT_1` deployment types.
     * 
     */
    @Export(name="storageType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageType;

    /**
     * @return The filesystem storage type. Either `SSD` or `HDD`, defaults to `SSD`. `HDD` is only supported on `PERSISTENT_1` deployment types.
     * 
     */
    public Output<Optional<String>> storageType() {
        return Codegen.optional(this.storageType);
    }
    /**
     * A list of IDs for the subnets that the file system will be accessible from. File systems currently support only one subnet. The file server is also launched in that subnet&#39;s Availability Zone.
     * 
     */
    @Export(name="subnetIds", refs={String.class}, tree="[0]")
    private Output<String> subnetIds;

    /**
     * @return A list of IDs for the subnets that the file system will be accessible from. File systems currently support only one subnet. The file server is also launched in that subnet&#39;s Availability Zone.
     * 
     */
    public Output<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * A map of tags to assign to the file system. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the file system. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Identifier of the Virtual Private Cloud for the file system.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return Identifier of the Virtual Private Cloud for the file system.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
     * 
     */
    @Export(name="weeklyMaintenanceStartTime", refs={String.class}, tree="[0]")
    private Output<String> weeklyMaintenanceStartTime;

    /**
     * @return The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
     * 
     */
    public Output<String> weeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LustreFileSystem(String name) {
        this(name, LustreFileSystemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LustreFileSystem(String name, LustreFileSystemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LustreFileSystem(String name, LustreFileSystemArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/lustreFileSystem:LustreFileSystem", name, args == null ? LustreFileSystemArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LustreFileSystem(String name, Output<String> id, @Nullable LustreFileSystemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/lustreFileSystem:LustreFileSystem", name, state, makeResourceOptions(options, id));
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
    public static LustreFileSystem get(String name, Output<String> id, @Nullable LustreFileSystemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LustreFileSystem(name, id, state, options);
    }
}
