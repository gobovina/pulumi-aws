// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DynamoDB
{
    /// <summary>
    /// Manages [DynamoDB Global Tables V1 (version 2017.11.29)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V1.html). These are layered on top of existing DynamoDB Tables.
    /// 
    /// &gt; **NOTE:** To instead manage [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html), use the `aws.dynamodb.Table` resource `replica` configuration block.
    /// 
    /// &gt; Note: There are many restrictions before you can properly create DynamoDB Global Tables in multiple regions. See the [AWS DynamoDB Global Table Requirements](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables_reqs_bestpractices.html) for more information.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var us_east_1 = new Aws.Provider("us-east-1", new()
    ///     {
    ///         Region = "us-east-1",
    ///     });
    /// 
    ///     var us_west_2 = new Aws.Provider("us-west-2", new()
    ///     {
    ///         Region = "us-west-2",
    ///     });
    /// 
    ///     var us_east_1Table = new Aws.DynamoDB.Table("us-east-1Table", new()
    ///     {
    ///         HashKey = "myAttribute",
    ///         StreamEnabled = true,
    ///         StreamViewType = "NEW_AND_OLD_IMAGES",
    ///         ReadCapacity = 1,
    ///         WriteCapacity = 1,
    ///         Attributes = new[]
    ///         {
    ///             new Aws.DynamoDB.Inputs.TableAttributeArgs
    ///             {
    ///                 Name = "myAttribute",
    ///                 Type = "S",
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = aws.Us_east_1,
    ///     });
    /// 
    ///     var us_west_2Table = new Aws.DynamoDB.Table("us-west-2Table", new()
    ///     {
    ///         HashKey = "myAttribute",
    ///         StreamEnabled = true,
    ///         StreamViewType = "NEW_AND_OLD_IMAGES",
    ///         ReadCapacity = 1,
    ///         WriteCapacity = 1,
    ///         Attributes = new[]
    ///         {
    ///             new Aws.DynamoDB.Inputs.TableAttributeArgs
    ///             {
    ///                 Name = "myAttribute",
    ///                 Type = "S",
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = aws.Us_west_2,
    ///     });
    /// 
    ///     var myTable = new Aws.DynamoDB.GlobalTable("myTable", new()
    ///     {
    ///         Replicas = new[]
    ///         {
    ///             new Aws.DynamoDB.Inputs.GlobalTableReplicaArgs
    ///             {
    ///                 RegionName = "us-east-1",
    ///             },
    ///             new Aws.DynamoDB.Inputs.GlobalTableReplicaArgs
    ///             {
    ///                 RegionName = "us-west-2",
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = aws.Us_east_1,
    ///         DependsOn = new[]
    ///         {
    ///             us_east_1Table,
    ///             us_west_2Table,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import DynamoDB Global Tables using the global table name. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:dynamodb/globalTable:GlobalTable MyTable MyTable
    /// ```
    /// </summary>
    [AwsResourceType("aws:dynamodb/globalTable:GlobalTable")]
    public partial class GlobalTable : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the DynamoDB Global Table
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The name of the global table. Must match underlying DynamoDB Table names in all regions.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Underlying DynamoDB Table. At least 1 replica must be defined. See below.
        /// </summary>
        [Output("replicas")]
        public Output<ImmutableArray<Outputs.GlobalTableReplica>> Replicas { get; private set; } = null!;


        /// <summary>
        /// Create a GlobalTable resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GlobalTable(string name, GlobalTableArgs args, CustomResourceOptions? options = null)
            : base("aws:dynamodb/globalTable:GlobalTable", name, args ?? new GlobalTableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GlobalTable(string name, Input<string> id, GlobalTableState? state = null, CustomResourceOptions? options = null)
            : base("aws:dynamodb/globalTable:GlobalTable", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GlobalTable resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GlobalTable Get(string name, Input<string> id, GlobalTableState? state = null, CustomResourceOptions? options = null)
        {
            return new GlobalTable(name, id, state, options);
        }
    }

    public sealed class GlobalTableArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the global table. Must match underlying DynamoDB Table names in all regions.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("replicas", required: true)]
        private InputList<Inputs.GlobalTableReplicaArgs>? _replicas;

        /// <summary>
        /// Underlying DynamoDB Table. At least 1 replica must be defined. See below.
        /// </summary>
        public InputList<Inputs.GlobalTableReplicaArgs> Replicas
        {
            get => _replicas ?? (_replicas = new InputList<Inputs.GlobalTableReplicaArgs>());
            set => _replicas = value;
        }

        public GlobalTableArgs()
        {
        }
        public static new GlobalTableArgs Empty => new GlobalTableArgs();
    }

    public sealed class GlobalTableState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the DynamoDB Global Table
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The name of the global table. Must match underlying DynamoDB Table names in all regions.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("replicas")]
        private InputList<Inputs.GlobalTableReplicaGetArgs>? _replicas;

        /// <summary>
        /// Underlying DynamoDB Table. At least 1 replica must be defined. See below.
        /// </summary>
        public InputList<Inputs.GlobalTableReplicaGetArgs> Replicas
        {
            get => _replicas ?? (_replicas = new InputList<Inputs.GlobalTableReplicaGetArgs>());
            set => _replicas = value;
        }

        public GlobalTableState()
        {
        }
        public static new GlobalTableState Empty => new GlobalTableState();
    }
}
