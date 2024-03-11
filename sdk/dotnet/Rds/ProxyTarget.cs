// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Rds
{
    /// <summary>
    /// Provides an RDS DB proxy target resource.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Rds.Proxy("example", new()
    ///     {
    ///         Name = "example",
    ///         DebugLogging = false,
    ///         EngineFamily = "MYSQL",
    ///         IdleClientTimeout = 1800,
    ///         RequireTls = true,
    ///         RoleArn = exampleAwsIamRole.Arn,
    ///         VpcSecurityGroupIds = new[]
    ///         {
    ///             exampleAwsSecurityGroup.Id,
    ///         },
    ///         VpcSubnetIds = new[]
    ///         {
    ///             exampleAwsSubnet.Id,
    ///         },
    ///         Auths = new[]
    ///         {
    ///             new Aws.Rds.Inputs.ProxyAuthArgs
    ///             {
    ///                 AuthScheme = "SECRETS",
    ///                 Description = "example",
    ///                 IamAuth = "DISABLED",
    ///                 SecretArn = exampleAwsSecretsmanagerSecret.Arn,
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Name", "example" },
    ///             { "Key", "value" },
    ///         },
    ///     });
    /// 
    ///     var exampleProxyDefaultTargetGroup = new Aws.Rds.ProxyDefaultTargetGroup("example", new()
    ///     {
    ///         DbProxyName = example.Name,
    ///         ConnectionPoolConfig = new Aws.Rds.Inputs.ProxyDefaultTargetGroupConnectionPoolConfigArgs
    ///         {
    ///             ConnectionBorrowTimeout = 120,
    ///             InitQuery = "SET x=1, y=2",
    ///             MaxConnectionsPercent = 100,
    ///             MaxIdleConnectionsPercent = 50,
    ///             SessionPinningFilters = new[]
    ///             {
    ///                 "EXCLUDE_VARIABLE_SETS",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleProxyTarget = new Aws.Rds.ProxyTarget("example", new()
    ///     {
    ///         DbInstanceIdentifier = exampleAwsDbInstance.Identifier,
    ///         DbProxyName = example.Name,
    ///         TargetGroupName = exampleProxyDefaultTargetGroup.Name,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Provisioned Clusters:
    /// 
    /// __Using `pulumi import` to import__ RDS DB Proxy Targets using the `db_proxy_name`, `target_group_name`, target type (such as `RDS_INSTANCE` or `TRACKED_CLUSTER`), and resource identifier separated by forward slashes (`/`). For example:
    /// 
    /// Instances:
    /// 
    /// ```sh
    /// $ pulumi import aws:rds/proxyTarget:ProxyTarget example example-proxy/default/RDS_INSTANCE/example-instance
    /// ```
    /// Provisioned Clusters:
    /// 
    /// ```sh
    /// $ pulumi import aws:rds/proxyTarget:ProxyTarget example example-proxy/default/TRACKED_CLUSTER/example-cluster
    /// ```
    /// </summary>
    [AwsResourceType("aws:rds/proxyTarget:ProxyTarget")]
    public partial class ProxyTarget : global::Pulumi.CustomResource
    {
        /// <summary>
        /// DB cluster identifier.
        /// 
        /// **NOTE:** Either `db_instance_identifier` or `db_cluster_identifier` should be specified and both should not be specified together
        /// </summary>
        [Output("dbClusterIdentifier")]
        public Output<string?> DbClusterIdentifier { get; private set; } = null!;

        /// <summary>
        /// DB instance identifier.
        /// </summary>
        [Output("dbInstanceIdentifier")]
        public Output<string?> DbInstanceIdentifier { get; private set; } = null!;

        /// <summary>
        /// The name of the DB proxy.
        /// </summary>
        [Output("dbProxyName")]
        public Output<string> DbProxyName { get; private set; } = null!;

        /// <summary>
        /// Hostname for the target RDS DB Instance. Only returned for `RDS_INSTANCE` type.
        /// </summary>
        [Output("endpoint")]
        public Output<string> Endpoint { get; private set; } = null!;

        /// <summary>
        /// Port for the target RDS DB Instance or Aurora DB Cluster.
        /// </summary>
        [Output("port")]
        public Output<int> Port { get; private set; } = null!;

        /// <summary>
        /// Identifier representing the DB Instance or DB Cluster target.
        /// </summary>
        [Output("rdsResourceId")]
        public Output<string> RdsResourceId { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) for the DB instance or DB cluster. Currently not returned by the RDS API.
        /// </summary>
        [Output("targetArn")]
        public Output<string> TargetArn { get; private set; } = null!;

        /// <summary>
        /// The name of the target group.
        /// </summary>
        [Output("targetGroupName")]
        public Output<string> TargetGroupName { get; private set; } = null!;

        /// <summary>
        /// DB Cluster identifier for the DB Instance target. Not returned unless manually importing an `RDS_INSTANCE` target that is part of a DB Cluster.
        /// </summary>
        [Output("trackedClusterId")]
        public Output<string> TrackedClusterId { get; private set; } = null!;

        /// <summary>
        /// Type of targetE.g., `RDS_INSTANCE` or `TRACKED_CLUSTER`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a ProxyTarget resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProxyTarget(string name, ProxyTargetArgs args, CustomResourceOptions? options = null)
            : base("aws:rds/proxyTarget:ProxyTarget", name, args ?? new ProxyTargetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProxyTarget(string name, Input<string> id, ProxyTargetState? state = null, CustomResourceOptions? options = null)
            : base("aws:rds/proxyTarget:ProxyTarget", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ProxyTarget resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProxyTarget Get(string name, Input<string> id, ProxyTargetState? state = null, CustomResourceOptions? options = null)
        {
            return new ProxyTarget(name, id, state, options);
        }
    }

    public sealed class ProxyTargetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// DB cluster identifier.
        /// 
        /// **NOTE:** Either `db_instance_identifier` or `db_cluster_identifier` should be specified and both should not be specified together
        /// </summary>
        [Input("dbClusterIdentifier")]
        public Input<string>? DbClusterIdentifier { get; set; }

        /// <summary>
        /// DB instance identifier.
        /// </summary>
        [Input("dbInstanceIdentifier")]
        public Input<string>? DbInstanceIdentifier { get; set; }

        /// <summary>
        /// The name of the DB proxy.
        /// </summary>
        [Input("dbProxyName", required: true)]
        public Input<string> DbProxyName { get; set; } = null!;

        /// <summary>
        /// The name of the target group.
        /// </summary>
        [Input("targetGroupName", required: true)]
        public Input<string> TargetGroupName { get; set; } = null!;

        public ProxyTargetArgs()
        {
        }
        public static new ProxyTargetArgs Empty => new ProxyTargetArgs();
    }

    public sealed class ProxyTargetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// DB cluster identifier.
        /// 
        /// **NOTE:** Either `db_instance_identifier` or `db_cluster_identifier` should be specified and both should not be specified together
        /// </summary>
        [Input("dbClusterIdentifier")]
        public Input<string>? DbClusterIdentifier { get; set; }

        /// <summary>
        /// DB instance identifier.
        /// </summary>
        [Input("dbInstanceIdentifier")]
        public Input<string>? DbInstanceIdentifier { get; set; }

        /// <summary>
        /// The name of the DB proxy.
        /// </summary>
        [Input("dbProxyName")]
        public Input<string>? DbProxyName { get; set; }

        /// <summary>
        /// Hostname for the target RDS DB Instance. Only returned for `RDS_INSTANCE` type.
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// Port for the target RDS DB Instance or Aurora DB Cluster.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Identifier representing the DB Instance or DB Cluster target.
        /// </summary>
        [Input("rdsResourceId")]
        public Input<string>? RdsResourceId { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) for the DB instance or DB cluster. Currently not returned by the RDS API.
        /// </summary>
        [Input("targetArn")]
        public Input<string>? TargetArn { get; set; }

        /// <summary>
        /// The name of the target group.
        /// </summary>
        [Input("targetGroupName")]
        public Input<string>? TargetGroupName { get; set; }

        /// <summary>
        /// DB Cluster identifier for the DB Instance target. Not returned unless manually importing an `RDS_INSTANCE` target that is part of a DB Cluster.
        /// </summary>
        [Input("trackedClusterId")]
        public Input<string>? TrackedClusterId { get; set; }

        /// <summary>
        /// Type of targetE.g., `RDS_INSTANCE` or `TRACKED_CLUSTER`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ProxyTargetState()
        {
        }
        public static new ProxyTargetState Empty => new ProxyTargetState();
    }
}
