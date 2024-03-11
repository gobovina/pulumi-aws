// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Efs
{
    public static class GetAccessPoint
    {
        /// <summary>
        /// Provides information about an Elastic File System (EFS) Access Point.
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
        ///     var test = Aws.Efs.GetAccessPoint.Invoke(new()
        ///     {
        ///         AccessPointId = "fsap-12345678",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetAccessPointResult> InvokeAsync(GetAccessPointArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccessPointResult>("aws:efs/getAccessPoint:getAccessPoint", args ?? new GetAccessPointArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about an Elastic File System (EFS) Access Point.
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
        ///     var test = Aws.Efs.GetAccessPoint.Invoke(new()
        ///     {
        ///         AccessPointId = "fsap-12345678",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetAccessPointResult> Invoke(GetAccessPointInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccessPointResult>("aws:efs/getAccessPoint:getAccessPoint", args ?? new GetAccessPointInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccessPointArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID that identifies the file system.
        /// </summary>
        [Input("accessPointId", required: true)]
        public string AccessPointId { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Key-value mapping of resource tags.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetAccessPointArgs()
        {
        }
        public static new GetAccessPointArgs Empty => new GetAccessPointArgs();
    }

    public sealed class GetAccessPointInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID that identifies the file system.
        /// </summary>
        [Input("accessPointId", required: true)]
        public Input<string> AccessPointId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value mapping of resource tags.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetAccessPointInvokeArgs()
        {
        }
        public static new GetAccessPointInvokeArgs Empty => new GetAccessPointInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccessPointResult
    {
        public readonly string AccessPointId;
        /// <summary>
        /// Amazon Resource Name of the file system.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// Amazon Resource Name of the file system.
        /// </summary>
        public readonly string FileSystemArn;
        /// <summary>
        /// ID of the file system for which the access point is intended.
        /// </summary>
        public readonly string FileSystemId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string OwnerId;
        /// <summary>
        /// Single element list containing operating system user and group applied to all file system requests made using the access point.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAccessPointPosixUserResult> PosixUsers;
        /// <summary>
        /// Single element list containing information on the directory on the Amazon EFS file system that the access point provides access to.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAccessPointRootDirectoryResult> RootDirectories;
        /// <summary>
        /// Key-value mapping of resource tags.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Tags;

        [OutputConstructor]
        private GetAccessPointResult(
            string accessPointId,

            string arn,

            string fileSystemArn,

            string fileSystemId,

            string id,

            string ownerId,

            ImmutableArray<Outputs.GetAccessPointPosixUserResult> posixUsers,

            ImmutableArray<Outputs.GetAccessPointRootDirectoryResult> rootDirectories,

            ImmutableDictionary<string, string>? tags)
        {
            AccessPointId = accessPointId;
            Arn = arn;
            FileSystemArn = fileSystemArn;
            FileSystemId = fileSystemId;
            Id = id;
            OwnerId = ownerId;
            PosixUsers = posixUsers;
            RootDirectories = rootDirectories;
            Tags = tags;
        }
    }
}
