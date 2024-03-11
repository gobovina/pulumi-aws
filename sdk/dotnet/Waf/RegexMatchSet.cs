// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Waf
{
    /// <summary>
    /// Provides a WAF Regex Match Set Resource
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
    ///     var exampleRegexPatternSet = new Aws.Waf.RegexPatternSet("example", new()
    ///     {
    ///         Name = "example",
    ///         RegexPatternStrings = new[]
    ///         {
    ///             "one",
    ///             "two",
    ///         },
    ///     });
    /// 
    ///     var example = new Aws.Waf.RegexMatchSet("example", new()
    ///     {
    ///         Name = "example",
    ///         RegexMatchTuples = new[]
    ///         {
    ///             new Aws.Waf.Inputs.RegexMatchSetRegexMatchTupleArgs
    ///             {
    ///                 FieldToMatch = new Aws.Waf.Inputs.RegexMatchSetRegexMatchTupleFieldToMatchArgs
    ///                 {
    ///                     Data = "User-Agent",
    ///                     Type = "HEADER",
    ///                 },
    ///                 RegexPatternSetId = exampleRegexPatternSet.Id,
    ///                 TextTransformation = "NONE",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import WAF Regex Match Set using their ID. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:waf/regexMatchSet:RegexMatchSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
    /// ```
    /// </summary>
    [AwsResourceType("aws:waf/regexMatchSet:RegexMatchSet")]
    public partial class RegexMatchSet : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN)
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The name or description of the Regex Match Set.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
        /// </summary>
        [Output("regexMatchTuples")]
        public Output<ImmutableArray<Outputs.RegexMatchSetRegexMatchTuple>> RegexMatchTuples { get; private set; } = null!;


        /// <summary>
        /// Create a RegexMatchSet resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RegexMatchSet(string name, RegexMatchSetArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:waf/regexMatchSet:RegexMatchSet", name, args ?? new RegexMatchSetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RegexMatchSet(string name, Input<string> id, RegexMatchSetState? state = null, CustomResourceOptions? options = null)
            : base("aws:waf/regexMatchSet:RegexMatchSet", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RegexMatchSet resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RegexMatchSet Get(string name, Input<string> id, RegexMatchSetState? state = null, CustomResourceOptions? options = null)
        {
            return new RegexMatchSet(name, id, state, options);
        }
    }

    public sealed class RegexMatchSetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name or description of the Regex Match Set.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("regexMatchTuples")]
        private InputList<Inputs.RegexMatchSetRegexMatchTupleArgs>? _regexMatchTuples;

        /// <summary>
        /// The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
        /// </summary>
        public InputList<Inputs.RegexMatchSetRegexMatchTupleArgs> RegexMatchTuples
        {
            get => _regexMatchTuples ?? (_regexMatchTuples = new InputList<Inputs.RegexMatchSetRegexMatchTupleArgs>());
            set => _regexMatchTuples = value;
        }

        public RegexMatchSetArgs()
        {
        }
        public static new RegexMatchSetArgs Empty => new RegexMatchSetArgs();
    }

    public sealed class RegexMatchSetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN)
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The name or description of the Regex Match Set.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("regexMatchTuples")]
        private InputList<Inputs.RegexMatchSetRegexMatchTupleGetArgs>? _regexMatchTuples;

        /// <summary>
        /// The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
        /// </summary>
        public InputList<Inputs.RegexMatchSetRegexMatchTupleGetArgs> RegexMatchTuples
        {
            get => _regexMatchTuples ?? (_regexMatchTuples = new InputList<Inputs.RegexMatchSetRegexMatchTupleGetArgs>());
            set => _regexMatchTuples = value;
        }

        public RegexMatchSetState()
        {
        }
        public static new RegexMatchSetState Empty => new RegexMatchSetState();
    }
}
