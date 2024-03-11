// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.LicenseManager.Outputs
{

    [OutputType]
    public sealed class GetReceivedLicensesFilterResult
    {
        /// <summary>
        /// Name of the field to filter by, as defined by
        /// [the underlying AWS API](https://docs.aws.amazon.com/license-manager/latest/APIReference/API_ListReceivedLicenses.html#API_ListReceivedLicenses_RequestSyntax).
        /// For example, if filtering using `ProductSKU`, use:
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
        ///     var selected = Aws.LicenseManager.GetReceivedLicenses.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.LicenseManager.Inputs.GetReceivedLicensesFilterInputArgs
        ///             {
        ///                 Name = "ProductSKU",
        ///                 Values = new[]
        ///                 {
        ///                     "",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Set of values that are accepted for the given field.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetReceivedLicensesFilterResult(
            string name,

            ImmutableArray<string> values)
        {
            Name = name;
            Values = values;
        }
    }
}
