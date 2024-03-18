// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.LakeFormation.Inputs
{

    public sealed class PermissionsDataCellsFilterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the database.
        /// </summary>
        [Input("databaseName", required: true)]
        public Input<string> DatabaseName { get; set; } = null!;

        /// <summary>
        /// The name of the data cells filter.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The ID of the Data Catalog.
        /// </summary>
        [Input("tableCatalogId", required: true)]
        public Input<string> TableCatalogId { get; set; } = null!;

        /// <summary>
        /// The name of the table.
        /// </summary>
        [Input("tableName", required: true)]
        public Input<string> TableName { get; set; } = null!;

        public PermissionsDataCellsFilterGetArgs()
        {
        }
        public static new PermissionsDataCellsFilterGetArgs Empty => new PermissionsDataCellsFilterGetArgs();
    }
}
