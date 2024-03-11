// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.EmrContainers
{
    /// <summary>
    /// Manages an EMR Containers (EMR on EKS) Job Template.
    /// 
    /// ## Example Usage
    /// 
    /// ### Basic Usage
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
    ///     var example = new Aws.EmrContainers.JobTemplate("example", new()
    ///     {
    ///         JobTemplateData = new Aws.EmrContainers.Inputs.JobTemplateJobTemplateDataArgs
    ///         {
    ///             ExecutionRoleArn = exampleAwsIamRole.Arn,
    ///             ReleaseLabel = "emr-6.10.0-latest",
    ///             JobDriver = new Aws.EmrContainers.Inputs.JobTemplateJobTemplateDataJobDriverArgs
    ///             {
    ///                 SparkSqlJobDriver = new Aws.EmrContainers.Inputs.JobTemplateJobTemplateDataJobDriverSparkSqlJobDriverArgs
    ///                 {
    ///                     EntryPoint = "default",
    ///                 },
    ///             },
    ///         },
    ///         Name = "example",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import EKS job templates using the `id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:emrcontainers/jobTemplate:JobTemplate example a1b2c3d4e5f6g7h8i9j10k11l
    /// ```
    /// </summary>
    [AwsResourceType("aws:emrcontainers/jobTemplate:JobTemplate")]
    public partial class JobTemplate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the job template.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The job template data which holds values of StartJobRun API request.
        /// </summary>
        [Output("jobTemplateData")]
        public Output<Outputs.JobTemplateJobTemplateData> JobTemplateData { get; private set; } = null!;

        /// <summary>
        /// The KMS key ARN used to encrypt the job template.
        /// </summary>
        [Output("kmsKeyArn")]
        public Output<string?> KmsKeyArn { get; private set; } = null!;

        /// <summary>
        /// The specified name of the job template.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a JobTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public JobTemplate(string name, JobTemplateArgs args, CustomResourceOptions? options = null)
            : base("aws:emrcontainers/jobTemplate:JobTemplate", name, args ?? new JobTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private JobTemplate(string name, Input<string> id, JobTemplateState? state = null, CustomResourceOptions? options = null)
            : base("aws:emrcontainers/jobTemplate:JobTemplate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing JobTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static JobTemplate Get(string name, Input<string> id, JobTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new JobTemplate(name, id, state, options);
        }
    }

    public sealed class JobTemplateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The job template data which holds values of StartJobRun API request.
        /// </summary>
        [Input("jobTemplateData", required: true)]
        public Input<Inputs.JobTemplateJobTemplateDataArgs> JobTemplateData { get; set; } = null!;

        /// <summary>
        /// The KMS key ARN used to encrypt the job template.
        /// </summary>
        [Input("kmsKeyArn")]
        public Input<string>? KmsKeyArn { get; set; }

        /// <summary>
        /// The specified name of the job template.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public JobTemplateArgs()
        {
        }
        public static new JobTemplateArgs Empty => new JobTemplateArgs();
    }

    public sealed class JobTemplateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the job template.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The job template data which holds values of StartJobRun API request.
        /// </summary>
        [Input("jobTemplateData")]
        public Input<Inputs.JobTemplateJobTemplateDataGetArgs>? JobTemplateData { get; set; }

        /// <summary>
        /// The KMS key ARN used to encrypt the job template.
        /// </summary>
        [Input("kmsKeyArn")]
        public Input<string>? KmsKeyArn { get; set; }

        /// <summary>
        /// The specified name of the job template.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public JobTemplateState()
        {
        }
        public static new JobTemplateState Empty => new JobTemplateState();
    }
}
