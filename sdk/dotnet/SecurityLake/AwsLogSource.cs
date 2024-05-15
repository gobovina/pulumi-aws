// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SecurityLake
{
    /// <summary>
    /// Resource for managing an Amazon Security Lake AWS Log Source.
    /// 
    /// &gt; **NOTE:** A single `aws.securitylake.AwsLogSource` should be used to configure a log source across all regions and accounts.
    /// 
    /// &gt; **NOTE:** The underlying `aws.securitylake.DataLake` must be configured before creating the `aws.securitylake.AwsLogSource`. Use a `depends_on` statement.
    /// 
    /// ## Example Usage
    /// 
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
    ///     var example = new Aws.SecurityLake.AwsLogSource("example", new()
    ///     {
    ///         Source = new Aws.SecurityLake.Inputs.AwsLogSourceSourceArgs
    ///         {
    ///             Accounts = new[]
    ///             {
    ///                 "123456789012",
    ///             },
    ///             Regions = new[]
    ///             {
    ///                 "eu-west-1",
    ///             },
    ///             SourceName = "ROUTE53",
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             exampleAwsSecuritylakeDataLake,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import AWS log sources using the source name. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:securitylake/awsLogSource:AwsLogSource example ROUTE53
    /// ```
    /// </summary>
    [AwsResourceType("aws:securitylake/awsLogSource:AwsLogSource")]
    public partial class AwsLogSource : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specify the natively-supported AWS service to add as a source in Security Lake.
        /// </summary>
        [Output("source")]
        public Output<Outputs.AwsLogSourceSource?> Source { get; private set; } = null!;


        /// <summary>
        /// Create a AwsLogSource resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AwsLogSource(string name, AwsLogSourceArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:securitylake/awsLogSource:AwsLogSource", name, args ?? new AwsLogSourceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AwsLogSource(string name, Input<string> id, AwsLogSourceState? state = null, CustomResourceOptions? options = null)
            : base("aws:securitylake/awsLogSource:AwsLogSource", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AwsLogSource resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AwsLogSource Get(string name, Input<string> id, AwsLogSourceState? state = null, CustomResourceOptions? options = null)
        {
            return new AwsLogSource(name, id, state, options);
        }
    }

    public sealed class AwsLogSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specify the natively-supported AWS service to add as a source in Security Lake.
        /// </summary>
        [Input("source")]
        public Input<Inputs.AwsLogSourceSourceArgs>? Source { get; set; }

        public AwsLogSourceArgs()
        {
        }
        public static new AwsLogSourceArgs Empty => new AwsLogSourceArgs();
    }

    public sealed class AwsLogSourceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specify the natively-supported AWS service to add as a source in Security Lake.
        /// </summary>
        [Input("source")]
        public Input<Inputs.AwsLogSourceSourceGetArgs>? Source { get; set; }

        public AwsLogSourceState()
        {
        }
        public static new AwsLogSourceState Empty => new AwsLogSourceState();
    }
}
