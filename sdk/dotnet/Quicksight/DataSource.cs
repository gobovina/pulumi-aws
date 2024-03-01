// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Quicksight
{
    /// <summary>
    /// Resource for managing QuickSight Data Source
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
    ///     var @default = new Aws.Quicksight.DataSource("default", new()
    ///     {
    ///         DataSourceId = "example-id",
    ///         Name = "My Cool Data in S3",
    ///         Parameters = new Aws.Quicksight.Inputs.DataSourceParametersArgs
    ///         {
    ///             S3 = new Aws.Quicksight.Inputs.DataSourceParametersS3Args
    ///             {
    ///                 ManifestFileLocation = new Aws.Quicksight.Inputs.DataSourceParametersS3ManifestFileLocationArgs
    ///                 {
    ///                     Bucket = "my-bucket",
    ///                     Key = "path/to/manifest.json",
    ///                 },
    ///             },
    ///         },
    ///         Type = "S3",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import a QuickSight data source using the AWS account ID, and data source ID separated by a slash (`/`). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:quicksight/dataSource:DataSource example 123456789123/my-data-source-id
    /// ```
    /// </summary>
    [AwsResourceType("aws:quicksight/dataSource:DataSource")]
    public partial class DataSource : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the data source
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The ID for the AWS account that the data source is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
        /// </summary>
        [Output("awsAccountId")]
        public Output<string> AwsAccountId { get; private set; } = null!;

        /// <summary>
        /// The credentials Amazon QuickSight uses to connect to your underlying source. Currently, only credentials based on user name and password are supported. See Credentials below for more details.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.DataSourceCredentials?> Credentials { get; private set; } = null!;

        /// <summary>
        /// An identifier for the data source.
        /// </summary>
        [Output("dataSourceId")]
        public Output<string> DataSourceId { get; private set; } = null!;

        /// <summary>
        /// A name for the data source, maximum of 128 characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The parameters used to connect to this data source (exactly one).
        /// </summary>
        [Output("parameters")]
        public Output<Outputs.DataSourceParameters> Parameters { get; private set; } = null!;

        /// <summary>
        /// A set of resource permissions on the data source. Maximum of 64 items. See Permission below for more details.
        /// </summary>
        [Output("permissions")]
        public Output<ImmutableArray<Outputs.DataSourcePermission>> Permissions { get; private set; } = null!;

        /// <summary>
        /// Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your underlying source. See SSL Properties below for more details.
        /// </summary>
        [Output("sslProperties")]
        public Output<Outputs.DataSourceSslProperties?> SslProperties { get; private set; } = null!;

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
        /// The type of the data source. See the [AWS Documentation](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CreateDataSource.html#QS-CreateDataSource-request-Type) for the complete list of valid values.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting to your underlying source. See VPC Connection Properties below for more details.
        /// </summary>
        [Output("vpcConnectionProperties")]
        public Output<Outputs.DataSourceVpcConnectionProperties?> VpcConnectionProperties { get; private set; } = null!;


        /// <summary>
        /// Create a DataSource resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DataSource(string name, DataSourceArgs args, CustomResourceOptions? options = null)
            : base("aws:quicksight/dataSource:DataSource", name, args ?? new DataSourceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DataSource(string name, Input<string> id, DataSourceState? state = null, CustomResourceOptions? options = null)
            : base("aws:quicksight/dataSource:DataSource", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DataSource resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DataSource Get(string name, Input<string> id, DataSourceState? state = null, CustomResourceOptions? options = null)
        {
            return new DataSource(name, id, state, options);
        }
    }

    public sealed class DataSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID for the AWS account that the data source is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
        /// </summary>
        [Input("awsAccountId")]
        public Input<string>? AwsAccountId { get; set; }

        /// <summary>
        /// The credentials Amazon QuickSight uses to connect to your underlying source. Currently, only credentials based on user name and password are supported. See Credentials below for more details.
        /// </summary>
        [Input("credentials")]
        public Input<Inputs.DataSourceCredentialsArgs>? Credentials { get; set; }

        /// <summary>
        /// An identifier for the data source.
        /// </summary>
        [Input("dataSourceId", required: true)]
        public Input<string> DataSourceId { get; set; } = null!;

        /// <summary>
        /// A name for the data source, maximum of 128 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The parameters used to connect to this data source (exactly one).
        /// </summary>
        [Input("parameters", required: true)]
        public Input<Inputs.DataSourceParametersArgs> Parameters { get; set; } = null!;

        [Input("permissions")]
        private InputList<Inputs.DataSourcePermissionArgs>? _permissions;

        /// <summary>
        /// A set of resource permissions on the data source. Maximum of 64 items. See Permission below for more details.
        /// </summary>
        public InputList<Inputs.DataSourcePermissionArgs> Permissions
        {
            get => _permissions ?? (_permissions = new InputList<Inputs.DataSourcePermissionArgs>());
            set => _permissions = value;
        }

        /// <summary>
        /// Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your underlying source. See SSL Properties below for more details.
        /// </summary>
        [Input("sslProperties")]
        public Input<Inputs.DataSourceSslPropertiesArgs>? SslProperties { get; set; }

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

        /// <summary>
        /// The type of the data source. See the [AWS Documentation](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CreateDataSource.html#QS-CreateDataSource-request-Type) for the complete list of valid values.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting to your underlying source. See VPC Connection Properties below for more details.
        /// </summary>
        [Input("vpcConnectionProperties")]
        public Input<Inputs.DataSourceVpcConnectionPropertiesArgs>? VpcConnectionProperties { get; set; }

        public DataSourceArgs()
        {
        }
        public static new DataSourceArgs Empty => new DataSourceArgs();
    }

    public sealed class DataSourceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the data source
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The ID for the AWS account that the data source is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
        /// </summary>
        [Input("awsAccountId")]
        public Input<string>? AwsAccountId { get; set; }

        /// <summary>
        /// The credentials Amazon QuickSight uses to connect to your underlying source. Currently, only credentials based on user name and password are supported. See Credentials below for more details.
        /// </summary>
        [Input("credentials")]
        public Input<Inputs.DataSourceCredentialsGetArgs>? Credentials { get; set; }

        /// <summary>
        /// An identifier for the data source.
        /// </summary>
        [Input("dataSourceId")]
        public Input<string>? DataSourceId { get; set; }

        /// <summary>
        /// A name for the data source, maximum of 128 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The parameters used to connect to this data source (exactly one).
        /// </summary>
        [Input("parameters")]
        public Input<Inputs.DataSourceParametersGetArgs>? Parameters { get; set; }

        [Input("permissions")]
        private InputList<Inputs.DataSourcePermissionGetArgs>? _permissions;

        /// <summary>
        /// A set of resource permissions on the data source. Maximum of 64 items. See Permission below for more details.
        /// </summary>
        public InputList<Inputs.DataSourcePermissionGetArgs> Permissions
        {
            get => _permissions ?? (_permissions = new InputList<Inputs.DataSourcePermissionGetArgs>());
            set => _permissions = value;
        }

        /// <summary>
        /// Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your underlying source. See SSL Properties below for more details.
        /// </summary>
        [Input("sslProperties")]
        public Input<Inputs.DataSourceSslPropertiesGetArgs>? SslProperties { get; set; }

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
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The type of the data source. See the [AWS Documentation](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CreateDataSource.html#QS-CreateDataSource-request-Type) for the complete list of valid values.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting to your underlying source. See VPC Connection Properties below for more details.
        /// </summary>
        [Input("vpcConnectionProperties")]
        public Input<Inputs.DataSourceVpcConnectionPropertiesGetArgs>? VpcConnectionProperties { get; set; }

        public DataSourceState()
        {
        }
        public static new DataSourceState Empty => new DataSourceState();
    }
}
