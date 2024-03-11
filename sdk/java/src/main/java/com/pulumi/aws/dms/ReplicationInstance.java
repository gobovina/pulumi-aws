// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.dms.ReplicationInstanceArgs;
import com.pulumi.aws.dms.inputs.ReplicationInstanceState;
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
 * Provides a DMS (Data Migration Service) replication instance resource. DMS replication instances can be created, updated, deleted, and imported.
 * 
 * ## Example Usage
 * 
 * Create required roles and then create a DMS instance, setting the depends_on to the required role policy attachments.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.iam.RolePolicyAttachment;
 * import com.pulumi.aws.iam.RolePolicyAttachmentArgs;
 * import com.pulumi.aws.dms.ReplicationInstance;
 * import com.pulumi.aws.dms.ReplicationInstanceArgs;
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
 *         final var dmsAssumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .identifiers(&#34;dms.amazonaws.com&#34;)
 *                     .type(&#34;Service&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var dms_access_for_endpoint = new Role(&#34;dms-access-for-endpoint&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(dmsAssumeRole.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .name(&#34;dms-access-for-endpoint&#34;)
 *             .build());
 * 
 *         var dms_access_for_endpoint_AmazonDMSRedshiftS3Role = new RolePolicyAttachment(&#34;dms-access-for-endpoint-AmazonDMSRedshiftS3Role&#34;, RolePolicyAttachmentArgs.builder()        
 *             .policyArn(&#34;arn:aws:iam::aws:policy/service-role/AmazonDMSRedshiftS3Role&#34;)
 *             .role(dms_access_for_endpoint.name())
 *             .build());
 * 
 *         var dms_cloudwatch_logs_role = new Role(&#34;dms-cloudwatch-logs-role&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(dmsAssumeRole.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .name(&#34;dms-cloudwatch-logs-role&#34;)
 *             .build());
 * 
 *         var dms_cloudwatch_logs_role_AmazonDMSCloudWatchLogsRole = new RolePolicyAttachment(&#34;dms-cloudwatch-logs-role-AmazonDMSCloudWatchLogsRole&#34;, RolePolicyAttachmentArgs.builder()        
 *             .policyArn(&#34;arn:aws:iam::aws:policy/service-role/AmazonDMSCloudWatchLogsRole&#34;)
 *             .role(dms_cloudwatch_logs_role.name())
 *             .build());
 * 
 *         var dms_vpc_role = new Role(&#34;dms-vpc-role&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(dmsAssumeRole.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .name(&#34;dms-vpc-role&#34;)
 *             .build());
 * 
 *         var dms_vpc_role_AmazonDMSVPCManagementRole = new RolePolicyAttachment(&#34;dms-vpc-role-AmazonDMSVPCManagementRole&#34;, RolePolicyAttachmentArgs.builder()        
 *             .policyArn(&#34;arn:aws:iam::aws:policy/service-role/AmazonDMSVPCManagementRole&#34;)
 *             .role(dms_vpc_role.name())
 *             .build());
 * 
 *         var test = new ReplicationInstance(&#34;test&#34;, ReplicationInstanceArgs.builder()        
 *             .allocatedStorage(20)
 *             .applyImmediately(true)
 *             .autoMinorVersionUpgrade(true)
 *             .availabilityZone(&#34;us-west-2c&#34;)
 *             .engineVersion(&#34;3.1.4&#34;)
 *             .kmsKeyArn(&#34;arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012&#34;)
 *             .multiAz(false)
 *             .preferredMaintenanceWindow(&#34;sun:10:30-sun:14:30&#34;)
 *             .publiclyAccessible(true)
 *             .replicationInstanceClass(&#34;dms.t2.micro&#34;)
 *             .replicationInstanceId(&#34;test-dms-replication-instance-tf&#34;)
 *             .replicationSubnetGroupId(test_dms_replication_subnet_group_tf.id())
 *             .tags(Map.of(&#34;Name&#34;, &#34;test&#34;))
 *             .vpcSecurityGroupIds(&#34;sg-12345678&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import replication instances using the `replication_instance_id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:dms/replicationInstance:ReplicationInstance test test-dms-replication-instance-tf
 * ```
 * 
 */
@ResourceType(type="aws:dms/replicationInstance:ReplicationInstance")
public class ReplicationInstance extends com.pulumi.resources.CustomResource {
    /**
     * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
     * 
     */
    @Export(name="allocatedStorage", refs={Integer.class}, tree="[0]")
    private Output<Integer> allocatedStorage;

    /**
     * @return The amount of storage (in gigabytes) to be initially allocated for the replication instance.
     * 
     */
    public Output<Integer> allocatedStorage() {
        return this.allocatedStorage;
    }
    /**
     * Indicates that major version upgrades are allowed.
     * 
     */
    @Export(name="allowMajorVersionUpgrade", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowMajorVersionUpgrade;

    /**
     * @return Indicates that major version upgrades are allowed.
     * 
     */
    public Output<Optional<Boolean>> allowMajorVersionUpgrade() {
        return Codegen.optional(this.allowMajorVersionUpgrade);
    }
    /**
     * Indicates whether the changes should be applied immediately or during the next maintenance window. Only used when updating an existing resource.
     * 
     */
    @Export(name="applyImmediately", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> applyImmediately;

    /**
     * @return Indicates whether the changes should be applied immediately or during the next maintenance window. Only used when updating an existing resource.
     * 
     */
    public Output<Optional<Boolean>> applyImmediately() {
        return Codegen.optional(this.applyImmediately);
    }
    /**
     * Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window.
     * 
     */
    @Export(name="autoMinorVersionUpgrade", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> autoMinorVersionUpgrade;

    /**
     * @return Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window.
     * 
     */
    public Output<Boolean> autoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }
    /**
     * The EC2 Availability Zone that the replication instance will be created in.
     * 
     */
    @Export(name="availabilityZone", refs={String.class}, tree="[0]")
    private Output<String> availabilityZone;

    /**
     * @return The EC2 Availability Zone that the replication instance will be created in.
     * 
     */
    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * The engine version number of the replication instance.
     * 
     */
    @Export(name="engineVersion", refs={String.class}, tree="[0]")
    private Output<String> engineVersion;

    /**
     * @return The engine version number of the replication instance.
     * 
     */
    public Output<String> engineVersion() {
        return this.engineVersion;
    }
    /**
     * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kms_key_arn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
     * 
     */
    @Export(name="kmsKeyArn", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyArn;

    /**
     * @return The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kms_key_arn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
     * 
     */
    public Output<String> kmsKeyArn() {
        return this.kmsKeyArn;
    }
    /**
     * Specifies if the replication instance is a multi-az deployment. You cannot set the `availability_zone` parameter if the `multi_az` parameter is set to `true`.
     * 
     */
    @Export(name="multiAz", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> multiAz;

    /**
     * @return Specifies if the replication instance is a multi-az deployment. You cannot set the `availability_zone` parameter if the `multi_az` parameter is set to `true`.
     * 
     */
    public Output<Boolean> multiAz() {
        return this.multiAz;
    }
    /**
     * The type of IP address protocol used by a replication instance. Valid values: `IPV4`, `DUAL`.
     * 
     */
    @Export(name="networkType", refs={String.class}, tree="[0]")
    private Output<String> networkType;

    /**
     * @return The type of IP address protocol used by a replication instance. Valid values: `IPV4`, `DUAL`.
     * 
     */
    public Output<String> networkType() {
        return this.networkType;
    }
    /**
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * 
     * - Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a random day of the week.
     * - Format: `ddd:hh24:mi-ddd:hh24:mi`
     * - Valid Days: `mon, tue, wed, thu, fri, sat, sun`
     * - Constraints: Minimum 30-minute window.
     * 
     */
    @Export(name="preferredMaintenanceWindow", refs={String.class}, tree="[0]")
    private Output<String> preferredMaintenanceWindow;

    /**
     * @return The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * 
     * - Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a random day of the week.
     * - Format: `ddd:hh24:mi-ddd:hh24:mi`
     * - Valid Days: `mon, tue, wed, thu, fri, sat, sun`
     * - Constraints: Minimum 30-minute window.
     * 
     */
    public Output<String> preferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    /**
     * Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address.
     * 
     */
    @Export(name="publiclyAccessible", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> publiclyAccessible;

    /**
     * @return Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address.
     * 
     */
    public Output<Boolean> publiclyAccessible() {
        return this.publiclyAccessible;
    }
    /**
     * The Amazon Resource Name (ARN) of the replication instance.
     * 
     */
    @Export(name="replicationInstanceArn", refs={String.class}, tree="[0]")
    private Output<String> replicationInstanceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the replication instance.
     * 
     */
    public Output<String> replicationInstanceArn() {
        return this.replicationInstanceArn;
    }
    /**
     * The compute and memory capacity of the replication instance as specified by the replication instance class. See [AWS DMS User Guide](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.Types.html) for available instance sizes and advice on which one to choose.
     * 
     */
    @Export(name="replicationInstanceClass", refs={String.class}, tree="[0]")
    private Output<String> replicationInstanceClass;

    /**
     * @return The compute and memory capacity of the replication instance as specified by the replication instance class. See [AWS DMS User Guide](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.Types.html) for available instance sizes and advice on which one to choose.
     * 
     */
    public Output<String> replicationInstanceClass() {
        return this.replicationInstanceClass;
    }
    /**
     * The replication instance identifier. This parameter is stored as a lowercase string.
     * 
     * - Must contain from 1 to 63 alphanumeric characters or hyphens.
     * - First character must be a letter.
     * - Cannot end with a hyphen
     * - Cannot contain two consecutive hyphens.
     * 
     */
    @Export(name="replicationInstanceId", refs={String.class}, tree="[0]")
    private Output<String> replicationInstanceId;

    /**
     * @return The replication instance identifier. This parameter is stored as a lowercase string.
     * 
     * - Must contain from 1 to 63 alphanumeric characters or hyphens.
     * - First character must be a letter.
     * - Cannot end with a hyphen
     * - Cannot contain two consecutive hyphens.
     * 
     */
    public Output<String> replicationInstanceId() {
        return this.replicationInstanceId;
    }
    /**
     * A list of the private IP addresses of the replication instance.
     * 
     */
    @Export(name="replicationInstancePrivateIps", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> replicationInstancePrivateIps;

    /**
     * @return A list of the private IP addresses of the replication instance.
     * 
     */
    public Output<List<String>> replicationInstancePrivateIps() {
        return this.replicationInstancePrivateIps;
    }
    /**
     * A list of the public IP addresses of the replication instance.
     * 
     */
    @Export(name="replicationInstancePublicIps", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> replicationInstancePublicIps;

    /**
     * @return A list of the public IP addresses of the replication instance.
     * 
     */
    public Output<List<String>> replicationInstancePublicIps() {
        return this.replicationInstancePublicIps;
    }
    /**
     * A subnet group to associate with the replication instance.
     * 
     */
    @Export(name="replicationSubnetGroupId", refs={String.class}, tree="[0]")
    private Output<String> replicationSubnetGroupId;

    /**
     * @return A subnet group to associate with the replication instance.
     * 
     */
    public Output<String> replicationSubnetGroupId() {
        return this.replicationSubnetGroupId;
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
     * A list of VPC security group IDs to be used with the replication instance. The VPC security groups must work with the VPC containing the replication instance.
     * 
     */
    @Export(name="vpcSecurityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> vpcSecurityGroupIds;

    /**
     * @return A list of VPC security group IDs to be used with the replication instance. The VPC security groups must work with the VPC containing the replication instance.
     * 
     */
    public Output<List<String>> vpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationInstance(String name) {
        this(name, ReplicationInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationInstance(String name, ReplicationInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationInstance(String name, ReplicationInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dms/replicationInstance:ReplicationInstance", name, args == null ? ReplicationInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReplicationInstance(String name, Output<String> id, @Nullable ReplicationInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dms/replicationInstance:ReplicationInstance", name, state, makeResourceOptions(options, id));
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
    public static ReplicationInstance get(String name, Output<String> id, @Nullable ReplicationInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationInstance(name, id, state, options);
    }
}
