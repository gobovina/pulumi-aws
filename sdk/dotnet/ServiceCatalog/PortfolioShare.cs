// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ServiceCatalog
{
    /// <summary>
    /// Manages a Service Catalog Portfolio Share. Shares the specified portfolio with the specified account or organization node. You can share portfolios to an organization, an organizational unit, or a specific account.
    /// 
    /// If the portfolio share with the specified account or organization node already exists, using this resource to re-create the share will have no effect and will not return an error. You can then use this resource to update the share.
    /// 
    /// &gt; **NOTE:** Shares to an organization node can only be created by the management account of an organization or by a delegated administrator. If a delegated admin is de-registered, they can no longer create portfolio shares.
    /// 
    /// &gt; **NOTE:** AWSOrganizationsAccess must be enabled in order to create a portfolio share to an organization node.
    /// 
    /// &gt; **NOTE:** You can't share a shared resource, including portfolios that contain a shared product.
    /// 
    /// ## Example Usage
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
    ///     var example = new Aws.ServiceCatalog.PortfolioShare("example", new()
    ///     {
    ///         PrincipalId = "012128675309",
    ///         PortfolioId = aws_servicecatalog_portfolio.Example.Id,
    ///         Type = "ACCOUNT",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_servicecatalog_portfolio_share` using the portfolio share ID. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:servicecatalog/portfolioShare:PortfolioShare example port-12344321:ACCOUNT:123456789012
    /// ```
    /// </summary>
    [AwsResourceType("aws:servicecatalog/portfolioShare:PortfolioShare")]
    public partial class PortfolioShare : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        /// </summary>
        [Output("acceptLanguage")]
        public Output<string?> AcceptLanguage { get; private set; } = null!;

        /// <summary>
        /// Whether the shared portfolio is imported by the recipient account. If the recipient is organizational, the share is automatically imported, and the field is always set to true.
        /// </summary>
        [Output("accepted")]
        public Output<bool> Accepted { get; private set; } = null!;

        /// <summary>
        /// Portfolio identifier.
        /// </summary>
        [Output("portfolioId")]
        public Output<string> PortfolioId { get; private set; } = null!;

        /// <summary>
        /// Identifier of the principal with whom you will share the portfolio. Valid values AWS account IDs and ARNs of AWS Organizations and organizational units.
        /// </summary>
        [Output("principalId")]
        public Output<string> PrincipalId { get; private set; } = null!;

        /// <summary>
        /// Enables or disables Principal sharing when creating the portfolio share. If this flag is not provided, principal sharing is disabled.
        /// </summary>
        [Output("sharePrincipals")]
        public Output<bool?> SharePrincipals { get; private set; } = null!;

        /// <summary>
        /// Whether to enable sharing of `aws.servicecatalog.TagOption` resources when creating the portfolio share.
        /// </summary>
        [Output("shareTagOptions")]
        public Output<bool?> ShareTagOptions { get; private set; } = null!;

        /// <summary>
        /// Type of portfolio share. Valid values are `ACCOUNT` (an external account), `ORGANIZATION` (a share to every account in an organization), `ORGANIZATIONAL_UNIT`, `ORGANIZATION_MEMBER_ACCOUNT` (a share to an account in an organization).
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Whether to wait (up to the timeout) for the share to be accepted. Organizational shares are automatically accepted.
        /// </summary>
        [Output("waitForAcceptance")]
        public Output<bool?> WaitForAcceptance { get; private set; } = null!;


        /// <summary>
        /// Create a PortfolioShare resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PortfolioShare(string name, PortfolioShareArgs args, CustomResourceOptions? options = null)
            : base("aws:servicecatalog/portfolioShare:PortfolioShare", name, args ?? new PortfolioShareArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PortfolioShare(string name, Input<string> id, PortfolioShareState? state = null, CustomResourceOptions? options = null)
            : base("aws:servicecatalog/portfolioShare:PortfolioShare", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PortfolioShare resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PortfolioShare Get(string name, Input<string> id, PortfolioShareState? state = null, CustomResourceOptions? options = null)
        {
            return new PortfolioShare(name, id, state, options);
        }
    }

    public sealed class PortfolioShareArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        /// </summary>
        [Input("acceptLanguage")]
        public Input<string>? AcceptLanguage { get; set; }

        /// <summary>
        /// Portfolio identifier.
        /// </summary>
        [Input("portfolioId", required: true)]
        public Input<string> PortfolioId { get; set; } = null!;

        /// <summary>
        /// Identifier of the principal with whom you will share the portfolio. Valid values AWS account IDs and ARNs of AWS Organizations and organizational units.
        /// </summary>
        [Input("principalId", required: true)]
        public Input<string> PrincipalId { get; set; } = null!;

        /// <summary>
        /// Enables or disables Principal sharing when creating the portfolio share. If this flag is not provided, principal sharing is disabled.
        /// </summary>
        [Input("sharePrincipals")]
        public Input<bool>? SharePrincipals { get; set; }

        /// <summary>
        /// Whether to enable sharing of `aws.servicecatalog.TagOption` resources when creating the portfolio share.
        /// </summary>
        [Input("shareTagOptions")]
        public Input<bool>? ShareTagOptions { get; set; }

        /// <summary>
        /// Type of portfolio share. Valid values are `ACCOUNT` (an external account), `ORGANIZATION` (a share to every account in an organization), `ORGANIZATIONAL_UNIT`, `ORGANIZATION_MEMBER_ACCOUNT` (a share to an account in an organization).
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Whether to wait (up to the timeout) for the share to be accepted. Organizational shares are automatically accepted.
        /// </summary>
        [Input("waitForAcceptance")]
        public Input<bool>? WaitForAcceptance { get; set; }

        public PortfolioShareArgs()
        {
        }
        public static new PortfolioShareArgs Empty => new PortfolioShareArgs();
    }

    public sealed class PortfolioShareState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        /// </summary>
        [Input("acceptLanguage")]
        public Input<string>? AcceptLanguage { get; set; }

        /// <summary>
        /// Whether the shared portfolio is imported by the recipient account. If the recipient is organizational, the share is automatically imported, and the field is always set to true.
        /// </summary>
        [Input("accepted")]
        public Input<bool>? Accepted { get; set; }

        /// <summary>
        /// Portfolio identifier.
        /// </summary>
        [Input("portfolioId")]
        public Input<string>? PortfolioId { get; set; }

        /// <summary>
        /// Identifier of the principal with whom you will share the portfolio. Valid values AWS account IDs and ARNs of AWS Organizations and organizational units.
        /// </summary>
        [Input("principalId")]
        public Input<string>? PrincipalId { get; set; }

        /// <summary>
        /// Enables or disables Principal sharing when creating the portfolio share. If this flag is not provided, principal sharing is disabled.
        /// </summary>
        [Input("sharePrincipals")]
        public Input<bool>? SharePrincipals { get; set; }

        /// <summary>
        /// Whether to enable sharing of `aws.servicecatalog.TagOption` resources when creating the portfolio share.
        /// </summary>
        [Input("shareTagOptions")]
        public Input<bool>? ShareTagOptions { get; set; }

        /// <summary>
        /// Type of portfolio share. Valid values are `ACCOUNT` (an external account), `ORGANIZATION` (a share to every account in an organization), `ORGANIZATIONAL_UNIT`, `ORGANIZATION_MEMBER_ACCOUNT` (a share to an account in an organization).
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Whether to wait (up to the timeout) for the share to be accepted. Organizational shares are automatically accepted.
        /// </summary>
        [Input("waitForAcceptance")]
        public Input<bool>? WaitForAcceptance { get; set; }

        public PortfolioShareState()
        {
        }
        public static new PortfolioShareState Empty => new PortfolioShareState();
    }
}
