// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Comprehend
{
    /// <summary>
    /// Resource for managing an AWS Comprehend Entity Recognizer.
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
    ///     var documents = new Aws.S3.BucketObjectv2("documents");
    /// 
    ///     // ...
    ///     var entities = new Aws.S3.BucketObjectv2("entities");
    /// 
    ///     // ...
    ///     var example = new Aws.Comprehend.EntityRecognizer("example", new()
    ///     {
    ///         DataAccessRoleArn = aws_iam_role.Example.Arn,
    ///         LanguageCode = "en",
    ///         InputDataConfig = new Aws.Comprehend.Inputs.EntityRecognizerInputDataConfigArgs
    ///         {
    ///             EntityTypes = new[]
    ///             {
    ///                 new Aws.Comprehend.Inputs.EntityRecognizerInputDataConfigEntityTypeArgs
    ///                 {
    ///                     Type = "ENTITY_1",
    ///                 },
    ///                 new Aws.Comprehend.Inputs.EntityRecognizerInputDataConfigEntityTypeArgs
    ///                 {
    ///                     Type = "ENTITY_2",
    ///                 },
    ///             },
    ///             Documents = new Aws.Comprehend.Inputs.EntityRecognizerInputDataConfigDocumentsArgs
    ///             {
    ///                 S3Uri = documents.Id.Apply(id =&gt; $"s3://{aws_s3_bucket.Documents.Bucket}/{id}"),
    ///             },
    ///             EntityList = new Aws.Comprehend.Inputs.EntityRecognizerInputDataConfigEntityListArgs
    ///             {
    ///                 S3Uri = entities.Id.Apply(id =&gt; $"s3://{aws_s3_bucket.Entities.Bucket}/{id}"),
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             aws_iam_role_policy.Example,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Comprehend Entity Recognizer using the ARN. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:comprehend/entityRecognizer:EntityRecognizer example arn:aws:comprehend:us-west-2:123456789012:entity-recognizer/example
    /// ```
    /// </summary>
    [AwsResourceType("aws:comprehend/entityRecognizer:EntityRecognizer")]
    public partial class EntityRecognizer : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the Entity Recognizer version.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The ARN for an IAM Role which allows Comprehend to read the training and testing data.
        /// </summary>
        [Output("dataAccessRoleArn")]
        public Output<string> DataAccessRoleArn { get; private set; } = null!;

        /// <summary>
        /// Configuration for the training and testing data.
        /// See the `input_data_config` Configuration Block section below.
        /// </summary>
        [Output("inputDataConfig")]
        public Output<Outputs.EntityRecognizerInputDataConfig> InputDataConfig { get; private set; } = null!;

        /// <summary>
        /// Two-letter language code for the language.
        /// One of `en`, `es`, `fr`, `it`, `de`, or `pt`.
        /// </summary>
        [Output("languageCode")]
        public Output<string> LanguageCode { get; private set; } = null!;

        /// <summary>
        /// The ID or ARN of a KMS Key used to encrypt trained Entity Recognizers.
        /// </summary>
        [Output("modelKmsKeyId")]
        public Output<string?> ModelKmsKeyId { get; private set; } = null!;

        /// <summary>
        /// Name for the Entity Recognizer.
        /// Has a maximum length of 63 characters.
        /// Can contain upper- and lower-case letters, numbers, and hypen (`-`).
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` Configuration Block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Name for the version of the Entity Recognizer.
        /// Each version must have a unique name within the Entity Recognizer.
        /// If omitted, the provider will assign a random, unique version name.
        /// If explicitly set to `""`, no version name will be set.
        /// Has a maximum length of 63 characters.
        /// Can contain upper- and lower-case letters, numbers, and hypen (`-`).
        /// Conflicts with `version_name_prefix`.
        /// </summary>
        [Output("versionName")]
        public Output<string> VersionName { get; private set; } = null!;

        /// <summary>
        /// Creates a unique version name beginning with the specified prefix.
        /// Has a maximum length of 37 characters.
        /// Can contain upper- and lower-case letters, numbers, and hypen (`-`).
        /// Conflicts with `version_name`.
        /// </summary>
        [Output("versionNamePrefix")]
        public Output<string> VersionNamePrefix { get; private set; } = null!;

        /// <summary>
        /// ID or ARN of a KMS Key used to encrypt storage volumes during job processing.
        /// </summary>
        [Output("volumeKmsKeyId")]
        public Output<string?> VolumeKmsKeyId { get; private set; } = null!;

        /// <summary>
        /// Configuration parameters for VPC to contain Entity Recognizer resources.
        /// See the `vpc_config` Configuration Block section below.
        /// </summary>
        [Output("vpcConfig")]
        public Output<Outputs.EntityRecognizerVpcConfig?> VpcConfig { get; private set; } = null!;


        /// <summary>
        /// Create a EntityRecognizer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EntityRecognizer(string name, EntityRecognizerArgs args, CustomResourceOptions? options = null)
            : base("aws:comprehend/entityRecognizer:EntityRecognizer", name, args ?? new EntityRecognizerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EntityRecognizer(string name, Input<string> id, EntityRecognizerState? state = null, CustomResourceOptions? options = null)
            : base("aws:comprehend/entityRecognizer:EntityRecognizer", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EntityRecognizer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EntityRecognizer Get(string name, Input<string> id, EntityRecognizerState? state = null, CustomResourceOptions? options = null)
        {
            return new EntityRecognizer(name, id, state, options);
        }
    }

    public sealed class EntityRecognizerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN for an IAM Role which allows Comprehend to read the training and testing data.
        /// </summary>
        [Input("dataAccessRoleArn", required: true)]
        public Input<string> DataAccessRoleArn { get; set; } = null!;

        /// <summary>
        /// Configuration for the training and testing data.
        /// See the `input_data_config` Configuration Block section below.
        /// </summary>
        [Input("inputDataConfig", required: true)]
        public Input<Inputs.EntityRecognizerInputDataConfigArgs> InputDataConfig { get; set; } = null!;

        /// <summary>
        /// Two-letter language code for the language.
        /// One of `en`, `es`, `fr`, `it`, `de`, or `pt`.
        /// </summary>
        [Input("languageCode", required: true)]
        public Input<string> LanguageCode { get; set; } = null!;

        /// <summary>
        /// The ID or ARN of a KMS Key used to encrypt trained Entity Recognizers.
        /// </summary>
        [Input("modelKmsKeyId")]
        public Input<string>? ModelKmsKeyId { get; set; }

        /// <summary>
        /// Name for the Entity Recognizer.
        /// Has a maximum length of 63 characters.
        /// Can contain upper- and lower-case letters, numbers, and hypen (`-`).
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` Configuration Block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Name for the version of the Entity Recognizer.
        /// Each version must have a unique name within the Entity Recognizer.
        /// If omitted, the provider will assign a random, unique version name.
        /// If explicitly set to `""`, no version name will be set.
        /// Has a maximum length of 63 characters.
        /// Can contain upper- and lower-case letters, numbers, and hypen (`-`).
        /// Conflicts with `version_name_prefix`.
        /// </summary>
        [Input("versionName")]
        public Input<string>? VersionName { get; set; }

        /// <summary>
        /// Creates a unique version name beginning with the specified prefix.
        /// Has a maximum length of 37 characters.
        /// Can contain upper- and lower-case letters, numbers, and hypen (`-`).
        /// Conflicts with `version_name`.
        /// </summary>
        [Input("versionNamePrefix")]
        public Input<string>? VersionNamePrefix { get; set; }

        /// <summary>
        /// ID or ARN of a KMS Key used to encrypt storage volumes during job processing.
        /// </summary>
        [Input("volumeKmsKeyId")]
        public Input<string>? VolumeKmsKeyId { get; set; }

        /// <summary>
        /// Configuration parameters for VPC to contain Entity Recognizer resources.
        /// See the `vpc_config` Configuration Block section below.
        /// </summary>
        [Input("vpcConfig")]
        public Input<Inputs.EntityRecognizerVpcConfigArgs>? VpcConfig { get; set; }

        public EntityRecognizerArgs()
        {
        }
        public static new EntityRecognizerArgs Empty => new EntityRecognizerArgs();
    }

    public sealed class EntityRecognizerState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the Entity Recognizer version.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The ARN for an IAM Role which allows Comprehend to read the training and testing data.
        /// </summary>
        [Input("dataAccessRoleArn")]
        public Input<string>? DataAccessRoleArn { get; set; }

        /// <summary>
        /// Configuration for the training and testing data.
        /// See the `input_data_config` Configuration Block section below.
        /// </summary>
        [Input("inputDataConfig")]
        public Input<Inputs.EntityRecognizerInputDataConfigGetArgs>? InputDataConfig { get; set; }

        /// <summary>
        /// Two-letter language code for the language.
        /// One of `en`, `es`, `fr`, `it`, `de`, or `pt`.
        /// </summary>
        [Input("languageCode")]
        public Input<string>? LanguageCode { get; set; }

        /// <summary>
        /// The ID or ARN of a KMS Key used to encrypt trained Entity Recognizers.
        /// </summary>
        [Input("modelKmsKeyId")]
        public Input<string>? ModelKmsKeyId { get; set; }

        /// <summary>
        /// Name for the Entity Recognizer.
        /// Has a maximum length of 63 characters.
        /// Can contain upper- and lower-case letters, numbers, and hypen (`-`).
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` Configuration Block present, tags with matching keys will overwrite those defined at the provider-level.
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
        /// Name for the version of the Entity Recognizer.
        /// Each version must have a unique name within the Entity Recognizer.
        /// If omitted, the provider will assign a random, unique version name.
        /// If explicitly set to `""`, no version name will be set.
        /// Has a maximum length of 63 characters.
        /// Can contain upper- and lower-case letters, numbers, and hypen (`-`).
        /// Conflicts with `version_name_prefix`.
        /// </summary>
        [Input("versionName")]
        public Input<string>? VersionName { get; set; }

        /// <summary>
        /// Creates a unique version name beginning with the specified prefix.
        /// Has a maximum length of 37 characters.
        /// Can contain upper- and lower-case letters, numbers, and hypen (`-`).
        /// Conflicts with `version_name`.
        /// </summary>
        [Input("versionNamePrefix")]
        public Input<string>? VersionNamePrefix { get; set; }

        /// <summary>
        /// ID or ARN of a KMS Key used to encrypt storage volumes during job processing.
        /// </summary>
        [Input("volumeKmsKeyId")]
        public Input<string>? VolumeKmsKeyId { get; set; }

        /// <summary>
        /// Configuration parameters for VPC to contain Entity Recognizer resources.
        /// See the `vpc_config` Configuration Block section below.
        /// </summary>
        [Input("vpcConfig")]
        public Input<Inputs.EntityRecognizerVpcConfigGetArgs>? VpcConfig { get; set; }

        public EntityRecognizerState()
        {
        }
        public static new EntityRecognizerState Empty => new EntityRecognizerState();
    }
}
