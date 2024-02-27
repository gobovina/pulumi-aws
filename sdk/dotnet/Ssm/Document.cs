// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ssm
{
    /// <summary>
    /// Provides an SSM Document resource
    /// 
    /// &gt; **NOTE on updating SSM documents:** Only documents with a schema version of 2.0
    /// or greater can update their content once created, see [SSM Schema Features](http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-ssm-docs.html#document-schemas-features). To update a document with an older schema version you must recreate the resource. Not all document types support a schema version of 2.0 or greater. Refer to [SSM document schema features and examples](https://docs.aws.amazon.com/systems-manager/latest/userguide/document-schemas-features.html) for information about which schema versions are supported for the respective `document_type`.
    /// 
    /// ## Example Usage
    /// ### Create an ssm document in JSON format
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new Aws.Ssm.Document("foo", new()
    ///     {
    ///         Content = @"  {
    ///     ""schemaVersion"": ""1.2"",
    ///     ""description"": ""Check ip configuration of a Linux instance."",
    ///     ""parameters"": {
    /// 
    ///     },
    ///     ""runtimeConfig"": {
    ///       ""aws:runShellScript"": {
    ///         ""properties"": [
    ///           {
    ///             ""id"": ""0.aws:runShellScript"",
    ///             ""runCommand"": [""ifconfig""]
    ///           }
    ///         ]
    ///       }
    ///     }
    ///   }
    /// 
    /// ",
    ///         DocumentType = "Command",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create an ssm document in YAML format
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new Aws.Ssm.Document("foo", new()
    ///     {
    ///         Content = @"schemaVersion: '1.2'
    /// description: Check ip configuration of a Linux instance.
    /// parameters: {}
    /// runtimeConfig:
    ///   'aws:runShellScript':
    ///     properties:
    ///       - id: '0.aws:runShellScript'
    ///         runCommand:
    ///           - ifconfig
    /// 
    /// ",
    ///         DocumentFormat = "YAML",
    ///         DocumentType = "Command",
    ///     });
    /// 
    /// });
    /// ```
    /// ## Permissions
    /// 
    /// The permissions attribute specifies how you want to share the document. If you share a document privately,
    /// you must specify the AWS user account IDs for those people who can use the document. If you share a document
    /// publicly, you must specify All as the account ID.
    /// 
    /// The permissions mapping supports the following:
    /// 
    /// * `type` - The permission type for the document. The permission type can be `Share`.
    /// * `account_ids` - The AWS user accounts that should have access to the document. The account IDs can either be a group of account IDs or `All`.
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import SSM Documents using the name. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ssm/document:Document example example
    /// ```
    ///  The `attachments_source` argument does not have an SSM API method for reading the attachment information detail after creation. If the argument is set in the Pulumi program on an imported resource, Pulumi will always show a difference. To workaround this behavior, either omit the argument from the Pulumi program or use `ignore_changes` to hide the difference. For example:
    /// </summary>
    [AwsResourceType("aws:ssm/document:Document")]
    public partial class Document : global::Pulumi.CustomResource
    {
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// One or more configuration blocks describing attachments sources to a version of a document. Defined below.
        /// </summary>
        [Output("attachmentsSources")]
        public Output<ImmutableArray<Outputs.DocumentAttachmentsSource>> AttachmentsSources { get; private set; } = null!;

        /// <summary>
        /// The JSON or YAML content of the document.
        /// </summary>
        [Output("content")]
        public Output<string> Content { get; private set; } = null!;

        /// <summary>
        /// The date the document was created.
        /// </summary>
        [Output("createdDate")]
        public Output<string> CreatedDate { get; private set; } = null!;

        /// <summary>
        /// The default version of the document.
        /// </summary>
        [Output("defaultVersion")]
        public Output<string> DefaultVersion { get; private set; } = null!;

        /// <summary>
        /// The description of the document.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The format of the document. Valid document types include: `JSON` and `YAML`
        /// </summary>
        [Output("documentFormat")]
        public Output<string?> DocumentFormat { get; private set; } = null!;

        /// <summary>
        /// The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
        /// </summary>
        [Output("documentType")]
        public Output<string> DocumentType { get; private set; } = null!;

        /// <summary>
        /// The document version.
        /// </summary>
        [Output("documentVersion")]
        public Output<string> DocumentVersion { get; private set; } = null!;

        /// <summary>
        /// The sha1 or sha256 of the document content
        /// </summary>
        [Output("hash")]
        public Output<string> Hash { get; private set; } = null!;

        /// <summary>
        /// "Sha1" "Sha256". The hashing algorithm used when hashing the content.
        /// </summary>
        [Output("hashType")]
        public Output<string> HashType { get; private set; } = null!;

        /// <summary>
        /// The latest version of the document.
        /// </summary>
        [Output("latestVersion")]
        public Output<string> LatestVersion { get; private set; } = null!;

        /// <summary>
        /// The name of the document.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The AWS user account of the person who created the document.
        /// </summary>
        [Output("owner")]
        public Output<string> Owner { get; private set; } = null!;

        /// <summary>
        /// The parameters that are available to this document.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableArray<Outputs.DocumentParameter>> Parameters { get; private set; } = null!;

        /// <summary>
        /// Additional Permissions to attach to the document. See Permissions below for details.
        /// </summary>
        [Output("permissions")]
        public Output<ImmutableDictionary<string, string>?> Permissions { get; private set; } = null!;

        /// <summary>
        /// A list of OS platforms compatible with this SSM document, either "Windows" or "Linux".
        /// </summary>
        [Output("platformTypes")]
        public Output<ImmutableArray<string>> PlatformTypes { get; private set; } = null!;

        /// <summary>
        /// The schema version of the document.
        /// </summary>
        [Output("schemaVersion")]
        public Output<string> SchemaVersion { get; private set; } = null!;

        /// <summary>
        /// "Creating", "Active" or "Deleting". The current status of the document.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
        /// </summary>
        [Output("targetType")]
        public Output<string?> TargetType { get; private set; } = null!;

        /// <summary>
        /// A field specifying the version of the artifact you are creating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document and cannot be changed for an existing document version.
        /// </summary>
        [Output("versionName")]
        public Output<string?> VersionName { get; private set; } = null!;


        /// <summary>
        /// Create a Document resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Document(string name, DocumentArgs args, CustomResourceOptions? options = null)
            : base("aws:ssm/document:Document", name, args ?? new DocumentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Document(string name, Input<string> id, DocumentState? state = null, CustomResourceOptions? options = null)
            : base("aws:ssm/document:Document", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Document resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Document Get(string name, Input<string> id, DocumentState? state = null, CustomResourceOptions? options = null)
        {
            return new Document(name, id, state, options);
        }
    }

    public sealed class DocumentArgs : global::Pulumi.ResourceArgs
    {
        [Input("attachmentsSources")]
        private InputList<Inputs.DocumentAttachmentsSourceArgs>? _attachmentsSources;

        /// <summary>
        /// One or more configuration blocks describing attachments sources to a version of a document. Defined below.
        /// </summary>
        public InputList<Inputs.DocumentAttachmentsSourceArgs> AttachmentsSources
        {
            get => _attachmentsSources ?? (_attachmentsSources = new InputList<Inputs.DocumentAttachmentsSourceArgs>());
            set => _attachmentsSources = value;
        }

        /// <summary>
        /// The JSON or YAML content of the document.
        /// </summary>
        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        /// <summary>
        /// The format of the document. Valid document types include: `JSON` and `YAML`
        /// </summary>
        [Input("documentFormat")]
        public Input<string>? DocumentFormat { get; set; }

        /// <summary>
        /// The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
        /// </summary>
        [Input("documentType", required: true)]
        public Input<string> DocumentType { get; set; } = null!;

        /// <summary>
        /// The name of the document.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("permissions")]
        private InputMap<string>? _permissions;

        /// <summary>
        /// Additional Permissions to attach to the document. See Permissions below for details.
        /// </summary>
        public InputMap<string> Permissions
        {
            get => _permissions ?? (_permissions = new InputMap<string>());
            set => _permissions = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
        /// </summary>
        [Input("targetType")]
        public Input<string>? TargetType { get; set; }

        /// <summary>
        /// A field specifying the version of the artifact you are creating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document and cannot be changed for an existing document version.
        /// </summary>
        [Input("versionName")]
        public Input<string>? VersionName { get; set; }

        public DocumentArgs()
        {
        }
        public static new DocumentArgs Empty => new DocumentArgs();
    }

    public sealed class DocumentState : global::Pulumi.ResourceArgs
    {
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("attachmentsSources")]
        private InputList<Inputs.DocumentAttachmentsSourceGetArgs>? _attachmentsSources;

        /// <summary>
        /// One or more configuration blocks describing attachments sources to a version of a document. Defined below.
        /// </summary>
        public InputList<Inputs.DocumentAttachmentsSourceGetArgs> AttachmentsSources
        {
            get => _attachmentsSources ?? (_attachmentsSources = new InputList<Inputs.DocumentAttachmentsSourceGetArgs>());
            set => _attachmentsSources = value;
        }

        /// <summary>
        /// The JSON or YAML content of the document.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        /// <summary>
        /// The date the document was created.
        /// </summary>
        [Input("createdDate")]
        public Input<string>? CreatedDate { get; set; }

        /// <summary>
        /// The default version of the document.
        /// </summary>
        [Input("defaultVersion")]
        public Input<string>? DefaultVersion { get; set; }

        /// <summary>
        /// The description of the document.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The format of the document. Valid document types include: `JSON` and `YAML`
        /// </summary>
        [Input("documentFormat")]
        public Input<string>? DocumentFormat { get; set; }

        /// <summary>
        /// The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
        /// </summary>
        [Input("documentType")]
        public Input<string>? DocumentType { get; set; }

        /// <summary>
        /// The document version.
        /// </summary>
        [Input("documentVersion")]
        public Input<string>? DocumentVersion { get; set; }

        /// <summary>
        /// The sha1 or sha256 of the document content
        /// </summary>
        [Input("hash")]
        public Input<string>? Hash { get; set; }

        /// <summary>
        /// "Sha1" "Sha256". The hashing algorithm used when hashing the content.
        /// </summary>
        [Input("hashType")]
        public Input<string>? HashType { get; set; }

        /// <summary>
        /// The latest version of the document.
        /// </summary>
        [Input("latestVersion")]
        public Input<string>? LatestVersion { get; set; }

        /// <summary>
        /// The name of the document.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The AWS user account of the person who created the document.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("parameters")]
        private InputList<Inputs.DocumentParameterGetArgs>? _parameters;

        /// <summary>
        /// The parameters that are available to this document.
        /// </summary>
        public InputList<Inputs.DocumentParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.DocumentParameterGetArgs>());
            set => _parameters = value;
        }

        [Input("permissions")]
        private InputMap<string>? _permissions;

        /// <summary>
        /// Additional Permissions to attach to the document. See Permissions below for details.
        /// </summary>
        public InputMap<string> Permissions
        {
            get => _permissions ?? (_permissions = new InputMap<string>());
            set => _permissions = value;
        }

        [Input("platformTypes")]
        private InputList<string>? _platformTypes;

        /// <summary>
        /// A list of OS platforms compatible with this SSM document, either "Windows" or "Linux".
        /// </summary>
        public InputList<string> PlatformTypes
        {
            get => _platformTypes ?? (_platformTypes = new InputList<string>());
            set => _platformTypes = value;
        }

        /// <summary>
        /// The schema version of the document.
        /// </summary>
        [Input("schemaVersion")]
        public Input<string>? SchemaVersion { get; set; }

        /// <summary>
        /// "Creating", "Active" or "Deleting". The current status of the document.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        /// The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
        /// </summary>
        [Input("targetType")]
        public Input<string>? TargetType { get; set; }

        /// <summary>
        /// A field specifying the version of the artifact you are creating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document and cannot be changed for an existing document version.
        /// </summary>
        [Input("versionName")]
        public Input<string>? VersionName { get; set; }

        public DocumentState()
        {
        }
        public static new DocumentState Empty => new DocumentState();
    }
}
