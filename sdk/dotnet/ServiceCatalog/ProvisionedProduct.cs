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
    /// This resource provisions and manages a Service Catalog provisioned product.
    /// 
    /// A provisioned product is a resourced instance of a product. For example, provisioning a product based on a CloudFormation template launches a CloudFormation stack and its underlying resources.
    /// 
    /// Like this resource, the `aws_servicecatalog_record` data source also provides information about a provisioned product. Although a Service Catalog record provides some overlapping information with this resource, a record is tied to a provisioned product event, such as provisioning, termination, and updating.
    /// 
    /// &gt; **Tip:** If you include conflicted keys as tags, AWS will report an error, "Parameter validation failed: Missing required parameter in Tags[N]:Value".
    /// 
    /// &gt; **Tip:** A "provisioning artifact" is also referred to as a "version." A "distributor" is also referred to as a "vendor."
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
    ///     var example = new Aws.ServiceCatalog.ProvisionedProduct("example", new()
    ///     {
    ///         ProductName = "Example product",
    ///         ProvisioningArtifactName = "Example version",
    ///         ProvisioningParameters = new[]
    ///         {
    ///             new Aws.ServiceCatalog.Inputs.ProvisionedProductProvisioningParameterArgs
    ///             {
    ///                 Key = "foo",
    ///                 Value = "bar",
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "foo", "bar" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_servicecatalog_provisioned_product` using the provisioned product ID. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:servicecatalog/provisionedProduct:ProvisionedProduct example pp-dnigbtea24ste
    /// ```
    /// </summary>
    [AwsResourceType("aws:servicecatalog/provisionedProduct:ProvisionedProduct")]
    public partial class ProvisionedProduct : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        /// </summary>
        [Output("acceptLanguage")]
        public Output<string?> AcceptLanguage { get; private set; } = null!;

        /// <summary>
        /// ARN of the provisioned product.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Set of CloudWatch dashboards that were created when provisioning the product.
        /// </summary>
        [Output("cloudwatchDashboardNames")]
        public Output<ImmutableArray<string>> CloudwatchDashboardNames { get; private set; } = null!;

        /// <summary>
        /// Time when the provisioned product was created.
        /// </summary>
        [Output("createdTime")]
        public Output<string> CreatedTime { get; private set; } = null!;

        /// <summary>
        /// _Only applies to deleting._ If set to `true`, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources. The default value is `false`.
        /// </summary>
        [Output("ignoreErrors")]
        public Output<bool?> IgnoreErrors { get; private set; } = null!;

        /// <summary>
        /// Record identifier of the last request performed on this provisioned product of the following types: `ProvisionedProduct`, `UpdateProvisionedProduct`, `ExecuteProvisionedProductPlan`, `TerminateProvisionedProduct`.
        /// </summary>
        [Output("lastProvisioningRecordId")]
        public Output<string> LastProvisioningRecordId { get; private set; } = null!;

        /// <summary>
        /// Record identifier of the last request performed on this provisioned product.
        /// </summary>
        [Output("lastRecordId")]
        public Output<string> LastRecordId { get; private set; } = null!;

        /// <summary>
        /// Record identifier of the last successful request performed on this provisioned product of the following types: `ProvisionedProduct`, `UpdateProvisionedProduct`, `ExecuteProvisionedProductPlan`, `TerminateProvisionedProduct`.
        /// </summary>
        [Output("lastSuccessfulProvisioningRecordId")]
        public Output<string> LastSuccessfulProvisioningRecordId { get; private set; } = null!;

        /// <summary>
        /// ARN of the launch role associated with the provisioned product.
        /// </summary>
        [Output("launchRoleArn")]
        public Output<string> LaunchRoleArn { get; private set; } = null!;

        /// <summary>
        /// User-friendly name of the provisioned product.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
        /// </summary>
        [Output("notificationArns")]
        public Output<ImmutableArray<string>> NotificationArns { get; private set; } = null!;

        /// <summary>
        /// The set of outputs for the product created.
        /// </summary>
        [Output("outputs")]
        public Output<ImmutableArray<Outputs.ProvisionedProductOutput>> Outputs { get; private set; } = null!;

        /// <summary>
        /// Path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use `aws.servicecatalog.getLaunchPaths`. When required, you must provide `path_id` or `path_name`, but not both.
        /// </summary>
        [Output("pathId")]
        public Output<string> PathId { get; private set; } = null!;

        /// <summary>
        /// Name of the path. You must provide `path_id` or `path_name`, but not both.
        /// </summary>
        [Output("pathName")]
        public Output<string?> PathName { get; private set; } = null!;

        /// <summary>
        /// Product identifier. For example, `prod-abcdzk7xy33qa`. You must provide `product_id` or `product_name`, but not both.
        /// </summary>
        [Output("productId")]
        public Output<string> ProductId { get; private set; } = null!;

        /// <summary>
        /// Name of the product. You must provide `product_id` or `product_name`, but not both.
        /// </summary>
        [Output("productName")]
        public Output<string?> ProductName { get; private set; } = null!;

        /// <summary>
        /// Identifier of the provisioning artifact. For example, `pa-4abcdjnxjj6ne`. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
        /// </summary>
        [Output("provisioningArtifactId")]
        public Output<string> ProvisioningArtifactId { get; private set; } = null!;

        /// <summary>
        /// Name of the provisioning artifact. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
        /// </summary>
        [Output("provisioningArtifactName")]
        public Output<string?> ProvisioningArtifactName { get; private set; } = null!;

        /// <summary>
        /// Configuration block with parameters specified by the administrator that are required for provisioning the product. See details below.
        /// </summary>
        [Output("provisioningParameters")]
        public Output<ImmutableArray<Outputs.ProvisionedProductProvisioningParameter>> ProvisioningParameters { get; private set; } = null!;

        /// <summary>
        /// _Only applies to deleting._ Whether to delete the Service Catalog provisioned product but leave the CloudFormation stack, stack set, or the underlying resources of the deleted provisioned product. The default value is `false`.
        /// </summary>
        [Output("retainPhysicalResources")]
        public Output<bool?> RetainPhysicalResources { get; private set; } = null!;

        /// <summary>
        /// Configuration block with information about the provisioning preferences for a stack set. See details below.
        /// </summary>
        [Output("stackSetProvisioningPreferences")]
        public Output<Outputs.ProvisionedProductStackSetProvisioningPreferences?> StackSetProvisioningPreferences { get; private set; } = null!;

        /// <summary>
        /// Current status of the provisioned product. See meanings below.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Current status message of the provisioned product.
        /// </summary>
        [Output("statusMessage")]
        public Output<string> StatusMessage { get; private set; } = null!;

        /// <summary>
        /// Tags to apply to the provisioned product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Type of provisioned product. Valid values are `CFN_STACK` and `CFN_STACKSET`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a ProvisionedProduct resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProvisionedProduct(string name, ProvisionedProductArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:servicecatalog/provisionedProduct:ProvisionedProduct", name, args ?? new ProvisionedProductArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProvisionedProduct(string name, Input<string> id, ProvisionedProductState? state = null, CustomResourceOptions? options = null)
            : base("aws:servicecatalog/provisionedProduct:ProvisionedProduct", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ProvisionedProduct resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProvisionedProduct Get(string name, Input<string> id, ProvisionedProductState? state = null, CustomResourceOptions? options = null)
        {
            return new ProvisionedProduct(name, id, state, options);
        }
    }

    public sealed class ProvisionedProductArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        /// </summary>
        [Input("acceptLanguage")]
        public Input<string>? AcceptLanguage { get; set; }

        /// <summary>
        /// _Only applies to deleting._ If set to `true`, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources. The default value is `false`.
        /// </summary>
        [Input("ignoreErrors")]
        public Input<bool>? IgnoreErrors { get; set; }

        /// <summary>
        /// User-friendly name of the provisioned product.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notificationArns")]
        private InputList<string>? _notificationArns;

        /// <summary>
        /// Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
        /// </summary>
        public InputList<string> NotificationArns
        {
            get => _notificationArns ?? (_notificationArns = new InputList<string>());
            set => _notificationArns = value;
        }

        /// <summary>
        /// Path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use `aws.servicecatalog.getLaunchPaths`. When required, you must provide `path_id` or `path_name`, but not both.
        /// </summary>
        [Input("pathId")]
        public Input<string>? PathId { get; set; }

        /// <summary>
        /// Name of the path. You must provide `path_id` or `path_name`, but not both.
        /// </summary>
        [Input("pathName")]
        public Input<string>? PathName { get; set; }

        /// <summary>
        /// Product identifier. For example, `prod-abcdzk7xy33qa`. You must provide `product_id` or `product_name`, but not both.
        /// </summary>
        [Input("productId")]
        public Input<string>? ProductId { get; set; }

        /// <summary>
        /// Name of the product. You must provide `product_id` or `product_name`, but not both.
        /// </summary>
        [Input("productName")]
        public Input<string>? ProductName { get; set; }

        /// <summary>
        /// Identifier of the provisioning artifact. For example, `pa-4abcdjnxjj6ne`. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
        /// </summary>
        [Input("provisioningArtifactId")]
        public Input<string>? ProvisioningArtifactId { get; set; }

        /// <summary>
        /// Name of the provisioning artifact. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
        /// </summary>
        [Input("provisioningArtifactName")]
        public Input<string>? ProvisioningArtifactName { get; set; }

        [Input("provisioningParameters")]
        private InputList<Inputs.ProvisionedProductProvisioningParameterArgs>? _provisioningParameters;

        /// <summary>
        /// Configuration block with parameters specified by the administrator that are required for provisioning the product. See details below.
        /// </summary>
        public InputList<Inputs.ProvisionedProductProvisioningParameterArgs> ProvisioningParameters
        {
            get => _provisioningParameters ?? (_provisioningParameters = new InputList<Inputs.ProvisionedProductProvisioningParameterArgs>());
            set => _provisioningParameters = value;
        }

        /// <summary>
        /// _Only applies to deleting._ Whether to delete the Service Catalog provisioned product but leave the CloudFormation stack, stack set, or the underlying resources of the deleted provisioned product. The default value is `false`.
        /// </summary>
        [Input("retainPhysicalResources")]
        public Input<bool>? RetainPhysicalResources { get; set; }

        /// <summary>
        /// Configuration block with information about the provisioning preferences for a stack set. See details below.
        /// </summary>
        [Input("stackSetProvisioningPreferences")]
        public Input<Inputs.ProvisionedProductStackSetProvisioningPreferencesArgs>? StackSetProvisioningPreferences { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Tags to apply to the provisioned product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ProvisionedProductArgs()
        {
        }
        public static new ProvisionedProductArgs Empty => new ProvisionedProductArgs();
    }

    public sealed class ProvisionedProductState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        /// </summary>
        [Input("acceptLanguage")]
        public Input<string>? AcceptLanguage { get; set; }

        /// <summary>
        /// ARN of the provisioned product.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("cloudwatchDashboardNames")]
        private InputList<string>? _cloudwatchDashboardNames;

        /// <summary>
        /// Set of CloudWatch dashboards that were created when provisioning the product.
        /// </summary>
        public InputList<string> CloudwatchDashboardNames
        {
            get => _cloudwatchDashboardNames ?? (_cloudwatchDashboardNames = new InputList<string>());
            set => _cloudwatchDashboardNames = value;
        }

        /// <summary>
        /// Time when the provisioned product was created.
        /// </summary>
        [Input("createdTime")]
        public Input<string>? CreatedTime { get; set; }

        /// <summary>
        /// _Only applies to deleting._ If set to `true`, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources. The default value is `false`.
        /// </summary>
        [Input("ignoreErrors")]
        public Input<bool>? IgnoreErrors { get; set; }

        /// <summary>
        /// Record identifier of the last request performed on this provisioned product of the following types: `ProvisionedProduct`, `UpdateProvisionedProduct`, `ExecuteProvisionedProductPlan`, `TerminateProvisionedProduct`.
        /// </summary>
        [Input("lastProvisioningRecordId")]
        public Input<string>? LastProvisioningRecordId { get; set; }

        /// <summary>
        /// Record identifier of the last request performed on this provisioned product.
        /// </summary>
        [Input("lastRecordId")]
        public Input<string>? LastRecordId { get; set; }

        /// <summary>
        /// Record identifier of the last successful request performed on this provisioned product of the following types: `ProvisionedProduct`, `UpdateProvisionedProduct`, `ExecuteProvisionedProductPlan`, `TerminateProvisionedProduct`.
        /// </summary>
        [Input("lastSuccessfulProvisioningRecordId")]
        public Input<string>? LastSuccessfulProvisioningRecordId { get; set; }

        /// <summary>
        /// ARN of the launch role associated with the provisioned product.
        /// </summary>
        [Input("launchRoleArn")]
        public Input<string>? LaunchRoleArn { get; set; }

        /// <summary>
        /// User-friendly name of the provisioned product.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notificationArns")]
        private InputList<string>? _notificationArns;

        /// <summary>
        /// Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
        /// </summary>
        public InputList<string> NotificationArns
        {
            get => _notificationArns ?? (_notificationArns = new InputList<string>());
            set => _notificationArns = value;
        }

        [Input("outputs")]
        private InputList<Inputs.ProvisionedProductOutputGetArgs>? _outputs;

        /// <summary>
        /// The set of outputs for the product created.
        /// </summary>
        public InputList<Inputs.ProvisionedProductOutputGetArgs> Outputs
        {
            get => _outputs ?? (_outputs = new InputList<Inputs.ProvisionedProductOutputGetArgs>());
            set => _outputs = value;
        }

        /// <summary>
        /// Path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use `aws.servicecatalog.getLaunchPaths`. When required, you must provide `path_id` or `path_name`, but not both.
        /// </summary>
        [Input("pathId")]
        public Input<string>? PathId { get; set; }

        /// <summary>
        /// Name of the path. You must provide `path_id` or `path_name`, but not both.
        /// </summary>
        [Input("pathName")]
        public Input<string>? PathName { get; set; }

        /// <summary>
        /// Product identifier. For example, `prod-abcdzk7xy33qa`. You must provide `product_id` or `product_name`, but not both.
        /// </summary>
        [Input("productId")]
        public Input<string>? ProductId { get; set; }

        /// <summary>
        /// Name of the product. You must provide `product_id` or `product_name`, but not both.
        /// </summary>
        [Input("productName")]
        public Input<string>? ProductName { get; set; }

        /// <summary>
        /// Identifier of the provisioning artifact. For example, `pa-4abcdjnxjj6ne`. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
        /// </summary>
        [Input("provisioningArtifactId")]
        public Input<string>? ProvisioningArtifactId { get; set; }

        /// <summary>
        /// Name of the provisioning artifact. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
        /// </summary>
        [Input("provisioningArtifactName")]
        public Input<string>? ProvisioningArtifactName { get; set; }

        [Input("provisioningParameters")]
        private InputList<Inputs.ProvisionedProductProvisioningParameterGetArgs>? _provisioningParameters;

        /// <summary>
        /// Configuration block with parameters specified by the administrator that are required for provisioning the product. See details below.
        /// </summary>
        public InputList<Inputs.ProvisionedProductProvisioningParameterGetArgs> ProvisioningParameters
        {
            get => _provisioningParameters ?? (_provisioningParameters = new InputList<Inputs.ProvisionedProductProvisioningParameterGetArgs>());
            set => _provisioningParameters = value;
        }

        /// <summary>
        /// _Only applies to deleting._ Whether to delete the Service Catalog provisioned product but leave the CloudFormation stack, stack set, or the underlying resources of the deleted provisioned product. The default value is `false`.
        /// </summary>
        [Input("retainPhysicalResources")]
        public Input<bool>? RetainPhysicalResources { get; set; }

        /// <summary>
        /// Configuration block with information about the provisioning preferences for a stack set. See details below.
        /// </summary>
        [Input("stackSetProvisioningPreferences")]
        public Input<Inputs.ProvisionedProductStackSetProvisioningPreferencesGetArgs>? StackSetProvisioningPreferences { get; set; }

        /// <summary>
        /// Current status of the provisioned product. See meanings below.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Current status message of the provisioned product.
        /// </summary>
        [Input("statusMessage")]
        public Input<string>? StatusMessage { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Tags to apply to the provisioned product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Type of provisioned product. Valid values are `CFN_STACK` and `CFN_STACKSET`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ProvisionedProductState()
        {
        }
        public static new ProvisionedProductState Empty => new ProvisionedProductState();
    }
}
