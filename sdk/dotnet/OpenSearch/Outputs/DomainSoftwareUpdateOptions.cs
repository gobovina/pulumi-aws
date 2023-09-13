// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.OpenSearch.Outputs
{

    [OutputType]
    public sealed class DomainSoftwareUpdateOptions
    {
        /// <summary>
        /// Whether automatic service software updates are enabled for the domain. Defaults to `false`.
        /// </summary>
        public readonly bool? AutoSoftwareUpdateEnabled;

        [OutputConstructor]
        private DomainSoftwareUpdateOptions(bool? autoSoftwareUpdateEnabled)
        {
            AutoSoftwareUpdateEnabled = autoSoftwareUpdateEnabled;
        }
    }
}
