// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppSync
{
    /// <summary>
    /// Provides an AppSync Type.
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
    ///     var example = new Aws.AppSync.GraphQLApi("example", new()
    ///     {
    ///         AuthenticationType = "API_KEY",
    ///         Name = "example",
    ///     });
    /// 
    ///     var exampleType = new Aws.AppSync.Type("example", new()
    ///     {
    ///         ApiId = example.Id,
    ///         Format = "SDL",
    ///         Definition = @"type Mutation
    /// 
    /// {
    /// putPost(id: ID!,title: String! ): Post
    /// 
    /// }
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Appsync Types using the `id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:appsync/type:Type example api-id:format:name
    /// ```
    /// </summary>
    [AwsResourceType("aws:appsync/type:Type")]
    public partial class Type : global::Pulumi.CustomResource
    {
        /// <summary>
        /// GraphQL API ID.
        /// </summary>
        [Output("apiId")]
        public Output<string> ApiId { get; private set; } = null!;

        /// <summary>
        /// The ARN of the type.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The type definition.
        /// </summary>
        [Output("definition")]
        public Output<string> Definition { get; private set; } = null!;

        /// <summary>
        /// The type description.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The type format: `SDL` or `JSON`.
        /// </summary>
        [Output("format")]
        public Output<string> Format { get; private set; } = null!;

        /// <summary>
        /// The type name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a Type resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Type(string name, TypeArgs args, CustomResourceOptions? options = null)
            : base("aws:appsync/type:Type", name, args ?? new TypeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Type(string name, Input<string> id, TypeState? state = null, CustomResourceOptions? options = null)
            : base("aws:appsync/type:Type", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Type resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Type Get(string name, Input<string> id, TypeState? state = null, CustomResourceOptions? options = null)
        {
            return new Type(name, id, state, options);
        }
    }

    public sealed class TypeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// GraphQL API ID.
        /// </summary>
        [Input("apiId", required: true)]
        public Input<string> ApiId { get; set; } = null!;

        /// <summary>
        /// The type definition.
        /// </summary>
        [Input("definition", required: true)]
        public Input<string> Definition { get; set; } = null!;

        /// <summary>
        /// The type format: `SDL` or `JSON`.
        /// </summary>
        [Input("format", required: true)]
        public Input<string> Format { get; set; } = null!;

        public TypeArgs()
        {
        }
        public static new TypeArgs Empty => new TypeArgs();
    }

    public sealed class TypeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// GraphQL API ID.
        /// </summary>
        [Input("apiId")]
        public Input<string>? ApiId { get; set; }

        /// <summary>
        /// The ARN of the type.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The type definition.
        /// </summary>
        [Input("definition")]
        public Input<string>? Definition { get; set; }

        /// <summary>
        /// The type description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The type format: `SDL` or `JSON`.
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// The type name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public TypeState()
        {
        }
        public static new TypeState Empty => new TypeState();
    }
}
