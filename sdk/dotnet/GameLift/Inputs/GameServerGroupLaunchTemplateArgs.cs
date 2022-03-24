// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.GameLift.Inputs
{

    public sealed class GameServerGroupLaunchTemplateArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A unique identifier for an existing EC2 launch template.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// A readable identifier for an existing EC2 launch template.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The version of the EC2 launch template to use. If none is set, the default is the first version created.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public GameServerGroupLaunchTemplateArgs()
        {
        }
    }
}
