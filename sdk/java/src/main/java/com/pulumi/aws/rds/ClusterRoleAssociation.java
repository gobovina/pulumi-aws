// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rds.ClusterRoleAssociationArgs;
import com.pulumi.aws.rds.inputs.ClusterRoleAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a RDS DB Cluster association with an IAM Role. Example use cases:
 * 
 * * [Creating an IAM Role to Allow Amazon Aurora to Access AWS Services](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.IAM.CreateRole.html)
 * * [Importing Amazon S3 Data into an RDS PostgreSQL DB Cluster](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PostgreSQL.S3Import.html)
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.rds.ClusterRoleAssociation;
 * import com.pulumi.aws.rds.ClusterRoleAssociationArgs;
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
 *         var example = new ClusterRoleAssociation(&#34;example&#34;, ClusterRoleAssociationArgs.builder()        
 *             .dbClusterIdentifier(aws_rds_cluster.example().id())
 *             .featureName(&#34;S3_INTEGRATION&#34;)
 *             .roleArn(aws_iam_role.example().arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_rds_cluster_role_association` using the DB Cluster Identifier and IAM Role ARN separated by a comma (`,`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:rds/clusterRoleAssociation:ClusterRoleAssociation example my-db-cluster,arn:aws:iam::123456789012:role/my-role
 * ```
 * 
 */
@ResourceType(type="aws:rds/clusterRoleAssociation:ClusterRoleAssociation")
public class ClusterRoleAssociation extends com.pulumi.resources.CustomResource {
    /**
     * DB Cluster Identifier to associate with the IAM Role.
     * 
     */
    @Export(name="dbClusterIdentifier", refs={String.class}, tree="[0]")
    private Output<String> dbClusterIdentifier;

    /**
     * @return DB Cluster Identifier to associate with the IAM Role.
     * 
     */
    public Output<String> dbClusterIdentifier() {
        return this.dbClusterIdentifier;
    }
    /**
     * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
     * 
     */
    @Export(name="featureName", refs={String.class}, tree="[0]")
    private Output<String> featureName;

    /**
     * @return Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
     * 
     */
    public Output<String> featureName() {
        return this.featureName;
    }
    /**
     * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Cluster.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output<String> roleArn;

    /**
     * @return Amazon Resource Name (ARN) of the IAM Role to associate with the DB Cluster.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterRoleAssociation(String name) {
        this(name, ClusterRoleAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterRoleAssociation(String name, ClusterRoleAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterRoleAssociation(String name, ClusterRoleAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/clusterRoleAssociation:ClusterRoleAssociation", name, args == null ? ClusterRoleAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterRoleAssociation(String name, Output<String> id, @Nullable ClusterRoleAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/clusterRoleAssociation:ClusterRoleAssociation", name, state, makeResourceOptions(options, id));
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
    public static ClusterRoleAssociation get(String name, Output<String> id, @Nullable ClusterRoleAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterRoleAssociation(name, id, state, options);
    }
}
