// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.VpcLattice
{
    /// <summary>
    /// Provides the ability to register a target with an AWS VPC Lattice Target Group.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.VpcLattice.TargetGroupAttachment("example", new()
    ///     {
    ///         TargetGroupIdentifier = exampleAwsVpclatticeTargetGroup.Id,
    ///         Target = new Aws.VpcLattice.Inputs.TargetGroupAttachmentTargetArgs
    ///         {
    ///             Id = exampleAwsLb.Arn,
    ///             Port = 80,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [AwsResourceType("aws:vpclattice/targetGroupAttachment:TargetGroupAttachment")]
    public partial class TargetGroupAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The target.
        /// </summary>
        [Output("target")]
        public Output<Outputs.TargetGroupAttachmentTarget> Target { get; private set; } = null!;

        /// <summary>
        /// The ID or Amazon Resource Name (ARN) of the target group.
        /// </summary>
        [Output("targetGroupIdentifier")]
        public Output<string> TargetGroupIdentifier { get; private set; } = null!;


        /// <summary>
        /// Create a TargetGroupAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TargetGroupAttachment(string name, TargetGroupAttachmentArgs args, CustomResourceOptions? options = null)
            : base("aws:vpclattice/targetGroupAttachment:TargetGroupAttachment", name, args ?? new TargetGroupAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TargetGroupAttachment(string name, Input<string> id, TargetGroupAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("aws:vpclattice/targetGroupAttachment:TargetGroupAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TargetGroupAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TargetGroupAttachment Get(string name, Input<string> id, TargetGroupAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new TargetGroupAttachment(name, id, state, options);
        }
    }

    public sealed class TargetGroupAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The target.
        /// </summary>
        [Input("target", required: true)]
        public Input<Inputs.TargetGroupAttachmentTargetArgs> Target { get; set; } = null!;

        /// <summary>
        /// The ID or Amazon Resource Name (ARN) of the target group.
        /// </summary>
        [Input("targetGroupIdentifier", required: true)]
        public Input<string> TargetGroupIdentifier { get; set; } = null!;

        public TargetGroupAttachmentArgs()
        {
        }
        public static new TargetGroupAttachmentArgs Empty => new TargetGroupAttachmentArgs();
    }

    public sealed class TargetGroupAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The target.
        /// </summary>
        [Input("target")]
        public Input<Inputs.TargetGroupAttachmentTargetGetArgs>? Target { get; set; }

        /// <summary>
        /// The ID or Amazon Resource Name (ARN) of the target group.
        /// </summary>
        [Input("targetGroupIdentifier")]
        public Input<string>? TargetGroupIdentifier { get; set; }

        public TargetGroupAttachmentState()
        {
        }
        public static new TargetGroupAttachmentState Empty => new TargetGroupAttachmentState();
    }
}
