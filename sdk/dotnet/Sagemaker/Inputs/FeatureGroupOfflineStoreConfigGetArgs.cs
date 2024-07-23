// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Inputs
{

    public sealed class FeatureGroupOfflineStoreConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The meta data of the Glue table that is autogenerated when an OfflineStore is created. See Data Catalog Config Below.
        /// </summary>
        [Input("dataCatalogConfig")]
        public Input<Inputs.FeatureGroupOfflineStoreConfigDataCatalogConfigGetArgs>? DataCatalogConfig { get; set; }

        /// <summary>
        /// Set to `true` to turn Online Store On.
        /// </summary>
        [Input("disableGlueTableCreation")]
        public Input<bool>? DisableGlueTableCreation { get; set; }

        /// <summary>
        /// The Amazon Simple Storage (Amazon S3) location of OfflineStore. See S3 Storage Config Below.
        /// </summary>
        [Input("s3StorageConfig", required: true)]
        public Input<Inputs.FeatureGroupOfflineStoreConfigS3StorageConfigGetArgs> S3StorageConfig { get; set; } = null!;

        /// <summary>
        /// Format for the offline store table. Supported formats are `Glue` (Default) and Apache `Iceberg` (https://iceberg.apache.org/).
        /// </summary>
        [Input("tableFormat")]
        public Input<string>? TableFormat { get; set; }

        public FeatureGroupOfflineStoreConfigGetArgs()
        {
        }
        public static new FeatureGroupOfflineStoreConfigGetArgs Empty => new FeatureGroupOfflineStoreConfigGetArgs();
    }
}
