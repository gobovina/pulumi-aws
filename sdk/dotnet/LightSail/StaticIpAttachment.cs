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
    /// Provides a static IP address attachment - relationship between a Lightsail static IP &amp; Lightsail instance.
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
    ///     var testStaticIp = new Aws.LightSail.StaticIp("test", new()
    ///     {
    ///         Name = "example",
    ///     });
    /// 
    ///     var testInstance = new Aws.LightSail.Instance("test", new()
    ///     {
    ///         Name = "example",
    ///         AvailabilityZone = "us-east-1b",
    ///         BlueprintId = "string",
    ///         BundleId = "string",
    ///         KeyPairName = "some_key_name",
    ///     });
    /// 
    ///     var test = new Aws.LightSail.StaticIpAttachment("test", new()
    ///     {
    ///         StaticIpName = testStaticIp.Id,
    ///         InstanceName = testInstance.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [AwsResourceType("aws:lightsail/staticIpAttachment:StaticIpAttachment")]
    public partial class StaticIpAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the Lightsail instance to attach the IP to
        /// </summary>
        [Output("instanceName")]
        public Output<string> InstanceName { get; private set; } = null!;

        /// <summary>
        /// The allocated static IP address
        /// </summary>
        [Output("ipAddress")]
        public Output<string> IpAddress { get; private set; } = null!;

        /// <summary>
        /// The name of the allocated static IP
        /// </summary>
        [Output("staticIpName")]
        public Output<string> StaticIpName { get; private set; } = null!;


        /// <summary>
        /// Create a StaticIpAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StaticIpAttachment(string name, StaticIpAttachmentArgs args, CustomResourceOptions? options = null)
            : base("aws:lightsail/staticIpAttachment:StaticIpAttachment", name, args ?? new StaticIpAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StaticIpAttachment(string name, Input<string> id, StaticIpAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("aws:lightsail/staticIpAttachment:StaticIpAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StaticIpAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StaticIpAttachment Get(string name, Input<string> id, StaticIpAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new StaticIpAttachment(name, id, state, options);
        }
    }

    public sealed class StaticIpAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Lightsail instance to attach the IP to
        /// </summary>
        [Input("instanceName", required: true)]
        public Input<string> InstanceName { get; set; } = null!;

        /// <summary>
        /// The name of the allocated static IP
        /// </summary>
        [Input("staticIpName", required: true)]
        public Input<string> StaticIpName { get; set; } = null!;

        public StaticIpAttachmentArgs()
        {
        }
        public static new StaticIpAttachmentArgs Empty => new StaticIpAttachmentArgs();
    }

    public sealed class StaticIpAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Lightsail instance to attach the IP to
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// The allocated static IP address
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// The name of the allocated static IP
        /// </summary>
        [Input("staticIpName")]
        public Input<string>? StaticIpName { get; set; }

        public StaticIpAttachmentState()
        {
        }
        public static new StaticIpAttachmentState Empty => new StaticIpAttachmentState();
    }
}
