// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppConfig
{
    /// <summary>
    /// Provides an AppConfig Configuration Profile resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.AppConfig.ConfigurationProfile("example", new()
    ///     {
    ///         ApplicationId = exampleAwsAppconfigApplication.Id,
    ///         Description = "Example Configuration Profile",
    ///         Name = "example-configuration-profile-tf",
    ///         LocationUri = "hosted",
    ///         Validators = new[]
    ///         {
    ///             new Aws.AppConfig.Inputs.ConfigurationProfileValidatorArgs
    ///             {
    ///                 Content = exampleAwsLambdaFunction.Arn,
    ///                 Type = "LAMBDA",
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Type", "AppConfig Configuration Profile" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import AppConfig Configuration Profiles using the configuration profile ID and application ID separated by a colon (`:`). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:appconfig/configurationProfile:ConfigurationProfile example 71abcde:11xxxxx
    /// ```
    /// </summary>
    [AwsResourceType("aws:appconfig/configurationProfile:ConfigurationProfile")]
    public partial class ConfigurationProfile : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Application ID. Must be between 4 and 7 characters in length.
        /// </summary>
        [Output("applicationId")]
        public Output<string> ApplicationId { get; private set; } = null!;

        /// <summary>
        /// ARN of the AppConfig Configuration Profile.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The configuration profile ID.
        /// </summary>
        [Output("configurationProfileId")]
        public Output<string> ConfigurationProfileId { get; private set; } = null!;

        /// <summary>
        /// Description of the configuration profile. Can be at most 1024 characters.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The identifier for an Key Management Service key to encrypt new configuration data versions in the AppConfig hosted configuration store. This attribute is only used for hosted configuration types. The identifier can be an KMS key ID, alias, or the Amazon Resource Name (ARN) of the key ID or alias.
        /// </summary>
        [Output("kmsKeyIdentifier")]
        public Output<string?> KmsKeyIdentifier { get; private set; } = null!;

        /// <summary>
        /// URI to locate the configuration. You can specify the AWS AppConfig hosted configuration store, Systems Manager (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object. For the hosted configuration store, specify `hosted`. For an SSM document, specify either the document name in the format `ssm-document://&lt;Document_name&gt;` or the ARN. For a parameter, specify either the parameter name in the format `ssm-parameter://&lt;Parameter_name&gt;` or the ARN. For an Amazon S3 object, specify the URI in the following format: `s3://&lt;bucket&gt;/&lt;objectKey&gt;`.
        /// </summary>
        [Output("locationUri")]
        public Output<string> LocationUri { get; private set; } = null!;

        /// <summary>
        /// Name for the configuration profile. Must be between 1 and 64 characters in length.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// ARN of an IAM role with permission to access the configuration at the specified `location_uri`. A retrieval role ARN is not required for configurations stored in the AWS AppConfig `hosted` configuration store. It is required for all other sources that store your configuration.
        /// </summary>
        [Output("retrievalRoleArn")]
        public Output<string?> RetrievalRoleArn { get; private set; } = null!;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Type of configurations contained in the profile. Valid values: `AWS.AppConfig.FeatureFlags` and `AWS.Freeform`.  Default: `AWS.Freeform`.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        /// <summary>
        /// Set of methods for validating the configuration. Maximum of 2. See Validator below for more details.
        /// </summary>
        [Output("validators")]
        public Output<ImmutableArray<Outputs.ConfigurationProfileValidator>> Validators { get; private set; } = null!;


        /// <summary>
        /// Create a ConfigurationProfile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConfigurationProfile(string name, ConfigurationProfileArgs args, CustomResourceOptions? options = null)
            : base("aws:appconfig/configurationProfile:ConfigurationProfile", name, args ?? new ConfigurationProfileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConfigurationProfile(string name, Input<string> id, ConfigurationProfileState? state = null, CustomResourceOptions? options = null)
            : base("aws:appconfig/configurationProfile:ConfigurationProfile", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ConfigurationProfile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConfigurationProfile Get(string name, Input<string> id, ConfigurationProfileState? state = null, CustomResourceOptions? options = null)
        {
            return new ConfigurationProfile(name, id, state, options);
        }
    }

    public sealed class ConfigurationProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Application ID. Must be between 4 and 7 characters in length.
        /// </summary>
        [Input("applicationId", required: true)]
        public Input<string> ApplicationId { get; set; } = null!;

        /// <summary>
        /// Description of the configuration profile. Can be at most 1024 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The identifier for an Key Management Service key to encrypt new configuration data versions in the AppConfig hosted configuration store. This attribute is only used for hosted configuration types. The identifier can be an KMS key ID, alias, or the Amazon Resource Name (ARN) of the key ID or alias.
        /// </summary>
        [Input("kmsKeyIdentifier")]
        public Input<string>? KmsKeyIdentifier { get; set; }

        /// <summary>
        /// URI to locate the configuration. You can specify the AWS AppConfig hosted configuration store, Systems Manager (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object. For the hosted configuration store, specify `hosted`. For an SSM document, specify either the document name in the format `ssm-document://&lt;Document_name&gt;` or the ARN. For a parameter, specify either the parameter name in the format `ssm-parameter://&lt;Parameter_name&gt;` or the ARN. For an Amazon S3 object, specify the URI in the following format: `s3://&lt;bucket&gt;/&lt;objectKey&gt;`.
        /// </summary>
        [Input("locationUri", required: true)]
        public Input<string> LocationUri { get; set; } = null!;

        /// <summary>
        /// Name for the configuration profile. Must be between 1 and 64 characters in length.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ARN of an IAM role with permission to access the configuration at the specified `location_uri`. A retrieval role ARN is not required for configurations stored in the AWS AppConfig `hosted` configuration store. It is required for all other sources that store your configuration.
        /// </summary>
        [Input("retrievalRoleArn")]
        public Input<string>? RetrievalRoleArn { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Type of configurations contained in the profile. Valid values: `AWS.AppConfig.FeatureFlags` and `AWS.Freeform`.  Default: `AWS.Freeform`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("validators")]
        private InputList<Inputs.ConfigurationProfileValidatorArgs>? _validators;

        /// <summary>
        /// Set of methods for validating the configuration. Maximum of 2. See Validator below for more details.
        /// </summary>
        public InputList<Inputs.ConfigurationProfileValidatorArgs> Validators
        {
            get => _validators ?? (_validators = new InputList<Inputs.ConfigurationProfileValidatorArgs>());
            set => _validators = value;
        }

        public ConfigurationProfileArgs()
        {
        }
        public static new ConfigurationProfileArgs Empty => new ConfigurationProfileArgs();
    }

    public sealed class ConfigurationProfileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Application ID. Must be between 4 and 7 characters in length.
        /// </summary>
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        /// <summary>
        /// ARN of the AppConfig Configuration Profile.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The configuration profile ID.
        /// </summary>
        [Input("configurationProfileId")]
        public Input<string>? ConfigurationProfileId { get; set; }

        /// <summary>
        /// Description of the configuration profile. Can be at most 1024 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The identifier for an Key Management Service key to encrypt new configuration data versions in the AppConfig hosted configuration store. This attribute is only used for hosted configuration types. The identifier can be an KMS key ID, alias, or the Amazon Resource Name (ARN) of the key ID or alias.
        /// </summary>
        [Input("kmsKeyIdentifier")]
        public Input<string>? KmsKeyIdentifier { get; set; }

        /// <summary>
        /// URI to locate the configuration. You can specify the AWS AppConfig hosted configuration store, Systems Manager (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object. For the hosted configuration store, specify `hosted`. For an SSM document, specify either the document name in the format `ssm-document://&lt;Document_name&gt;` or the ARN. For a parameter, specify either the parameter name in the format `ssm-parameter://&lt;Parameter_name&gt;` or the ARN. For an Amazon S3 object, specify the URI in the following format: `s3://&lt;bucket&gt;/&lt;objectKey&gt;`.
        /// </summary>
        [Input("locationUri")]
        public Input<string>? LocationUri { get; set; }

        /// <summary>
        /// Name for the configuration profile. Must be between 1 and 64 characters in length.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ARN of an IAM role with permission to access the configuration at the specified `location_uri`. A retrieval role ARN is not required for configurations stored in the AWS AppConfig `hosted` configuration store. It is required for all other sources that store your configuration.
        /// </summary>
        [Input("retrievalRoleArn")]
        public Input<string>? RetrievalRoleArn { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        /// Type of configurations contained in the profile. Valid values: `AWS.AppConfig.FeatureFlags` and `AWS.Freeform`.  Default: `AWS.Freeform`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("validators")]
        private InputList<Inputs.ConfigurationProfileValidatorGetArgs>? _validators;

        /// <summary>
        /// Set of methods for validating the configuration. Maximum of 2. See Validator below for more details.
        /// </summary>
        public InputList<Inputs.ConfigurationProfileValidatorGetArgs> Validators
        {
            get => _validators ?? (_validators = new InputList<Inputs.ConfigurationProfileValidatorGetArgs>());
            set => _validators = value;
        }

        public ConfigurationProfileState()
        {
        }
        public static new ConfigurationProfileState Empty => new ConfigurationProfileState();
    }
}
