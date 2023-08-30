// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kms
{
    /// <summary>
    /// Provides an alias for a KMS customer master key. AWS Console enforces 1-to-1 mapping between aliases &amp; keys,
    /// but API (hence this provider too) allows you to create as many aliases as
    /// the [account limits](http://docs.aws.amazon.com/kms/latest/developerguide/limits.html) allow you.
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
    ///     var key = new Aws.Kms.Key("key");
    /// 
    ///     var @alias = new Aws.Kms.Alias("alias", new()
    ///     {
    ///         TargetKeyId = key.KeyId,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import KMS aliases using the `name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:kms/alias:Alias a alias/my-key-alias
    /// ```
    /// </summary>
    [AwsResourceType("aws:kms/alias:Alias")]
    public partial class Alias : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the key alias.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Creates an unique alias beginning with the specified prefix.
        /// The name must start with the word "alias" followed by a forward slash (alias/).  Conflicts with `name`.
        /// </summary>
        [Output("namePrefix")]
        public Output<string> NamePrefix { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the target key identifier.
        /// </summary>
        [Output("targetKeyArn")]
        public Output<string> TargetKeyArn { get; private set; } = null!;

        /// <summary>
        /// Identifier for the key for which the alias is for, can be either an ARN or key_id.
        /// </summary>
        [Output("targetKeyId")]
        public Output<string> TargetKeyId { get; private set; } = null!;


        /// <summary>
        /// Create a Alias resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Alias(string name, AliasArgs args, CustomResourceOptions? options = null)
            : base("aws:kms/alias:Alias", name, args ?? new AliasArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Alias(string name, Input<string> id, AliasState? state = null, CustomResourceOptions? options = null)
            : base("aws:kms/alias:Alias", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Alias resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Alias Get(string name, Input<string> id, AliasState? state = null, CustomResourceOptions? options = null)
        {
            return new Alias(name, id, state, options);
        }
    }

    public sealed class AliasArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Creates an unique alias beginning with the specified prefix.
        /// The name must start with the word "alias" followed by a forward slash (alias/).  Conflicts with `name`.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// Identifier for the key for which the alias is for, can be either an ARN or key_id.
        /// </summary>
        [Input("targetKeyId", required: true)]
        public Input<string> TargetKeyId { get; set; } = null!;

        public AliasArgs()
        {
        }
        public static new AliasArgs Empty => new AliasArgs();
    }

    public sealed class AliasState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the key alias.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Creates an unique alias beginning with the specified prefix.
        /// The name must start with the word "alias" followed by a forward slash (alias/).  Conflicts with `name`.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the target key identifier.
        /// </summary>
        [Input("targetKeyArn")]
        public Input<string>? TargetKeyArn { get; set; }

        /// <summary>
        /// Identifier for the key for which the alias is for, can be either an ARN or key_id.
        /// </summary>
        [Input("targetKeyId")]
        public Input<string>? TargetKeyId { get; set; }

        public AliasState()
        {
        }
        public static new AliasState Empty => new AliasState();
    }
}
