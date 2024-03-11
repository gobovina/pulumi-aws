// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kendra
{
    public static class GetQuerySuggestionsBlockList
    {
        /// <summary>
        /// Provides details about a specific Amazon Kendra block list used for query suggestions for an index.
        /// 
        /// ## Example Usage
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
        ///     var example = Aws.Kendra.GetQuerySuggestionsBlockList.Invoke(new()
        ///     {
        ///         IndexId = "12345678-1234-1234-1234-123456789123",
        ///         QuerySuggestionsBlockListId = "87654321-1234-4321-4321-321987654321",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetQuerySuggestionsBlockListResult> InvokeAsync(GetQuerySuggestionsBlockListArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetQuerySuggestionsBlockListResult>("aws:kendra/getQuerySuggestionsBlockList:getQuerySuggestionsBlockList", args ?? new GetQuerySuggestionsBlockListArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific Amazon Kendra block list used for query suggestions for an index.
        /// 
        /// ## Example Usage
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
        ///     var example = Aws.Kendra.GetQuerySuggestionsBlockList.Invoke(new()
        ///     {
        ///         IndexId = "12345678-1234-1234-1234-123456789123",
        ///         QuerySuggestionsBlockListId = "87654321-1234-4321-4321-321987654321",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetQuerySuggestionsBlockListResult> Invoke(GetQuerySuggestionsBlockListInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetQuerySuggestionsBlockListResult>("aws:kendra/getQuerySuggestionsBlockList:getQuerySuggestionsBlockList", args ?? new GetQuerySuggestionsBlockListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetQuerySuggestionsBlockListArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier of the index that contains the block list.
        /// </summary>
        [Input("indexId", required: true)]
        public string IndexId { get; set; } = null!;

        /// <summary>
        /// Identifier of the block list.
        /// </summary>
        [Input("querySuggestionsBlockListId", required: true)]
        public string QuerySuggestionsBlockListId { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Metadata that helps organize the block list you create.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetQuerySuggestionsBlockListArgs()
        {
        }
        public static new GetQuerySuggestionsBlockListArgs Empty => new GetQuerySuggestionsBlockListArgs();
    }

    public sealed class GetQuerySuggestionsBlockListInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier of the index that contains the block list.
        /// </summary>
        [Input("indexId", required: true)]
        public Input<string> IndexId { get; set; } = null!;

        /// <summary>
        /// Identifier of the block list.
        /// </summary>
        [Input("querySuggestionsBlockListId", required: true)]
        public Input<string> QuerySuggestionsBlockListId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Metadata that helps organize the block list you create.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetQuerySuggestionsBlockListInvokeArgs()
        {
        }
        public static new GetQuerySuggestionsBlockListInvokeArgs Empty => new GetQuerySuggestionsBlockListInvokeArgs();
    }


    [OutputType]
    public sealed class GetQuerySuggestionsBlockListResult
    {
        /// <summary>
        /// ARN of the block list.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// Date-time a block list was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// Description for the block list.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Error message containing details if there are issues processing the block list.
        /// </summary>
        public readonly string ErrorMessage;
        /// <summary>
        /// Current size of the block list text file in S3.
        /// </summary>
        public readonly int FileSizeBytes;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string IndexId;
        /// <summary>
        /// Current number of valid, non-empty words or phrases in the block list text file.
        /// </summary>
        public readonly int ItemCount;
        /// <summary>
        /// Name of the block list.
        /// </summary>
        public readonly string Name;
        public readonly string QuerySuggestionsBlockListId;
        /// <summary>
        /// ARN of a role with permission to access the S3 bucket that contains the block list. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
        /// </summary>
        public readonly string RoleArn;
        /// <summary>
        /// S3 location of the block list input data. Detailed below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetQuerySuggestionsBlockListSourceS3PathResult> SourceS3Paths;
        /// <summary>
        /// Current status of the block list. When the value is `ACTIVE`, the block list is ready for use.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Metadata that helps organize the block list you create.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Date and time that the block list was last updated.
        /// </summary>
        public readonly string UpdatedAt;

        [OutputConstructor]
        private GetQuerySuggestionsBlockListResult(
            string arn,

            string createdAt,

            string description,

            string errorMessage,

            int fileSizeBytes,

            string id,

            string indexId,

            int itemCount,

            string name,

            string querySuggestionsBlockListId,

            string roleArn,

            ImmutableArray<Outputs.GetQuerySuggestionsBlockListSourceS3PathResult> sourceS3Paths,

            string status,

            ImmutableDictionary<string, string> tags,

            string updatedAt)
        {
            Arn = arn;
            CreatedAt = createdAt;
            Description = description;
            ErrorMessage = errorMessage;
            FileSizeBytes = fileSizeBytes;
            Id = id;
            IndexId = indexId;
            ItemCount = itemCount;
            Name = name;
            QuerySuggestionsBlockListId = querySuggestionsBlockListId;
            RoleArn = roleArn;
            SourceS3Paths = sourceS3Paths;
            Status = status;
            Tags = tags;
            UpdatedAt = updatedAt;
        }
    }
}
