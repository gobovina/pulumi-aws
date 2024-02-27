// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.RedShift
{
    /// <summary>
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
    ///     var @default = new Aws.RedShift.SnapshotSchedule("default", new()
    ///     {
    ///         Definitions = new[]
    ///         {
    ///             "rate(12 hours)",
    ///         },
    ///         Identifier = "tf-redshift-snapshot-schedule",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Redshift Snapshot Schedule using the `identifier`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:redshift/snapshotSchedule:SnapshotSchedule default tf-redshift-snapshot-schedule
    /// ```
    /// </summary>
    [AwsResourceType("aws:redshift/snapshotSchedule:SnapshotSchedule")]
    public partial class SnapshotSchedule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Redshift Snapshot Schedule.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The definition of the snapshot schedule. The definition is made up of schedule expressions, for example `cron(30 12 *)` or `rate(12 hours)`.
        /// </summary>
        [Output("definitions")]
        public Output<ImmutableArray<string>> Definitions { get; private set; } = null!;

        /// <summary>
        /// The description of the snapshot schedule.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Whether to destroy all associated clusters with this snapshot schedule on deletion. Must be enabled and applied before attempting deletion.
        /// </summary>
        [Output("forceDestroy")]
        public Output<bool?> ForceDestroy { get; private set; } = null!;

        /// <summary>
        /// The snapshot schedule identifier. If omitted, this provider will assign a random, unique identifier.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Creates a unique
        /// identifier beginning with the specified prefix. Conflicts with `identifier`.
        /// </summary>
        [Output("identifierPrefix")]
        public Output<string> IdentifierPrefix { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a SnapshotSchedule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SnapshotSchedule(string name, SnapshotScheduleArgs args, CustomResourceOptions? options = null)
            : base("aws:redshift/snapshotSchedule:SnapshotSchedule", name, args ?? new SnapshotScheduleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SnapshotSchedule(string name, Input<string> id, SnapshotScheduleState? state = null, CustomResourceOptions? options = null)
            : base("aws:redshift/snapshotSchedule:SnapshotSchedule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SnapshotSchedule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SnapshotSchedule Get(string name, Input<string> id, SnapshotScheduleState? state = null, CustomResourceOptions? options = null)
        {
            return new SnapshotSchedule(name, id, state, options);
        }
    }

    public sealed class SnapshotScheduleArgs : global::Pulumi.ResourceArgs
    {
        [Input("definitions", required: true)]
        private InputList<string>? _definitions;

        /// <summary>
        /// The definition of the snapshot schedule. The definition is made up of schedule expressions, for example `cron(30 12 *)` or `rate(12 hours)`.
        /// </summary>
        public InputList<string> Definitions
        {
            get => _definitions ?? (_definitions = new InputList<string>());
            set => _definitions = value;
        }

        /// <summary>
        /// The description of the snapshot schedule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether to destroy all associated clusters with this snapshot schedule on deletion. Must be enabled and applied before attempting deletion.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// The snapshot schedule identifier. If omitted, this provider will assign a random, unique identifier.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Creates a unique
        /// identifier beginning with the specified prefix. Conflicts with `identifier`.
        /// </summary>
        [Input("identifierPrefix")]
        public Input<string>? IdentifierPrefix { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public SnapshotScheduleArgs()
        {
        }
        public static new SnapshotScheduleArgs Empty => new SnapshotScheduleArgs();
    }

    public sealed class SnapshotScheduleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Redshift Snapshot Schedule.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("definitions")]
        private InputList<string>? _definitions;

        /// <summary>
        /// The definition of the snapshot schedule. The definition is made up of schedule expressions, for example `cron(30 12 *)` or `rate(12 hours)`.
        /// </summary>
        public InputList<string> Definitions
        {
            get => _definitions ?? (_definitions = new InputList<string>());
            set => _definitions = value;
        }

        /// <summary>
        /// The description of the snapshot schedule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether to destroy all associated clusters with this snapshot schedule on deletion. Must be enabled and applied before attempting deletion.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// The snapshot schedule identifier. If omitted, this provider will assign a random, unique identifier.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Creates a unique
        /// identifier beginning with the specified prefix. Conflicts with `identifier`.
        /// </summary>
        [Input("identifierPrefix")]
        public Input<string>? IdentifierPrefix { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public SnapshotScheduleState()
        {
        }
        public static new SnapshotScheduleState Empty => new SnapshotScheduleState();
    }
}
