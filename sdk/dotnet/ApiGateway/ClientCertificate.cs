// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ApiGateway
{
    /// <summary>
    /// Provides an API Gateway Client Certificate.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var demo = new Aws.ApiGateway.ClientCertificate("demo", new Aws.ApiGateway.ClientCertificateArgs
    ///         {
    ///             Description = "My client certificate",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class ClientCertificate : Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN)
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The date when the client certificate was created.
        /// </summary>
        [Output("createdDate")]
        public Output<string> CreatedDate { get; private set; } = null!;

        /// <summary>
        /// The description of the client certificate.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The date when the client certificate will expire.
        /// </summary>
        [Output("expirationDate")]
        public Output<string> ExpirationDate { get; private set; } = null!;

        /// <summary>
        /// The PEM-encoded public key of the client certificate.
        /// </summary>
        [Output("pemEncodedCertificate")]
        public Output<string> PemEncodedCertificate { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a ClientCertificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClientCertificate(string name, ClientCertificateArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:apigateway/clientCertificate:ClientCertificate", name, args ?? new ClientCertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ClientCertificate(string name, Input<string> id, ClientCertificateState? state = null, CustomResourceOptions? options = null)
            : base("aws:apigateway/clientCertificate:ClientCertificate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ClientCertificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ClientCertificate Get(string name, Input<string> id, ClientCertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new ClientCertificate(name, id, state, options);
        }
    }

    public sealed class ClientCertificateArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the client certificate.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ClientCertificateArgs()
        {
        }
    }

    public sealed class ClientCertificateState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN)
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The date when the client certificate was created.
        /// </summary>
        [Input("createdDate")]
        public Input<string>? CreatedDate { get; set; }

        /// <summary>
        /// The description of the client certificate.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The date when the client certificate will expire.
        /// </summary>
        [Input("expirationDate")]
        public Input<string>? ExpirationDate { get; set; }

        /// <summary>
        /// The PEM-encoded public key of the client certificate.
        /// </summary>
        [Input("pemEncodedCertificate")]
        public Input<string>? PemEncodedCertificate { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ClientCertificateState()
        {
        }
    }
}
