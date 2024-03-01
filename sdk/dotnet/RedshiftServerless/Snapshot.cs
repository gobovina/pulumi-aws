// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.RedshiftServerless
{
    /// <summary>
    /// Creates a new Amazon Redshift Serverless Snapshot.
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
    ///     var example = new Aws.RedshiftServerless.Snapshot("example", new()
    ///     {
    ///         NamespaceName = exampleAwsRedshiftserverlessWorkgroup.NamespaceName,
    ///         SnapshotName = "example",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Redshift Serverless Snapshots using the `snapshot_name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:redshiftserverless/snapshot:Snapshot example example
    /// ```
    /// </summary>
    [AwsResourceType("aws:redshiftserverless/snapshot:Snapshot")]
    public partial class Snapshot : global::Pulumi.CustomResource
    {
        /// <summary>
        /// All of the Amazon Web Services accounts that have access to restore a snapshot to a provisioned cluster.
        /// </summary>
        [Output("accountsWithProvisionedRestoreAccesses")]
        public Output<ImmutableArray<string>> AccountsWithProvisionedRestoreAccesses { get; private set; } = null!;

        /// <summary>
        /// All of the Amazon Web Services accounts that have access to restore a snapshot to a namespace.
        /// </summary>
        [Output("accountsWithRestoreAccesses")]
        public Output<ImmutableArray<string>> AccountsWithRestoreAccesses { get; private set; } = null!;

        /// <summary>
        /// The username of the database within a snapshot.
        /// </summary>
        [Output("adminUsername")]
        public Output<string> AdminUsername { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the snapshot.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The unique identifier of the KMS key used to encrypt the snapshot.
        /// </summary>
        [Output("kmsKeyId")]
        public Output<string> KmsKeyId { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the namespace the snapshot was created from.
        /// </summary>
        [Output("namespaceArn")]
        public Output<string> NamespaceArn { get; private set; } = null!;

        /// <summary>
        /// The namespace to create a snapshot for.
        /// </summary>
        [Output("namespaceName")]
        public Output<string> NamespaceName { get; private set; } = null!;

        /// <summary>
        /// The owner Amazon Web Services; account of the snapshot.
        /// </summary>
        [Output("ownerAccount")]
        public Output<string> OwnerAccount { get; private set; } = null!;

        /// <summary>
        /// How long to retain the created snapshot. Default value is `-1`.
        /// </summary>
        [Output("retentionPeriod")]
        public Output<int?> RetentionPeriod { get; private set; } = null!;

        /// <summary>
        /// The name of the snapshot.
        /// </summary>
        [Output("snapshotName")]
        public Output<string> SnapshotName { get; private set; } = null!;


        /// <summary>
        /// Create a Snapshot resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Snapshot(string name, SnapshotArgs args, CustomResourceOptions? options = null)
            : base("aws:redshiftserverless/snapshot:Snapshot", name, args ?? new SnapshotArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Snapshot(string name, Input<string> id, SnapshotState? state = null, CustomResourceOptions? options = null)
            : base("aws:redshiftserverless/snapshot:Snapshot", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Snapshot resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Snapshot Get(string name, Input<string> id, SnapshotState? state = null, CustomResourceOptions? options = null)
        {
            return new Snapshot(name, id, state, options);
        }
    }

    public sealed class SnapshotArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The namespace to create a snapshot for.
        /// </summary>
        [Input("namespaceName", required: true)]
        public Input<string> NamespaceName { get; set; } = null!;

        /// <summary>
        /// How long to retain the created snapshot. Default value is `-1`.
        /// </summary>
        [Input("retentionPeriod")]
        public Input<int>? RetentionPeriod { get; set; }

        /// <summary>
        /// The name of the snapshot.
        /// </summary>
        [Input("snapshotName", required: true)]
        public Input<string> SnapshotName { get; set; } = null!;

        public SnapshotArgs()
        {
        }
        public static new SnapshotArgs Empty => new SnapshotArgs();
    }

    public sealed class SnapshotState : global::Pulumi.ResourceArgs
    {
        [Input("accountsWithProvisionedRestoreAccesses")]
        private InputList<string>? _accountsWithProvisionedRestoreAccesses;

        /// <summary>
        /// All of the Amazon Web Services accounts that have access to restore a snapshot to a provisioned cluster.
        /// </summary>
        public InputList<string> AccountsWithProvisionedRestoreAccesses
        {
            get => _accountsWithProvisionedRestoreAccesses ?? (_accountsWithProvisionedRestoreAccesses = new InputList<string>());
            set => _accountsWithProvisionedRestoreAccesses = value;
        }

        [Input("accountsWithRestoreAccesses")]
        private InputList<string>? _accountsWithRestoreAccesses;

        /// <summary>
        /// All of the Amazon Web Services accounts that have access to restore a snapshot to a namespace.
        /// </summary>
        public InputList<string> AccountsWithRestoreAccesses
        {
            get => _accountsWithRestoreAccesses ?? (_accountsWithRestoreAccesses = new InputList<string>());
            set => _accountsWithRestoreAccesses = value;
        }

        /// <summary>
        /// The username of the database within a snapshot.
        /// </summary>
        [Input("adminUsername")]
        public Input<string>? AdminUsername { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the snapshot.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The unique identifier of the KMS key used to encrypt the snapshot.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the namespace the snapshot was created from.
        /// </summary>
        [Input("namespaceArn")]
        public Input<string>? NamespaceArn { get; set; }

        /// <summary>
        /// The namespace to create a snapshot for.
        /// </summary>
        [Input("namespaceName")]
        public Input<string>? NamespaceName { get; set; }

        /// <summary>
        /// The owner Amazon Web Services; account of the snapshot.
        /// </summary>
        [Input("ownerAccount")]
        public Input<string>? OwnerAccount { get; set; }

        /// <summary>
        /// How long to retain the created snapshot. Default value is `-1`.
        /// </summary>
        [Input("retentionPeriod")]
        public Input<int>? RetentionPeriod { get; set; }

        /// <summary>
        /// The name of the snapshot.
        /// </summary>
        [Input("snapshotName")]
        public Input<string>? SnapshotName { get; set; }

        public SnapshotState()
        {
        }
        public static new SnapshotState Empty => new SnapshotState();
    }
}
