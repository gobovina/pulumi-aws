// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rds.SnapshotArgs;
import com.pulumi.aws.rds.inputs.SnapshotState;
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
 * Manages an RDS database instance snapshot. For managing RDS database cluster snapshots, see the `aws.rds.ClusterSnapshot` resource.
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
 * import com.pulumi.aws.rds.Instance;
 * import com.pulumi.aws.rds.InstanceArgs;
 * import com.pulumi.aws.rds.Snapshot;
 * import com.pulumi.aws.rds.SnapshotArgs;
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
 *         var bar = new Instance(&#34;bar&#34;, InstanceArgs.builder()        
 *             .allocatedStorage(10)
 *             .engine(&#34;mysql&#34;)
 *             .engineVersion(&#34;5.6.21&#34;)
 *             .instanceClass(&#34;db.t2.micro&#34;)
 *             .dbName(&#34;baz&#34;)
 *             .password(&#34;barbarbarbar&#34;)
 *             .username(&#34;foo&#34;)
 *             .maintenanceWindow(&#34;Fri:09:00-Fri:09:30&#34;)
 *             .backupRetentionPeriod(0)
 *             .parameterGroupName(&#34;default.mysql5.6&#34;)
 *             .build());
 * 
 *         var test = new Snapshot(&#34;test&#34;, SnapshotArgs.builder()        
 *             .dbInstanceIdentifier(bar.identifier())
 *             .dbSnapshotIdentifier(&#34;testsnapshot1234&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_db_snapshot` using the snapshot identifier. For example:
 * 
 * ```sh
 * $ pulumi import aws:rds/snapshot:Snapshot example my-snapshot
 * ```
 * 
 */
@ResourceType(type="aws:rds/snapshot:Snapshot")
public class Snapshot extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the allocated storage size in gigabytes (GB).
     * 
     */
    @Export(name="allocatedStorage", refs={Integer.class}, tree="[0]")
    private Output<Integer> allocatedStorage;

    /**
     * @return Specifies the allocated storage size in gigabytes (GB).
     * 
     */
    public Output<Integer> allocatedStorage() {
        return this.allocatedStorage;
    }
    /**
     * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     * 
     */
    @Export(name="availabilityZone", refs={String.class}, tree="[0]")
    private Output<String> availabilityZone;

    /**
     * @return Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     * 
     */
    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * The DB Instance Identifier from which to take the snapshot.
     * 
     */
    @Export(name="dbInstanceIdentifier", refs={String.class}, tree="[0]")
    private Output<String> dbInstanceIdentifier;

    /**
     * @return The DB Instance Identifier from which to take the snapshot.
     * 
     */
    public Output<String> dbInstanceIdentifier() {
        return this.dbInstanceIdentifier;
    }
    /**
     * The Amazon Resource Name (ARN) for the DB snapshot.
     * 
     */
    @Export(name="dbSnapshotArn", refs={String.class}, tree="[0]")
    private Output<String> dbSnapshotArn;

    /**
     * @return The Amazon Resource Name (ARN) for the DB snapshot.
     * 
     */
    public Output<String> dbSnapshotArn() {
        return this.dbSnapshotArn;
    }
    /**
     * The Identifier for the snapshot.
     * 
     */
    @Export(name="dbSnapshotIdentifier", refs={String.class}, tree="[0]")
    private Output<String> dbSnapshotIdentifier;

    /**
     * @return The Identifier for the snapshot.
     * 
     */
    public Output<String> dbSnapshotIdentifier() {
        return this.dbSnapshotIdentifier;
    }
    /**
     * Specifies whether the DB snapshot is encrypted.
     * 
     */
    @Export(name="encrypted", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> encrypted;

    /**
     * @return Specifies whether the DB snapshot is encrypted.
     * 
     */
    public Output<Boolean> encrypted() {
        return this.encrypted;
    }
    /**
     * Specifies the name of the database engine.
     * 
     */
    @Export(name="engine", refs={String.class}, tree="[0]")
    private Output<String> engine;

    /**
     * @return Specifies the name of the database engine.
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    /**
     * Specifies the version of the database engine.
     * 
     */
    @Export(name="engineVersion", refs={String.class}, tree="[0]")
    private Output<String> engineVersion;

    /**
     * @return Specifies the version of the database engine.
     * 
     */
    public Output<String> engineVersion() {
        return this.engineVersion;
    }
    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * 
     */
    @Export(name="iops", refs={Integer.class}, tree="[0]")
    private Output<Integer> iops;

    /**
     * @return Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * 
     */
    public Output<Integer> iops() {
        return this.iops;
    }
    /**
     * The ARN for the KMS encryption key.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyId;

    /**
     * @return The ARN for the KMS encryption key.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * License model information for the restored DB instance.
     * 
     */
    @Export(name="licenseModel", refs={String.class}, tree="[0]")
    private Output<String> licenseModel;

    /**
     * @return License model information for the restored DB instance.
     * 
     */
    public Output<String> licenseModel() {
        return this.licenseModel;
    }
    /**
     * Provides the option group name for the DB snapshot.
     * 
     */
    @Export(name="optionGroupName", refs={String.class}, tree="[0]")
    private Output<String> optionGroupName;

    /**
     * @return Provides the option group name for the DB snapshot.
     * 
     */
    public Output<String> optionGroupName() {
        return this.optionGroupName;
    }
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }
    /**
     * List of AWS Account ids to share snapshot with, use `all` to make snaphot public.
     * 
     */
    @Export(name="sharedAccounts", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> sharedAccounts;

    /**
     * @return List of AWS Account ids to share snapshot with, use `all` to make snaphot public.
     * 
     */
    public Output<Optional<List<String>>> sharedAccounts() {
        return Codegen.optional(this.sharedAccounts);
    }
    @Export(name="snapshotType", refs={String.class}, tree="[0]")
    private Output<String> snapshotType;

    public Output<String> snapshotType() {
        return this.snapshotType;
    }
    /**
     * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
     * 
     */
    @Export(name="sourceDbSnapshotIdentifier", refs={String.class}, tree="[0]")
    private Output<String> sourceDbSnapshotIdentifier;

    /**
     * @return The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
     * 
     */
    public Output<String> sourceDbSnapshotIdentifier() {
        return this.sourceDbSnapshotIdentifier;
    }
    /**
     * The region that the DB snapshot was created in or copied from.
     * 
     */
    @Export(name="sourceRegion", refs={String.class}, tree="[0]")
    private Output<String> sourceRegion;

    /**
     * @return The region that the DB snapshot was created in or copied from.
     * 
     */
    public Output<String> sourceRegion() {
        return this.sourceRegion;
    }
    /**
     * Specifies the status of this DB snapshot.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Specifies the status of this DB snapshot.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Specifies the storage type associated with DB snapshot.
     * 
     */
    @Export(name="storageType", refs={String.class}, tree="[0]")
    private Output<String> storageType;

    /**
     * @return Specifies the storage type associated with DB snapshot.
     * 
     */
    public Output<String> storageType() {
        return this.storageType;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Provides the VPC ID associated with the DB snapshot.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return Provides the VPC ID associated with the DB snapshot.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Snapshot(String name) {
        this(name, SnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Snapshot(String name, SnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Snapshot(String name, SnapshotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/snapshot:Snapshot", name, args == null ? SnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Snapshot(String name, Output<String> id, @Nullable SnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/snapshot:Snapshot", name, state, makeResourceOptions(options, id));
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
    public static Snapshot get(String name, Output<String> id, @Nullable SnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Snapshot(name, id, state, options);
    }
}
