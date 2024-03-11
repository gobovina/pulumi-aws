// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ebs.Inputs
{

    public sealed class GetEbsVolumesFilterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the field to filter by, as defined by
        /// [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVolumes.html).
        /// For example, if matching against the `size` filter, use:
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
        ///     var tenOrTwentyGbVolumes = Aws.Ebs.GetEbsVolumes.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ebs.Inputs.GetEbsVolumesFilterInputArgs
        ///             {
        ///                 Name = "size",
        ///                 Values = new[]
        ///                 {
        ///                     "10",
        ///                     "20",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("values", required: true)]
        private List<string>? _values;

        /// <summary>
        /// Set of values that are accepted for the given field.
        /// EBS Volume IDs will be selected if any one of the given values match.
        /// </summary>
        public List<string> Values
        {
            get => _values ?? (_values = new List<string>());
            set => _values = value;
        }

        public GetEbsVolumesFilterArgs()
        {
        }
        public static new GetEbsVolumesFilterArgs Empty => new GetEbsVolumesFilterArgs();
    }
}
