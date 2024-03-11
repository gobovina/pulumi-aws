// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3Control
{
    /// <summary>
    /// Provides a resource to manage an S3 Access Grants location.
    /// A location is an S3 resource (bucket or prefix) in a permission grant that the grantee can access.
    /// The S3 data must be in the same Region as your S3 Access Grants instance.
    /// When you register a location, you must include the IAM role that has permission to manage the S3 location that you are registering.
    /// 
    /// ## Example Usage
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
    ///     var example = new Aws.S3Control.AccessGrantsInstance("example");
    /// 
    ///     var exampleAccessGrantsLocation = new Aws.S3Control.AccessGrantsLocation("example", new()
    ///     {
    ///         IamRoleArn = exampleAwsIamRole.Arn,
    ///         LocationScope = "s3://",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import S3 Access Grants locations using the `account_id` and `access_grants_location_id`, separated by a comma (`,`). For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:s3control/accessGrantsLocation:AccessGrantsLocation example 123456789012,default
    /// ```
    /// </summary>
    [AwsResourceType("aws:s3control/accessGrantsLocation:AccessGrantsLocation")]
    public partial class AccessGrantsLocation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the S3 Access Grants location.
        /// </summary>
        [Output("accessGrantsLocationArn")]
        public Output<string> AccessGrantsLocationArn { get; private set; } = null!;

        /// <summary>
        /// Unique ID of the S3 Access Grants location.
        /// </summary>
        [Output("accessGrantsLocationId")]
        public Output<string> AccessGrantsLocationId { get; private set; } = null!;

        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The ARN of the IAM role that S3 Access Grants should use when fulfilling runtime access
        /// requests to the location.
        /// </summary>
        [Output("iamRoleArn")]
        public Output<string> IamRoleArn { get; private set; } = null!;

        /// <summary>
        /// The default S3 URI `s3://` or the URI to a custom location, a specific bucket or prefix.
        /// </summary>
        [Output("locationScope")]
        public Output<string> LocationScope { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a AccessGrantsLocation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessGrantsLocation(string name, AccessGrantsLocationArgs args, CustomResourceOptions? options = null)
            : base("aws:s3control/accessGrantsLocation:AccessGrantsLocation", name, args ?? new AccessGrantsLocationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessGrantsLocation(string name, Input<string> id, AccessGrantsLocationState? state = null, CustomResourceOptions? options = null)
            : base("aws:s3control/accessGrantsLocation:AccessGrantsLocation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessGrantsLocation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessGrantsLocation Get(string name, Input<string> id, AccessGrantsLocationState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessGrantsLocation(name, id, state, options);
        }
    }

    public sealed class AccessGrantsLocationArgs : global::Pulumi.ResourceArgs
    {
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The ARN of the IAM role that S3 Access Grants should use when fulfilling runtime access
        /// requests to the location.
        /// </summary>
        [Input("iamRoleArn", required: true)]
        public Input<string> IamRoleArn { get; set; } = null!;

        /// <summary>
        /// The default S3 URI `s3://` or the URI to a custom location, a specific bucket or prefix.
        /// </summary>
        [Input("locationScope", required: true)]
        public Input<string> LocationScope { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public AccessGrantsLocationArgs()
        {
        }
        public static new AccessGrantsLocationArgs Empty => new AccessGrantsLocationArgs();
    }

    public sealed class AccessGrantsLocationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the S3 Access Grants location.
        /// </summary>
        [Input("accessGrantsLocationArn")]
        public Input<string>? AccessGrantsLocationArn { get; set; }

        /// <summary>
        /// Unique ID of the S3 Access Grants location.
        /// </summary>
        [Input("accessGrantsLocationId")]
        public Input<string>? AccessGrantsLocationId { get; set; }

        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The ARN of the IAM role that S3 Access Grants should use when fulfilling runtime access
        /// requests to the location.
        /// </summary>
        [Input("iamRoleArn")]
        public Input<string>? IamRoleArn { get; set; }

        /// <summary>
        /// The default S3 URI `s3://` or the URI to a custom location, a specific bucket or prefix.
        /// </summary>
        [Input("locationScope")]
        public Input<string>? LocationScope { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public AccessGrantsLocationState()
        {
        }
        public static new AccessGrantsLocationState Empty => new AccessGrantsLocationState();
    }
}
