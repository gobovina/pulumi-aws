// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ImageBuilder
{
    public static class GetContainerRecipes
    {
        /// <summary>
        /// Use this data source to get the ARNs and names of Image Builder Container Recipes matching the specified criteria.
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
        ///     var example = Aws.ImageBuilder.GetContainerRecipes.Invoke(new()
        ///     {
        ///         Owner = "Self",
        ///         Filters = new[]
        ///         {
        ///             new Aws.ImageBuilder.Inputs.GetContainerRecipesFilterInputArgs
        ///             {
        ///                 Name = "platform",
        ///                 Values = new[]
        ///                 {
        ///                     "Linux",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetContainerRecipesResult> InvokeAsync(GetContainerRecipesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetContainerRecipesResult>("aws:imagebuilder/getContainerRecipes:getContainerRecipes", args ?? new GetContainerRecipesArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get the ARNs and names of Image Builder Container Recipes matching the specified criteria.
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
        ///     var example = Aws.ImageBuilder.GetContainerRecipes.Invoke(new()
        ///     {
        ///         Owner = "Self",
        ///         Filters = new[]
        ///         {
        ///             new Aws.ImageBuilder.Inputs.GetContainerRecipesFilterInputArgs
        ///             {
        ///                 Name = "platform",
        ///                 Values = new[]
        ///                 {
        ///                     "Linux",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetContainerRecipesResult> Invoke(GetContainerRecipesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetContainerRecipesResult>("aws:imagebuilder/getContainerRecipes:getContainerRecipes", args ?? new GetContainerRecipesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetContainerRecipesArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetContainerRecipesFilterArgs>? _filters;

        /// <summary>
        /// Configuration block(s) for filtering. Detailed below.
        /// </summary>
        public List<Inputs.GetContainerRecipesFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetContainerRecipesFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// Owner of the container recipes. Valid values are `Self`, `Shared`, `Amazon` and `ThirdParty`. Defaults to `Self`.
        /// </summary>
        [Input("owner")]
        public string? Owner { get; set; }

        public GetContainerRecipesArgs()
        {
        }
        public static new GetContainerRecipesArgs Empty => new GetContainerRecipesArgs();
    }

    public sealed class GetContainerRecipesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetContainerRecipesFilterInputArgs>? _filters;

        /// <summary>
        /// Configuration block(s) for filtering. Detailed below.
        /// </summary>
        public InputList<Inputs.GetContainerRecipesFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetContainerRecipesFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// Owner of the container recipes. Valid values are `Self`, `Shared`, `Amazon` and `ThirdParty`. Defaults to `Self`.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        public GetContainerRecipesInvokeArgs()
        {
        }
        public static new GetContainerRecipesInvokeArgs Empty => new GetContainerRecipesInvokeArgs();
    }


    [OutputType]
    public sealed class GetContainerRecipesResult
    {
        /// <summary>
        /// Set of ARNs of the matched Image Builder Container Recipes.
        /// </summary>
        public readonly ImmutableArray<string> Arns;
        public readonly ImmutableArray<Outputs.GetContainerRecipesFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Set of names of the matched Image Builder Container Recipes.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? Owner;

        [OutputConstructor]
        private GetContainerRecipesResult(
            ImmutableArray<string> arns,

            ImmutableArray<Outputs.GetContainerRecipesFilterResult> filters,

            string id,

            ImmutableArray<string> names,

            string? owner)
        {
            Arns = arns;
            Filters = filters;
            Id = id;
            Names = names;
            Owner = owner;
        }
    }
}
