// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.LakeFormation
{
    public static class GetDataLakeSettings
    {
        /// <summary>
        /// Get Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions.
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
        ///     var example = Aws.LakeFormation.GetDataLakeSettings.Invoke(new()
        ///     {
        ///         CatalogId = "14916253649",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetDataLakeSettingsResult> InvokeAsync(GetDataLakeSettingsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDataLakeSettingsResult>("aws:lakeformation/getDataLakeSettings:getDataLakeSettings", args ?? new GetDataLakeSettingsArgs(), options.WithDefaults());

        /// <summary>
        /// Get Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions.
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
        ///     var example = Aws.LakeFormation.GetDataLakeSettings.Invoke(new()
        ///     {
        ///         CatalogId = "14916253649",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetDataLakeSettingsResult> Invoke(GetDataLakeSettingsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDataLakeSettingsResult>("aws:lakeformation/getDataLakeSettings:getDataLakeSettings", args ?? new GetDataLakeSettingsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDataLakeSettingsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier for the Data Catalog. By default, the account ID.
        /// </summary>
        [Input("catalogId")]
        public string? CatalogId { get; set; }

        public GetDataLakeSettingsArgs()
        {
        }
        public static new GetDataLakeSettingsArgs Empty => new GetDataLakeSettingsArgs();
    }

    public sealed class GetDataLakeSettingsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier for the Data Catalog. By default, the account ID.
        /// </summary>
        [Input("catalogId")]
        public Input<string>? CatalogId { get; set; }

        public GetDataLakeSettingsInvokeArgs()
        {
        }
        public static new GetDataLakeSettingsInvokeArgs Empty => new GetDataLakeSettingsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDataLakeSettingsResult
    {
        /// <summary>
        /// List of ARNs of AWS Lake Formation principals (IAM users or roles).
        /// </summary>
        public readonly ImmutableArray<string> Admins;
        /// <summary>
        /// Whether to allow Amazon EMR clusters to access data managed by Lake Formation.
        /// </summary>
        public readonly bool AllowExternalDataFiltering;
        /// <summary>
        /// Lake Formation relies on a privileged process secured by Amazon EMR or the third party integrator to tag the user's role while assuming it.
        /// </summary>
        public readonly ImmutableArray<string> AuthorizedSessionTagValueLists;
        public readonly string? CatalogId;
        /// <summary>
        /// Up to three configuration blocks of principal permissions for default create database permissions. Detailed below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDataLakeSettingsCreateDatabaseDefaultPermissionResult> CreateDatabaseDefaultPermissions;
        /// <summary>
        /// Up to three configuration blocks of principal permissions for default create table permissions. Detailed below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDataLakeSettingsCreateTableDefaultPermissionResult> CreateTableDefaultPermissions;
        /// <summary>
        /// A list of the account IDs of Amazon Web Services accounts with Amazon EMR clusters that are to perform data filtering.
        /// </summary>
        public readonly ImmutableArray<string> ExternalDataFilteringAllowLists;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of ARNs of AWS Lake Formation principals (IAM users or roles) with only view access to the resources.
        /// </summary>
        public readonly ImmutableArray<string> ReadOnlyAdmins;
        /// <summary>
        /// List of the resource-owning account IDs that the caller's account can use to share their user access details (user ARNs).
        /// </summary>
        public readonly ImmutableArray<string> TrustedResourceOwners;

        [OutputConstructor]
        private GetDataLakeSettingsResult(
            ImmutableArray<string> admins,

            bool allowExternalDataFiltering,

            ImmutableArray<string> authorizedSessionTagValueLists,

            string? catalogId,

            ImmutableArray<Outputs.GetDataLakeSettingsCreateDatabaseDefaultPermissionResult> createDatabaseDefaultPermissions,

            ImmutableArray<Outputs.GetDataLakeSettingsCreateTableDefaultPermissionResult> createTableDefaultPermissions,

            ImmutableArray<string> externalDataFilteringAllowLists,

            string id,

            ImmutableArray<string> readOnlyAdmins,

            ImmutableArray<string> trustedResourceOwners)
        {
            Admins = admins;
            AllowExternalDataFiltering = allowExternalDataFiltering;
            AuthorizedSessionTagValueLists = authorizedSessionTagValueLists;
            CatalogId = catalogId;
            CreateDatabaseDefaultPermissions = createDatabaseDefaultPermissions;
            CreateTableDefaultPermissions = createTableDefaultPermissions;
            ExternalDataFilteringAllowLists = externalDataFilteringAllowLists;
            Id = id;
            ReadOnlyAdmins = readOnlyAdmins;
            TrustedResourceOwners = trustedResourceOwners;
        }
    }
}
