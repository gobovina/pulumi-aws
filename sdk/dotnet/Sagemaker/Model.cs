// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker
{
    /// <summary>
    /// Provides a SageMaker model resource.
    /// 
    /// ## Example Usage
    /// 
    /// Basic usage:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var assumeRole = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Actions = new[]
    ///                 {
    ///                     "sts:AssumeRole",
    ///                 },
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "Service",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "sagemaker.amazonaws.com",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleRole = new Aws.Iam.Role("exampleRole", new()
    ///     {
    ///         AssumeRolePolicy = assumeRole.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var test = Aws.Sagemaker.GetPrebuiltEcrImage.Invoke(new()
    ///     {
    ///         RepositoryName = "kmeans",
    ///     });
    /// 
    ///     var exampleModel = new Aws.Sagemaker.Model("exampleModel", new()
    ///     {
    ///         ExecutionRoleArn = exampleRole.Arn,
    ///         PrimaryContainer = new Aws.Sagemaker.Inputs.ModelPrimaryContainerArgs
    ///         {
    ///             Image = test.Apply(getPrebuiltEcrImageResult =&gt; getPrebuiltEcrImageResult.RegistryPath),
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## Inference Execution Config
    /// 
    /// * `mode` - (Required) How containers in a multi-container are run. The following values are valid `Serial` and `Direct`.
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import models using the `name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:sagemaker/model:Model test_model model-foo
    /// ```
    /// </summary>
    [AwsResourceType("aws:sagemaker/model:Model")]
    public partial class Model : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) assigned by AWS to this model.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Specifies containers in the inference pipeline. If not specified, the `primary_container` argument is required. Fields are documented below.
        /// </summary>
        [Output("containers")]
        public Output<ImmutableArray<Outputs.ModelContainer>> Containers { get; private set; } = null!;

        /// <summary>
        /// Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
        /// </summary>
        [Output("enableNetworkIsolation")]
        public Output<bool?> EnableNetworkIsolation { get; private set; } = null!;

        /// <summary>
        /// A role that SageMaker can assume to access model artifacts and docker images for deployment.
        /// </summary>
        [Output("executionRoleArn")]
        public Output<string> ExecutionRoleArn { get; private set; } = null!;

        /// <summary>
        /// Specifies details of how containers in a multi-container endpoint are called. see Inference Execution Config.
        /// </summary>
        [Output("inferenceExecutionConfig")]
        public Output<Outputs.ModelInferenceExecutionConfig> InferenceExecutionConfig { get; private set; } = null!;

        /// <summary>
        /// The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
        /// </summary>
        [Output("primaryContainer")]
        public Output<Outputs.ModelPrimaryContainer?> PrimaryContainer { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// 
        /// The `primary_container` and `container` block both support:
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
        /// </summary>
        [Output("vpcConfig")]
        public Output<Outputs.ModelVpcConfig?> VpcConfig { get; private set; } = null!;


        /// <summary>
        /// Create a Model resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Model(string name, ModelArgs args, CustomResourceOptions? options = null)
            : base("aws:sagemaker/model:Model", name, args ?? new ModelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Model(string name, Input<string> id, ModelState? state = null, CustomResourceOptions? options = null)
            : base("aws:sagemaker/model:Model", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Model resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Model Get(string name, Input<string> id, ModelState? state = null, CustomResourceOptions? options = null)
        {
            return new Model(name, id, state, options);
        }
    }

    public sealed class ModelArgs : global::Pulumi.ResourceArgs
    {
        [Input("containers")]
        private InputList<Inputs.ModelContainerArgs>? _containers;

        /// <summary>
        /// Specifies containers in the inference pipeline. If not specified, the `primary_container` argument is required. Fields are documented below.
        /// </summary>
        public InputList<Inputs.ModelContainerArgs> Containers
        {
            get => _containers ?? (_containers = new InputList<Inputs.ModelContainerArgs>());
            set => _containers = value;
        }

        /// <summary>
        /// Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
        /// </summary>
        [Input("enableNetworkIsolation")]
        public Input<bool>? EnableNetworkIsolation { get; set; }

        /// <summary>
        /// A role that SageMaker can assume to access model artifacts and docker images for deployment.
        /// </summary>
        [Input("executionRoleArn", required: true)]
        public Input<string> ExecutionRoleArn { get; set; } = null!;

        /// <summary>
        /// Specifies details of how containers in a multi-container endpoint are called. see Inference Execution Config.
        /// </summary>
        [Input("inferenceExecutionConfig")]
        public Input<Inputs.ModelInferenceExecutionConfigArgs>? InferenceExecutionConfig { get; set; }

        /// <summary>
        /// The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
        /// </summary>
        [Input("primaryContainer")]
        public Input<Inputs.ModelPrimaryContainerArgs>? PrimaryContainer { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// 
        /// The `primary_container` and `container` block both support:
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
        /// </summary>
        [Input("vpcConfig")]
        public Input<Inputs.ModelVpcConfigArgs>? VpcConfig { get; set; }

        public ModelArgs()
        {
        }
        public static new ModelArgs Empty => new ModelArgs();
    }

    public sealed class ModelState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) assigned by AWS to this model.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("containers")]
        private InputList<Inputs.ModelContainerGetArgs>? _containers;

        /// <summary>
        /// Specifies containers in the inference pipeline. If not specified, the `primary_container` argument is required. Fields are documented below.
        /// </summary>
        public InputList<Inputs.ModelContainerGetArgs> Containers
        {
            get => _containers ?? (_containers = new InputList<Inputs.ModelContainerGetArgs>());
            set => _containers = value;
        }

        /// <summary>
        /// Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
        /// </summary>
        [Input("enableNetworkIsolation")]
        public Input<bool>? EnableNetworkIsolation { get; set; }

        /// <summary>
        /// A role that SageMaker can assume to access model artifacts and docker images for deployment.
        /// </summary>
        [Input("executionRoleArn")]
        public Input<string>? ExecutionRoleArn { get; set; }

        /// <summary>
        /// Specifies details of how containers in a multi-container endpoint are called. see Inference Execution Config.
        /// </summary>
        [Input("inferenceExecutionConfig")]
        public Input<Inputs.ModelInferenceExecutionConfigGetArgs>? InferenceExecutionConfig { get; set; }

        /// <summary>
        /// The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
        /// </summary>
        [Input("primaryContainer")]
        public Input<Inputs.ModelPrimaryContainerGetArgs>? PrimaryContainer { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// 
        /// The `primary_container` and `container` block both support:
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
        /// </summary>
        [Input("vpcConfig")]
        public Input<Inputs.ModelVpcConfigGetArgs>? VpcConfig { get; set; }

        public ModelState()
        {
        }
        public static new ModelState Empty => new ModelState();
    }
}
