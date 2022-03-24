// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ImageBuilder.Inputs
{

    public sealed class ImageRecipeSystemsManagerAgentGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to remove the Systems Manager Agent after the image has been built. Defaults to `false`.
        /// </summary>
        [Input("uninstallAfterBuild", required: true)]
        public Input<bool> UninstallAfterBuild { get; set; } = null!;

        public ImageRecipeSystemsManagerAgentGetArgs()
        {
        }
    }
}
