// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Fsx
{
    /// <summary>
    /// Manages a FSx for Lustre Data Repository Association. See [Linking your file system to an S3 bucket](https://docs.aws.amazon.com/fsx/latest/LustreGuide/create-dra-linked-data-repo.html) for more information.
    /// 
    /// &gt; **NOTE:** Data Repository Associations are only compatible with AWS FSx for Lustre File Systems and `PERSISTENT_2` deployment type.
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
    ///     var exampleBucketV2 = new Aws.S3.BucketV2("exampleBucketV2");
    /// 
    ///     var exampleBucketAclV2 = new Aws.S3.BucketAclV2("exampleBucketAclV2", new()
    ///     {
    ///         Bucket = exampleBucketV2.Id,
    ///         Acl = "private",
    ///     });
    /// 
    ///     var exampleLustreFileSystem = new Aws.Fsx.LustreFileSystem("exampleLustreFileSystem", new()
    ///     {
    ///         StorageCapacity = 1200,
    ///         SubnetIds = new[]
    ///         {
    ///             aws_subnet.Example.Id,
    ///         },
    ///         DeploymentType = "PERSISTENT_2",
    ///         PerUnitStorageThroughput = 125,
    ///     });
    /// 
    ///     var exampleDataRepositoryAssociation = new Aws.Fsx.DataRepositoryAssociation("exampleDataRepositoryAssociation", new()
    ///     {
    ///         FileSystemId = exampleLustreFileSystem.Id,
    ///         DataRepositoryPath = exampleBucketV2.Id.Apply(id =&gt; $"s3://{id}"),
    ///         FileSystemPath = "/my-bucket",
    ///         S3 = new Aws.Fsx.Inputs.DataRepositoryAssociationS3Args
    ///         {
    ///             AutoExportPolicy = new Aws.Fsx.Inputs.DataRepositoryAssociationS3AutoExportPolicyArgs
    ///             {
    ///                 Events = new[]
    ///                 {
    ///                     "NEW",
    ///                     "CHANGED",
    ///                     "DELETED",
    ///                 },
    ///             },
    ///             AutoImportPolicy = new Aws.Fsx.Inputs.DataRepositoryAssociationS3AutoImportPolicyArgs
    ///             {
    ///                 Events = new[]
    ///                 {
    ///                     "NEW",
    ///                     "CHANGED",
    ///                     "DELETED",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import FSx Data Repository Associations using the `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:fsx/dataRepositoryAssociation:DataRepositoryAssociation example dra-0b1cfaeca11088b10
    /// ```
    /// </summary>
    [AwsResourceType("aws:fsx/dataRepositoryAssociation:DataRepositoryAssociation")]
    public partial class DataRepositoryAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name of the file system.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        [Output("associationId")]
        public Output<string> AssociationId { get; private set; } = null!;

        /// <summary>
        /// Set to true to run an import data repository task to import metadata from the data repository to the file system after the data repository association is created. Defaults to `false`.
        /// </summary>
        [Output("batchImportMetaDataOnCreate")]
        public Output<bool?> BatchImportMetaDataOnCreate { get; private set; } = null!;

        /// <summary>
        /// The path to the Amazon S3 data repository that will be linked to the file system. The path must be an S3 bucket s3://myBucket/myPrefix/. This path specifies where in the S3 data repository files will be imported from or exported to. The same S3 bucket cannot be linked more than once to the same file system.
        /// </summary>
        [Output("dataRepositoryPath")]
        public Output<string> DataRepositoryPath { get; private set; } = null!;

        /// <summary>
        /// Set to true to delete files from the file system upon deleting this data repository association. Defaults to `false`.
        /// </summary>
        [Output("deleteDataInFilesystem")]
        public Output<bool?> DeleteDataInFilesystem { get; private set; } = null!;

        /// <summary>
        /// The ID of the Amazon FSx file system to on which to create a data repository association.
        /// </summary>
        [Output("fileSystemId")]
        public Output<string> FileSystemId { get; private set; } = null!;

        /// <summary>
        /// A path on the file system that points to a high-level directory (such as `/ns1/`) or subdirectory (such as `/ns1/subdir/`) that will be mapped 1-1 with `data_repository_path`. The leading forward slash in the name is required. Two data repository associations cannot have overlapping file system paths. For example, if a data repository is associated with file system path `/ns1/`, then you cannot link another data repository with file system path `/ns1/ns2`. This path specifies where in your file system files will be exported from or imported to. This file system directory can be linked to only one Amazon S3 bucket, and no other S3 bucket can be linked to the directory.
        /// </summary>
        [Output("fileSystemPath")]
        public Output<string> FileSystemPath { get; private set; } = null!;

        /// <summary>
        /// For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped across is limited by the total number of disks that make up the file system.
        /// </summary>
        [Output("importedFileChunkSize")]
        public Output<int> ImportedFileChunkSize { get; private set; } = null!;

        /// <summary>
        /// See the `s3` configuration block. Max of 1.
        /// The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system with a data repository association. The configuration defines which file events (new, changed, or deleted files or directories) are automatically imported from the linked data repository to the file system or automatically exported from the file system to the data repository.
        /// </summary>
        [Output("s3")]
        public Output<Outputs.DataRepositoryAssociationS3> S3 { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the data repository association. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a DataRepositoryAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DataRepositoryAssociation(string name, DataRepositoryAssociationArgs args, CustomResourceOptions? options = null)
            : base("aws:fsx/dataRepositoryAssociation:DataRepositoryAssociation", name, args ?? new DataRepositoryAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DataRepositoryAssociation(string name, Input<string> id, DataRepositoryAssociationState? state = null, CustomResourceOptions? options = null)
            : base("aws:fsx/dataRepositoryAssociation:DataRepositoryAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DataRepositoryAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DataRepositoryAssociation Get(string name, Input<string> id, DataRepositoryAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new DataRepositoryAssociation(name, id, state, options);
        }
    }

    public sealed class DataRepositoryAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set to true to run an import data repository task to import metadata from the data repository to the file system after the data repository association is created. Defaults to `false`.
        /// </summary>
        [Input("batchImportMetaDataOnCreate")]
        public Input<bool>? BatchImportMetaDataOnCreate { get; set; }

        /// <summary>
        /// The path to the Amazon S3 data repository that will be linked to the file system. The path must be an S3 bucket s3://myBucket/myPrefix/. This path specifies where in the S3 data repository files will be imported from or exported to. The same S3 bucket cannot be linked more than once to the same file system.
        /// </summary>
        [Input("dataRepositoryPath", required: true)]
        public Input<string> DataRepositoryPath { get; set; } = null!;

        /// <summary>
        /// Set to true to delete files from the file system upon deleting this data repository association. Defaults to `false`.
        /// </summary>
        [Input("deleteDataInFilesystem")]
        public Input<bool>? DeleteDataInFilesystem { get; set; }

        /// <summary>
        /// The ID of the Amazon FSx file system to on which to create a data repository association.
        /// </summary>
        [Input("fileSystemId", required: true)]
        public Input<string> FileSystemId { get; set; } = null!;

        /// <summary>
        /// A path on the file system that points to a high-level directory (such as `/ns1/`) or subdirectory (such as `/ns1/subdir/`) that will be mapped 1-1 with `data_repository_path`. The leading forward slash in the name is required. Two data repository associations cannot have overlapping file system paths. For example, if a data repository is associated with file system path `/ns1/`, then you cannot link another data repository with file system path `/ns1/ns2`. This path specifies where in your file system files will be exported from or imported to. This file system directory can be linked to only one Amazon S3 bucket, and no other S3 bucket can be linked to the directory.
        /// </summary>
        [Input("fileSystemPath", required: true)]
        public Input<string> FileSystemPath { get; set; } = null!;

        /// <summary>
        /// For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped across is limited by the total number of disks that make up the file system.
        /// </summary>
        [Input("importedFileChunkSize")]
        public Input<int>? ImportedFileChunkSize { get; set; }

        /// <summary>
        /// See the `s3` configuration block. Max of 1.
        /// The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system with a data repository association. The configuration defines which file events (new, changed, or deleted files or directories) are automatically imported from the linked data repository to the file system or automatically exported from the file system to the data repository.
        /// </summary>
        [Input("s3")]
        public Input<Inputs.DataRepositoryAssociationS3Args>? S3 { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the data repository association. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public DataRepositoryAssociationArgs()
        {
        }
        public static new DataRepositoryAssociationArgs Empty => new DataRepositoryAssociationArgs();
    }

    public sealed class DataRepositoryAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name of the file system.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("associationId")]
        public Input<string>? AssociationId { get; set; }

        /// <summary>
        /// Set to true to run an import data repository task to import metadata from the data repository to the file system after the data repository association is created. Defaults to `false`.
        /// </summary>
        [Input("batchImportMetaDataOnCreate")]
        public Input<bool>? BatchImportMetaDataOnCreate { get; set; }

        /// <summary>
        /// The path to the Amazon S3 data repository that will be linked to the file system. The path must be an S3 bucket s3://myBucket/myPrefix/. This path specifies where in the S3 data repository files will be imported from or exported to. The same S3 bucket cannot be linked more than once to the same file system.
        /// </summary>
        [Input("dataRepositoryPath")]
        public Input<string>? DataRepositoryPath { get; set; }

        /// <summary>
        /// Set to true to delete files from the file system upon deleting this data repository association. Defaults to `false`.
        /// </summary>
        [Input("deleteDataInFilesystem")]
        public Input<bool>? DeleteDataInFilesystem { get; set; }

        /// <summary>
        /// The ID of the Amazon FSx file system to on which to create a data repository association.
        /// </summary>
        [Input("fileSystemId")]
        public Input<string>? FileSystemId { get; set; }

        /// <summary>
        /// A path on the file system that points to a high-level directory (such as `/ns1/`) or subdirectory (such as `/ns1/subdir/`) that will be mapped 1-1 with `data_repository_path`. The leading forward slash in the name is required. Two data repository associations cannot have overlapping file system paths. For example, if a data repository is associated with file system path `/ns1/`, then you cannot link another data repository with file system path `/ns1/ns2`. This path specifies where in your file system files will be exported from or imported to. This file system directory can be linked to only one Amazon S3 bucket, and no other S3 bucket can be linked to the directory.
        /// </summary>
        [Input("fileSystemPath")]
        public Input<string>? FileSystemPath { get; set; }

        /// <summary>
        /// For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped across is limited by the total number of disks that make up the file system.
        /// </summary>
        [Input("importedFileChunkSize")]
        public Input<int>? ImportedFileChunkSize { get; set; }

        /// <summary>
        /// See the `s3` configuration block. Max of 1.
        /// The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system with a data repository association. The configuration defines which file events (new, changed, or deleted files or directories) are automatically imported from the linked data repository to the file system or automatically exported from the file system to the data repository.
        /// </summary>
        [Input("s3")]
        public Input<Inputs.DataRepositoryAssociationS3GetArgs>? S3 { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the data repository association. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public DataRepositoryAssociationState()
        {
        }
        public static new DataRepositoryAssociationState Empty => new DataRepositoryAssociationState();
    }
}
