// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CodeArtifact
{
    /// <summary>
    /// Provides a CodeArtifact Repository Resource.
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
    ///     var exampleKey = new Aws.Kms.Key("exampleKey", new()
    ///     {
    ///         Description = "domain key",
    ///     });
    /// 
    ///     var exampleDomain = new Aws.CodeArtifact.Domain("exampleDomain", new()
    ///     {
    ///         DomainName = "example",
    ///         EncryptionKey = exampleKey.Arn,
    ///     });
    /// 
    ///     var test = new Aws.CodeArtifact.Repository("test", new()
    ///     {
    ///         RepositoryName = "example",
    ///         Domain = exampleDomain.DomainName,
    ///     });
    /// 
    /// });
    /// ```
    /// ### With Upstream Repository
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var upstream = new Aws.CodeArtifact.Repository("upstream", new()
    ///     {
    ///         RepositoryName = "upstream",
    ///         Domain = aws_codeartifact_domain.Test.Domain,
    ///     });
    /// 
    ///     var test = new Aws.CodeArtifact.Repository("test", new()
    ///     {
    ///         RepositoryName = "example",
    ///         Domain = aws_codeartifact_domain.Example.Domain,
    ///         Upstreams = new[]
    ///         {
    ///             new Aws.CodeArtifact.Inputs.RepositoryUpstreamArgs
    ///             {
    ///                 RepositoryName = upstream.RepositoryName,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### With External Connection
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var upstream = new Aws.CodeArtifact.Repository("upstream", new()
    ///     {
    ///         RepositoryName = "upstream",
    ///         Domain = aws_codeartifact_domain.Test.Domain,
    ///     });
    /// 
    ///     var test = new Aws.CodeArtifact.Repository("test", new()
    ///     {
    ///         RepositoryName = "example",
    ///         Domain = aws_codeartifact_domain.Example.Domain,
    ///         ExternalConnections = new Aws.CodeArtifact.Inputs.RepositoryExternalConnectionsArgs
    ///         {
    ///             ExternalConnectionName = "public:npmjs",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import CodeArtifact Repository using the CodeArtifact Repository ARN. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:codeartifact/repository:Repository example arn:aws:codeartifact:us-west-2:012345678912:repository/tf-acc-test-6968272603913957763/tf-acc-test-6968272603913957763
    /// ```
    /// </summary>
    [AwsResourceType("aws:codeartifact/repository:Repository")]
    public partial class Repository : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account number of the AWS account that manages the repository.
        /// </summary>
        [Output("administratorAccount")]
        public Output<string> AdministratorAccount { get; private set; } = null!;

        /// <summary>
        /// The ARN of the repository.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The description of the repository.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The domain that contains the created repository.
        /// </summary>
        [Output("domain")]
        public Output<string> Domain { get; private set; } = null!;

        /// <summary>
        /// The account number of the AWS account that owns the domain.
        /// </summary>
        [Output("domainOwner")]
        public Output<string> DomainOwner { get; private set; } = null!;

        /// <summary>
        /// An array of external connections associated with the repository. Only one external connection can be set per repository. see External Connections.
        /// </summary>
        [Output("externalConnections")]
        public Output<Outputs.RepositoryExternalConnections?> ExternalConnections { get; private set; } = null!;

        /// <summary>
        /// The name of the repository to create.
        /// </summary>
        [Output("repository")]
        public Output<string> RepositoryName { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
        /// </summary>
        [Output("upstreams")]
        public Output<ImmutableArray<Outputs.RepositoryUpstream>> Upstreams { get; private set; } = null!;


        /// <summary>
        /// Create a Repository resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Repository(string name, RepositoryArgs args, CustomResourceOptions? options = null)
            : base("aws:codeartifact/repository:Repository", name, args ?? new RepositoryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Repository(string name, Input<string> id, RepositoryState? state = null, CustomResourceOptions? options = null)
            : base("aws:codeartifact/repository:Repository", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Repository resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Repository Get(string name, Input<string> id, RepositoryState? state = null, CustomResourceOptions? options = null)
        {
            return new Repository(name, id, state, options);
        }
    }

    public sealed class RepositoryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the repository.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The domain that contains the created repository.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        /// <summary>
        /// The account number of the AWS account that owns the domain.
        /// </summary>
        [Input("domainOwner")]
        public Input<string>? DomainOwner { get; set; }

        /// <summary>
        /// An array of external connections associated with the repository. Only one external connection can be set per repository. see External Connections.
        /// </summary>
        [Input("externalConnections")]
        public Input<Inputs.RepositoryExternalConnectionsArgs>? ExternalConnections { get; set; }

        /// <summary>
        /// The name of the repository to create.
        /// </summary>
        [Input("repository", required: true)]
        public Input<string> RepositoryName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("upstreams")]
        private InputList<Inputs.RepositoryUpstreamArgs>? _upstreams;

        /// <summary>
        /// A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
        /// </summary>
        public InputList<Inputs.RepositoryUpstreamArgs> Upstreams
        {
            get => _upstreams ?? (_upstreams = new InputList<Inputs.RepositoryUpstreamArgs>());
            set => _upstreams = value;
        }

        public RepositoryArgs()
        {
        }
        public static new RepositoryArgs Empty => new RepositoryArgs();
    }

    public sealed class RepositoryState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account number of the AWS account that manages the repository.
        /// </summary>
        [Input("administratorAccount")]
        public Input<string>? AdministratorAccount { get; set; }

        /// <summary>
        /// The ARN of the repository.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The description of the repository.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The domain that contains the created repository.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// The account number of the AWS account that owns the domain.
        /// </summary>
        [Input("domainOwner")]
        public Input<string>? DomainOwner { get; set; }

        /// <summary>
        /// An array of external connections associated with the repository. Only one external connection can be set per repository. see External Connections.
        /// </summary>
        [Input("externalConnections")]
        public Input<Inputs.RepositoryExternalConnectionsGetArgs>? ExternalConnections { get; set; }

        /// <summary>
        /// The name of the repository to create.
        /// </summary>
        [Input("repository")]
        public Input<string>? RepositoryName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        [Input("upstreams")]
        private InputList<Inputs.RepositoryUpstreamGetArgs>? _upstreams;

        /// <summary>
        /// A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
        /// </summary>
        public InputList<Inputs.RepositoryUpstreamGetArgs> Upstreams
        {
            get => _upstreams ?? (_upstreams = new InputList<Inputs.RepositoryUpstreamGetArgs>());
            set => _upstreams = value;
        }

        public RepositoryState()
        {
        }
        public static new RepositoryState Empty => new RepositoryState();
    }
}
