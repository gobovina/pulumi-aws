// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Glue
{
    /// <summary>
    /// Provides a Glue Classifier resource.
    /// 
    /// &gt; **NOTE:** It is only valid to create one type of classifier (csv, grok, JSON, or XML). Changing classifier types will recreate the classifier.
    /// 
    /// ## Example Usage
    /// ### Csv Classifier
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Glue.Classifier("example", new()
    ///     {
    ///         Name = "example",
    ///         CsvClassifier = new Aws.Glue.Inputs.ClassifierCsvClassifierArgs
    ///         {
    ///             AllowSingleColumn = false,
    ///             ContainsHeader = "PRESENT",
    ///             Delimiter = ",",
    ///             DisableValueTrimming = false,
    ///             Headers = new[]
    ///             {
    ///                 "example1",
    ///                 "example2",
    ///             },
    ///             QuoteSymbol = "'",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Grok Classifier
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Glue.Classifier("example", new()
    ///     {
    ///         Name = "example",
    ///         GrokClassifier = new Aws.Glue.Inputs.ClassifierGrokClassifierArgs
    ///         {
    ///             Classification = "example",
    ///             GrokPattern = "example",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### JSON Classifier
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Glue.Classifier("example", new()
    ///     {
    ///         Name = "example",
    ///         JsonClassifier = new Aws.Glue.Inputs.ClassifierJsonClassifierArgs
    ///         {
    ///             JsonPath = "example",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### XML Classifier
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Glue.Classifier("example", new()
    ///     {
    ///         Name = "example",
    ///         XmlClassifier = new Aws.Glue.Inputs.ClassifierXmlClassifierArgs
    ///         {
    ///             Classification = "example",
    ///             RowTag = "example",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Glue Classifiers using their name. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:glue/classifier:Classifier MyClassifier MyClassifier
    /// ```
    /// </summary>
    [AwsResourceType("aws:glue/classifier:Classifier")]
    public partial class Classifier : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A classifier for Csv content. Defined below.
        /// </summary>
        [Output("csvClassifier")]
        public Output<Outputs.ClassifierCsvClassifier?> CsvClassifier { get; private set; } = null!;

        /// <summary>
        /// A classifier that uses grok patterns. Defined below.
        /// </summary>
        [Output("grokClassifier")]
        public Output<Outputs.ClassifierGrokClassifier?> GrokClassifier { get; private set; } = null!;

        /// <summary>
        /// A classifier for JSON content. Defined below.
        /// </summary>
        [Output("jsonClassifier")]
        public Output<Outputs.ClassifierJsonClassifier?> JsonClassifier { get; private set; } = null!;

        /// <summary>
        /// The name of the classifier.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A classifier for XML content. Defined below.
        /// </summary>
        [Output("xmlClassifier")]
        public Output<Outputs.ClassifierXmlClassifier?> XmlClassifier { get; private set; } = null!;


        /// <summary>
        /// Create a Classifier resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Classifier(string name, ClassifierArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:glue/classifier:Classifier", name, args ?? new ClassifierArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Classifier(string name, Input<string> id, ClassifierState? state = null, CustomResourceOptions? options = null)
            : base("aws:glue/classifier:Classifier", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Classifier resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Classifier Get(string name, Input<string> id, ClassifierState? state = null, CustomResourceOptions? options = null)
        {
            return new Classifier(name, id, state, options);
        }
    }

    public sealed class ClassifierArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A classifier for Csv content. Defined below.
        /// </summary>
        [Input("csvClassifier")]
        public Input<Inputs.ClassifierCsvClassifierArgs>? CsvClassifier { get; set; }

        /// <summary>
        /// A classifier that uses grok patterns. Defined below.
        /// </summary>
        [Input("grokClassifier")]
        public Input<Inputs.ClassifierGrokClassifierArgs>? GrokClassifier { get; set; }

        /// <summary>
        /// A classifier for JSON content. Defined below.
        /// </summary>
        [Input("jsonClassifier")]
        public Input<Inputs.ClassifierJsonClassifierArgs>? JsonClassifier { get; set; }

        /// <summary>
        /// The name of the classifier.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A classifier for XML content. Defined below.
        /// </summary>
        [Input("xmlClassifier")]
        public Input<Inputs.ClassifierXmlClassifierArgs>? XmlClassifier { get; set; }

        public ClassifierArgs()
        {
        }
        public static new ClassifierArgs Empty => new ClassifierArgs();
    }

    public sealed class ClassifierState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A classifier for Csv content. Defined below.
        /// </summary>
        [Input("csvClassifier")]
        public Input<Inputs.ClassifierCsvClassifierGetArgs>? CsvClassifier { get; set; }

        /// <summary>
        /// A classifier that uses grok patterns. Defined below.
        /// </summary>
        [Input("grokClassifier")]
        public Input<Inputs.ClassifierGrokClassifierGetArgs>? GrokClassifier { get; set; }

        /// <summary>
        /// A classifier for JSON content. Defined below.
        /// </summary>
        [Input("jsonClassifier")]
        public Input<Inputs.ClassifierJsonClassifierGetArgs>? JsonClassifier { get; set; }

        /// <summary>
        /// The name of the classifier.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A classifier for XML content. Defined below.
        /// </summary>
        [Input("xmlClassifier")]
        public Input<Inputs.ClassifierXmlClassifierGetArgs>? XmlClassifier { get; set; }

        public ClassifierState()
        {
        }
        public static new ClassifierState Empty => new ClassifierState();
    }
}
