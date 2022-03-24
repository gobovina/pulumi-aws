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
    /// Provides an AppConfig Hosted Configuration Version resource.
    /// 
    /// ## Example Usage
    /// ### Freeform
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Aws.AppConfig.HostedConfigurationVersion("example", new Aws.AppConfig.HostedConfigurationVersionArgs
    ///         {
    ///             ApplicationId = aws_appconfig_application.Example.Id,
    ///             ConfigurationProfileId = aws_appconfig_configuration_profile.Example.Configuration_profile_id,
    ///             Description = "Example Freeform Hosted Configuration Version",
    ///             ContentType = "application/json",
    ///             Content = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 { "foo", "bar" },
    ///                 { "fruit", new[]
    ///                     {
    ///                         "apple",
    ///                         "pear",
    ///                         "orange",
    ///                     }
    ///                  },
    ///                 { "isThingEnabled", true },
    ///             }),
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Feature Flags
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Aws.AppConfig.HostedConfigurationVersion("example", new Aws.AppConfig.HostedConfigurationVersionArgs
    ///         {
    ///             ApplicationId = aws_appconfig_application.Example.Id,
    ///             ConfigurationProfileId = aws_appconfig_configuration_profile.Example.Configuration_profile_id,
    ///             Description = "Example Freeform Hosted Configuration Version",
    ///             ContentType = "application/json",
    ///             Content = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 { "flags", new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     { "foo", new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         { "name", "foo" },
    ///                         { "_deprecation", new Dictionary&lt;string, object?&gt;
    ///                         {
    ///                             { "status", "planned" },
    ///                         } },
    ///                     } },
    ///                     { "bar", new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         { "name", "bar" },
    ///                     } },
    ///                 } },
    ///                 { "values", new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     { "foo", new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         { "enabled", "true" },
    ///                     } },
    ///                     { "bar", new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         { "enabled", "true" },
    ///                     } },
    ///                 } },
    ///                 { "version", "1" },
    ///             }),
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// AppConfig Hosted Configuration Versions can be imported by using the application ID, configuration profile ID, and version number separated by a slash (`/`), e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:appconfig/hostedConfigurationVersion:HostedConfigurationVersion example 71abcde/11xxxxx/2
    /// ```
    /// </summary>
    [AwsResourceType("aws:appconfig/hostedConfigurationVersion:HostedConfigurationVersion")]
    public partial class HostedConfigurationVersion : Pulumi.CustomResource
    {
        /// <summary>
        /// The application ID.
        /// </summary>
        [Output("applicationId")]
        public Output<string> ApplicationId { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the AppConfig  hosted configuration version.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The configuration profile ID.
        /// </summary>
        [Output("configurationProfileId")]
        public Output<string> ConfigurationProfileId { get; private set; } = null!;

        /// <summary>
        /// The content of the configuration or the configuration data.
        /// </summary>
        [Output("content")]
        public Output<string> Content { get; private set; } = null!;

        /// <summary>
        /// A standard MIME type describing the format of the configuration content. For more information, see [Content-Type](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17).
        /// </summary>
        [Output("contentType")]
        public Output<string> ContentType { get; private set; } = null!;

        /// <summary>
        /// A description of the configuration.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The version number of the hosted configuration.
        /// </summary>
        [Output("versionNumber")]
        public Output<int> VersionNumber { get; private set; } = null!;


        /// <summary>
        /// Create a HostedConfigurationVersion resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HostedConfigurationVersion(string name, HostedConfigurationVersionArgs args, CustomResourceOptions? options = null)
            : base("aws:appconfig/hostedConfigurationVersion:HostedConfigurationVersion", name, args ?? new HostedConfigurationVersionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HostedConfigurationVersion(string name, Input<string> id, HostedConfigurationVersionState? state = null, CustomResourceOptions? options = null)
            : base("aws:appconfig/hostedConfigurationVersion:HostedConfigurationVersion", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing HostedConfigurationVersion resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HostedConfigurationVersion Get(string name, Input<string> id, HostedConfigurationVersionState? state = null, CustomResourceOptions? options = null)
        {
            return new HostedConfigurationVersion(name, id, state, options);
        }
    }

    public sealed class HostedConfigurationVersionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The application ID.
        /// </summary>
        [Input("applicationId", required: true)]
        public Input<string> ApplicationId { get; set; } = null!;

        /// <summary>
        /// The configuration profile ID.
        /// </summary>
        [Input("configurationProfileId", required: true)]
        public Input<string> ConfigurationProfileId { get; set; } = null!;

        /// <summary>
        /// The content of the configuration or the configuration data.
        /// </summary>
        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        /// <summary>
        /// A standard MIME type describing the format of the configuration content. For more information, see [Content-Type](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17).
        /// </summary>
        [Input("contentType", required: true)]
        public Input<string> ContentType { get; set; } = null!;

        /// <summary>
        /// A description of the configuration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        public HostedConfigurationVersionArgs()
        {
        }
    }

    public sealed class HostedConfigurationVersionState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The application ID.
        /// </summary>
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the AppConfig  hosted configuration version.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The configuration profile ID.
        /// </summary>
        [Input("configurationProfileId")]
        public Input<string>? ConfigurationProfileId { get; set; }

        /// <summary>
        /// The content of the configuration or the configuration data.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        /// <summary>
        /// A standard MIME type describing the format of the configuration content. For more information, see [Content-Type](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17).
        /// </summary>
        [Input("contentType")]
        public Input<string>? ContentType { get; set; }

        /// <summary>
        /// A description of the configuration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The version number of the hosted configuration.
        /// </summary>
        [Input("versionNumber")]
        public Input<int>? VersionNumber { get; set; }

        public HostedConfigurationVersionState()
        {
        }
    }
}
