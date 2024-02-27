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
    /// Provides a SageMaker Human Task UI resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.IO;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Sagemaker.HumanTaskUI("example", new()
    ///     {
    ///         HumanTaskUiName = "example",
    ///         UiTemplate = new Aws.Sagemaker.Inputs.HumanTaskUIUiTemplateArgs
    ///         {
    ///             Content = File.ReadAllText("sagemaker-human-task-ui-template.html"),
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import SageMaker Human Task UIs using the `human_task_ui_name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:sagemaker/humanTaskUI:HumanTaskUI example example
    /// ```
    /// </summary>
    [AwsResourceType("aws:sagemaker/humanTaskUI:HumanTaskUI")]
    public partial class HumanTaskUI : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) assigned by AWS to this Human Task UI.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The name of the Human Task UI.
        /// </summary>
        [Output("humanTaskUiName")]
        public Output<string> HumanTaskUiName { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The Liquid template for the worker user interface. See UI Template below.
        /// </summary>
        [Output("uiTemplate")]
        public Output<Outputs.HumanTaskUIUiTemplate> UiTemplate { get; private set; } = null!;


        /// <summary>
        /// Create a HumanTaskUI resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HumanTaskUI(string name, HumanTaskUIArgs args, CustomResourceOptions? options = null)
            : base("aws:sagemaker/humanTaskUI:HumanTaskUI", name, args ?? new HumanTaskUIArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HumanTaskUI(string name, Input<string> id, HumanTaskUIState? state = null, CustomResourceOptions? options = null)
            : base("aws:sagemaker/humanTaskUI:HumanTaskUI", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing HumanTaskUI resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HumanTaskUI Get(string name, Input<string> id, HumanTaskUIState? state = null, CustomResourceOptions? options = null)
        {
            return new HumanTaskUI(name, id, state, options);
        }
    }

    public sealed class HumanTaskUIArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Human Task UI.
        /// </summary>
        [Input("humanTaskUiName", required: true)]
        public Input<string> HumanTaskUiName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The Liquid template for the worker user interface. See UI Template below.
        /// </summary>
        [Input("uiTemplate", required: true)]
        public Input<Inputs.HumanTaskUIUiTemplateArgs> UiTemplate { get; set; } = null!;

        public HumanTaskUIArgs()
        {
        }
        public static new HumanTaskUIArgs Empty => new HumanTaskUIArgs();
    }

    public sealed class HumanTaskUIState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) assigned by AWS to this Human Task UI.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The name of the Human Task UI.
        /// </summary>
        [Input("humanTaskUiName")]
        public Input<string>? HumanTaskUiName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The Liquid template for the worker user interface. See UI Template below.
        /// </summary>
        [Input("uiTemplate")]
        public Input<Inputs.HumanTaskUIUiTemplateGetArgs>? UiTemplate { get; set; }

        public HumanTaskUIState()
        {
        }
        public static new HumanTaskUIState Empty => new HumanTaskUIState();
    }
}
