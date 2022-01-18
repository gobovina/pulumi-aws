// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppSync.Inputs
{

    public sealed class DataSourceRelationalDatabaseConfigHttpEndpointConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS secret store ARN for database credentials.
        /// </summary>
        [Input("awsSecretStoreArn", required: true)]
        public Input<string> AwsSecretStoreArn { get; set; } = null!;

        /// <summary>
        /// Logical database name.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        /// <summary>
        /// Amazon RDS cluster identifier.
        /// </summary>
        [Input("dbClusterIdentifier", required: true)]
        public Input<string> DbClusterIdentifier { get; set; } = null!;

        /// <summary>
        /// AWS Region for RDS HTTP endpoint. Defaults to current region.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Logical schema name.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        public DataSourceRelationalDatabaseConfigHttpEndpointConfigArgs()
        {
        }
    }
}
