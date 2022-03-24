// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kinesis.Inputs
{

    public sealed class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enables or disables [dynamic partitioning](https://docs.aws.amazon.com/firehose/latest/dev/dynamic-partitioning.html). Defaults to `false`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Nested argument that specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data from JSON. More details below.
        /// </summary>
        [Input("inputFormatConfiguration", required: true)]
        public Input<Inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationArgs> InputFormatConfiguration { get; set; } = null!;

        /// <summary>
        /// Nested argument that specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to the Parquet or ORC format. More details below.
        /// </summary>
        [Input("outputFormatConfiguration", required: true)]
        public Input<Inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationArgs> OutputFormatConfiguration { get; set; } = null!;

        /// <summary>
        /// Nested argument that specifies the AWS Glue Data Catalog table that contains the column information. More details below.
        /// </summary>
        [Input("schemaConfiguration", required: true)]
        public Input<Inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationArgs> SchemaConfiguration { get; set; } = null!;

        public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationArgs()
        {
        }
    }
}
