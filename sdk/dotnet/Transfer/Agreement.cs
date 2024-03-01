// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Transfer
{
    /// <summary>
    /// Provides a AWS Transfer AS2 Agreement resource.
    /// 
    /// ## Example Usage
    /// ### Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Transfer.Agreement("example", new()
    ///     {
    ///         AccessRole = test.Arn,
    ///         BaseDirectory = "/DOC-EXAMPLE-BUCKET/home/mydirectory",
    ///         Description = "example",
    ///         LocalProfileId = local.ProfileId,
    ///         PartnerProfileId = partner.ProfileId,
    ///         ServerId = testAwsTransferServer.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Transfer AS2 Agreement using the `server_id/agreement_id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:transfer/agreement:Agreement example s-4221a88afd5f4362a/a-4221a88afd5f4362a
    /// ```
    /// </summary>
    [AwsResourceType("aws:transfer/agreement:Agreement")]
    public partial class Agreement : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
        /// </summary>
        [Output("accessRole")]
        public Output<string> AccessRole { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the AS2 agreement.
        /// </summary>
        [Output("agreementId")]
        public Output<string> AgreementId { get; private set; } = null!;

        /// <summary>
        /// The ARN of the agreement.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The landing directory for the files transferred by using the AS2 protocol.
        /// </summary>
        [Output("baseDirectory")]
        public Output<string> BaseDirectory { get; private set; } = null!;

        /// <summary>
        /// The Optional description of the transdfer.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the AS2 local profile.
        /// </summary>
        [Output("localProfileId")]
        public Output<string> LocalProfileId { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the AS2 partner profile.
        /// </summary>
        [Output("partnerProfileId")]
        public Output<string> PartnerProfileId { get; private set; } = null!;

        /// <summary>
        /// The unique server identifier for the server instance. This is the specific server the agreement uses.
        /// </summary>
        [Output("serverId")]
        public Output<string> ServerId { get; private set; } = null!;

        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a Agreement resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Agreement(string name, AgreementArgs args, CustomResourceOptions? options = null)
            : base("aws:transfer/agreement:Agreement", name, args ?? new AgreementArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Agreement(string name, Input<string> id, AgreementState? state = null, CustomResourceOptions? options = null)
            : base("aws:transfer/agreement:Agreement", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Agreement resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Agreement Get(string name, Input<string> id, AgreementState? state = null, CustomResourceOptions? options = null)
        {
            return new Agreement(name, id, state, options);
        }
    }

    public sealed class AgreementArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
        /// </summary>
        [Input("accessRole", required: true)]
        public Input<string> AccessRole { get; set; } = null!;

        /// <summary>
        /// The landing directory for the files transferred by using the AS2 protocol.
        /// </summary>
        [Input("baseDirectory", required: true)]
        public Input<string> BaseDirectory { get; set; } = null!;

        /// <summary>
        /// The Optional description of the transdfer.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The unique identifier for the AS2 local profile.
        /// </summary>
        [Input("localProfileId", required: true)]
        public Input<string> LocalProfileId { get; set; } = null!;

        /// <summary>
        /// The unique identifier for the AS2 partner profile.
        /// </summary>
        [Input("partnerProfileId", required: true)]
        public Input<string> PartnerProfileId { get; set; } = null!;

        /// <summary>
        /// The unique server identifier for the server instance. This is the specific server the agreement uses.
        /// </summary>
        [Input("serverId", required: true)]
        public Input<string> ServerId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public AgreementArgs()
        {
        }
        public static new AgreementArgs Empty => new AgreementArgs();
    }

    public sealed class AgreementState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
        /// </summary>
        [Input("accessRole")]
        public Input<string>? AccessRole { get; set; }

        /// <summary>
        /// The unique identifier for the AS2 agreement.
        /// </summary>
        [Input("agreementId")]
        public Input<string>? AgreementId { get; set; }

        /// <summary>
        /// The ARN of the agreement.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The landing directory for the files transferred by using the AS2 protocol.
        /// </summary>
        [Input("baseDirectory")]
        public Input<string>? BaseDirectory { get; set; }

        /// <summary>
        /// The Optional description of the transdfer.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The unique identifier for the AS2 local profile.
        /// </summary>
        [Input("localProfileId")]
        public Input<string>? LocalProfileId { get; set; }

        /// <summary>
        /// The unique identifier for the AS2 partner profile.
        /// </summary>
        [Input("partnerProfileId")]
        public Input<string>? PartnerProfileId { get; set; }

        /// <summary>
        /// The unique server identifier for the server instance. This is the specific server the agreement uses.
        /// </summary>
        [Input("serverId")]
        public Input<string>? ServerId { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public AgreementState()
        {
        }
        public static new AgreementState Empty => new AgreementState();
    }
}
