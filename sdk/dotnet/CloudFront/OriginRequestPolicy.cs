// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFront
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// The following example below creates a CloudFront origin request policy.
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
    ///     var example = new Aws.CloudFront.OriginRequestPolicy("example", new()
    ///     {
    ///         Name = "example-policy",
    ///         Comment = "example comment",
    ///         CookiesConfig = new Aws.CloudFront.Inputs.OriginRequestPolicyCookiesConfigArgs
    ///         {
    ///             CookieBehavior = "whitelist",
    ///             Cookies = new Aws.CloudFront.Inputs.OriginRequestPolicyCookiesConfigCookiesArgs
    ///             {
    ///                 Items = new[]
    ///                 {
    ///                     "example",
    ///                 },
    ///             },
    ///         },
    ///         HeadersConfig = new Aws.CloudFront.Inputs.OriginRequestPolicyHeadersConfigArgs
    ///         {
    ///             HeaderBehavior = "whitelist",
    ///             Headers = new Aws.CloudFront.Inputs.OriginRequestPolicyHeadersConfigHeadersArgs
    ///             {
    ///                 Items = new[]
    ///                 {
    ///                     "example",
    ///                 },
    ///             },
    ///         },
    ///         QueryStringsConfig = new Aws.CloudFront.Inputs.OriginRequestPolicyQueryStringsConfigArgs
    ///         {
    ///             QueryStringBehavior = "whitelist",
    ///             QueryStrings = new Aws.CloudFront.Inputs.OriginRequestPolicyQueryStringsConfigQueryStringsArgs
    ///             {
    ///                 Items = new[]
    ///                 {
    ///                     "example",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Cloudfront Origin Request Policies using the `id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:cloudfront/originRequestPolicy:OriginRequestPolicy policy ccca32ef-dce3-4df3-80df-1bd3000bc4d3
    /// ```
    /// </summary>
    [AwsResourceType("aws:cloudfront/originRequestPolicy:OriginRequestPolicy")]
    public partial class OriginRequestPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Comment to describe the origin request policy.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
        /// </summary>
        [Output("cookiesConfig")]
        public Output<Outputs.OriginRequestPolicyCookiesConfig> CookiesConfig { get; private set; } = null!;

        /// <summary>
        /// The current version of the origin request policy.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// Object that determines whether any HTTP headers (and if so, which headers) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
        /// </summary>
        [Output("headersConfig")]
        public Output<Outputs.OriginRequestPolicyHeadersConfig> HeadersConfig { get; private set; } = null!;

        /// <summary>
        /// Unique name to identify the origin request policy.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
        /// </summary>
        [Output("queryStringsConfig")]
        public Output<Outputs.OriginRequestPolicyQueryStringsConfig> QueryStringsConfig { get; private set; } = null!;


        /// <summary>
        /// Create a OriginRequestPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OriginRequestPolicy(string name, OriginRequestPolicyArgs args, CustomResourceOptions? options = null)
            : base("aws:cloudfront/originRequestPolicy:OriginRequestPolicy", name, args ?? new OriginRequestPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OriginRequestPolicy(string name, Input<string> id, OriginRequestPolicyState? state = null, CustomResourceOptions? options = null)
            : base("aws:cloudfront/originRequestPolicy:OriginRequestPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OriginRequestPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OriginRequestPolicy Get(string name, Input<string> id, OriginRequestPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new OriginRequestPolicy(name, id, state, options);
        }
    }

    public sealed class OriginRequestPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Comment to describe the origin request policy.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
        /// </summary>
        [Input("cookiesConfig", required: true)]
        public Input<Inputs.OriginRequestPolicyCookiesConfigArgs> CookiesConfig { get; set; } = null!;

        /// <summary>
        /// Object that determines whether any HTTP headers (and if so, which headers) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
        /// </summary>
        [Input("headersConfig", required: true)]
        public Input<Inputs.OriginRequestPolicyHeadersConfigArgs> HeadersConfig { get; set; } = null!;

        /// <summary>
        /// Unique name to identify the origin request policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
        /// </summary>
        [Input("queryStringsConfig", required: true)]
        public Input<Inputs.OriginRequestPolicyQueryStringsConfigArgs> QueryStringsConfig { get; set; } = null!;

        public OriginRequestPolicyArgs()
        {
        }
        public static new OriginRequestPolicyArgs Empty => new OriginRequestPolicyArgs();
    }

    public sealed class OriginRequestPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Comment to describe the origin request policy.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
        /// </summary>
        [Input("cookiesConfig")]
        public Input<Inputs.OriginRequestPolicyCookiesConfigGetArgs>? CookiesConfig { get; set; }

        /// <summary>
        /// The current version of the origin request policy.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// Object that determines whether any HTTP headers (and if so, which headers) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
        /// </summary>
        [Input("headersConfig")]
        public Input<Inputs.OriginRequestPolicyHeadersConfigGetArgs>? HeadersConfig { get; set; }

        /// <summary>
        /// Unique name to identify the origin request policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
        /// </summary>
        [Input("queryStringsConfig")]
        public Input<Inputs.OriginRequestPolicyQueryStringsConfigGetArgs>? QueryStringsConfig { get; set; }

        public OriginRequestPolicyState()
        {
        }
        public static new OriginRequestPolicyState Empty => new OriginRequestPolicyState();
    }
}
