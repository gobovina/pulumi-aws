// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    /// <summary>
    /// Provides an Traffic mirror target.\
    /// Read [limits and considerations](https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html) for traffic mirroring
    /// 
    /// ## Example Usage
    /// 
    /// To create a basic traffic mirror session
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var nlb = new Aws.Ec2.TrafficMirrorTarget("nlb", new Aws.Ec2.TrafficMirrorTargetArgs
    ///         {
    ///             Description = "NLB target",
    ///             NetworkLoadBalancerArn = aws_lb.Lb.Arn,
    ///         });
    ///         var eni = new Aws.Ec2.TrafficMirrorTarget("eni", new Aws.Ec2.TrafficMirrorTargetArgs
    ///         {
    ///             Description = "ENI target",
    ///             NetworkInterfaceId = aws_instance.Test.Primary_network_interface_id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class TrafficMirrorTarget : Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the traffic mirror target.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// A description of the traffic mirror session.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The network interface ID that is associated with the target.
        /// </summary>
        [Output("networkInterfaceId")]
        public Output<string?> NetworkInterfaceId { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
        /// </summary>
        [Output("networkLoadBalancerArn")]
        public Output<string?> NetworkLoadBalancerArn { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a TrafficMirrorTarget resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TrafficMirrorTarget(string name, TrafficMirrorTargetArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:ec2/trafficMirrorTarget:TrafficMirrorTarget", name, args ?? new TrafficMirrorTargetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TrafficMirrorTarget(string name, Input<string> id, TrafficMirrorTargetState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/trafficMirrorTarget:TrafficMirrorTarget", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TrafficMirrorTarget resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TrafficMirrorTarget Get(string name, Input<string> id, TrafficMirrorTargetState? state = null, CustomResourceOptions? options = null)
        {
            return new TrafficMirrorTarget(name, id, state, options);
        }
    }

    public sealed class TrafficMirrorTargetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description of the traffic mirror session.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The network interface ID that is associated with the target.
        /// </summary>
        [Input("networkInterfaceId")]
        public Input<string>? NetworkInterfaceId { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
        /// </summary>
        [Input("networkLoadBalancerArn")]
        public Input<string>? NetworkLoadBalancerArn { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public TrafficMirrorTargetArgs()
        {
        }
    }

    public sealed class TrafficMirrorTargetState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the traffic mirror target.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// A description of the traffic mirror session.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The network interface ID that is associated with the target.
        /// </summary>
        [Input("networkInterfaceId")]
        public Input<string>? NetworkInterfaceId { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
        /// </summary>
        [Input("networkLoadBalancerArn")]
        public Input<string>? NetworkLoadBalancerArn { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public TrafficMirrorTargetState()
        {
        }
    }
}
