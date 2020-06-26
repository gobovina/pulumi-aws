// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh
{
    /// <summary>
    /// Provides an AWS App Mesh virtual service resource.
    /// 
    /// ## Example Usage
    /// ### Virtual Node Provider
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var servicea = new Aws.AppMesh.VirtualService("servicea", new Aws.AppMesh.VirtualServiceArgs
    ///         {
    ///             MeshName = aws_appmesh_mesh.Simple.Id,
    ///             Spec = new Aws.AppMesh.Inputs.VirtualServiceSpecArgs
    ///             {
    ///                 Provider = new Aws.AppMesh.Inputs.VirtualServiceSpecProviderArgs
    ///                 {
    ///                     VirtualNode = new Aws.AppMesh.Inputs.VirtualServiceSpecProviderVirtualNodeArgs
    ///                     {
    ///                         VirtualNodeName = aws_appmesh_virtual_node.Serviceb1.Name,
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Virtual Router Provider
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var servicea = new Aws.AppMesh.VirtualService("servicea", new Aws.AppMesh.VirtualServiceArgs
    ///         {
    ///             MeshName = aws_appmesh_mesh.Simple.Id,
    ///             Spec = new Aws.AppMesh.Inputs.VirtualServiceSpecArgs
    ///             {
    ///                 Provider = new Aws.AppMesh.Inputs.VirtualServiceSpecProviderArgs
    ///                 {
    ///                     VirtualRouter = new Aws.AppMesh.Inputs.VirtualServiceSpecProviderVirtualRouterArgs
    ///                     {
    ///                         VirtualRouterName = aws_appmesh_virtual_router.Serviceb.Name,
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class VirtualService : Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the virtual service.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The creation date of the virtual service.
        /// </summary>
        [Output("createdDate")]
        public Output<string> CreatedDate { get; private set; } = null!;

        /// <summary>
        /// The last update date of the virtual service.
        /// </summary>
        [Output("lastUpdatedDate")]
        public Output<string> LastUpdatedDate { get; private set; } = null!;

        /// <summary>
        /// The name of the service mesh in which to create the virtual service.
        /// </summary>
        [Output("meshName")]
        public Output<string> MeshName { get; private set; } = null!;

        /// <summary>
        /// The name to use for the virtual service.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The virtual service specification to apply.
        /// </summary>
        [Output("spec")]
        public Output<Outputs.VirtualServiceSpec> Spec { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a VirtualService resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VirtualService(string name, VirtualServiceArgs args, CustomResourceOptions? options = null)
            : base("aws:appmesh/virtualService:VirtualService", name, args ?? new VirtualServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VirtualService(string name, Input<string> id, VirtualServiceState? state = null, CustomResourceOptions? options = null)
            : base("aws:appmesh/virtualService:VirtualService", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VirtualService resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VirtualService Get(string name, Input<string> id, VirtualServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new VirtualService(name, id, state, options);
        }
    }

    public sealed class VirtualServiceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the service mesh in which to create the virtual service.
        /// </summary>
        [Input("meshName", required: true)]
        public Input<string> MeshName { get; set; } = null!;

        /// <summary>
        /// The name to use for the virtual service.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The virtual service specification to apply.
        /// </summary>
        [Input("spec", required: true)]
        public Input<Inputs.VirtualServiceSpecArgs> Spec { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public VirtualServiceArgs()
        {
        }
    }

    public sealed class VirtualServiceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the virtual service.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The creation date of the virtual service.
        /// </summary>
        [Input("createdDate")]
        public Input<string>? CreatedDate { get; set; }

        /// <summary>
        /// The last update date of the virtual service.
        /// </summary>
        [Input("lastUpdatedDate")]
        public Input<string>? LastUpdatedDate { get; set; }

        /// <summary>
        /// The name of the service mesh in which to create the virtual service.
        /// </summary>
        [Input("meshName")]
        public Input<string>? MeshName { get; set; }

        /// <summary>
        /// The name to use for the virtual service.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The virtual service specification to apply.
        /// </summary>
        [Input("spec")]
        public Input<Inputs.VirtualServiceSpecGetArgs>? Spec { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public VirtualServiceState()
        {
        }
    }
}
