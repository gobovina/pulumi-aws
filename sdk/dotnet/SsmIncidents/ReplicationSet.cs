// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SsmIncidents
{
    /// <summary>
    /// Provides a resource for managing a replication set in AWS Systems Manager Incident Manager.
    /// 
    /// &gt; **NOTE:** Deleting a replication set also deletes all Incident Manager related data including response plans, incident records, contacts and escalation plans.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// Create a replication set.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var replicationSetName = new Aws.SsmIncidents.ReplicationSet("replicationSetName", new()
    ///     {
    ///         Regions = new[]
    ///         {
    ///             new Aws.SsmIncidents.Inputs.ReplicationSetRegionArgs
    ///             {
    ///                 Name = "us-west-2",
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "exampleTag", "exampleValue" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Add a Region to a replication set. (You can add only one Region at a time.)
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var replicationSetName = new Aws.SsmIncidents.ReplicationSet("replicationSetName", new()
    ///     {
    ///         Regions = new[]
    ///         {
    ///             new Aws.SsmIncidents.Inputs.ReplicationSetRegionArgs
    ///             {
    ///                 Name = "us-west-2",
    ///             },
    ///             new Aws.SsmIncidents.Inputs.ReplicationSetRegionArgs
    ///             {
    ///                 Name = "ap-southeast-2",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Delete a Region from a replication set. (You can delete only one Region at a time.)
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var replicationSetName = new Aws.SsmIncidents.ReplicationSet("replicationSetName", new()
    ///     {
    ///         Regions = new[]
    ///         {
    ///             new Aws.SsmIncidents.Inputs.ReplicationSetRegionArgs
    ///             {
    ///                 Name = "us-west-2",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## Basic Usage with an AWS Customer Managed Key
    /// 
    /// Create a replication set with an AWS Key Management Service (AWS KMS) customer manager key:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleKey = new Aws.Kms.Key("exampleKey");
    /// 
    ///     var replicationSetName = new Aws.SsmIncidents.ReplicationSet("replicationSetName", new()
    ///     {
    ///         Regions = new[]
    ///         {
    ///             new Aws.SsmIncidents.Inputs.ReplicationSetRegionArgs
    ///             {
    ///                 Name = "us-west-2",
    ///                 KmsKeyArn = exampleKey.Arn,
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "exampleTag", "exampleValue" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import an Incident Manager replication. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ssmincidents/replicationSet:ReplicationSet replicationSetName import
    /// ```
    /// </summary>
    [AwsResourceType("aws:ssmincidents/replicationSet:ReplicationSet")]
    public partial class ReplicationSet : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the replication set.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The ARN of the user who created the replication set.
        /// </summary>
        [Output("createdBy")]
        public Output<string> CreatedBy { get; private set; } = null!;

        /// <summary>
        /// If `true`, the last region in a replication set cannot be deleted.
        /// </summary>
        [Output("deletionProtected")]
        public Output<bool> DeletionProtected { get; private set; } = null!;

        /// <summary>
        /// A timestamp showing when the replication set was last modified.
        /// </summary>
        [Output("lastModifiedBy")]
        public Output<string> LastModifiedBy { get; private set; } = null!;

        [Output("regions")]
        public Output<ImmutableArray<Outputs.ReplicationSetRegion>> Regions { get; private set; } = null!;

        /// <summary>
        /// The current status of the Region.
        /// * Valid Values: `ACTIVE` | `CREATING` | `UPDATING` | `DELETING` | `FAILED`
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Tags applied to the replication set.
        /// 
        /// For information about the maximum allowed number of Regions and tag value constraints, see [CreateReplicationSet in the *AWS Systems Manager Incident Manager API Reference*](https://docs.aws.amazon.com/incident-manager/latest/APIReference/API_CreateReplicationSet.html).
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a ReplicationSet resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ReplicationSet(string name, ReplicationSetArgs args, CustomResourceOptions? options = null)
            : base("aws:ssmincidents/replicationSet:ReplicationSet", name, args ?? new ReplicationSetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ReplicationSet(string name, Input<string> id, ReplicationSetState? state = null, CustomResourceOptions? options = null)
            : base("aws:ssmincidents/replicationSet:ReplicationSet", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ReplicationSet resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ReplicationSet Get(string name, Input<string> id, ReplicationSetState? state = null, CustomResourceOptions? options = null)
        {
            return new ReplicationSet(name, id, state, options);
        }
    }

    public sealed class ReplicationSetArgs : global::Pulumi.ResourceArgs
    {
        [Input("regions", required: true)]
        private InputList<Inputs.ReplicationSetRegionArgs>? _regions;
        public InputList<Inputs.ReplicationSetRegionArgs> Regions
        {
            get => _regions ?? (_regions = new InputList<Inputs.ReplicationSetRegionArgs>());
            set => _regions = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Tags applied to the replication set.
        /// 
        /// For information about the maximum allowed number of Regions and tag value constraints, see [CreateReplicationSet in the *AWS Systems Manager Incident Manager API Reference*](https://docs.aws.amazon.com/incident-manager/latest/APIReference/API_CreateReplicationSet.html).
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ReplicationSetArgs()
        {
        }
        public static new ReplicationSetArgs Empty => new ReplicationSetArgs();
    }

    public sealed class ReplicationSetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the replication set.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The ARN of the user who created the replication set.
        /// </summary>
        [Input("createdBy")]
        public Input<string>? CreatedBy { get; set; }

        /// <summary>
        /// If `true`, the last region in a replication set cannot be deleted.
        /// </summary>
        [Input("deletionProtected")]
        public Input<bool>? DeletionProtected { get; set; }

        /// <summary>
        /// A timestamp showing when the replication set was last modified.
        /// </summary>
        [Input("lastModifiedBy")]
        public Input<string>? LastModifiedBy { get; set; }

        [Input("regions")]
        private InputList<Inputs.ReplicationSetRegionGetArgs>? _regions;
        public InputList<Inputs.ReplicationSetRegionGetArgs> Regions
        {
            get => _regions ?? (_regions = new InputList<Inputs.ReplicationSetRegionGetArgs>());
            set => _regions = value;
        }

        /// <summary>
        /// The current status of the Region.
        /// * Valid Values: `ACTIVE` | `CREATING` | `UPDATING` | `DELETING` | `FAILED`
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Tags applied to the replication set.
        /// 
        /// For information about the maximum allowed number of Regions and tag value constraints, see [CreateReplicationSet in the *AWS Systems Manager Incident Manager API Reference*](https://docs.aws.amazon.com/incident-manager/latest/APIReference/API_CreateReplicationSet.html).
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
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public ReplicationSetState()
        {
        }
        public static new ReplicationSetState Empty => new ReplicationSetState();
    }
}
