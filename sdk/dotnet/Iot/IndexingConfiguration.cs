// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Iot
{
    /// <summary>
    /// Managing [IoT Thing indexing](https://docs.aws.amazon.com/iot/latest/developerguide/managing-index.html).
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
    ///     var example = new Aws.Iot.IndexingConfiguration("example", new()
    ///     {
    ///         ThingIndexingConfiguration = new Aws.Iot.Inputs.IndexingConfigurationThingIndexingConfigurationArgs
    ///         {
    ///             ThingIndexingMode = "REGISTRY_AND_SHADOW",
    ///             ThingConnectivityIndexingMode = "STATUS",
    ///             DeviceDefenderIndexingMode = "VIOLATIONS",
    ///             NamedShadowIndexingMode = "ON",
    ///             Filter = new Aws.Iot.Inputs.IndexingConfigurationThingIndexingConfigurationFilterArgs
    ///             {
    ///                 NamedShadowNames = new[]
    ///                 {
    ///                     "thing1shadow",
    ///                 },
    ///             },
    ///             CustomFields = new[]
    ///             {
    ///                 new Aws.Iot.Inputs.IndexingConfigurationThingIndexingConfigurationCustomFieldArgs
    ///                 {
    ///                     Name = "shadow.desired.power",
    ///                     Type = "Boolean",
    ///                 },
    ///                 new Aws.Iot.Inputs.IndexingConfigurationThingIndexingConfigurationCustomFieldArgs
    ///                 {
    ///                     Name = "attributes.version",
    ///                     Type = "Number",
    ///                 },
    ///                 new Aws.Iot.Inputs.IndexingConfigurationThingIndexingConfigurationCustomFieldArgs
    ///                 {
    ///                     Name = "shadow.name.thing1shadow.desired.DefaultDesired",
    ///                     Type = "String",
    ///                 },
    ///                 new Aws.Iot.Inputs.IndexingConfigurationThingIndexingConfigurationCustomFieldArgs
    ///                 {
    ///                     Name = "deviceDefender.securityProfile1.NUMBER_VALUE_BEHAVIOR.lastViolationValue.number",
    ///                     Type = "Number",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [AwsResourceType("aws:iot/indexingConfiguration:IndexingConfiguration")]
    public partial class IndexingConfiguration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Thing group indexing configuration. See below.
        /// </summary>
        [Output("thingGroupIndexingConfiguration")]
        public Output<Outputs.IndexingConfigurationThingGroupIndexingConfiguration> ThingGroupIndexingConfiguration { get; private set; } = null!;

        /// <summary>
        /// Thing indexing configuration. See below.
        /// </summary>
        [Output("thingIndexingConfiguration")]
        public Output<Outputs.IndexingConfigurationThingIndexingConfiguration> ThingIndexingConfiguration { get; private set; } = null!;


        /// <summary>
        /// Create a IndexingConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IndexingConfiguration(string name, IndexingConfigurationArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:iot/indexingConfiguration:IndexingConfiguration", name, args ?? new IndexingConfigurationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IndexingConfiguration(string name, Input<string> id, IndexingConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("aws:iot/indexingConfiguration:IndexingConfiguration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IndexingConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IndexingConfiguration Get(string name, Input<string> id, IndexingConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new IndexingConfiguration(name, id, state, options);
        }
    }

    public sealed class IndexingConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Thing group indexing configuration. See below.
        /// </summary>
        [Input("thingGroupIndexingConfiguration")]
        public Input<Inputs.IndexingConfigurationThingGroupIndexingConfigurationArgs>? ThingGroupIndexingConfiguration { get; set; }

        /// <summary>
        /// Thing indexing configuration. See below.
        /// </summary>
        [Input("thingIndexingConfiguration")]
        public Input<Inputs.IndexingConfigurationThingIndexingConfigurationArgs>? ThingIndexingConfiguration { get; set; }

        public IndexingConfigurationArgs()
        {
        }
        public static new IndexingConfigurationArgs Empty => new IndexingConfigurationArgs();
    }

    public sealed class IndexingConfigurationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Thing group indexing configuration. See below.
        /// </summary>
        [Input("thingGroupIndexingConfiguration")]
        public Input<Inputs.IndexingConfigurationThingGroupIndexingConfigurationGetArgs>? ThingGroupIndexingConfiguration { get; set; }

        /// <summary>
        /// Thing indexing configuration. See below.
        /// </summary>
        [Input("thingIndexingConfiguration")]
        public Input<Inputs.IndexingConfigurationThingIndexingConfigurationGetArgs>? ThingIndexingConfiguration { get; set; }

        public IndexingConfigurationState()
        {
        }
        public static new IndexingConfigurationState Empty => new IndexingConfigurationState();
    }
}
