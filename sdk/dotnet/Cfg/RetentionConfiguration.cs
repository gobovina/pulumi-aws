// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Cfg
{
    /// <summary>
    /// Provides a resource to manage the AWS Config retention configuration.
    /// The retention configuration defines the number of days that AWS Config stores historical information.
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
    ///     var example = new Aws.Cfg.RetentionConfiguration("example", new()
    ///     {
    ///         RetentionPeriodInDays = 90,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import the AWS Config retention configuration using the `name`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:cfg/retentionConfiguration:RetentionConfiguration example default
    /// ```
    /// </summary>
    [AwsResourceType("aws:cfg/retentionConfiguration:RetentionConfiguration")]
    public partial class RetentionConfiguration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the retention configuration object. The object is always named **default**.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The number of days AWS Config stores historical information.
        /// </summary>
        [Output("retentionPeriodInDays")]
        public Output<int> RetentionPeriodInDays { get; private set; } = null!;


        /// <summary>
        /// Create a RetentionConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RetentionConfiguration(string name, RetentionConfigurationArgs args, CustomResourceOptions? options = null)
            : base("aws:cfg/retentionConfiguration:RetentionConfiguration", name, args ?? new RetentionConfigurationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RetentionConfiguration(string name, Input<string> id, RetentionConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("aws:cfg/retentionConfiguration:RetentionConfiguration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RetentionConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RetentionConfiguration Get(string name, Input<string> id, RetentionConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new RetentionConfiguration(name, id, state, options);
        }
    }

    public sealed class RetentionConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of days AWS Config stores historical information.
        /// </summary>
        [Input("retentionPeriodInDays", required: true)]
        public Input<int> RetentionPeriodInDays { get; set; } = null!;

        public RetentionConfigurationArgs()
        {
        }
        public static new RetentionConfigurationArgs Empty => new RetentionConfigurationArgs();
    }

    public sealed class RetentionConfigurationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the retention configuration object. The object is always named **default**.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The number of days AWS Config stores historical information.
        /// </summary>
        [Input("retentionPeriodInDays")]
        public Input<int>? RetentionPeriodInDays { get; set; }

        public RetentionConfigurationState()
        {
        }
        public static new RetentionConfigurationState Empty => new RetentionConfigurationState();
    }
}
