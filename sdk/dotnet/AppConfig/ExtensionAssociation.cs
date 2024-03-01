// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppConfig
{
    /// <summary>
    /// Associates an AppConfig Extension with a Resource.
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
    ///     var testTopic = new Aws.Sns.Topic("test", new()
    ///     {
    ///         Name = "test",
    ///     });
    /// 
    ///     var test = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Actions = new[]
    ///                 {
    ///                     "sts:AssumeRole",
    ///                 },
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "Service",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "appconfig.amazonaws.com",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var testRole = new Aws.Iam.Role("test", new()
    ///     {
    ///         Name = "test",
    ///         AssumeRolePolicy = test.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var testExtension = new Aws.AppConfig.Extension("test", new()
    ///     {
    ///         Name = "test",
    ///         Description = "test description",
    ///         ActionPoints = new[]
    ///         {
    ///             new Aws.AppConfig.Inputs.ExtensionActionPointArgs
    ///             {
    ///                 Point = "ON_DEPLOYMENT_COMPLETE",
    ///                 Actions = new[]
    ///                 {
    ///                     new Aws.AppConfig.Inputs.ExtensionActionPointActionArgs
    ///                     {
    ///                         Name = "test",
    ///                         RoleArn = testRole.Arn,
    ///                         Uri = testTopic.Arn,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Type", "AppConfig Extension" },
    ///         },
    ///     });
    /// 
    ///     var testApplication = new Aws.AppConfig.Application("test", new()
    ///     {
    ///         Name = "test",
    ///     });
    /// 
    ///     var testExtensionAssociation = new Aws.AppConfig.ExtensionAssociation("test", new()
    ///     {
    ///         ExtensionArn = testExtension.Arn,
    ///         ResourceArn = testApplication.Arn,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import AppConfig Extension Associations using their extension association ID. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:appconfig/extensionAssociation:ExtensionAssociation example 71rxuzt
    /// ```
    /// </summary>
    [AwsResourceType("aws:appconfig/extensionAssociation:ExtensionAssociation")]
    public partial class ExtensionAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the AppConfig Extension Association.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The ARN of the extension defined in the association.
        /// </summary>
        [Output("extensionArn")]
        public Output<string> ExtensionArn { get; private set; } = null!;

        /// <summary>
        /// The version number for the extension defined in the association.
        /// </summary>
        [Output("extensionVersion")]
        public Output<int> ExtensionVersion { get; private set; } = null!;

        /// <summary>
        /// The parameter names and values defined for the association.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableDictionary<string, string>?> Parameters { get; private set; } = null!;

        /// <summary>
        /// The ARN of the application, configuration profile, or environment to associate with the extension.
        /// </summary>
        [Output("resourceArn")]
        public Output<string> ResourceArn { get; private set; } = null!;


        /// <summary>
        /// Create a ExtensionAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ExtensionAssociation(string name, ExtensionAssociationArgs args, CustomResourceOptions? options = null)
            : base("aws:appconfig/extensionAssociation:ExtensionAssociation", name, args ?? new ExtensionAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ExtensionAssociation(string name, Input<string> id, ExtensionAssociationState? state = null, CustomResourceOptions? options = null)
            : base("aws:appconfig/extensionAssociation:ExtensionAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ExtensionAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ExtensionAssociation Get(string name, Input<string> id, ExtensionAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new ExtensionAssociation(name, id, state, options);
        }
    }

    public sealed class ExtensionAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the extension defined in the association.
        /// </summary>
        [Input("extensionArn", required: true)]
        public Input<string> ExtensionArn { get; set; } = null!;

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// The parameter names and values defined for the association.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// The ARN of the application, configuration profile, or environment to associate with the extension.
        /// </summary>
        [Input("resourceArn", required: true)]
        public Input<string> ResourceArn { get; set; } = null!;

        public ExtensionAssociationArgs()
        {
        }
        public static new ExtensionAssociationArgs Empty => new ExtensionAssociationArgs();
    }

    public sealed class ExtensionAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the AppConfig Extension Association.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The ARN of the extension defined in the association.
        /// </summary>
        [Input("extensionArn")]
        public Input<string>? ExtensionArn { get; set; }

        /// <summary>
        /// The version number for the extension defined in the association.
        /// </summary>
        [Input("extensionVersion")]
        public Input<int>? ExtensionVersion { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// The parameter names and values defined for the association.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// The ARN of the application, configuration profile, or environment to associate with the extension.
        /// </summary>
        [Input("resourceArn")]
        public Input<string>? ResourceArn { get; set; }

        public ExtensionAssociationState()
        {
        }
        public static new ExtensionAssociationState Empty => new ExtensionAssociationState();
    }
}
