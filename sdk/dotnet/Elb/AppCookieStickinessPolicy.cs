// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Elb
{
    /// <summary>
    /// Provides an application cookie stickiness policy, which allows an ELB to wed its sticky cookie's expiration to a cookie generated by your application.
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
    ///     var lb = new Aws.Elb.LoadBalancer("lb", new()
    ///     {
    ///         AvailabilityZones = new[]
    ///         {
    ///             "us-east-1a",
    ///         },
    ///         Listeners = new[]
    ///         {
    ///             new Aws.Elb.Inputs.LoadBalancerListenerArgs
    ///             {
    ///                 InstancePort = 8000,
    ///                 InstanceProtocol = "http",
    ///                 LbPort = 80,
    ///                 LbProtocol = "http",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var foo = new Aws.Elb.AppCookieStickinessPolicy("foo", new()
    ///     {
    ///         LoadBalancer = lb.Name,
    ///         LbPort = 80,
    ///         CookieName = "MyAppCookie",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import application cookie stickiness policies using the ELB name, port, and policy name separated by colons (`:`). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:elb/appCookieStickinessPolicy:AppCookieStickinessPolicy example my-elb:80:my-policy
    /// ```
    /// </summary>
    [AwsResourceType("aws:elb/appCookieStickinessPolicy:AppCookieStickinessPolicy")]
    public partial class AppCookieStickinessPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Application cookie whose lifetime the ELB's cookie should follow.
        /// </summary>
        [Output("cookieName")]
        public Output<string> CookieName { get; private set; } = null!;

        /// <summary>
        /// Load balancer port to which the policy
        /// should be applied. This must be an active listener on the load
        /// balancer.
        /// </summary>
        [Output("lbPort")]
        public Output<int> LbPort { get; private set; } = null!;

        /// <summary>
        /// Name of load balancer to which the policy
        /// should be attached.
        /// </summary>
        [Output("loadBalancer")]
        public Output<string> LoadBalancer { get; private set; } = null!;

        /// <summary>
        /// Name of the stickiness policy.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a AppCookieStickinessPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AppCookieStickinessPolicy(string name, AppCookieStickinessPolicyArgs args, CustomResourceOptions? options = null)
            : base("aws:elb/appCookieStickinessPolicy:AppCookieStickinessPolicy", name, args ?? new AppCookieStickinessPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AppCookieStickinessPolicy(string name, Input<string> id, AppCookieStickinessPolicyState? state = null, CustomResourceOptions? options = null)
            : base("aws:elb/appCookieStickinessPolicy:AppCookieStickinessPolicy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                Aliases =
                {
                    new global::Pulumi.Alias { Type = "aws:elasticloadbalancing/appCookieStickinessPolicy:AppCookieStickinessPolicy"},
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AppCookieStickinessPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AppCookieStickinessPolicy Get(string name, Input<string> id, AppCookieStickinessPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new AppCookieStickinessPolicy(name, id, state, options);
        }
    }

    public sealed class AppCookieStickinessPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Application cookie whose lifetime the ELB's cookie should follow.
        /// </summary>
        [Input("cookieName", required: true)]
        public Input<string> CookieName { get; set; } = null!;

        /// <summary>
        /// Load balancer port to which the policy
        /// should be applied. This must be an active listener on the load
        /// balancer.
        /// </summary>
        [Input("lbPort", required: true)]
        public Input<int> LbPort { get; set; } = null!;

        /// <summary>
        /// Name of load balancer to which the policy
        /// should be attached.
        /// </summary>
        [Input("loadBalancer", required: true)]
        public Input<string> LoadBalancer { get; set; } = null!;

        /// <summary>
        /// Name of the stickiness policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AppCookieStickinessPolicyArgs()
        {
        }
        public static new AppCookieStickinessPolicyArgs Empty => new AppCookieStickinessPolicyArgs();
    }

    public sealed class AppCookieStickinessPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Application cookie whose lifetime the ELB's cookie should follow.
        /// </summary>
        [Input("cookieName")]
        public Input<string>? CookieName { get; set; }

        /// <summary>
        /// Load balancer port to which the policy
        /// should be applied. This must be an active listener on the load
        /// balancer.
        /// </summary>
        [Input("lbPort")]
        public Input<int>? LbPort { get; set; }

        /// <summary>
        /// Name of load balancer to which the policy
        /// should be attached.
        /// </summary>
        [Input("loadBalancer")]
        public Input<string>? LoadBalancer { get; set; }

        /// <summary>
        /// Name of the stickiness policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AppCookieStickinessPolicyState()
        {
        }
        public static new AppCookieStickinessPolicyState Empty => new AppCookieStickinessPolicyState();
    }
}
