// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.VerifiedAccess
{
    /// <summary>
    /// Resource for managing a Verified Access Group.
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
    ///     var example = new Aws.VerifiedAccess.Group("example", new()
    ///     {
    ///         VerifiedaccessInstanceId = exampleAwsVerifiedaccessInstance.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [AwsResourceType("aws:verifiedaccess/group:Group")]
    public partial class Group : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Timestamp when the access group was created.
        /// </summary>
        [Output("creationTime")]
        public Output<string> CreationTime { get; private set; } = null!;

        /// <summary>
        /// Timestamp when the access group was deleted.
        /// </summary>
        [Output("deletionTime")]
        public Output<string> DeletionTime { get; private set; } = null!;

        /// <summary>
        /// Description of the verified access group.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Timestamp when the access group was last updated.
        /// </summary>
        [Output("lastUpdatedTime")]
        public Output<string> LastUpdatedTime { get; private set; } = null!;

        /// <summary>
        /// AWS account number owning this resource.
        /// </summary>
        [Output("owner")]
        public Output<string> Owner { get; private set; } = null!;

        /// <summary>
        /// The policy document that is associated with this resource.
        /// </summary>
        [Output("policyDocument")]
        public Output<string?> PolicyDocument { get; private set; } = null!;

        /// <summary>
        /// Configuration block to use KMS keys for server-side encryption.
        /// </summary>
        [Output("sseConfiguration")]
        public Output<Outputs.GroupSseConfiguration> SseConfiguration { get; private set; } = null!;

        /// <summary>
        /// Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// ARN of this verified acess group.
        /// </summary>
        [Output("verifiedaccessGroupArn")]
        public Output<string> VerifiedaccessGroupArn { get; private set; } = null!;

        /// <summary>
        /// ID of this verified access group.
        /// </summary>
        [Output("verifiedaccessGroupId")]
        public Output<string> VerifiedaccessGroupId { get; private set; } = null!;

        /// <summary>
        /// The id of the verified access instance this group is associated with.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("verifiedaccessInstanceId")]
        public Output<string> VerifiedaccessInstanceId { get; private set; } = null!;


        /// <summary>
        /// Create a Group resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Group(string name, GroupArgs args, CustomResourceOptions? options = null)
            : base("aws:verifiedaccess/group:Group", name, args ?? new GroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Group(string name, Input<string> id, GroupState? state = null, CustomResourceOptions? options = null)
            : base("aws:verifiedaccess/group:Group", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Group resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Group Get(string name, Input<string> id, GroupState? state = null, CustomResourceOptions? options = null)
        {
            return new Group(name, id, state, options);
        }
    }

    public sealed class GroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the verified access group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The policy document that is associated with this resource.
        /// </summary>
        [Input("policyDocument")]
        public Input<string>? PolicyDocument { get; set; }

        /// <summary>
        /// Configuration block to use KMS keys for server-side encryption.
        /// </summary>
        [Input("sseConfiguration")]
        public Input<Inputs.GroupSseConfigurationArgs>? SseConfiguration { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The id of the verified access instance this group is associated with.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("verifiedaccessInstanceId", required: true)]
        public Input<string> VerifiedaccessInstanceId { get; set; } = null!;

        public GroupArgs()
        {
        }
        public static new GroupArgs Empty => new GroupArgs();
    }

    public sealed class GroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Timestamp when the access group was created.
        /// </summary>
        [Input("creationTime")]
        public Input<string>? CreationTime { get; set; }

        /// <summary>
        /// Timestamp when the access group was deleted.
        /// </summary>
        [Input("deletionTime")]
        public Input<string>? DeletionTime { get; set; }

        /// <summary>
        /// Description of the verified access group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Timestamp when the access group was last updated.
        /// </summary>
        [Input("lastUpdatedTime")]
        public Input<string>? LastUpdatedTime { get; set; }

        /// <summary>
        /// AWS account number owning this resource.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        /// <summary>
        /// The policy document that is associated with this resource.
        /// </summary>
        [Input("policyDocument")]
        public Input<string>? PolicyDocument { get; set; }

        /// <summary>
        /// Configuration block to use KMS keys for server-side encryption.
        /// </summary>
        [Input("sseConfiguration")]
        public Input<Inputs.GroupSseConfigurationGetArgs>? SseConfiguration { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        /// <summary>
        /// ARN of this verified acess group.
        /// </summary>
        [Input("verifiedaccessGroupArn")]
        public Input<string>? VerifiedaccessGroupArn { get; set; }

        /// <summary>
        /// ID of this verified access group.
        /// </summary>
        [Input("verifiedaccessGroupId")]
        public Input<string>? VerifiedaccessGroupId { get; set; }

        /// <summary>
        /// The id of the verified access instance this group is associated with.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("verifiedaccessInstanceId")]
        public Input<string>? VerifiedaccessInstanceId { get; set; }

        public GroupState()
        {
        }
        public static new GroupState Empty => new GroupState();
    }
}
