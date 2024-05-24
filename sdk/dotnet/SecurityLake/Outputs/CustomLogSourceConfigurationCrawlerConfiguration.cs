// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SecurityLake.Outputs
{

    [OutputType]
    public sealed class CustomLogSourceConfigurationCrawlerConfiguration
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role to be used by the AWS Glue crawler.
        /// </summary>
        public readonly string RoleArn;

        [OutputConstructor]
        private CustomLogSourceConfigurationCrawlerConfiguration(string roleArn)
        {
            RoleArn = roleArn;
        }
    }
}
