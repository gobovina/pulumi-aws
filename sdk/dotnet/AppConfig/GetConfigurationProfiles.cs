// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppConfig
{
    public static class GetConfigurationProfiles
    {
        /// <summary>
        /// Provides access to all Configuration Properties for an AppConfig Application. This will allow you to pass Configuration
        /// Profile IDs to another resource.
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
        ///     var example = Aws.AppConfig.GetConfigurationProfiles.Invoke(new()
        ///     {
        ///         ApplicationId = "a1d3rpe",
        ///     });
        /// 
        ///     var exampleGetConfigurationProfile = ;
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetConfigurationProfilesResult> InvokeAsync(GetConfigurationProfilesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetConfigurationProfilesResult>("aws:appconfig/getConfigurationProfiles:getConfigurationProfiles", args ?? new GetConfigurationProfilesArgs(), options.WithDefaults());

        /// <summary>
        /// Provides access to all Configuration Properties for an AppConfig Application. This will allow you to pass Configuration
        /// Profile IDs to another resource.
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
        ///     var example = Aws.AppConfig.GetConfigurationProfiles.Invoke(new()
        ///     {
        ///         ApplicationId = "a1d3rpe",
        ///     });
        /// 
        ///     var exampleGetConfigurationProfile = ;
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetConfigurationProfilesResult> Invoke(GetConfigurationProfilesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetConfigurationProfilesResult>("aws:appconfig/getConfigurationProfiles:getConfigurationProfiles", args ?? new GetConfigurationProfilesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetConfigurationProfilesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the AppConfig Application.
        /// </summary>
        [Input("applicationId", required: true)]
        public string ApplicationId { get; set; } = null!;

        public GetConfigurationProfilesArgs()
        {
        }
        public static new GetConfigurationProfilesArgs Empty => new GetConfigurationProfilesArgs();
    }

    public sealed class GetConfigurationProfilesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the AppConfig Application.
        /// </summary>
        [Input("applicationId", required: true)]
        public Input<string> ApplicationId { get; set; } = null!;

        public GetConfigurationProfilesInvokeArgs()
        {
        }
        public static new GetConfigurationProfilesInvokeArgs Empty => new GetConfigurationProfilesInvokeArgs();
    }


    [OutputType]
    public sealed class GetConfigurationProfilesResult
    {
        public readonly string ApplicationId;
        /// <summary>
        /// Set of Configuration Profile IDs associated with the AppConfig Application.
        /// </summary>
        public readonly ImmutableArray<string> ConfigurationProfileIds;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetConfigurationProfilesResult(
            string applicationId,

            ImmutableArray<string> configurationProfileIds,

            string id)
        {
            ApplicationId = applicationId;
            ConfigurationProfileIds = configurationProfileIds;
            Id = id;
        }
    }
}
