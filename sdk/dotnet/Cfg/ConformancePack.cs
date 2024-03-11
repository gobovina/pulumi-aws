// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Cfg
{
    /// <summary>
    /// Manages a Config Conformance Pack. More information about this collection of Config rules and remediation actions can be found in the
    /// [Conformance Packs](https://docs.aws.amazon.com/config/latest/developerguide/conformance-packs.html) documentation.
    /// Sample Conformance Pack templates may be found in the
    /// [AWS Config Rules Repository](https://github.com/awslabs/aws-config-rules/tree/master/aws-config-conformance-packs).
    /// 
    /// &gt; **NOTE:** The account must have a Configuration Recorder with proper IAM permissions before the Conformance Pack will
    /// successfully create or update. See also the
    /// `aws.cfg.Recorder` resource.
    /// 
    /// ## Example Usage
    /// 
    /// ### Template Body
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
    ///     var example = new Aws.Cfg.ConformancePack("example", new()
    ///     {
    ///         Name = "example",
    ///         InputParameters = new[]
    ///         {
    ///             new Aws.Cfg.Inputs.ConformancePackInputParameterArgs
    ///             {
    ///                 ParameterName = "AccessKeysRotatedParameterMaxAccessKeyAge",
    ///                 ParameterValue = "90",
    ///             },
    ///         },
    ///         TemplateBody = @"Parameters:
    ///   AccessKeysRotatedParameterMaxAccessKeyAge:
    ///     Type: String
    /// Resources:
    ///   IAMPasswordPolicy:
    ///     Properties:
    ///       ConfigRuleName: IAMPasswordPolicy
    ///       Source:
    ///         Owner: AWS
    ///         SourceIdentifier: IAM_PASSWORD_POLICY
    ///     Type: AWS::Config::ConfigRule
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Template S3 URI
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
    ///     var exampleBucketV2 = new Aws.S3.BucketV2("example", new()
    ///     {
    ///         Bucket = "example",
    ///     });
    /// 
    ///     var exampleBucketObjectv2 = new Aws.S3.BucketObjectv2("example", new()
    ///     {
    ///         Bucket = exampleBucketV2.Id,
    ///         Key = "example-key",
    ///         Content = @"Resources:
    ///   IAMPasswordPolicy:
    ///     Properties:
    ///       ConfigRuleName: IAMPasswordPolicy
    ///       Source:
    ///         Owner: AWS
    ///         SourceIdentifier: IAM_PASSWORD_POLICY
    ///     Type: AWS::Config::ConfigRule
    /// ",
    ///     });
    /// 
    ///     var example = new Aws.Cfg.ConformancePack("example", new()
    ///     {
    ///         Name = "example",
    ///         TemplateS3Uri = Output.Tuple(exampleBucketV2.Bucket, exampleBucketObjectv2.Key).Apply(values =&gt;
    ///         {
    ///             var bucket = values.Item1;
    ///             var key = values.Item2;
    ///             return $"s3://{bucket}/{key}";
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Config Conformance Packs using the `name`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:cfg/conformancePack:ConformancePack example example
    /// ```
    /// </summary>
    [AwsResourceType("aws:cfg/conformancePack:ConformancePack")]
    public partial class ConformancePack : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the conformance pack.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Amazon S3 bucket where AWS Config stores conformance pack templates. Maximum length of 63.
        /// </summary>
        [Output("deliveryS3Bucket")]
        public Output<string?> DeliveryS3Bucket { get; private set; } = null!;

        /// <summary>
        /// The prefix for the Amazon S3 bucket. Maximum length of 1024.
        /// </summary>
        [Output("deliveryS3KeyPrefix")]
        public Output<string?> DeliveryS3KeyPrefix { get; private set; } = null!;

        /// <summary>
        /// Set of configuration blocks describing input parameters passed to the conformance pack template. Documented below. When configured, the parameters must also be included in the `template_body` or in the template stored in Amazon S3 if using `template_s3_uri`.
        /// </summary>
        [Output("inputParameters")]
        public Output<ImmutableArray<Outputs.ConformancePackInputParameter>> InputParameters { get; private set; } = null!;

        /// <summary>
        /// The name of the conformance pack. Must begin with a letter and contain from 1 to 256 alphanumeric characters and hyphens.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A string containing full conformance pack template body. Maximum length of 51200. Drift detection is not possible with this argument.
        /// </summary>
        [Output("templateBody")]
        public Output<string?> TemplateBody { get; private set; } = null!;

        /// <summary>
        /// Location of file, e.g., `s3://bucketname/prefix`, containing the template body. The uri must point to the conformance pack template that is located in an Amazon S3 bucket in the same region as the conformance pack. Maximum length of 1024. Drift detection is not possible with this argument.
        /// </summary>
        [Output("templateS3Uri")]
        public Output<string?> TemplateS3Uri { get; private set; } = null!;


        /// <summary>
        /// Create a ConformancePack resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConformancePack(string name, ConformancePackArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:cfg/conformancePack:ConformancePack", name, args ?? new ConformancePackArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConformancePack(string name, Input<string> id, ConformancePackState? state = null, CustomResourceOptions? options = null)
            : base("aws:cfg/conformancePack:ConformancePack", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ConformancePack resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConformancePack Get(string name, Input<string> id, ConformancePackState? state = null, CustomResourceOptions? options = null)
        {
            return new ConformancePack(name, id, state, options);
        }
    }

    public sealed class ConformancePackArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon S3 bucket where AWS Config stores conformance pack templates. Maximum length of 63.
        /// </summary>
        [Input("deliveryS3Bucket")]
        public Input<string>? DeliveryS3Bucket { get; set; }

        /// <summary>
        /// The prefix for the Amazon S3 bucket. Maximum length of 1024.
        /// </summary>
        [Input("deliveryS3KeyPrefix")]
        public Input<string>? DeliveryS3KeyPrefix { get; set; }

        [Input("inputParameters")]
        private InputList<Inputs.ConformancePackInputParameterArgs>? _inputParameters;

        /// <summary>
        /// Set of configuration blocks describing input parameters passed to the conformance pack template. Documented below. When configured, the parameters must also be included in the `template_body` or in the template stored in Amazon S3 if using `template_s3_uri`.
        /// </summary>
        public InputList<Inputs.ConformancePackInputParameterArgs> InputParameters
        {
            get => _inputParameters ?? (_inputParameters = new InputList<Inputs.ConformancePackInputParameterArgs>());
            set => _inputParameters = value;
        }

        /// <summary>
        /// The name of the conformance pack. Must begin with a letter and contain from 1 to 256 alphanumeric characters and hyphens.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A string containing full conformance pack template body. Maximum length of 51200. Drift detection is not possible with this argument.
        /// </summary>
        [Input("templateBody")]
        public Input<string>? TemplateBody { get; set; }

        /// <summary>
        /// Location of file, e.g., `s3://bucketname/prefix`, containing the template body. The uri must point to the conformance pack template that is located in an Amazon S3 bucket in the same region as the conformance pack. Maximum length of 1024. Drift detection is not possible with this argument.
        /// </summary>
        [Input("templateS3Uri")]
        public Input<string>? TemplateS3Uri { get; set; }

        public ConformancePackArgs()
        {
        }
        public static new ConformancePackArgs Empty => new ConformancePackArgs();
    }

    public sealed class ConformancePackState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the conformance pack.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Amazon S3 bucket where AWS Config stores conformance pack templates. Maximum length of 63.
        /// </summary>
        [Input("deliveryS3Bucket")]
        public Input<string>? DeliveryS3Bucket { get; set; }

        /// <summary>
        /// The prefix for the Amazon S3 bucket. Maximum length of 1024.
        /// </summary>
        [Input("deliveryS3KeyPrefix")]
        public Input<string>? DeliveryS3KeyPrefix { get; set; }

        [Input("inputParameters")]
        private InputList<Inputs.ConformancePackInputParameterGetArgs>? _inputParameters;

        /// <summary>
        /// Set of configuration blocks describing input parameters passed to the conformance pack template. Documented below. When configured, the parameters must also be included in the `template_body` or in the template stored in Amazon S3 if using `template_s3_uri`.
        /// </summary>
        public InputList<Inputs.ConformancePackInputParameterGetArgs> InputParameters
        {
            get => _inputParameters ?? (_inputParameters = new InputList<Inputs.ConformancePackInputParameterGetArgs>());
            set => _inputParameters = value;
        }

        /// <summary>
        /// The name of the conformance pack. Must begin with a letter and contain from 1 to 256 alphanumeric characters and hyphens.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A string containing full conformance pack template body. Maximum length of 51200. Drift detection is not possible with this argument.
        /// </summary>
        [Input("templateBody")]
        public Input<string>? TemplateBody { get; set; }

        /// <summary>
        /// Location of file, e.g., `s3://bucketname/prefix`, containing the template body. The uri must point to the conformance pack template that is located in an Amazon S3 bucket in the same region as the conformance pack. Maximum length of 1024. Drift detection is not possible with this argument.
        /// </summary>
        [Input("templateS3Uri")]
        public Input<string>? TemplateS3Uri { get; set; }

        public ConformancePackState()
        {
        }
        public static new ConformancePackState Empty => new ConformancePackState();
    }
}
