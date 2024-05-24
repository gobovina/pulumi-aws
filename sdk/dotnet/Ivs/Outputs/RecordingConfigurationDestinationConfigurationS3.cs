// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ivs.Outputs
{

    [OutputType]
    public sealed class RecordingConfigurationDestinationConfigurationS3
    {
        /// <summary>
        /// S3 bucket name where recorded videos will be stored.
        /// 
        /// The following arguments are optional:
        /// </summary>
        public readonly string BucketName;

        [OutputConstructor]
        private RecordingConfigurationDestinationConfigurationS3(string bucketName)
        {
            BucketName = bucketName;
        }
    }
}
