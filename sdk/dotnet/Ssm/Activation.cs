// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ssm
{
    /// <summary>
    /// Registers an on-premises server or virtual machine with Amazon EC2 so that it can be managed using Run Command.
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
    ///     var assumeRole = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "Service",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "ssm.amazonaws.com",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "sts:AssumeRole",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var testRole = new Aws.Iam.Role("testRole", new()
    ///     {
    ///         AssumeRolePolicy = assumeRole.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var testAttach = new Aws.Iam.RolePolicyAttachment("testAttach", new()
    ///     {
    ///         Role = testRole.Name,
    ///         PolicyArn = "arn:aws:iam::aws:policy/AmazonSSMManagedInstanceCore",
    ///     });
    /// 
    ///     var foo = new Aws.Ssm.Activation("foo", new()
    ///     {
    ///         Description = "Test",
    ///         IamRole = testRole.Id,
    ///         RegistrationLimit = 5,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             testAttach,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import AWS SSM Activation using the `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ssm/activation:Activation example e488f2f6-e686-4afb-8a04-ef6dfEXAMPLE
    /// ```
    ///  -&gt; __Note:__ The `activation_code` attribute cannot be imported.
    /// </summary>
    [AwsResourceType("aws:ssm/activation:Activation")]
    public partial class Activation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The code the system generates when it processes the activation.
        /// </summary>
        [Output("activationCode")]
        public Output<string> ActivationCode { get; private set; } = null!;

        /// <summary>
        /// The description of the resource that you want to register.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// UTC timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time. This provider will only perform drift detection of its value when present in a configuration.
        /// </summary>
        [Output("expirationDate")]
        public Output<string> ExpirationDate { get; private set; } = null!;

        /// <summary>
        /// If the current activation has expired.
        /// </summary>
        [Output("expired")]
        public Output<bool> Expired { get; private set; } = null!;

        /// <summary>
        /// The IAM Role to attach to the managed instance.
        /// </summary>
        [Output("iamRole")]
        public Output<string> IamRole { get; private set; } = null!;

        /// <summary>
        /// The default name of the registered managed instance.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The number of managed instances that are currently registered using this activation.
        /// </summary>
        [Output("registrationCount")]
        public Output<int> RegistrationCount { get; private set; } = null!;

        /// <summary>
        /// The maximum number of managed instances you want to register. The default value is 1 instance.
        /// </summary>
        [Output("registrationLimit")]
        public Output<int?> RegistrationLimit { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a Activation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Activation(string name, ActivationArgs args, CustomResourceOptions? options = null)
            : base("aws:ssm/activation:Activation", name, args ?? new ActivationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Activation(string name, Input<string> id, ActivationState? state = null, CustomResourceOptions? options = null)
            : base("aws:ssm/activation:Activation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Activation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Activation Get(string name, Input<string> id, ActivationState? state = null, CustomResourceOptions? options = null)
        {
            return new Activation(name, id, state, options);
        }
    }

    public sealed class ActivationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the resource that you want to register.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// UTC timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time. This provider will only perform drift detection of its value when present in a configuration.
        /// </summary>
        [Input("expirationDate")]
        public Input<string>? ExpirationDate { get; set; }

        /// <summary>
        /// The IAM Role to attach to the managed instance.
        /// </summary>
        [Input("iamRole", required: true)]
        public Input<string> IamRole { get; set; } = null!;

        /// <summary>
        /// The default name of the registered managed instance.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The maximum number of managed instances you want to register. The default value is 1 instance.
        /// </summary>
        [Input("registrationLimit")]
        public Input<int>? RegistrationLimit { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ActivationArgs()
        {
        }
        public static new ActivationArgs Empty => new ActivationArgs();
    }

    public sealed class ActivationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The code the system generates when it processes the activation.
        /// </summary>
        [Input("activationCode")]
        public Input<string>? ActivationCode { get; set; }

        /// <summary>
        /// The description of the resource that you want to register.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// UTC timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time. This provider will only perform drift detection of its value when present in a configuration.
        /// </summary>
        [Input("expirationDate")]
        public Input<string>? ExpirationDate { get; set; }

        /// <summary>
        /// If the current activation has expired.
        /// </summary>
        [Input("expired")]
        public Input<bool>? Expired { get; set; }

        /// <summary>
        /// The IAM Role to attach to the managed instance.
        /// </summary>
        [Input("iamRole")]
        public Input<string>? IamRole { get; set; }

        /// <summary>
        /// The default name of the registered managed instance.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The number of managed instances that are currently registered using this activation.
        /// </summary>
        [Input("registrationCount")]
        public Input<int>? RegistrationCount { get; set; }

        /// <summary>
        /// The maximum number of managed instances you want to register. The default value is 1 instance.
        /// </summary>
        [Input("registrationLimit")]
        public Input<int>? RegistrationLimit { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public ActivationState()
        {
        }
        public static new ActivationState Empty => new ActivationState();
    }
}
