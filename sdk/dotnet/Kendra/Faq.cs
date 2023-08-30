// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kendra
{
    /// <summary>
    /// Resource for managing an AWS Kendra FAQ.
    /// 
    /// ## Example Usage
    /// ### Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Kendra.Faq("example", new()
    ///     {
    ///         IndexId = aws_kendra_index.Example.Id,
    ///         RoleArn = aws_iam_role.Example.Arn,
    ///         S3Path = new Aws.Kendra.Inputs.FaqS3PathArgs
    ///         {
    ///             Bucket = aws_s3_bucket.Example.Id,
    ///             Key = aws_s3_object.Example.Key,
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Name", "Example Kendra Faq" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### With File Format
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Kendra.Faq("example", new()
    ///     {
    ///         IndexId = aws_kendra_index.Example.Id,
    ///         FileFormat = "CSV",
    ///         RoleArn = aws_iam_role.Example.Arn,
    ///         S3Path = new Aws.Kendra.Inputs.FaqS3PathArgs
    ///         {
    ///             Bucket = aws_s3_bucket.Example.Id,
    ///             Key = aws_s3_object.Example.Key,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### With Language Code
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Kendra.Faq("example", new()
    ///     {
    ///         IndexId = aws_kendra_index.Example.Id,
    ///         LanguageCode = "en",
    ///         RoleArn = aws_iam_role.Example.Arn,
    ///         S3Path = new Aws.Kendra.Inputs.FaqS3PathArgs
    ///         {
    ///             Bucket = aws_s3_bucket.Example.Id,
    ///             Key = aws_s3_object.Example.Key,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_kendra_faq` using the unique identifiers of the FAQ and index separated by a slash (`/`). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:kendra/faq:Faq example faq-123456780/idx-8012925589
    /// ```
    /// </summary>
    [AwsResourceType("aws:kendra/faq:Faq")]
    public partial class Faq : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the FAQ.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The Unix datetime that the FAQ was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// The description for a FAQ.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// When the Status field value is `FAILED`, this contains a message that explains why.
        /// </summary>
        [Output("errorMessage")]
        public Output<string> ErrorMessage { get; private set; } = null!;

        /// <summary>
        /// The identifier of the FAQ.
        /// </summary>
        [Output("faqId")]
        public Output<string> FaqId { get; private set; } = null!;

        /// <summary>
        /// The file format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
        /// </summary>
        [Output("fileFormat")]
        public Output<string?> FileFormat { get; private set; } = null!;

        /// <summary>
        /// The identifier of the index for a FAQ.
        /// </summary>
        [Output("indexId")]
        public Output<string> IndexId { get; private set; } = null!;

        /// <summary>
        /// The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
        /// </summary>
        [Output("languageCode")]
        public Output<string> LanguageCode { get; private set; } = null!;

        /// <summary>
        /// The name that should be associated with the FAQ.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
        /// </summary>
        [Output("roleArn")]
        public Output<string> RoleArn { get; private set; } = null!;

        /// <summary>
        /// The S3 location of the FAQ input data. Detailed below.
        /// 
        /// The `s3_path` configuration block supports the following arguments:
        /// </summary>
        [Output("s3Path")]
        public Output<Outputs.FaqS3Path> S3Path { get; private set; } = null!;

        /// <summary>
        /// The status of the FAQ. It is ready to use when the status is ACTIVE.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The date and time that the FAQ was last updated.
        /// </summary>
        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;


        /// <summary>
        /// Create a Faq resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Faq(string name, FaqArgs args, CustomResourceOptions? options = null)
            : base("aws:kendra/faq:Faq", name, args ?? new FaqArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Faq(string name, Input<string> id, FaqState? state = null, CustomResourceOptions? options = null)
            : base("aws:kendra/faq:Faq", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Faq resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Faq Get(string name, Input<string> id, FaqState? state = null, CustomResourceOptions? options = null)
        {
            return new Faq(name, id, state, options);
        }
    }

    public sealed class FaqArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description for a FAQ.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The file format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
        /// </summary>
        [Input("fileFormat")]
        public Input<string>? FileFormat { get; set; }

        /// <summary>
        /// The identifier of the index for a FAQ.
        /// </summary>
        [Input("indexId", required: true)]
        public Input<string> IndexId { get; set; } = null!;

        /// <summary>
        /// The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
        /// </summary>
        [Input("languageCode")]
        public Input<string>? LanguageCode { get; set; }

        /// <summary>
        /// The name that should be associated with the FAQ.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
        /// </summary>
        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        /// <summary>
        /// The S3 location of the FAQ input data. Detailed below.
        /// 
        /// The `s3_path` configuration block supports the following arguments:
        /// </summary>
        [Input("s3Path", required: true)]
        public Input<Inputs.FaqS3PathArgs> S3Path { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public FaqArgs()
        {
        }
        public static new FaqArgs Empty => new FaqArgs();
    }

    public sealed class FaqState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the FAQ.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The Unix datetime that the FAQ was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// The description for a FAQ.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// When the Status field value is `FAILED`, this contains a message that explains why.
        /// </summary>
        [Input("errorMessage")]
        public Input<string>? ErrorMessage { get; set; }

        /// <summary>
        /// The identifier of the FAQ.
        /// </summary>
        [Input("faqId")]
        public Input<string>? FaqId { get; set; }

        /// <summary>
        /// The file format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
        /// </summary>
        [Input("fileFormat")]
        public Input<string>? FileFormat { get; set; }

        /// <summary>
        /// The identifier of the index for a FAQ.
        /// </summary>
        [Input("indexId")]
        public Input<string>? IndexId { get; set; }

        /// <summary>
        /// The code for a language. This shows a supported language for the FAQ document. English is supported by default. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
        /// </summary>
        [Input("languageCode")]
        public Input<string>? LanguageCode { get; set; }

        /// <summary>
        /// The name that should be associated with the FAQ.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        /// <summary>
        /// The S3 location of the FAQ input data. Detailed below.
        /// 
        /// The `s3_path` configuration block supports the following arguments:
        /// </summary>
        [Input("s3Path")]
        public Input<Inputs.FaqS3PathGetArgs>? S3Path { get; set; }

        /// <summary>
        /// The status of the FAQ. It is ready to use when the status is ACTIVE.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        /// The date and time that the FAQ was last updated.
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        public FaqState()
        {
        }
        public static new FaqState Empty => new FaqState();
    }
}
