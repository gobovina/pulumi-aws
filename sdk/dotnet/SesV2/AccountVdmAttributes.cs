// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SesV2
{
    /// <summary>
    /// Resource for managing an AWS SESv2 (Simple Email V2) Account VDM Attributes.
    /// 
    /// ## Example Usage
    /// 
    /// ### Basic Usage
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
    ///     var example = new Aws.SesV2.AccountVdmAttributes("example", new()
    ///     {
    ///         VdmEnabled = "ENABLED",
    ///         DashboardAttributes = new Aws.SesV2.Inputs.AccountVdmAttributesDashboardAttributesArgs
    ///         {
    ///             EngagementMetrics = "ENABLED",
    ///         },
    ///         GuardianAttributes = new Aws.SesV2.Inputs.AccountVdmAttributesGuardianAttributesArgs
    ///         {
    ///             OptimizedSharedDelivery = "ENABLED",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import SESv2 (Simple Email V2) Account VDM Attributes using the word `ses-account-vdm-attributes`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:sesv2/accountVdmAttributes:AccountVdmAttributes example ses-account-vdm-attributes
    /// ```
    /// </summary>
    [AwsResourceType("aws:sesv2/accountVdmAttributes:AccountVdmAttributes")]
    public partial class AccountVdmAttributes : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies additional settings for your VDM configuration as applicable to the Dashboard.
        /// </summary>
        [Output("dashboardAttributes")]
        public Output<Outputs.AccountVdmAttributesDashboardAttributes> DashboardAttributes { get; private set; } = null!;

        /// <summary>
        /// Specifies additional settings for your VDM configuration as applicable to the Guardian.
        /// </summary>
        [Output("guardianAttributes")]
        public Output<Outputs.AccountVdmAttributesGuardianAttributes> GuardianAttributes { get; private set; } = null!;

        /// <summary>
        /// Specifies the status of your VDM configuration. Valid values: `ENABLED`, `DISABLED`.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("vdmEnabled")]
        public Output<string> VdmEnabled { get; private set; } = null!;


        /// <summary>
        /// Create a AccountVdmAttributes resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccountVdmAttributes(string name, AccountVdmAttributesArgs args, CustomResourceOptions? options = null)
            : base("aws:sesv2/accountVdmAttributes:AccountVdmAttributes", name, args ?? new AccountVdmAttributesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccountVdmAttributes(string name, Input<string> id, AccountVdmAttributesState? state = null, CustomResourceOptions? options = null)
            : base("aws:sesv2/accountVdmAttributes:AccountVdmAttributes", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccountVdmAttributes resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccountVdmAttributes Get(string name, Input<string> id, AccountVdmAttributesState? state = null, CustomResourceOptions? options = null)
        {
            return new AccountVdmAttributes(name, id, state, options);
        }
    }

    public sealed class AccountVdmAttributesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies additional settings for your VDM configuration as applicable to the Dashboard.
        /// </summary>
        [Input("dashboardAttributes")]
        public Input<Inputs.AccountVdmAttributesDashboardAttributesArgs>? DashboardAttributes { get; set; }

        /// <summary>
        /// Specifies additional settings for your VDM configuration as applicable to the Guardian.
        /// </summary>
        [Input("guardianAttributes")]
        public Input<Inputs.AccountVdmAttributesGuardianAttributesArgs>? GuardianAttributes { get; set; }

        /// <summary>
        /// Specifies the status of your VDM configuration. Valid values: `ENABLED`, `DISABLED`.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("vdmEnabled", required: true)]
        public Input<string> VdmEnabled { get; set; } = null!;

        public AccountVdmAttributesArgs()
        {
        }
        public static new AccountVdmAttributesArgs Empty => new AccountVdmAttributesArgs();
    }

    public sealed class AccountVdmAttributesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies additional settings for your VDM configuration as applicable to the Dashboard.
        /// </summary>
        [Input("dashboardAttributes")]
        public Input<Inputs.AccountVdmAttributesDashboardAttributesGetArgs>? DashboardAttributes { get; set; }

        /// <summary>
        /// Specifies additional settings for your VDM configuration as applicable to the Guardian.
        /// </summary>
        [Input("guardianAttributes")]
        public Input<Inputs.AccountVdmAttributesGuardianAttributesGetArgs>? GuardianAttributes { get; set; }

        /// <summary>
        /// Specifies the status of your VDM configuration. Valid values: `ENABLED`, `DISABLED`.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("vdmEnabled")]
        public Input<string>? VdmEnabled { get; set; }

        public AccountVdmAttributesState()
        {
        }
        public static new AccountVdmAttributesState Empty => new AccountVdmAttributesState();
    }
}
