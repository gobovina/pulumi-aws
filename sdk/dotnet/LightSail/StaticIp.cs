// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.LightSail
{
    /// <summary>
    /// Allocates a static IP address.
    /// 
    /// &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see ["Regions and Availability Zones in Amazon Lightsail"](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details
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
    ///     var test = new Aws.LightSail.StaticIp("test", new()
    ///     {
    ///         Name = "example",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [AwsResourceType("aws:lightsail/staticIp:StaticIp")]
    public partial class StaticIp : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the Lightsail static IP
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The allocated static IP address
        /// </summary>
        [Output("ipAddress")]
        public Output<string> IpAddress { get; private set; } = null!;

        /// <summary>
        /// The name for the allocated static IP
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The support code.
        /// </summary>
        [Output("supportCode")]
        public Output<string> SupportCode { get; private set; } = null!;


        /// <summary>
        /// Create a StaticIp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StaticIp(string name, StaticIpArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:lightsail/staticIp:StaticIp", name, args ?? new StaticIpArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StaticIp(string name, Input<string> id, StaticIpState? state = null, CustomResourceOptions? options = null)
            : base("aws:lightsail/staticIp:StaticIp", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StaticIp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StaticIp Get(string name, Input<string> id, StaticIpState? state = null, CustomResourceOptions? options = null)
        {
            return new StaticIp(name, id, state, options);
        }
    }

    public sealed class StaticIpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name for the allocated static IP
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public StaticIpArgs()
        {
        }
        public static new StaticIpArgs Empty => new StaticIpArgs();
    }

    public sealed class StaticIpState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the Lightsail static IP
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The allocated static IP address
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// The name for the allocated static IP
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The support code.
        /// </summary>
        [Input("supportCode")]
        public Input<string>? SupportCode { get; set; }

        public StaticIpState()
        {
        }
        public static new StaticIpState Empty => new StaticIpState();
    }
}
