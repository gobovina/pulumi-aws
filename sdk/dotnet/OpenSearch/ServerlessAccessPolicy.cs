// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.OpenSearch
{
    /// <summary>
    /// Resource for managing an AWS OpenSearch Serverless Access Policy. See AWS documentation for [data access policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html) and [supported data access policy permissions](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html#serverless-data-supported-permissions).
    /// 
    /// ## Example Usage
    /// 
    /// ### Grant all collection and index permissions
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var current = Aws.GetCallerIdentity.Invoke();
    /// 
    ///     var example = new Aws.OpenSearch.ServerlessAccessPolicy("example", new()
    ///     {
    ///         Name = "example",
    ///         Type = "data",
    ///         Description = "read and write permissions",
    ///         Policy = JsonSerializer.Serialize(new[]
    ///         {
    ///             new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["rules"] = new[]
    ///                 {
    ///                     new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["resourceType"] = "index",
    ///                         ["resource"] = new[]
    ///                         {
    ///                             "index/example-collection/*",
    ///                         },
    ///                         ["permission"] = new[]
    ///                         {
    ///                             "aoss:*",
    ///                         },
    ///                     },
    ///                     new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["resourceType"] = "collection",
    ///                         ["resource"] = new[]
    ///                         {
    ///                             "collection/example-collection",
    ///                         },
    ///                         ["permission"] = new[]
    ///                         {
    ///                             "aoss:*",
    ///                         },
    ///                     },
    ///                 },
    ///                 ["principal"] = new[]
    ///                 {
    ///                     current.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.Arn),
    ///                 },
    ///             },
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Grant read-only collection and index permissions
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var current = Aws.GetCallerIdentity.Invoke();
    /// 
    ///     var example = new Aws.OpenSearch.ServerlessAccessPolicy("example", new()
    ///     {
    ///         Name = "example",
    ///         Type = "data",
    ///         Description = "read-only permissions",
    ///         Policy = JsonSerializer.Serialize(new[]
    ///         {
    ///             new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["rules"] = new[]
    ///                 {
    ///                     new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["resourceType"] = "index",
    ///                         ["resource"] = new[]
    ///                         {
    ///                             "index/example-collection/*",
    ///                         },
    ///                         ["permission"] = new[]
    ///                         {
    ///                             "aoss:DescribeIndex",
    ///                             "aoss:ReadDocument",
    ///                         },
    ///                     },
    ///                     new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["resourceType"] = "collection",
    ///                         ["resource"] = new[]
    ///                         {
    ///                             "collection/example-collection",
    ///                         },
    ///                         ["permission"] = new[]
    ///                         {
    ///                             "aoss:DescribeCollectionItems",
    ///                         },
    ///                     },
    ///                 },
    ///                 ["principal"] = new[]
    ///                 {
    ///                     current.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.Arn),
    ///                 },
    ///             },
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Grant SAML identity permissions
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.OpenSearch.ServerlessAccessPolicy("example", new()
    ///     {
    ///         Name = "example",
    ///         Type = "data",
    ///         Description = "saml permissions",
    ///         Policy = JsonSerializer.Serialize(new[]
    ///         {
    ///             new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["rules"] = new[]
    ///                 {
    ///                     new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["resourceType"] = "index",
    ///                         ["resource"] = new[]
    ///                         {
    ///                             "index/example-collection/*",
    ///                         },
    ///                         ["permission"] = new[]
    ///                         {
    ///                             "aoss:*",
    ///                         },
    ///                     },
    ///                     new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["resourceType"] = "collection",
    ///                         ["resource"] = new[]
    ///                         {
    ///                             "collection/example-collection",
    ///                         },
    ///                         ["permission"] = new[]
    ///                         {
    ///                             "aoss:*",
    ///                         },
    ///                     },
    ///                 },
    ///                 ["principal"] = new[]
    ///                 {
    ///                     "saml/123456789012/myprovider/user/Annie",
    ///                     "saml/123456789012/anotherprovider/group/Accounting",
    ///                 },
    ///             },
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import OpenSearchServerless Access Policy using the `name` and `type` arguments separated by a slash (`/`). For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:opensearch/serverlessAccessPolicy:ServerlessAccessPolicy example example/data
    /// ```
    /// </summary>
    [AwsResourceType("aws:opensearch/serverlessAccessPolicy:ServerlessAccessPolicy")]
    public partial class ServerlessAccessPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description of the policy. Typically used to store information about the permissions defined in the policy.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Name of the policy.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// JSON policy document to use as the content for the new policy
        /// </summary>
        [Output("policy")]
        public Output<string> Policy { get; private set; } = null!;

        /// <summary>
        /// Version of the policy.
        /// </summary>
        [Output("policyVersion")]
        public Output<string> PolicyVersion { get; private set; } = null!;

        /// <summary>
        /// Type of access policy. Must be `data`.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a ServerlessAccessPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServerlessAccessPolicy(string name, ServerlessAccessPolicyArgs args, CustomResourceOptions? options = null)
            : base("aws:opensearch/serverlessAccessPolicy:ServerlessAccessPolicy", name, args ?? new ServerlessAccessPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServerlessAccessPolicy(string name, Input<string> id, ServerlessAccessPolicyState? state = null, CustomResourceOptions? options = null)
            : base("aws:opensearch/serverlessAccessPolicy:ServerlessAccessPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServerlessAccessPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServerlessAccessPolicy Get(string name, Input<string> id, ServerlessAccessPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new ServerlessAccessPolicy(name, id, state, options);
        }
    }

    public sealed class ServerlessAccessPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the policy. Typically used to store information about the permissions defined in the policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// JSON policy document to use as the content for the new policy
        /// </summary>
        [Input("policy", required: true)]
        public Input<string> Policy { get; set; } = null!;

        /// <summary>
        /// Type of access policy. Must be `data`.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ServerlessAccessPolicyArgs()
        {
        }
        public static new ServerlessAccessPolicyArgs Empty => new ServerlessAccessPolicyArgs();
    }

    public sealed class ServerlessAccessPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the policy. Typically used to store information about the permissions defined in the policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// JSON policy document to use as the content for the new policy
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// Version of the policy.
        /// </summary>
        [Input("policyVersion")]
        public Input<string>? PolicyVersion { get; set; }

        /// <summary>
        /// Type of access policy. Must be `data`.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ServerlessAccessPolicyState()
        {
        }
        public static new ServerlessAccessPolicyState Empty => new ServerlessAccessPolicyState();
    }
}
