// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.LakeFormation.Inputs
{

    public sealed class GetPermissionsTableWithColumnsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier for the Data Catalog. By default, it is the account ID of the caller.
        /// </summary>
        [Input("catalogId", required: true)]
        public string CatalogId { get; set; } = null!;

        [Input("columnNames")]
        private List<string>? _columnNames;

        /// <summary>
        /// Set of column names for the table. At least one of `column_names` or `excluded_column_names` is required.
        /// </summary>
        public List<string> ColumnNames
        {
            get => _columnNames ?? (_columnNames = new List<string>());
            set => _columnNames = value;
        }

        /// <summary>
        /// Name of the database for the table with columns resource. Unique to the Data Catalog.
        /// </summary>
        [Input("databaseName", required: true)]
        public string DatabaseName { get; set; } = null!;

        [Input("excludedColumnNames")]
        private List<string>? _excludedColumnNames;

        /// <summary>
        /// Set of column names for the table to exclude. At least one of `column_names` or `excluded_column_names` is required.
        /// </summary>
        public List<string> ExcludedColumnNames
        {
            get => _excludedColumnNames ?? (_excludedColumnNames = new List<string>());
            set => _excludedColumnNames = value;
        }

        /// <summary>
        /// Name of the table resource.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Whether to use a wildcard representing every table under a database. At least one of `name` or `wildcard` is required. Defaults to `false`.
        /// </summary>
        [Input("wildcard")]
        public bool? Wildcard { get; set; }

        public GetPermissionsTableWithColumnsArgs()
        {
        }
        public static new GetPermissionsTableWithColumnsArgs Empty => new GetPermissionsTableWithColumnsArgs();
    }
}
