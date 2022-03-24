// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Dms.Inputs
{

    public sealed class EndpointKinesisSettingsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Shows detailed control information for table definition, column definition, and table and column changes in the Kinesis message output. Default is `false`.
        /// </summary>
        [Input("includeControlDetails")]
        public Input<bool>? IncludeControlDetails { get; set; }

        /// <summary>
        /// Include NULL and empty columns in the target. Default is `false`.
        /// </summary>
        [Input("includeNullAndEmpty")]
        public Input<bool>? IncludeNullAndEmpty { get; set; }

        /// <summary>
        /// Shows the partition value within the Kinesis message output, unless the partition type is schema-table-type. Default is `false`.
        /// </summary>
        [Input("includePartitionValue")]
        public Input<bool>? IncludePartitionValue { get; set; }

        /// <summary>
        /// Includes any data definition language (DDL) operations that change the table in the control data. Default is `false`.
        /// </summary>
        [Input("includeTableAlterOperations")]
        public Input<bool>? IncludeTableAlterOperations { get; set; }

        /// <summary>
        /// Provides detailed transaction information from the source database. Default is `false`.
        /// </summary>
        [Input("includeTransactionDetails")]
        public Input<bool>? IncludeTransactionDetails { get; set; }

        /// <summary>
        /// Output format for the records created. Default is `json`. Valid values are `json` and `json_unformatted` (a single line with no tab).
        /// </summary>
        [Input("messageFormat")]
        public Input<string>? MessageFormat { get; set; }

        /// <summary>
        /// Prefixes schema and table names to partition values, when the partition type is primary-key-type. Default is `false`.
        /// </summary>
        [Input("partitionIncludeSchemaTable")]
        public Input<bool>? PartitionIncludeSchemaTable { get; set; }

        /// <summary>
        /// ARN of the IAM Role with permissions to read from or write to the S3 Bucket.
        /// </summary>
        [Input("serviceAccessRoleArn")]
        public Input<string>? ServiceAccessRoleArn { get; set; }

        /// <summary>
        /// ARN of the Kinesis data stream.
        /// </summary>
        [Input("streamArn")]
        public Input<string>? StreamArn { get; set; }

        public EndpointKinesisSettingsGetArgs()
        {
        }
    }
}
