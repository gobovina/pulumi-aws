// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kinesis.Inputs
{

    public sealed class FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the S3 bucket
        /// </summary>
        [Input("bucketArn", required: true)]
        public Input<string> BucketArn { get; set; } = null!;

        [Input("bufferingInterval")]
        public Input<int>? BufferingInterval { get; set; }

        [Input("bufferingSize")]
        public Input<int>? BufferingSize { get; set; }

        [Input("cloudwatchLoggingOptions")]
        public Input<Inputs.FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs>? CloudwatchLoggingOptions { get; set; }

        /// <summary>
        /// The compression format. If no value is specified, the default is `UNCOMPRESSED`. Other supported values are `GZIP`, `ZIP`, `Snappy`, &amp; `HADOOP_SNAPPY`.
        /// </summary>
        [Input("compressionFormat")]
        public Input<string>? CompressionFormat { get; set; }

        /// <summary>
        /// Prefix added to failed records before writing them to S3. Not currently supported for `redshift` destination. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see [Custom Prefixes for Amazon S3 Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html).
        /// </summary>
        [Input("errorOutputPrefix")]
        public Input<string>? ErrorOutputPrefix { get; set; }

        /// <summary>
        /// Specifies the KMS key ARN the stream will use to encrypt data. If not set, no encryption will
        /// be used.
        /// </summary>
        [Input("kmsKeyArn")]
        public Input<string>? KmsKeyArn { get; set; }

        /// <summary>
        /// The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered S3 files. You can specify an extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a folder in the S3 bucket
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        public FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs()
        {
        }
        public static new FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs Empty => new FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfigurationArgs();
    }
}
