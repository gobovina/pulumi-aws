// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AutoScaling
{
    /// <summary>
    /// Attaches a traffic source to an Auto Scaling group.
    /// 
    /// &gt; **NOTE on Auto Scaling Groups, Attachments and Traffic Source Attachments:** Pulumi provides standalone Attachment (for attaching Classic Load Balancers and Application Load Balancer, Gateway Load Balancer, or Network Load Balancer target groups) and Traffic Source Attachment (for attaching Load Balancers and VPC Lattice target groups) resources and an Auto Scaling Group resource with `load_balancers`, `target_group_arns` and `traffic_source` attributes. Do not use the same traffic source in more than one of these resources. Doing so will cause a conflict of attachments. A `lifecycle` configuration block can be used to suppress differences if necessary.
    /// 
    /// ## Example Usage
    /// 
    /// ### Basic Usage
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
    ///     var example = new Aws.AutoScaling.TrafficSourceAttachment("example", new()
    ///     {
    ///         AutoscalingGroupName = exampleAwsAutoscalingGroup.Id,
    ///         TrafficSource = new Aws.AutoScaling.Inputs.TrafficSourceAttachmentTrafficSourceArgs
    ///         {
    ///             Identifier = exampleAwsLbTargetGroup.Arn,
    ///             Type = "elbv2",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [AwsResourceType("aws:autoscaling/trafficSourceAttachment:TrafficSourceAttachment")]
    public partial class TrafficSourceAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the Auto Scaling group.
        /// </summary>
        [Output("autoscalingGroupName")]
        public Output<string> AutoscalingGroupName { get; private set; } = null!;

        /// <summary>
        /// The unique identifiers of a traffic sources.
        /// </summary>
        [Output("trafficSource")]
        public Output<Outputs.TrafficSourceAttachmentTrafficSource?> TrafficSource { get; private set; } = null!;


        /// <summary>
        /// Create a TrafficSourceAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TrafficSourceAttachment(string name, TrafficSourceAttachmentArgs args, CustomResourceOptions? options = null)
            : base("aws:autoscaling/trafficSourceAttachment:TrafficSourceAttachment", name, args ?? new TrafficSourceAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TrafficSourceAttachment(string name, Input<string> id, TrafficSourceAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("aws:autoscaling/trafficSourceAttachment:TrafficSourceAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TrafficSourceAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TrafficSourceAttachment Get(string name, Input<string> id, TrafficSourceAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new TrafficSourceAttachment(name, id, state, options);
        }
    }

    public sealed class TrafficSourceAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Auto Scaling group.
        /// </summary>
        [Input("autoscalingGroupName", required: true)]
        public Input<string> AutoscalingGroupName { get; set; } = null!;

        /// <summary>
        /// The unique identifiers of a traffic sources.
        /// </summary>
        [Input("trafficSource")]
        public Input<Inputs.TrafficSourceAttachmentTrafficSourceArgs>? TrafficSource { get; set; }

        public TrafficSourceAttachmentArgs()
        {
        }
        public static new TrafficSourceAttachmentArgs Empty => new TrafficSourceAttachmentArgs();
    }

    public sealed class TrafficSourceAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Auto Scaling group.
        /// </summary>
        [Input("autoscalingGroupName")]
        public Input<string>? AutoscalingGroupName { get; set; }

        /// <summary>
        /// The unique identifiers of a traffic sources.
        /// </summary>
        [Input("trafficSource")]
        public Input<Inputs.TrafficSourceAttachmentTrafficSourceGetArgs>? TrafficSource { get; set; }

        public TrafficSourceAttachmentState()
        {
        }
        public static new TrafficSourceAttachmentState Empty => new TrafficSourceAttachmentState();
    }
}
