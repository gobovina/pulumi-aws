// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudHsmV2
{
    /// <summary>
    /// Creates an Amazon CloudHSM v2 cluster.
    /// 
    /// For information about CloudHSM v2, see the
    /// [AWS CloudHSM User Guide](https://docs.aws.amazon.com/cloudhsm/latest/userguide/introduction.html) and the [Amazon
    /// CloudHSM API Reference][2].
    /// 
    /// &gt; **NOTE:** A CloudHSM Cluster can take several minutes to set up.
    /// Practically no single attribute can be updated, except for `tags`.
    /// If you need to delete a cluster, you have to remove its HSM modules first.
    /// To initialize cluster, you have to add an HSM instance to the cluster, then sign CSR and upload it.
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import CloudHSM v2 Clusters using the cluster `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:cloudhsmv2/cluster:Cluster test_cluster cluster-aeb282a201
    /// ```
    /// </summary>
    [AwsResourceType("aws:cloudhsmv2/cluster:Cluster")]
    public partial class Cluster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The list of cluster certificates.
        /// * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
        /// * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in `UNINITIALIZED` state after an HSM instance is added to the cluster.
        /// * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
        /// * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
        /// * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
        /// </summary>
        [Output("clusterCertificates")]
        public Output<ImmutableArray<Outputs.ClusterClusterCertificate>> ClusterCertificates { get; private set; } = null!;

        /// <summary>
        /// The id of the CloudHSM cluster.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The state of the CloudHSM cluster.
        /// </summary>
        [Output("clusterState")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
        /// </summary>
        [Output("hsmType")]
        public Output<string> HsmType { get; private set; } = null!;

        /// <summary>
        /// The ID of the security group associated with the CloudHSM cluster.
        /// </summary>
        [Output("securityGroupId")]
        public Output<string> SecurityGroupId { get; private set; } = null!;

        /// <summary>
        /// ID of Cloud HSM v2 cluster backup to be restored.
        /// </summary>
        [Output("sourceBackupIdentifier")]
        public Output<string?> SourceBackupIdentifier { get; private set; } = null!;

        /// <summary>
        /// The IDs of subnets in which cluster will operate.
        /// </summary>
        [Output("subnetIds")]
        public Output<ImmutableArray<string>> SubnetIds { get; private set; } = null!;

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
        /// The id of the VPC that the CloudHSM cluster resides in.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a Cluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Cluster(string name, ClusterArgs args, CustomResourceOptions? options = null)
            : base("aws:cloudhsmv2/cluster:Cluster", name, args ?? new ClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Cluster(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
            : base("aws:cloudhsmv2/cluster:Cluster", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Cluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Cluster Get(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new Cluster(name, id, state, options);
        }
    }

    public sealed class ClusterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
        /// </summary>
        [Input("hsmType", required: true)]
        public Input<string> HsmType { get; set; } = null!;

        /// <summary>
        /// ID of Cloud HSM v2 cluster backup to be restored.
        /// </summary>
        [Input("sourceBackupIdentifier")]
        public Input<string>? SourceBackupIdentifier { get; set; }

        [Input("subnetIds", required: true)]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// The IDs of subnets in which cluster will operate.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

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

        public ClusterArgs()
        {
        }
        public static new ClusterArgs Empty => new ClusterArgs();
    }

    public sealed class ClusterState : global::Pulumi.ResourceArgs
    {
        [Input("clusterCertificates")]
        private InputList<Inputs.ClusterClusterCertificateGetArgs>? _clusterCertificates;

        /// <summary>
        /// The list of cluster certificates.
        /// * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
        /// * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in `UNINITIALIZED` state after an HSM instance is added to the cluster.
        /// * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
        /// * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
        /// * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
        /// </summary>
        public InputList<Inputs.ClusterClusterCertificateGetArgs> ClusterCertificates
        {
            get => _clusterCertificates ?? (_clusterCertificates = new InputList<Inputs.ClusterClusterCertificateGetArgs>());
            set => _clusterCertificates = value;
        }

        /// <summary>
        /// The id of the CloudHSM cluster.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The state of the CloudHSM cluster.
        /// </summary>
        [Input("clusterState")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
        /// </summary>
        [Input("hsmType")]
        public Input<string>? HsmType { get; set; }

        /// <summary>
        /// The ID of the security group associated with the CloudHSM cluster.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// ID of Cloud HSM v2 cluster backup to be restored.
        /// </summary>
        [Input("sourceBackupIdentifier")]
        public Input<string>? SourceBackupIdentifier { get; set; }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// The IDs of subnets in which cluster will operate.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

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
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The id of the VPC that the CloudHSM cluster resides in.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public ClusterState()
        {
        }
        public static new ClusterState Empty => new ClusterState();
    }
}
