// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Glue
{
    /// <summary>
    /// Provides a Glue Connection resource.
    /// 
    /// ## Example Usage
    /// ### Non-VPC Connection
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Glue.Connection("example", new()
    ///     {
    ///         ConnectionProperties = 
    ///         {
    ///             { "JDBC_CONNECTION_URL", "jdbc:mysql://example.com/exampledatabase" },
    ///             { "PASSWORD", "examplepassword" },
    ///             { "USERNAME", "exampleusername" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### VPC Connection
    /// 
    /// For more information, see the [AWS Documentation](https://docs.aws.amazon.com/glue/latest/dg/populate-add-connection.html#connection-JDBC-VPC).
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Glue.Connection("example", new()
    ///     {
    ///         ConnectionProperties = 
    ///         {
    ///             { "JDBC_CONNECTION_URL", $"jdbc:mysql://{aws_rds_cluster.Example.Endpoint}/exampledatabase" },
    ///             { "PASSWORD", "examplepassword" },
    ///             { "USERNAME", "exampleusername" },
    ///         },
    ///         PhysicalConnectionRequirements = new Aws.Glue.Inputs.ConnectionPhysicalConnectionRequirementsArgs
    ///         {
    ///             AvailabilityZone = aws_subnet.Example.Availability_zone,
    ///             SecurityGroupIdLists = new[]
    ///             {
    ///                 aws_security_group.Example.Id,
    ///             },
    ///             SubnetId = aws_subnet.Example.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Glue Connections using the `CATALOG-ID` (AWS account ID if not custom) and `NAME`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:glue/connection:Connection MyConnection 123456789012:MyConnection
    /// ```
    /// </summary>
    [AwsResourceType("aws:glue/connection:Connection")]
    public partial class Connection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the Glue Connection.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
        /// </summary>
        [Output("catalogId")]
        public Output<string> CatalogId { get; private set; } = null!;

        /// <summary>
        /// A map of key-value pairs used as parameters for this connection.
        /// </summary>
        [Output("connectionProperties")]
        public Output<ImmutableDictionary<string, string>?> ConnectionProperties { get; private set; } = null!;

        /// <summary>
        /// The type of the connection. Supported are: `CUSTOM`, `JDBC`, `KAFKA`, `MARKETPLACE`, `MONGODB`, and `NETWORK`. Defaults to `JBDC`.
        /// </summary>
        [Output("connectionType")]
        public Output<string?> ConnectionType { get; private set; } = null!;

        /// <summary>
        /// Description of the connection.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A list of criteria that can be used in selecting this connection.
        /// </summary>
        [Output("matchCriterias")]
        public Output<ImmutableArray<string>> MatchCriterias { get; private set; } = null!;

        /// <summary>
        /// The name of the connection.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
        /// </summary>
        [Output("physicalConnectionRequirements")]
        public Output<Outputs.ConnectionPhysicalConnectionRequirements?> PhysicalConnectionRequirements { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a Connection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Connection(string name, ConnectionArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:glue/connection:Connection", name, args ?? new ConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Connection(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
            : base("aws:glue/connection:Connection", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "connectionProperties",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Connection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Connection Get(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new Connection(name, id, state, options);
        }
    }

    public sealed class ConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
        /// </summary>
        [Input("catalogId")]
        public Input<string>? CatalogId { get; set; }

        [Input("connectionProperties")]
        private InputMap<string>? _connectionProperties;

        /// <summary>
        /// A map of key-value pairs used as parameters for this connection.
        /// </summary>
        public InputMap<string> ConnectionProperties
        {
            get => _connectionProperties ?? (_connectionProperties = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _connectionProperties = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// The type of the connection. Supported are: `CUSTOM`, `JDBC`, `KAFKA`, `MARKETPLACE`, `MONGODB`, and `NETWORK`. Defaults to `JBDC`.
        /// </summary>
        [Input("connectionType")]
        public Input<string>? ConnectionType { get; set; }

        /// <summary>
        /// Description of the connection.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("matchCriterias")]
        private InputList<string>? _matchCriterias;

        /// <summary>
        /// A list of criteria that can be used in selecting this connection.
        /// </summary>
        public InputList<string> MatchCriterias
        {
            get => _matchCriterias ?? (_matchCriterias = new InputList<string>());
            set => _matchCriterias = value;
        }

        /// <summary>
        /// The name of the connection.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
        /// </summary>
        [Input("physicalConnectionRequirements")]
        public Input<Inputs.ConnectionPhysicalConnectionRequirementsArgs>? PhysicalConnectionRequirements { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ConnectionArgs()
        {
        }
        public static new ConnectionArgs Empty => new ConnectionArgs();
    }

    public sealed class ConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the Glue Connection.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
        /// </summary>
        [Input("catalogId")]
        public Input<string>? CatalogId { get; set; }

        [Input("connectionProperties")]
        private InputMap<string>? _connectionProperties;

        /// <summary>
        /// A map of key-value pairs used as parameters for this connection.
        /// </summary>
        public InputMap<string> ConnectionProperties
        {
            get => _connectionProperties ?? (_connectionProperties = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _connectionProperties = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// The type of the connection. Supported are: `CUSTOM`, `JDBC`, `KAFKA`, `MARKETPLACE`, `MONGODB`, and `NETWORK`. Defaults to `JBDC`.
        /// </summary>
        [Input("connectionType")]
        public Input<string>? ConnectionType { get; set; }

        /// <summary>
        /// Description of the connection.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("matchCriterias")]
        private InputList<string>? _matchCriterias;

        /// <summary>
        /// A list of criteria that can be used in selecting this connection.
        /// </summary>
        public InputList<string> MatchCriterias
        {
            get => _matchCriterias ?? (_matchCriterias = new InputList<string>());
            set => _matchCriterias = value;
        }

        /// <summary>
        /// The name of the connection.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
        /// </summary>
        [Input("physicalConnectionRequirements")]
        public Input<Inputs.ConnectionPhysicalConnectionRequirementsGetArgs>? PhysicalConnectionRequirements { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public ConnectionState()
        {
        }
        public static new ConnectionState Empty => new ConnectionState();
    }
}
