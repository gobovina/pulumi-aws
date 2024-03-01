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
    /// Manages a Service Catalog self-service action.
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
    ///     var example = new Aws.ServiceCatalog.ServiceAction("example", new()
    ///     {
    ///         Description = "Motor generator unit",
    ///         Name = "MGU",
    ///         Definition = new Aws.ServiceCatalog.Inputs.ServiceActionDefinitionArgs
    ///         {
    ///             Name = "AWS-RestartEC2Instance",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_servicecatalog_service_action` using the service action ID. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:servicecatalog/serviceAction:ServiceAction example act-f1w12eperfslh
    /// ```
    /// </summary>
    [AwsResourceType("aws:servicecatalog/serviceAction:ServiceAction")]
    public partial class ServiceAction : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
        /// </summary>
        [Output("acceptLanguage")]
        public Output<string?> AcceptLanguage { get; private set; } = null!;

        /// <summary>
        /// Self-service action definition configuration block. Detailed below.
        /// </summary>
        [Output("definition")]
        public Output<Outputs.ServiceActionDefinition> Definition { get; private set; } = null!;

        /// <summary>
        /// Self-service action description.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Self-service action name.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceAction resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceAction(string name, ServiceActionArgs args, CustomResourceOptions? options = null)
            : base("aws:servicecatalog/serviceAction:ServiceAction", name, args ?? new ServiceActionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceAction(string name, Input<string> id, ServiceActionState? state = null, CustomResourceOptions? options = null)
            : base("aws:servicecatalog/serviceAction:ServiceAction", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServiceAction resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceAction Get(string name, Input<string> id, ServiceActionState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceAction(name, id, state, options);
        }
    }

    public sealed class ServiceActionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
        /// </summary>
        [Input("acceptLanguage")]
        public Input<string>? AcceptLanguage { get; set; }

        /// <summary>
        /// Self-service action definition configuration block. Detailed below.
        /// </summary>
        [Input("definition", required: true)]
        public Input<Inputs.ServiceActionDefinitionArgs> Definition { get; set; } = null!;

        /// <summary>
        /// Self-service action description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Self-service action name.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ServiceActionArgs()
        {
        }
        public static new ServiceActionArgs Empty => new ServiceActionArgs();
    }

    public sealed class ServiceActionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
        /// </summary>
        [Input("acceptLanguage")]
        public Input<string>? AcceptLanguage { get; set; }

        /// <summary>
        /// Self-service action definition configuration block. Detailed below.
        /// </summary>
        [Input("definition")]
        public Input<Inputs.ServiceActionDefinitionGetArgs>? Definition { get; set; }

        /// <summary>
        /// Self-service action description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Self-service action name.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ServiceActionState()
        {
        }
        public static new ServiceActionState Empty => new ServiceActionState();
    }
}
