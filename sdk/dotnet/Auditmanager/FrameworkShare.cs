// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Auditmanager
{
    /// <summary>
    /// Resource for managing an AWS Audit Manager Framework Share.
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
    ///     var example = new Aws.Auditmanager.FrameworkShare("example", new()
    ///     {
    ///         DestinationAccount = "012345678901",
    ///         DestinationRegion = "us-east-1",
    ///         FrameworkId = exampleAwsAuditmanagerFramework.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Audit Manager Framework Share using the `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:auditmanager/frameworkShare:FrameworkShare example abcdef-123456
    /// ```
    /// </summary>
    [AwsResourceType("aws:auditmanager/frameworkShare:FrameworkShare")]
    public partial class FrameworkShare : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Comment from the sender about the share request.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Amazon Web Services account of the recipient.
        /// </summary>
        [Output("destinationAccount")]
        public Output<string> DestinationAccount { get; private set; } = null!;

        /// <summary>
        /// Amazon Web Services region of the recipient.
        /// </summary>
        [Output("destinationRegion")]
        public Output<string> DestinationRegion { get; private set; } = null!;

        /// <summary>
        /// Unique identifier for the shared custom framework.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("frameworkId")]
        public Output<string> FrameworkId { get; private set; } = null!;

        /// <summary>
        /// Status of the share request.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a FrameworkShare resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FrameworkShare(string name, FrameworkShareArgs args, CustomResourceOptions? options = null)
            : base("aws:auditmanager/frameworkShare:FrameworkShare", name, args ?? new FrameworkShareArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FrameworkShare(string name, Input<string> id, FrameworkShareState? state = null, CustomResourceOptions? options = null)
            : base("aws:auditmanager/frameworkShare:FrameworkShare", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FrameworkShare resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FrameworkShare Get(string name, Input<string> id, FrameworkShareState? state = null, CustomResourceOptions? options = null)
        {
            return new FrameworkShare(name, id, state, options);
        }
    }

    public sealed class FrameworkShareArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Comment from the sender about the share request.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Amazon Web Services account of the recipient.
        /// </summary>
        [Input("destinationAccount", required: true)]
        public Input<string> DestinationAccount { get; set; } = null!;

        /// <summary>
        /// Amazon Web Services region of the recipient.
        /// </summary>
        [Input("destinationRegion", required: true)]
        public Input<string> DestinationRegion { get; set; } = null!;

        /// <summary>
        /// Unique identifier for the shared custom framework.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("frameworkId", required: true)]
        public Input<string> FrameworkId { get; set; } = null!;

        public FrameworkShareArgs()
        {
        }
        public static new FrameworkShareArgs Empty => new FrameworkShareArgs();
    }

    public sealed class FrameworkShareState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Comment from the sender about the share request.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Amazon Web Services account of the recipient.
        /// </summary>
        [Input("destinationAccount")]
        public Input<string>? DestinationAccount { get; set; }

        /// <summary>
        /// Amazon Web Services region of the recipient.
        /// </summary>
        [Input("destinationRegion")]
        public Input<string>? DestinationRegion { get; set; }

        /// <summary>
        /// Unique identifier for the shared custom framework.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("frameworkId")]
        public Input<string>? FrameworkId { get; set; }

        /// <summary>
        /// Status of the share request.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public FrameworkShareState()
        {
        }
        public static new FrameworkShareState Empty => new FrameworkShareState();
    }
}
