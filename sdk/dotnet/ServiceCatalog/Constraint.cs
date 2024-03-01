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
    /// Manages a Service Catalog Constraint.
    /// 
    /// &gt; **NOTE:** This resource does not associate a Service Catalog product and portfolio. However, the product and portfolio must be associated (see the `aws.servicecatalog.ProductPortfolioAssociation` resource) prior to creating a constraint or you will receive an error.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.ServiceCatalog.Constraint("example", new()
    ///     {
    ///         Description = "Back off, man. I'm a scientist.",
    ///         PortfolioId = exampleAwsServicecatalogPortfolio.Id,
    ///         ProductId = exampleAwsServicecatalogProduct.Id,
    ///         Type = "LAUNCH",
    ///         Parameters = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["RoleArn"] = "arn:aws:iam::123456789012:role/LaunchRole",
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_servicecatalog_constraint` using the constraint ID. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:servicecatalog/constraint:Constraint example cons-nmdkb6cgxfcrs
    /// ```
    /// </summary>
    [AwsResourceType("aws:servicecatalog/constraint:Constraint")]
    public partial class Constraint : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        /// </summary>
        [Output("acceptLanguage")]
        public Output<string?> AcceptLanguage { get; private set; } = null!;

        /// <summary>
        /// Description of the constraint.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Owner of the constraint.
        /// </summary>
        [Output("owner")]
        public Output<string> Owner { get; private set; } = null!;

        /// <summary>
        /// Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
        /// </summary>
        [Output("parameters")]
        public Output<string> Parameters { get; private set; } = null!;

        /// <summary>
        /// Portfolio identifier.
        /// </summary>
        [Output("portfolioId")]
        public Output<string> PortfolioId { get; private set; } = null!;

        /// <summary>
        /// Product identifier.
        /// </summary>
        [Output("productId")]
        public Output<string> ProductId { get; private set; } = null!;

        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Constraint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Constraint(string name, ConstraintArgs args, CustomResourceOptions? options = null)
            : base("aws:servicecatalog/constraint:Constraint", name, args ?? new ConstraintArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Constraint(string name, Input<string> id, ConstraintState? state = null, CustomResourceOptions? options = null)
            : base("aws:servicecatalog/constraint:Constraint", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Constraint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Constraint Get(string name, Input<string> id, ConstraintState? state = null, CustomResourceOptions? options = null)
        {
            return new Constraint(name, id, state, options);
        }
    }

    public sealed class ConstraintArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        /// </summary>
        [Input("acceptLanguage")]
        public Input<string>? AcceptLanguage { get; set; }

        /// <summary>
        /// Description of the constraint.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
        /// </summary>
        [Input("parameters", required: true)]
        public Input<string> Parameters { get; set; } = null!;

        /// <summary>
        /// Portfolio identifier.
        /// </summary>
        [Input("portfolioId", required: true)]
        public Input<string> PortfolioId { get; set; } = null!;

        /// <summary>
        /// Product identifier.
        /// </summary>
        [Input("productId", required: true)]
        public Input<string> ProductId { get; set; } = null!;

        /// <summary>
        /// Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ConstraintArgs()
        {
        }
        public static new ConstraintArgs Empty => new ConstraintArgs();
    }

    public sealed class ConstraintState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        /// </summary>
        [Input("acceptLanguage")]
        public Input<string>? AcceptLanguage { get; set; }

        /// <summary>
        /// Description of the constraint.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Owner of the constraint.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        /// <summary>
        /// Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
        /// </summary>
        [Input("parameters")]
        public Input<string>? Parameters { get; set; }

        /// <summary>
        /// Portfolio identifier.
        /// </summary>
        [Input("portfolioId")]
        public Input<string>? PortfolioId { get; set; }

        /// <summary>
        /// Product identifier.
        /// </summary>
        [Input("productId")]
        public Input<string>? ProductId { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ConstraintState()
        {
        }
        public static new ConstraintState Empty => new ConstraintState();
    }
}
