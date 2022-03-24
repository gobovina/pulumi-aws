// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.GameLift.Outputs
{

    [OutputType]
    public sealed class GameServerGroupLaunchTemplate
    {
        /// <summary>
        /// A unique identifier for an existing EC2 launch template.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// A readable identifier for an existing EC2 launch template.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The version of the EC2 launch template to use. If none is set, the default is the first version created.
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private GameServerGroupLaunchTemplate(
            string? id,

            string? name,

            string? version)
        {
            Id = id;
            Name = name;
            Version = version;
        }
    }
}
