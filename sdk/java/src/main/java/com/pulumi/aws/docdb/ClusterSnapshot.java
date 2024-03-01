// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.docdb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.docdb.ClusterSnapshotArgs;
import com.pulumi.aws.docdb.inputs.ClusterSnapshotState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a DocumentDB database cluster snapshot for DocumentDB clusters.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.docdb.ClusterSnapshot;
 * import com.pulumi.aws.docdb.ClusterSnapshotArgs;
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
 *         var example = new ClusterSnapshot(&#34;example&#34;, ClusterSnapshotArgs.builder()        
 *             .dbClusterIdentifier(exampleAwsDocdbCluster.id())
 *             .dbClusterSnapshotIdentifier(&#34;resourcetestsnapshot1234&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_docdb_cluster_snapshot` using the cluster snapshot identifier. For example:
 * 
 * ```sh
 *  $ pulumi import aws:docdb/clusterSnapshot:ClusterSnapshot example my-cluster-snapshot
 * ```
 * 
 */
@ResourceType(type="aws:docdb/clusterSnapshot:ClusterSnapshot")
public class ClusterSnapshot extends com.pulumi.resources.CustomResource {
    /**
     * List of EC2 Availability Zones that instances in the DocumentDB cluster snapshot can be restored in.
     * 
     */
    @Export(name="availabilityZones", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> availabilityZones;

    /**
     * @return List of EC2 Availability Zones that instances in the DocumentDB cluster snapshot can be restored in.
     * 
     */
    public Output<List<String>> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * The DocumentDB Cluster Identifier from which to take the snapshot.
     * 
     */
    @Export(name="dbClusterIdentifier", refs={String.class}, tree="[0]")
    private Output<String> dbClusterIdentifier;

    /**
     * @return The DocumentDB Cluster Identifier from which to take the snapshot.
     * 
     */
    public Output<String> dbClusterIdentifier() {
        return this.dbClusterIdentifier;
    }
    /**
     * The Amazon Resource Name (ARN) for the DocumentDB Cluster Snapshot.
     * 
     */
    @Export(name="dbClusterSnapshotArn", refs={String.class}, tree="[0]")
    private Output<String> dbClusterSnapshotArn;

    /**
     * @return The Amazon Resource Name (ARN) for the DocumentDB Cluster Snapshot.
     * 
     */
    public Output<String> dbClusterSnapshotArn() {
        return this.dbClusterSnapshotArn;
    }
    /**
     * The Identifier for the snapshot.
     * 
     */
    @Export(name="dbClusterSnapshotIdentifier", refs={String.class}, tree="[0]")
    private Output<String> dbClusterSnapshotIdentifier;

    /**
     * @return The Identifier for the snapshot.
     * 
     */
    public Output<String> dbClusterSnapshotIdentifier() {
        return this.dbClusterSnapshotIdentifier;
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
     * Version of the database engine for this DocumentDB cluster snapshot.
     * 
     */
    @Export(name="engineVersion", refs={String.class}, tree="[0]")
    private Output<String> engineVersion;

    /**
     * @return Version of the database engine for this DocumentDB cluster snapshot.
     * 
     */
    public Output<String> engineVersion() {
        return this.engineVersion;
    }
    /**
     * If storage_encrypted is true, the AWS KMS key identifier for the encrypted DocumentDB cluster snapshot.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyId;

    /**
     * @return If storage_encrypted is true, the AWS KMS key identifier for the encrypted DocumentDB cluster snapshot.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * Port that the DocumentDB cluster was listening on at the time of the snapshot.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output<Integer> port;

    /**
     * @return Port that the DocumentDB cluster was listening on at the time of the snapshot.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    @Export(name="snapshotType", refs={String.class}, tree="[0]")
    private Output<String> snapshotType;

    public Output<String> snapshotType() {
        return this.snapshotType;
    }
    @Export(name="sourceDbClusterSnapshotArn", refs={String.class}, tree="[0]")
    private Output<String> sourceDbClusterSnapshotArn;

    public Output<String> sourceDbClusterSnapshotArn() {
        return this.sourceDbClusterSnapshotArn;
    }
    /**
     * The status of this DocumentDB Cluster Snapshot.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of this DocumentDB Cluster Snapshot.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Specifies whether the DocumentDB cluster snapshot is encrypted.
     * 
     */
    @Export(name="storageEncrypted", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> storageEncrypted;

    /**
     * @return Specifies whether the DocumentDB cluster snapshot is encrypted.
     * 
     */
    public Output<Boolean> storageEncrypted() {
        return this.storageEncrypted;
    }
    /**
     * The VPC ID associated with the DocumentDB cluster snapshot.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The VPC ID associated with the DocumentDB cluster snapshot.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterSnapshot(String name) {
        this(name, ClusterSnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterSnapshot(String name, ClusterSnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterSnapshot(String name, ClusterSnapshotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:docdb/clusterSnapshot:ClusterSnapshot", name, args == null ? ClusterSnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterSnapshot(String name, Output<String> id, @Nullable ClusterSnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:docdb/clusterSnapshot:ClusterSnapshot", name, state, makeResourceOptions(options, id));
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
    public static ClusterSnapshot get(String name, Output<String> id, @Nullable ClusterSnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterSnapshot(name, id, state, options);
    }
}
