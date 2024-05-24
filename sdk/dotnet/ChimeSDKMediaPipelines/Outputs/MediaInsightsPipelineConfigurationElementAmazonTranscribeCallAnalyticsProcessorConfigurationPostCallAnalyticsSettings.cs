// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ChimeSDKMediaPipelines.Outputs
{

    [OutputType]
    public sealed class MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationPostCallAnalyticsSettings
    {
        /// <summary>
        /// Should output be redacted.
        /// </summary>
        public readonly string? ContentRedactionOutput;
        /// <summary>
        /// ARN of the role used by AWS Transcribe to upload your post call analysis.
        /// </summary>
        public readonly string DataAccessRoleArn;
        /// <summary>
        /// ID of the KMS key used to encrypt the output.
        /// </summary>
        public readonly string? OutputEncryptionKmsKeyId;
        /// <summary>
        /// The Amazon S3 location where you want your Call Analytics post-call transcription output stored.
        /// </summary>
        public readonly string OutputLocation;

        [OutputConstructor]
        private MediaInsightsPipelineConfigurationElementAmazonTranscribeCallAnalyticsProcessorConfigurationPostCallAnalyticsSettings(
            string? contentRedactionOutput,

            string dataAccessRoleArn,

            string? outputEncryptionKmsKeyId,

            string outputLocation)
        {
            ContentRedactionOutput = contentRedactionOutput;
            DataAccessRoleArn = dataAccessRoleArn;
            OutputEncryptionKmsKeyId = outputEncryptionKmsKeyId;
            OutputLocation = outputLocation;
        }
    }
}
