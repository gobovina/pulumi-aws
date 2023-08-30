// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Route53
{
    /// <summary>
    /// Manages a Route53 Traffic Policy.
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
    ///     var example = new Aws.Route53.TrafficPolicy("example", new()
    ///     {
    ///         Comment = "example comment",
    ///         Document = @"{
    ///   ""AWSPolicyFormatVersion"": ""2015-10-01"",
    ///   ""RecordType"": ""A"",
    ///   ""Endpoints"": {
    ///     ""endpoint-start-NkPh"": {
    ///       ""Type"": ""value"",
    ///       ""Value"": ""10.0.0.2""
    ///     }
    ///   },
    ///   ""StartEndpoint"": ""endpoint-start-NkPh""
    /// }
    /// 
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Route53 Traffic Policy using the `id` and `version`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:route53/trafficPolicy:TrafficPolicy example 01a52019-d16f-422a-ae72-c306d2b6df7e/1
    /// ```
    /// </summary>
    [AwsResourceType("aws:route53/trafficPolicy:TrafficPolicy")]
    public partial class TrafficPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Comment for the traffic policy.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Policy document. This is a JSON formatted string. For more information about building Route53 traffic policy documents, see the [AWS Route53 Traffic Policy document format](https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html)
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("document")]
        public Output<string> Document { get; private set; } = null!;

        /// <summary>
        /// Name of the traffic policy.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Version number of the traffic policy. This value is automatically incremented by AWS after each update of this resource.
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a TrafficPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TrafficPolicy(string name, TrafficPolicyArgs args, CustomResourceOptions? options = null)
            : base("aws:route53/trafficPolicy:TrafficPolicy", name, args ?? new TrafficPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TrafficPolicy(string name, Input<string> id, TrafficPolicyState? state = null, CustomResourceOptions? options = null)
            : base("aws:route53/trafficPolicy:TrafficPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TrafficPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TrafficPolicy Get(string name, Input<string> id, TrafficPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new TrafficPolicy(name, id, state, options);
        }
    }

    public sealed class TrafficPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Comment for the traffic policy.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Policy document. This is a JSON formatted string. For more information about building Route53 traffic policy documents, see the [AWS Route53 Traffic Policy document format](https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html)
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("document", required: true)]
        public Input<string> Document { get; set; } = null!;

        /// <summary>
        /// Name of the traffic policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public TrafficPolicyArgs()
        {
        }
        public static new TrafficPolicyArgs Empty => new TrafficPolicyArgs();
    }

    public sealed class TrafficPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Comment for the traffic policy.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Policy document. This is a JSON formatted string. For more information about building Route53 traffic policy documents, see the [AWS Route53 Traffic Policy document format](https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html)
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("document")]
        public Input<string>? Document { get; set; }

        /// <summary>
        /// Name of the traffic policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Version number of the traffic policy. This value is automatically incremented by AWS after each update of this resource.
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public TrafficPolicyState()
        {
        }
        public static new TrafficPolicyState Empty => new TrafficPolicyState();
    }
}
