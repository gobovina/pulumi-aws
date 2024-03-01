// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.fsx.OntapFileSystemArgs;
import com.pulumi.aws.fsx.inputs.OntapFileSystemState;
import com.pulumi.aws.fsx.outputs.OntapFileSystemDiskIopsConfiguration;
import com.pulumi.aws.fsx.outputs.OntapFileSystemEndpoint;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Amazon FSx for NetApp ONTAP file system.
 * See the [FSx ONTAP User Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/what-is-fsx-ontap.html) for more information.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.fsx.OntapFileSystem;
 * import com.pulumi.aws.fsx.OntapFileSystemArgs;
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
 *         var test = new OntapFileSystem(&#34;test&#34;, OntapFileSystemArgs.builder()        
 *             .storageCapacity(1024)
 *             .subnetIds(            
 *                 test1.id(),
 *                 test2.id())
 *             .deploymentType(&#34;MULTI_AZ_1&#34;)
 *             .throughputCapacity(512)
 *             .preferredSubnetId(test1.id())
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
 *  $ pulumi import aws:fsx/ontapFileSystem:OntapFileSystem example fs-543ab12b1ca672f33
 * ```
 *  Certain resource arguments, like `security_group_ids`, do not have a FSx API method for reading the information after creation. If the argument is set in the Pulumi program on an imported resource, Pulumi will always show a difference. To workaround this behavior, either omit the argument from the Pulumi program or use `ignore_changes` to hide the difference. For example:
 * 
 */
@ResourceType(type="aws:fsx/ontapFileSystem:OntapFileSystem")
public class OntapFileSystem extends com.pulumi.resources.CustomResource {
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
     * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
     * 
     */
    @Export(name="automaticBackupRetentionDays", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> automaticBackupRetentionDays;

    /**
     * @return The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
     * 
     */
    public Output<Optional<Integer>> automaticBackupRetentionDays() {
        return Codegen.optional(this.automaticBackupRetentionDays);
    }
    /**
     * A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
     * 
     */
    @Export(name="dailyAutomaticBackupStartTime", refs={String.class}, tree="[0]")
    private Output<String> dailyAutomaticBackupStartTime;

    /**
     * @return A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
     * 
     */
    public Output<String> dailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime;
    }
    /**
     * The filesystem deployment type. Supports `MULTI_AZ_1` and `SINGLE_AZ_1`.
     * 
     */
    @Export(name="deploymentType", refs={String.class}, tree="[0]")
    private Output<String> deploymentType;

    /**
     * @return The filesystem deployment type. Supports `MULTI_AZ_1` and `SINGLE_AZ_1`.
     * 
     */
    public Output<String> deploymentType() {
        return this.deploymentType;
    }
    /**
     * The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system. See Disk Iops Configuration below.
     * 
     */
    @Export(name="diskIopsConfiguration", refs={OntapFileSystemDiskIopsConfiguration.class}, tree="[0]")
    private Output<OntapFileSystemDiskIopsConfiguration> diskIopsConfiguration;

    /**
     * @return The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system. See Disk Iops Configuration below.
     * 
     */
    public Output<OntapFileSystemDiskIopsConfiguration> diskIopsConfiguration() {
        return this.diskIopsConfiguration;
    }
    /**
     * The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
     * 
     */
    @Export(name="dnsName", refs={String.class}, tree="[0]")
    private Output<String> dnsName;

    /**
     * @return The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    /**
     * Specifies the IP address range in which the endpoints to access your file system will be created. By default, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * 
     */
    @Export(name="endpointIpAddressRange", refs={String.class}, tree="[0]")
    private Output<String> endpointIpAddressRange;

    /**
     * @return Specifies the IP address range in which the endpoints to access your file system will be created. By default, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * 
     */
    public Output<String> endpointIpAddressRange() {
        return this.endpointIpAddressRange;
    }
    /**
     * The endpoints that are used to access data or to manage the file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror. See Endpoints below.
     * 
     */
    @Export(name="endpoints", refs={List.class,OntapFileSystemEndpoint.class}, tree="[0,1]")
    private Output<List<OntapFileSystemEndpoint>> endpoints;

    /**
     * @return The endpoints that are used to access data or to manage the file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror. See Endpoints below.
     * 
     */
    public Output<List<OntapFileSystemEndpoint>> endpoints() {
        return this.endpoints;
    }
    /**
     * The ONTAP administrative password for the fsxadmin user that you can use to administer your file system using the ONTAP CLI and REST API.
     * 
     */
    @Export(name="fsxAdminPassword", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> fsxAdminPassword;

    /**
     * @return The ONTAP administrative password for the fsxadmin user that you can use to administer your file system using the ONTAP CLI and REST API.
     * 
     */
    public Output<Optional<String>> fsxAdminPassword() {
        return Codegen.optional(this.fsxAdminPassword);
    }
    /**
     * The number of ha_pairs to deploy for the file system. Valid values are 1 through 6. Recommend only using this parameter for 2 or more ha pairs.
     * 
     */
    @Export(name="haPairs", refs={Integer.class}, tree="[0]")
    private Output<Integer> haPairs;

    /**
     * @return The number of ha_pairs to deploy for the file system. Valid values are 1 through 6. Recommend only using this parameter for 2 or more ha pairs.
     * 
     */
    public Output<Integer> haPairs() {
        return this.haPairs;
    }
    /**
     * ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyId;

    /**
     * @return ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * Set of Elastic Network Interface identifiers from which the file system is accessible The first network interface returned is the primary network interface.
     * 
     */
    @Export(name="networkInterfaceIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> networkInterfaceIds;

    /**
     * @return Set of Elastic Network Interface identifiers from which the file system is accessible The first network interface returned is the primary network interface.
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
     * The ID for a subnet. A subnet is a range of IP addresses in your virtual private cloud (VPC).
     * 
     */
    @Export(name="preferredSubnetId", refs={String.class}, tree="[0]")
    private Output<String> preferredSubnetId;

    /**
     * @return The ID for a subnet. A subnet is a range of IP addresses in your virtual private cloud (VPC).
     * 
     */
    public Output<String> preferredSubnetId() {
        return this.preferredSubnetId;
    }
    /**
     * Specifies the VPC route tables in which your file system&#39;s endpoints will be created. You should specify all VPC route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your VPC&#39;s default route table.
     * 
     */
    @Export(name="routeTableIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> routeTableIds;

    /**
     * @return Specifies the VPC route tables in which your file system&#39;s endpoints will be created. You should specify all VPC route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your VPC&#39;s default route table.
     * 
     */
    public Output<List<String>> routeTableIds() {
        return this.routeTableIds;
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
     * The storage capacity (GiB) of the file system. Valid values between `1024` and `196608`.
     * 
     */
    @Export(name="storageCapacity", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> storageCapacity;

    /**
     * @return The storage capacity (GiB) of the file system. Valid values between `1024` and `196608`.
     * 
     */
    public Output<Optional<Integer>> storageCapacity() {
        return Codegen.optional(this.storageCapacity);
    }
    /**
     * The filesystem storage type. defaults to `SSD`.
     * 
     */
    @Export(name="storageType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageType;

    /**
     * @return The filesystem storage type. defaults to `SSD`.
     * 
     */
    public Output<Optional<String>> storageType() {
        return Codegen.optional(this.storageType);
    }
    /**
     * A list of IDs for the subnets that the file system will be accessible from. Up to 2 subnets can be provided.
     * 
     */
    @Export(name="subnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subnetIds;

    /**
     * @return A list of IDs for the subnets that the file system will be accessible from. Up to 2 subnets can be provided.
     * 
     */
    public Output<List<String>> subnetIds() {
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
     * Sets the throughput capacity (in MBps) for the file system that you&#39;re creating. Valid values are `128`, `256`, `512`, `1024`, `2048`, and `4096`. This parameter should only be used when specifying not using the ha_pairs parameter. Either throughput_capacity or throughput_capacity_per_ha_pair must be specified.
     * 
     */
    @Export(name="throughputCapacity", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> throughputCapacity;

    /**
     * @return Sets the throughput capacity (in MBps) for the file system that you&#39;re creating. Valid values are `128`, `256`, `512`, `1024`, `2048`, and `4096`. This parameter should only be used when specifying not using the ha_pairs parameter. Either throughput_capacity or throughput_capacity_per_ha_pair must be specified.
     * 
     */
    public Output<Optional<Integer>> throughputCapacity() {
        return Codegen.optional(this.throughputCapacity);
    }
    /**
     * Sets the throughput capacity (in MBps) for the file system that you&#39;re creating. Valid values are `3072`,`6144`. This parameter should only be used when specifying the ha_pairs parameter. Either throughput_capacity or throughput_capacity_per_ha_pair must be specified.
     * 
     */
    @Export(name="throughputCapacityPerHaPair", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> throughputCapacityPerHaPair;

    /**
     * @return Sets the throughput capacity (in MBps) for the file system that you&#39;re creating. Valid values are `3072`,`6144`. This parameter should only be used when specifying the ha_pairs parameter. Either throughput_capacity or throughput_capacity_per_ha_pair must be specified.
     * 
     */
    public Output<Optional<Integer>> throughputCapacityPerHaPair() {
        return Codegen.optional(this.throughputCapacityPerHaPair);
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
    public OntapFileSystem(String name) {
        this(name, OntapFileSystemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OntapFileSystem(String name, OntapFileSystemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OntapFileSystem(String name, OntapFileSystemArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/ontapFileSystem:OntapFileSystem", name, args == null ? OntapFileSystemArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OntapFileSystem(String name, Output<String> id, @Nullable OntapFileSystemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/ontapFileSystem:OntapFileSystem", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "fsxAdminPassword"
            ))
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
    public static OntapFileSystem get(String name, Output<String> id, @Nullable OntapFileSystemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OntapFileSystem(name, id, state, options);
    }
}
