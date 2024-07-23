// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Fsx.Outputs
{

    [OutputType]
    public sealed class DataRepositoryAssociationS3AutoExportPolicy
    {
        /// <summary>
        /// A list of file event types to automatically export to your linked S3 bucket or import from the linked S3 bucket. Valid values are `NEW`, `CHANGED`, `DELETED`. Max of 3.
        /// </summary>
        public readonly ImmutableArray<string> Events;

        [OutputConstructor]
        private DataRepositoryAssociationS3AutoExportPolicy(ImmutableArray<string> events)
        {
            Events = events;
        }
    }
}
